/**
 * 
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;

import biz.bi.vtcd.figures.VTCDFigureEquivalenceClassView;
import biz.bi.vtcd.model.VTCDAbstractFigure;
import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.model.impl.VTCDFigureCombinationImpl;
import biz.bi.vtcd.model.impl.VTCDFigureEquivalenceClassImpl;
import biz.bi.vtcd.model.impl.VTCDLinkCombinationEClassImpl;
import biz.bi.vtcd.provider.VTCDEditPlugin;

/**
 * Factory for the creation of new commands
 * @author smoreno
 *
 */
public class VTCDCommandFactoryImpl implements VTCDCommandFactory{

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createChangeConstraintCommand(biz.bi.vtcd.model.VTCDAbstractFigure, org.eclipse.draw2d.geometry.Rectangle)
	 */
	public Command createChangeConstraintCommand(VTCDAbstractFigure p_model, Rectangle p_constraint) {
	
		VTCDChangeFigureConstraintCommand command = new VTCDChangeFigureConstraintCommand();
		
		command.setModel(p_model);
		
		command.setConstraint(p_constraint);
		command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Move_Resize_object_label"));
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createLinkDependencyElementCommand(biz.bi.vtcd.model.VTCDFigureDependency, biz.bi.vtcd.model.VTCDFigureElement, biz.bi.vtcd.model.VTCDLinkDependencyElement)
	 */

	public Command createFigureElementCommand(VTCDDiagram p_parent, VTCDFigureElement p_child, Rectangle p_constraint) {

		VTCDCreateElementCommand command = new VTCDCreateElementCommand();
		if (p_constraint!=null)
			command.setConstraint(p_constraint);
		command.setChild(p_child);
		command.setParent(p_parent);
		command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Create_element_label"));
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDependencyCommand(biz.bi.vtcd.model.VTCDDiagram, biz.bi.vtcd.model.VTCDFigureDependency, org.eclipse.draw2d.geometry.Rectangle)
	 */
	public Command createFigureDependencyCommand(VTCDDiagramMain p_Parent, VTCDFigureDependency p_Child, Rectangle p_constraint) {
		VTCDCreateDependencyCommand command = new VTCDCreateDependencyCommand();
		if (p_constraint!=null)
			command.setConstraint(p_constraint);
		command.setChild(p_Child);
		command.setParent(p_Parent);
		command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Create_dependency_label"));
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createCombinationCommand(biz.bi.vtcd.model.VTCDDiagramCombination, biz.bi.vtcd.model.VTCDFigureCombination, org.eclipse.draw2d.geometry.Rectangle)
	 */
	public Command createFigureCombinationCommand(VTCDDiagramCombination p_combination, VTCDFigureCombination p_model, Rectangle p_constraint) {
		VTCDAddFigureCombinationCommand command = new VTCDAddFigureCombinationCommand();
		command.setChild(p_model);
		command.setParent(p_combination);
		command.setConstraint(p_constraint);
		command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Create_combination_label"));
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createLinkDependencyElementCommand(biz.bi.vtcd.model.VTCDFigureDependency, biz.bi.vtcd.model.VTCDLinkDependencyElement, biz.bi.vtcd.model.VTCDFigureElement)
	 */
	public Command createLinkDependencyElementCommand(VTCDFigureDependency p_dependency, VTCDLinkDependencyElement p_link, VTCDFigureElement p_element) {
		VTCDCreateLinkDependencyElementCommand command = new VTCDCreateLinkDependencyElementCommand();
		command.setConnection(p_link);
		command.setSource(p_dependency);
		command.setTarget(p_element);
		command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Create_link_dependencyElement_label"));
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDeleteCombinationCommand(biz.bi.vtcd.model.VTCDDiagramCombination, biz.bi.vtcd.model.VTCDFigureCombination)
	 */
	public Command createDeleteFigureCommand(Object p_figure) {
		if (p_figure instanceof VTCDFigureCombinationImpl)
		{
			VTCDDeleteFigureCombinationCommand command = new VTCDDeleteFigureCombinationCommand();
			command.setCombination((VTCDFigureCombination)p_figure);
			command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Delete_combination_label"));
			return command;
		}
		if (p_figure instanceof VTCDLinkCombinationEClassImpl)
		{
			VTCDDeleteLinkCombinationEClassCommand command = new VTCDDeleteLinkCombinationEClassCommand();
			command.setConnection((VTCDLinkCombinationEClass)p_figure);
			command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Delete_link_combinationEclass_label"));
			return command;
		}	
		
		if (p_figure instanceof VTCDFigureEquivalenceClassImpl)
		{
			VTCDDeleteEquivalenceClassCommand command = new VTCDDeleteEquivalenceClassCommand();
			command.setChild((VTCDFigureEquivalenceClass)p_figure);
			command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Delete_equivalenceClass_label"));
			return command;
		}	
		return UnexecutableCommand.INSTANCE;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createAddVTCDFigureCommand(biz.bi.vtcd.model.VTCDDiagram, biz.bi.vtcd.model.VTCDAbstractFigure, org.eclipse.draw2d.geometry.Rectangle)
	 */
	public Command createAddVTCDFigureCommand(VTCDDiagram p_parent, VTCDAbstractFigure p_child, Rectangle p_constraint) 
	{
	   switch ((p_child.eClass().getClassifierID())) {
	   case VTCDPackage.VTCD_FIGURE_ELEMENT:
		   return createFigureElementCommand(p_parent,(VTCDFigureElement)p_child,p_constraint);
	   case VTCDPackage.VTCD_FIGURE_DEPENDENCY:
		   return createFigureDependencyCommand((VTCDDiagramMain)p_parent,(VTCDFigureDependency)p_child,p_constraint);
	   case VTCDPackage.VTCD_FIGURE_COMBINATION:
		   return createFigureCombinationCommand((VTCDDiagramCombination)p_parent,(VTCDFigureCombination)p_child,p_constraint);
	  
	   default:
		   return null;
	} 
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createLinkCommand(biz.bi.vtcd.model.VTCDAbstractFigure, biz.bi.vtcd.model.VTCDAbstractFigure, biz.bi.vtcd.model.VTCDAbstractLink)
	 */
	public Command createLinkCommand(VTCDAbstractFigure p_source, VTCDAbstractFigure p_target, VTCDAbstractLink p_link) {
		
		VTCDCreateLinkCommand command = new VTCDCreateLinkCommand();
		command.setConnection(p_link);
		command.setSource(p_source);
		command.setTarget(p_target);
		return command;
	
	}

	public Command createLinkCombinationEClassCommand(VTCDFigureCombination p_combination, VTCDLinkCombinationEClass p_link, VTCDFigureEquivalenceClass p_EquivalenceClass) {
		VTCDCreateLinkCombinationEClassCommand command = new VTCDCreateLinkCombinationEClassCommand();
		command.setConnection(p_link);
		command.setSource(p_combination);
		command.setTarget(p_EquivalenceClass);
		command.setTargetTerminal(VTCDFigureEquivalenceClassView.TERMINAL_1_IN);
		command.setLabel(VTCDEditPlugin.INSTANCE.getString("_COMMAND_Create_link_combinationEclass_label"));
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createAutomaticLayoutCommand(biz.bi.vtcd.model.VTCDDiagram)
	 */
	public Command createAutomaticLayoutCommand(VTCDDiagram p_diagram) {
		
		VTCDCreateAutomaticLayoutCommand command = new VTCDCreateAutomaticLayoutCommand();
		command.setDiagram(p_diagram);
		
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createAddEquivalenceClassCommand(biz.bi.vtcd.model.VTCDFigureElement, biz.bi.vtcd.model.VTCDFigureEquivalenceClass)
	 */
	public Command createFigureEquivalenceClassCommand(VTCDFigureElement p_parent, VTCDFigureEquivalenceClass p_child) {
		VTCDCreateEquivalenceClassCommand command = new VTCDCreateEquivalenceClassCommand();
		command.setChild(p_child);
		command.setParent(p_parent);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDiagramCombinationCommand(biz.bi.vtcd.model.VTCDFigureDependency, biz.bi.vtcd.model.VTCDDiagramCombination)
	 */
	public Command createDiagramCombinationCommand(VTCDFigureDependency p_dependency, VTCDDiagramCombination p_diagram) {
		VTCDCreateDiagramCombinationCommand command = new VTCDCreateDiagramCombinationCommand();
		command.setChild(p_diagram);
		command.setParent(p_dependency);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createChangeFoldedCommand(biz.bi.vtcd.model.VTCDFigureElement, boolean)
	 */
	public Command createChangeFoldedCommand(VTCDFigureElement p_figureElement, boolean p_folded) {
		VTCDChangeFoldedCommand command = new VTCDChangeFoldedCommand();
		command.setElement(p_figureElement);
		command.setNewValue(p_folded);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDeleteFigureElement(biz.bi.vtcd.model.VTCDFigureElement)
	 */
	public Command createDeleteFigureElement(VTCDFigureElement p_figureElement) {
		VTCDDeleteFigureElementCommand command = new VTCDDeleteFigureElementCommand();
		command.setChild(p_figureElement);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDeleteFigureEquivalenceClassCommand(biz.bi.vtcd.model.VTCDFigureEquivalenceClass)
	 */
	public Command createDeleteFigureEquivalenceClassCommand(VTCDFigureEquivalenceClass p_figureEquivalenceClass) {
		VTCDDeleteEquivalenceClassCommand command = new VTCDDeleteEquivalenceClassCommand();
		command.setChild(p_figureEquivalenceClass);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDeleteFigureDependencyCommand(biz.bi.vtcd.model.VTCDFigureDependency)
	 */
	public Command createDeleteFigureDependencyCommand(VTCDFigureDependency p_figureDependency) {
		VTCDDeleteFigureDependencyCommand command = new VTCDDeleteFigureDependencyCommand();
		command.setChild(p_figureDependency);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createAddDiagramCombination(biz.bi.vtcd.model.VTCDFigureDependency, biz.bi.vtcd.model.VTCDDiagramCombination)
	 */
	public Command createAddDiagramCombination(VTCDFigureDependency p_figureDependency, VTCDDiagramCombination p_diagramCombination) {
		VTCDSetDiagramCombination command = new VTCDSetDiagramCombination();
		command.setChild(p_diagramCombination);
		command.setParent(p_figureDependency);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDeleteLinkDependencyElementCommand(biz.bi.vtcd.model.VTCDLinkDependencyElement)
	 */
	public Command createDeleteLinkDependencyElementCommand(VTCDLinkDependencyElement p_linkDependencyElement) {
		VTCDDeleteLinkDependencyElementCommand command = new VTCDDeleteLinkDependencyElementCommand();
		command.setConnection(p_linkDependencyElement);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDeleteFigureCombinationCommand(biz.bi.vtcd.model.VTCDFigureCombination)
	 */
	public Command createDeleteFigureCombinationCommand(VTCDFigureCombination p_figureCombination) {
		VTCDDeleteFigureCombinationCommand command = new VTCDDeleteFigureCombinationCommand();
		command.setCombination(p_figureCombination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createChangeTerminalCommand(biz.bi.vtcd.model.VTCDLinkCombinationEClass, java.lang.String)
	 */
	public Command createChangeTerminalCommand(VTCDLinkCombinationEClass p_linkCombinationEClass, String p_terminal, boolean target) {
		VTCDChangeTerminalCommand command = new VTCDChangeTerminalCommand();
		command.setLink(p_linkCombinationEClass);
		command.setNewValue(p_terminal);
		command.setTarget(target);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.commands.VTCDCommandFactory#createDeleteLinkCombinationEClassCommand(biz.bi.vtcd.model.VTCDLinkCombinationEClass)
	 */
	public Command createDeleteLinkCombinationEClassCommand(VTCDLinkCombinationEClass p_linkCombinationEClass) {
		VTCDDeleteLinkCombinationEClassCommand command = new VTCDDeleteLinkCombinationEClassCommand();
		command.setConnection(p_linkCombinationEClass);
		return command;
	}
	
	
	public Command createChangeElementIconCommand(VTCDFigureElement p_figureElement, String p_path) {
		VTCDChangeElementIconCommand command = new VTCDChangeElementIconCommand(p_figureElement,p_path);
		return command;
	}

}
