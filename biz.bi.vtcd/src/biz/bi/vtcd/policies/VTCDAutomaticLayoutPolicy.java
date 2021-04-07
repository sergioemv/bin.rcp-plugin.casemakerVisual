/* This Software has been developed by Business Software Innovations  .
Copyright (c)2005 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. */

package biz.bi.vtcd.policies;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.CompoundCommand;

import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;
import biz.bi.vtcd.provider.VTCDEditPlugin;

/**
 * Helper class that creates a compound command 
 * for an automatic arrengement of the figures 
 * of a existent diagram
 * @author smoreno
 *
 */
public class VTCDAutomaticLayoutPolicy {
	
	/**
	 * Vtcd diagram to arrange the children
	 */
	private VTCDDiagram m_Diagram;
	private Collection relatedFigureElements;
	private HashMap dependenciesMap;
	private CompoundCommand cCommand;
	
	private final int FIGURE_ELEMENT_HORIZONTAL_SPACING = VTCDFigureElement.WIDTH_DEFAULT/2;
	private final int FIGURE_ELEMENT_VERTICAL_SPACING = VTCDFigureElement.HEIGHT_DEFAULT + VTCDFigureElement.HEIGHT_DEFAULT/2;
	private final int FIGURE_ELEMENT_DEFAULT_IDENT1 =  VTCDFigureElement.WIDTH_DEFAULT/2;
	private final int FIGURE_DEPENDENCY_DEFAULT_IDENT = FIGURE_ELEMENT_DEFAULT_IDENT1+ VTCDFigureElement.WIDTH_DEFAULT+FIGURE_ELEMENT_HORIZONTAL_SPACING;
	private final int FIGURE_ELELEMT_DEFAULT_IDENT2 = FIGURE_DEPENDENCY_DEFAULT_IDENT + VTCDFigureElement.WIDTH_DEFAULT;   
	private final int FIGURE_DEPENDENCY_VERTICAL_SPACING =  VTCDFigureDependency.HEIGHT_DEFAULT/2;
	private final int FIGURE_COMBINATION_VERTICAL_SPACING =  VTCDFigureCombination.HEIGHT_DEFAULT;
	
	public VTCDAutomaticLayoutPolicy (VTCDDiagram p_Diagram)
	{	
		m_Diagram = p_Diagram; 
		relatedFigureElements = new Vector();
		dependenciesMap = new HashMap();
			loadPositions();
	}


	/**
	 * Load all the figures in the location maps
	 * with other figures
	 */
	public void loadPositions()
	{
		cCommand = new CompoundCommand();
		cCommand.setDebugLabel("doing automatic layout");
		cCommand.setLabel(VTCDEditPlugin.INSTANCE.getString("_UI_AutomaticLayout_menu_item_text"));		
		//m_Diagram.getChildren() could be replaced with m_Diagram.EContents
		if (m_Diagram instanceof VTCDDiagramMain)
		{
			loadPositionsMain ((VTCDDiagramMain) m_Diagram);
		}
		else
		if (m_Diagram instanceof VTCDDiagramCombination)
			loadPositionsCombination((VTCDDiagramCombination)m_Diagram);
	}
	
	private void validateDependencyPositions(VTCDDiagramMain p_DiagramMain)
	{
		for (Iterator i = p_DiagramMain.getM_VTCDFigureDependency().iterator();i.hasNext();)
		{
			//validate intersections between dependendencies 
			VTCDFigureDependency l_FigureDependency = (VTCDFigureDependency) i.next();
			Rectangle constraint = (Rectangle)dependenciesMap.get(l_FigureDependency);
			for (Iterator j = p_DiagramMain.getM_VTCDFigureDependency().iterator();j.hasNext();)
			{
				VTCDFigureDependency l_FigureDependencyNew = (VTCDFigureDependency) j.next();
				Rectangle constraintnew = (Rectangle)dependenciesMap.get(l_FigureDependencyNew);
				if (l_FigureDependency!=l_FigureDependencyNew)
				{
					while (constraintnew.intersects(constraint))
					{
						constraintnew.setLocation(constraintnew.x,constraintnew.y + VTCDFigureDependency.HEIGHT_DEFAULT + FIGURE_DEPENDENCY_VERTICAL_SPACING);
					}
					cCommand.add(VTCDCommandFactory.INSTANCE.createChangeConstraintCommand(l_FigureDependencyNew,constraintnew));
			
				}
			}
			
			
			
		}			
		
	}
	private void loadPositionsMain(VTCDDiagramMain p_DiagramMain)
	{
		
		relatedFigureElements.clear();
		//load all the dependencies and its related elements
		int positionX = 1;
		for (Iterator i = p_DiagramMain.getM_VTCDFigureDependency().iterator();i.hasNext();)
		{
			//put the dependency on the default position
			//depending on how many children the dependency has 
			//the dependency must have been placed in the middle of them
			VTCDFigureDependency l_FigureDependency = (VTCDFigureDependency) i.next();
			int l_InitialDependencyY=0;
		
			for (Iterator j = l_FigureDependency.getM_VTCDLinkDependencyElement().iterator(); j.hasNext();)
			{
				Rectangle constraint = new Rectangle();	
				VTCDFigureElement l_FigureElement = ((VTCDLinkDependencyElement)j.next()).getDestElement();
				if (!relatedFigureElements.contains(l_FigureElement))
				{
			
				
				constraint.width = VTCDFigureElement.WIDTH_DEFAULT;
				constraint.x = FIGURE_ELEMENT_DEFAULT_IDENT1;
				constraint.y = (positionX)*FIGURE_ELEMENT_VERTICAL_SPACING;
				cCommand.add(VTCDCommandFactory.INSTANCE.createChangeConstraintCommand(l_FigureElement,constraint));
				relatedFigureElements.add(l_FigureElement);
				positionX++;
				}	
				l_InitialDependencyY =l_InitialDependencyY+constraint.y;
				
			}
			
			l_InitialDependencyY = l_InitialDependencyY/ l_FigureDependency.getM_VTCDLinkDependencyElement().size();
			Rectangle constraint = new Rectangle();
			constraint.x = this.FIGURE_DEPENDENCY_DEFAULT_IDENT;
			constraint.y = l_InitialDependencyY;
			constraint.height = VTCDFigureDependency.HEIGHT_DEFAULT;
			constraint.width = VTCDFigureDependency.WIDTH_DEFAULT;
			cCommand.add(VTCDCommandFactory.INSTANCE.createChangeConstraintCommand(l_FigureDependency,constraint));
			dependenciesMap.put(l_FigureDependency,constraint);
			//
		}
		positionX = 1;
		for (Iterator k = p_DiagramMain.getM_VTCDFigureElement().iterator();k.hasNext();)
		{
			
			VTCDFigureElement l_FigureElement = (VTCDFigureElement) k.next();
		    Rectangle constraint = new Rectangle();
			if (!relatedFigureElements.contains(l_FigureElement))
			{
				constraint.x=FIGURE_ELELEMT_DEFAULT_IDENT2;
				constraint.y=positionX*FIGURE_ELEMENT_VERTICAL_SPACING;
				constraint.width=VTCDFigureElement.WIDTH_DEFAULT;
				cCommand.add(VTCDCommandFactory.INSTANCE.createChangeConstraintCommand(l_FigureElement,constraint));
				positionX++;
			}
		}		
		validateDependencyPositions(p_DiagramMain);
	}
	
	private void loadPositionsCombination(VTCDDiagramCombination p_DiagramCombination)
	{
		
		int positionX = 2;

			for (Iterator j = p_DiagramCombination.getM_VTCDFigureCombination().iterator(); j.hasNext();)
			{
				VTCDFigureCombination l_FigureCombination = (VTCDFigureCombination) j.next();
				Rectangle constraint = new Rectangle(0,0,-1,-1);
				constraint.x = FIGURE_DEPENDENCY_DEFAULT_IDENT;
				constraint.y = (positionX*VTCDFigureCombination.HEIGHT_DEFAULT)+FIGURE_COMBINATION_VERTICAL_SPACING;
				constraint.height = VTCDFigureCombination.HEIGHT_DEFAULT;
				constraint.width = VTCDFigureCombination.WIDTH_DEFAULT;
				cCommand.add(VTCDCommandFactory.INSTANCE.createChangeConstraintCommand(l_FigureCombination,constraint));
				positionX++;
			}
			positionX = 1;
			for (Iterator k = p_DiagramCombination.getM_VTCDFigureElement().iterator();k.hasNext();)
		{
			
			VTCDFigureElement l_FigureElement = (VTCDFigureElement) k.next();
			Rectangle constraint = new Rectangle(0,0,-1,-1);
				constraint.x = (this.FIGURE_ELEMENT_DEFAULT_IDENT1);
				constraint.y = positionX*FIGURE_ELEMENT_VERTICAL_SPACING;
				constraint.width = VTCDFigureElement.WIDTH_DEFAULT;
				cCommand.add(VTCDCommandFactory.INSTANCE.createChangeConstraintCommand(l_FigureElement,constraint));
				positionX++;
			
		}
		///	if (l_FigureElement.)			
		//validateDependencyPositions(p_DiagramMain);
	}


	/**
	 * @return Returns the cCommand.
	 */
	public CompoundCommand getCCommand() {
		return this.cCommand;
	}


	public Rectangle checkIntersections(List eParts,EditPart child,Rectangle constraint)
	{
		for (Iterator i = eParts.iterator();
		i.hasNext();)
		{
			GraphicalEditPart l_EditPart = (GraphicalEditPart) i.next();
			if (!l_EditPart.equals(child))
				if (constraint.intersects(l_EditPart.getFigure().getBounds()))
				{
					Rectangle newConstraint = constraint;
					newConstraint.y = l_EditPart.getFigure().getBounds().y + l_EditPart.getFigure().getBounds().height+10;
					return checkIntersections(eParts,child,newConstraint) ;
				}
		}
		return constraint;
	}
	
	

}
