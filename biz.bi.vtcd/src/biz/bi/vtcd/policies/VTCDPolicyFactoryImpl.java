/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.policies;


import java.util.Iterator;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;

import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFactory;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;

/**
 * @author smoreno
 * @09-08-2005
 * @smoreno
 */
public class VTCDPolicyFactoryImpl implements VTCDPolicyFactory {

	/* (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.ConstrainedLayoutEditPolicy#createChangeConstraintCommand(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	private VTCDReloadPolicy reloadPolicy = new VTCDReloadPolicy();
	
	public Command createFigureEquivalenceClassesPolicy(CMProxyEquivalenceClass p_proxyEquivalence,VTCDFigureElement p_Element)
	{
		CompoundCommand cc = new CompoundCommand();
		
		VTCDDiagramMain mainDiagram = null;
		if (p_Element.getM_VTCDDiagramMain() != null)
			mainDiagram = p_Element.getM_VTCDDiagramMain();
		else
			mainDiagram = p_Element.getM_VTCDDiagramCombination().getM_FigureDependency().getM_VTCDDiagramMain();
		
		CMProxyElement l_element = p_Element.getM_Element();
		VTCDFigureEquivalenceClass l_figureEquivalenceClass = null;
		if (mainDiagram.getM_VTCDFigureElement(l_element).getM_VTCDFigureEquivalenceClass(p_proxyEquivalence)==null)
		{
		l_figureEquivalenceClass = VTCDFactory.eINSTANCE.createVTCDFigureEquivalenceClass();
		l_figureEquivalenceClass.setM_EquivalenceClass(p_proxyEquivalence);
		cc.add(VTCDCommandFactory.INSTANCE.createFigureEquivalenceClassCommand(mainDiagram.getM_VTCDFigureElement(l_element),l_figureEquivalenceClass));
		}
		for (Iterator i = mainDiagram.getM_VTCDFigureDependency().iterator();i.hasNext();)
		{
			VTCDDiagramCombination diagramCombination = ((VTCDFigureDependency)i.next()).getM_VTCDDiagramCombination();
			if (diagramCombination.getM_VTCDFigureElement(l_element)!=null)
			  if (diagramCombination.getM_VTCDFigureElement(l_element).getM_VTCDFigureEquivalenceClass(p_proxyEquivalence)==null)
			  {
				l_figureEquivalenceClass = VTCDFactory.eINSTANCE.createVTCDFigureEquivalenceClass();
				l_figureEquivalenceClass.setM_EquivalenceClass(p_proxyEquivalence);
				cc.add(VTCDCommandFactory.INSTANCE.createFigureEquivalenceClassCommand(diagramCombination.getM_VTCDFigureElement(l_element),l_figureEquivalenceClass));
			  }
		}
		return cc;
	
	}

	public Command createDeleteAllCombinationsPolicy(VTCDDiagramCombination diagram)
	{
		CompoundCommand cc = new CompoundCommand();
		for (Iterator i = diagram.getM_VTCDFigureCombination().iterator();i.hasNext();)
		{
			VTCDFigureCombination combination = ((VTCDFigureCombination)i.next());
		    for (Iterator j = combination.getM_VTCDLinkCombinationEClass().iterator();j.hasNext();)
				cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCommand((VTCDLinkCombinationEClass)j.next()));
		    cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCommand(combination));
		}	
			
		return cc;
	}

	public Command createDeleteFigureAndLinksPolicy(VTCDAbstractFigure p_figure)
	{
		CompoundCommand cc = new CompoundCommand();
		cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCommand(p_figure));
		for (Iterator i = p_figure.getLinks().iterator();i.hasNext();)
			cc.add(this.createDeleteLinkPolicy((VTCDAbstractLink)i.next()));
		return cc;
	}


	/**
	 * @param p_diagram
	 * @param p_element
	 * @return
	 */
	public Command createAddFigureElementtoDiagramPolicy(VTCDDiagram p_diagram, CMProxyElement p_element) {
		CompoundCommand cc = new CompoundCommand();
		
			VTCDFigureElement l_Element = VTCDFactory.eINSTANCE.createVTCDFigureElement();
			l_Element.setM_Element(p_element);
			cc.add(VTCDCommandFactory.INSTANCE.createAddVTCDFigureCommand(p_diagram,l_Element,null));
			//for all children 
			for (Iterator i = p_element.getProxyEquivalenceClass().iterator();i.hasNext();)
			{
				VTCDFigureEquivalenceClass l_equivalence = VTCDFactory.eINSTANCE.createVTCDFigureEquivalenceClass((CMProxyEquivalenceClass)i.next());
				cc.add(VTCDCommandFactory.INSTANCE.createFigureEquivalenceClassCommand(l_Element,l_equivalence));
			}
		
			cc.add(VTCDCommandFactory.INSTANCE.createAutomaticLayoutCommand(p_diagram));
		return cc;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.editpolicies.VTCDPolicyFactory#createDeleteLinkPolicy(biz.bi.vtcd.model.VTCDAbstractLink)
	 */
	public Command createDeleteLinkPolicy(VTCDAbstractLink p_link) {
		CompoundCommand cc = new CompoundCommand();
		if (p_link instanceof VTCDLinkCombinationEClass)
		{
			VTCDLinkCombinationEClass l_link = (VTCDLinkCombinationEClass)p_link;
						cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCommand(l_link));
			return cc;
		}
		return UnexecutableCommand.INSTANCE;
	}

	public Command createDeleteFigureEquivalenceClassPolicy(VTCDFigureEquivalenceClass equivalence)
	
	{
		CompoundCommand cc = new CompoundCommand();
		//validate all the links of the Combination
		for (Iterator i = equivalence.getM_VTCDLinkCombinationEClass().iterator();i.hasNext();)
		{
			//delete the asociated combinations
			
			VTCDFigureCombination combination = (VTCDFigureCombination)((VTCDLinkCombinationEClass)i.next()).getSourceCombination();
			cc.add(createDeleteFigureAndLinksPolicy(combination));
		}
		cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCommand(equivalence));
		return cc;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.editpolicies.VTCDPolicyFactory#createDeleteFigureEquivalenceClassFromAllDiagramsClassPolicy(biz.bi.vtcd.model.VTCDDiagramMain, biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createDeleteFigureEquivalenceClassFromAllDiagramsClassPolicy(VTCDDiagramMain p_main, CMProxyEquivalenceClass p_equivalence) 
	{
		CompoundCommand cc = new CompoundCommand();
		CMProxyElement l_ProxyElement = p_equivalence.getProxyElement();
		cc.add(createDeleteFigureEquivalenceClassPolicy(p_main.getM_VTCDFigureElement(l_ProxyElement).getM_VTCDFigureEquivalenceClass(p_equivalence)));
	//delete from all other combination diagrams
		for (Iterator iter = p_main.getM_VTCDFigureDependency().iterator(); iter.hasNext();) 
		{
			VTCDDiagramCombination diagramCombination = ((VTCDFigureDependency) iter.next()).getM_VTCDDiagramCombination();
			if (diagramCombination.getM_VTCDFigureEquivalenceClass(p_equivalence)!=null)
				cc.add(createDeleteFigureEquivalenceClassPolicy(diagramCombination.getM_VTCDFigureEquivalenceClass(p_equivalence)));
		}
		
		return cc;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.editpolicies.VTCDPolicyFactory#createReloadDiagramMainPolicy(biz.bi.vtcd.model.VTCDDiagramMain)
	 */
	public Command createReloadDiagramMainPolicy(VTCDDiagramMain p_diagram) {
		final VTCDDiagramMain l_diagram=p_diagram;
		return new Command()
		{
			CompoundCommand policy;
			public void execute(){policy= reloadPolicy.reloadVTCDDiagramPolicy(l_diagram);
									if (policy!=null)
									policy.execute();}
			public void undo(){
				if (policy!=null)
				policy.undo();}
		};
	}
	
	

}
