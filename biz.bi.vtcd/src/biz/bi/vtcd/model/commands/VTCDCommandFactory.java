/**
 * 
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

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

/**
 * Command Factory interface for the VTCD
 * @author smoreno
 *
 */
public interface VTCDCommandFactory {
	
	VTCDCommandFactory INSTANCE = new VTCDCommandFactoryImpl();

	Command createChangeConstraintCommand(VTCDAbstractFigure model,Rectangle constraint);

	Command createFigureElementCommand(VTCDDiagram p_parent,VTCDFigureElement p_child,Rectangle p_constraint );
	
	Command createFigureDependencyCommand(VTCDDiagramMain p_Parent, VTCDFigureDependency p_Child, Rectangle p_constraint);

	/**
	 * @param p_combination
	 * @param p_model
	 * @param p_constraint
	 * @return
	 */
	Command createFigureCombinationCommand(VTCDDiagramCombination p_combination, VTCDFigureCombination p_model, Rectangle p_constraint);

	
	/**
	 * @param p_dependency
	 * @param p_element
	 * @param p_element2
	 * @return
	 */
	Command createLinkDependencyElementCommand(VTCDFigureDependency p_dependency, VTCDLinkDependencyElement p_link, VTCDFigureElement p_element);

	/**
	 * @param p_combination
	 * @param p_class
	 * @param p_class2
	 * @return
	 */
	Command createLinkCombinationEClassCommand(VTCDFigureCombination p_combination, VTCDLinkCombinationEClass p_link, VTCDFigureEquivalenceClass p_EquivalenceClass);
	/**
	 * @param p_combination
	 * @param p_combination2
	 * @return
	 */
	Command createDeleteFigureCommand(Object p_Figure);
	
	Command createAddVTCDFigureCommand(VTCDDiagram parent, VTCDAbstractFigure child, Rectangle constraint);

	Command createLinkCommand(VTCDAbstractFigure source,VTCDAbstractFigure target,VTCDAbstractLink link);

	Command createAutomaticLayoutCommand(VTCDDiagram diagram);
	/**
	 * @param p_element
	 * @param p_class
	 * @return
	 */
	Command createFigureEquivalenceClassCommand(VTCDFigureElement parent, VTCDFigureEquivalenceClass child);

	/**
	 * @param p_dependency
	 * @param p_combination
	 * @return
	 */
	Command createDiagramCombinationCommand(VTCDFigureDependency p_dependency, VTCDDiagramCombination p_diagram);

	/**
	 * @param p_figureElement
	 * @param p_b
	 * @return
	 */
	Command createChangeFoldedCommand(VTCDFigureElement p_figureElement, boolean p_folded);

	/**
	 * @param p_figureElement
	 * @return
	 */
	Command createDeleteFigureElement(VTCDFigureElement p_figureElement);

	/**
	 * @param p_figureEquivalenceClass
	 * @return
	 */
	Command createDeleteFigureEquivalenceClassCommand(VTCDFigureEquivalenceClass p_figureEquivalenceClass);

	/**
	 * @param p_figureDependency
	 * @return
	 */
	Command createDeleteFigureDependencyCommand(VTCDFigureDependency p_figureDependency);

	/**
	 * @param p_figureDependency
	 * @param p_diagramCombination
	 * @return
	 */
	Command createAddDiagramCombination(VTCDFigureDependency p_figureDependency, VTCDDiagramCombination p_diagramCombination);

	/**
	 * @param p_linkDependencyElement
	 * @return
	 */
	Command createDeleteLinkDependencyElementCommand(VTCDLinkDependencyElement p_linkDependencyElement);

	/**
	 * @param p_figureCombination
	 * @return
	 */
	Command createDeleteFigureCombinationCommand(VTCDFigureCombination p_figureCombination);

	/**
	 * @param p_linkCombinationEClass
	 * @param p_terminal_1_in
	 * @return
	 */
	Command createChangeTerminalCommand(VTCDLinkCombinationEClass p_linkCombinationEClass, String p_terminal, boolean target);

	/**
	 * @param p_linkCombinationEClass
	 * @return
	 */
	Command createDeleteLinkCombinationEClassCommand(VTCDLinkCombinationEClass p_linkCombinationEClass);

	Command createChangeElementIconCommand(VTCDFigureElement p_figureElement, String p_path);
}
	




