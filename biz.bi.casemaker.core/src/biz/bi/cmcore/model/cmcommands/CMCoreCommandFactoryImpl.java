/**
 * 
 */
package biz.bi.cmcore.model.cmcommands;



import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author Sergio M
 *
 */
public class CMCoreCommandFactoryImpl implements CMCoreCommandFactory {


	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddCommand(biz.bi.cmcore.model.CMProxyObject)
	 */
	public Command createAddNewProxyObjectCommand(CMProxyObject parent , CMProxyObject child) {

			switch (child.eClass().getClassifierID()) {
			case CMCorePackage.CM_PROXY_ELEMENT:
				return createAddProxyElementCommand((CMProxyTestObject)parent,(CMProxyElement) child);
			case CMCorePackage.CM_PROXY_DEPENDENCY:
				return createAddProxyDependencyCommand((CMProxyTestObject)parent,(CMProxyDependency) child);				
			case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS:
				return createAddProxyEquivalenceClassCommand((CMProxyElement)parent,(CMProxyEquivalenceClass)child);
			case CMCorePackage.CM_PROXY_COMBINATION:
				return createAddProxyCombinationCommand((CMProxyDependency)parent, (CMProxyCombination) child);
			default:
				return UnexecutableCommand.INSTANCE;
			}
		
	}
	
	/**
	 * @param p_object
	 * @param p_combination
	 * @return
	 */
	public Command createAddProxyCombinationCommand(CMProxyDependency p_dependency, CMProxyCombination p_combination) {
		CMCoreAddCombinationCommand command = new CMCoreAddCombinationCommand();
		command.setChild(p_combination);
		command.setParent(p_dependency);
		return command;
	}

	/**
	 * @param p_element
	 * @param p_class
	 * @return
	 */
	public Command createAddProxyEquivalenceClassCommand(CMProxyElement p_element, CMProxyEquivalenceClass p_class) {
		
		CMCoreAddEquivalenceClassCommand command = new  CMCoreAddEquivalenceClassCommand();
		command.setParent(p_element);
		command.setChild(p_class);
		return command;
	}

	public Command createAddExistentProxyObjectCommand(CMProxyObject parent , CMProxyObject child)
	{
		if ((parent instanceof CMProxyDependency) && (child instanceof CMProxyElement))
			return createAddProxyElementToProxyDependencyCommand((CMProxyDependency)parent, (CMProxyElement) child);
		if ((parent instanceof CMProxyCombination) && (child instanceof CMProxyEquivalenceClass))
			return this.createAddProxyEquivalenceClasstoCombinationCommand((CMProxyCombination)parent,(CMProxyEquivalenceClass)child);
		return UnexecutableCommand.INSTANCE;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyElement(biz.bi.cmcore.model.CMProxyElement)
	 */
	public Command createAddProxyElementCommand(CMProxyTestObject parent,CMProxyElement p_proxyElement) {
		CMCoreAddElementCommand command = new CMCoreAddElementCommand();
		command.setChild(p_proxyElement);
		command.setParent(parent);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyDependencyCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyDependency)
	 */
	public Command createAddProxyDependencyCommand(CMProxyTestObject p_parent, CMProxyDependency p_child) {
		
		CMCoreAddDependencyCommand command = new CMCoreAddDependencyCommand();
		command.setChild(p_child);
		command.setParent(p_parent);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyElementToDependencyCommand(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement)
	 */
	public Command createAddProxyElementToProxyDependencyCommand(CMProxyDependency p_source, CMProxyElement p_target) {
		
		CMCoreAddElementToDependencyCommand command = new CMCoreAddElementToDependencyCommand();
		command.setParent(p_source);
		command.setChild(p_target);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClasstoCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createAddProxyEquivalenceClasstoCombinationCommand(CMProxyCombination p_source, CMProxyEquivalenceClass p_target) {
		CMCoreAddEquivalenceClasstoCombinationCommand command = new CMCoreAddEquivalenceClasstoCombinationCommand();
		command.setParent(p_source);
		command.setChild(p_target);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveReferenceCommand(biz.bi.cmcore.model.CMProxyObject, biz.bi.cmcore.model.CMProxyObject)
	 */
	public Command createRemoveReferenceCommand(CMProxyObject p_source, CMProxyObject p_target) {
		
		if ((p_source instanceof CMProxyCombination)
			&&(p_target instanceof CMProxyEquivalenceClass))
		{
			CMCoreRemoveEquivalenceFromCombinationCommand command= new CMCoreRemoveEquivalenceFromCombinationCommand();
			command.setChild((CMProxyEquivalenceClass)p_target);
			command.setParent((CMProxyCombination)p_source);
			return command;
		}
		else
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveCombinationCommand(biz.bi.cmcore.model.CMProxyCombination)
	 */
	public Command createDeleteProxyCombinationCommand(CMProxyCombination p_combination) {
		CMCoreDeleteCombinationCommand command = new CMCoreDeleteCombinationCommand() ;
	//	command.setChild(p_combination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createDeleteProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_equivalence) {
		CMCoreDeleteEquivalenceClassCommand command = new CMCoreDeleteEquivalenceClassCommand();
		command.setChild(p_equivalence);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyElementCommand(biz.bi.cmcore.model.CMProxyElement)
	 */
	public Command createDeleteProxyElementCommand(CMProxyElement p_proxyElement) {
		
		CMCoreDeleteElementCommand command = new CMCoreDeleteElementCommand();
		command.setChild(p_proxyElement);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEffectCommand(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createDeleteProxyEffectCommand(CMProxyEffect p_proxyEffect) {
		CMCoreDeleteEffectCommand command = new CMCoreDeleteEffectCommand();
		command.setChild(p_proxyEffect);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createAddProxyEffectCommand(CMProxyTestObject p_parent, CMProxyEffect p_proxyEffect) {
		CMCoreAddEffectCommand command = new CMCoreAddEffectCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_parent);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createAddProxyEffectToProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect) {
		CMCoreAddEffectToEquivalenceClassCommand command = new CMCoreAddEffectToEquivalenceClassCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromEquivalenceCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createRemoveProxyEffectFromEquivalenceCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect) {
		CMCoreRemoveEffectFromEquivalenceCommand command = new CMCoreRemoveEffectFromEquivalenceCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyDependencyCommand(biz.bi.cmcore.model.CMProxyDependency)
	 */
	public Command createDeleteProxyDependencyCommand(CMProxyDependency p_proxyDependency) {
		CMCoreDeleteDependencyCommand command = new CMCoreDeleteDependencyCommand();
		command.setChild(p_proxyDependency);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyElementFromProxyDependency(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement)
	 */
	public Command createRemoveProxyElementFromProxyDependency(CMProxyDependency p_proxyDependency, CMProxyElement p_proxyElement) {
	
		CMCoreRemoveElementFromDependencyCommand command = new CMCoreRemoveElementFromDependencyCommand();
		command.setChild(p_proxyElement);
		command.setParent(p_proxyDependency);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createAddProxyEffectToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect) {
		CMCoreAddEffectToCombinationCommand command = new CMCoreAddEffectToCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createRemoveProxyEffectFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect) {
		CMCoreRemoveEffectFromCombinationCommand command = new CMCoreRemoveEffectFromCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClassToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createAddProxyEquivalenceClassToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass) {
		CMCoreAddEquivalenceClasstoCombinationCommand command = new CMCoreAddEquivalenceClasstoCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEquivalenceClassFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createRemoveProxyEquivalenceClassFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass) {
		CMCoreRemoveEquivalenceFromCombinationCommand command = new CMCoreRemoveEquivalenceFromCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		return command;
	}

		/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeNameCommand(biz.bi.cmcore.model.CMProxyObject, java.lang.String, int)
	 */
	public Command createChangeNameCommand(CMProxyElement p_proxyElement, String p_name) {
		CMCoreChangeNameCommand command = new CMCoreChangeNameCommand(p_proxyElement, p_name);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeValueCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, java.lang.String)
	 */
	public Command createChangeValueCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, String p_value) {
		CMCoreChangeValueCommand command = new CMCoreChangeValueCommand(p_proxyEquivalenceClass,p_value);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeDescriptionCommand(biz.bi.cmcore.model.CMProxyObject)
	 */
	public Command createChangeDescriptionCommand(CMProxyObject p_proxyObject, String p_Description) {
		CMCoreChangeDescriptionCommand command = new CMCoreChangeDescriptionCommand(p_proxyObject, p_Description);
		return command;
	}	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeProxyModelCommand(biz.bi.cmcore.model.CMProxyObject, java.lang.Object)
	 */
	public Command createChangeProxyModelCommand(CMProxyObject p_proxy, Object p_model) {
		CMCoreChangeProxyModelCommand command = new CMCoreChangeProxyModelCommand();
		command.setModel(p_model);
		command.setProxy(p_proxy);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddNewProxyObjectCommand(biz.bi.cmcore.model.CMProxyObject, biz.bi.cmcore.model.CMProxyObject, boolean)
	 */
	public Command createAddNewProxyObjectCommand(CMProxyObject p_parent, CMProxyObject p_child, boolean p_doCMModel) {
		switch (p_child.eClass().getClassifierID()) {
		case CMCorePackage.CM_PROXY_ELEMENT:
			return createAddProxyElementCommand((CMProxyTestObject)p_parent,(CMProxyElement) p_child,p_doCMModel);
		case CMCorePackage.CM_PROXY_DEPENDENCY:
			return createAddProxyDependencyCommand((CMProxyTestObject)p_parent,(CMProxyDependency) p_child,p_doCMModel);				
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS:
			return createAddProxyEquivalenceClassCommand((CMProxyElement)p_parent,(CMProxyEquivalenceClass)p_child,p_doCMModel);
		case CMCorePackage.CM_PROXY_COMBINATION:
			return createAddProxyCombinationCommand((CMProxyDependency)p_parent, (CMProxyCombination) p_child,p_doCMModel);
		default:
			return UnexecutableCommand.INSTANCE;
		}	
	}


	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyElementCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyElement, boolean)
	 */
	public Command createAddProxyElementCommand(CMProxyTestObject p_parent, CMProxyElement p_child, boolean p_doCMModel) {
		CMCoreAddElementCommand command = new CMCoreAddElementCommand();
		command.setChild(p_child);
		command.setParent(p_parent);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyDependencyCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyDependency, boolean)
	 */
	public Command createAddProxyDependencyCommand(CMProxyTestObject p_parent, CMProxyDependency p_child, boolean p_doCMModel) {
		CMCoreAddDependencyCommand command = new CMCoreAddDependencyCommand();
		command.setChild(p_child);
		command.setParent(p_parent);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyElementToProxyDependencyCommand(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement, boolean)
	 */
	public Command createAddProxyElementToProxyDependencyCommand(CMProxyDependency p_source, CMProxyElement p_target, boolean p_doCMModel) {
		CMCoreAddElementToDependencyCommand command = new CMCoreAddElementToDependencyCommand();
		command.setParent(p_source);
		command.setChild(p_target);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddExistentProxyObjectCommand(biz.bi.cmcore.model.CMProxyObject, biz.bi.cmcore.model.CMProxyObject, boolean)
	 */
	public Command createAddExistentProxyObjectCommand(CMProxyObject p_parent, CMProxyObject p_child, boolean p_doCMModel) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClasstoCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createAddProxyEquivalenceClasstoCombinationCommand(CMProxyCombination p_source, CMProxyEquivalenceClass p_target, boolean p_doCMModel) {
		CMCoreAddEquivalenceClasstoCombinationCommand command = new CMCoreAddEquivalenceClasstoCombinationCommand();
		command.setParent(p_source);
		command.setChild(p_target);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyElement, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createAddProxyEquivalenceClassCommand(CMProxyElement p_element, CMProxyEquivalenceClass p_class, boolean p_doCMModel) {
		CMCoreAddEquivalenceClassCommand command = new  CMCoreAddEquivalenceClassCommand();
		command.setParent(p_element);
		command.setChild(p_class);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyCombinationCommand(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyCombination, boolean)
	 */
	public Command createAddProxyCombinationCommand(CMProxyDependency p_dependency, CMProxyCombination p_combination, boolean p_doCMModel) {
		CMCoreAddCombinationCommand command = new CMCoreAddCombinationCommand();
		command.setChild(p_combination);
		command.setParent(p_dependency);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveReferenceCommand(biz.bi.cmcore.model.CMProxyObject, biz.bi.cmcore.model.CMProxyObject, boolean)
	 */
	public Command createRemoveReferenceCommand(CMProxyObject p_source, CMProxyObject p_target, boolean p_doCMModel) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, boolean)
	 */
	public Command createDeleteProxyCombinationCommand(CMProxyCombination p_combination, boolean p_doCMModel) {
		CMCoreDeleteCombinationCommand command = new CMCoreDeleteCombinationCommand() ;
	//	command.setChild(p_combination);
	//	command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createDeleteProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_equivalence, boolean p_doCMModel) {
		CMCoreDeleteEquivalenceClassCommand command = new CMCoreDeleteEquivalenceClassCommand();
		command.setChild(p_equivalence);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyElementCommand(biz.bi.cmcore.model.CMProxyElement, boolean)
	 */
	public Command createDeleteProxyElementCommand(CMProxyElement p_proxyElement, boolean p_doCMModel) {
		CMCoreDeleteElementCommand command = new CMCoreDeleteElementCommand();
		command.setChild(p_proxyElement);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEffectCommand(biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createDeleteProxyEffectCommand(CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMCoreDeleteEffectCommand command = new CMCoreDeleteEffectCommand();
		command.setChild(p_proxyEffect);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createAddProxyEffectCommand(CMProxyTestObject p_parent, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMCoreAddEffectCommand command = new CMCoreAddEffectCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_parent);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createAddProxyEffectToProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMCoreAddEffectToEquivalenceClassCommand command = new CMCoreAddEffectToEquivalenceClassCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromEquivalenceCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createRemoveProxyEffectFromEquivalenceCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMCoreRemoveEffectFromEquivalenceCommand command = new CMCoreRemoveEffectFromEquivalenceCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyDependencyCommand(biz.bi.cmcore.model.CMProxyDependency, boolean)
	 */
	public Command createDeleteProxyDependencyCommand(CMProxyDependency p_proxyDependency, boolean p_doCMModel) {
		CMCoreDeleteDependencyCommand command = new CMCoreDeleteDependencyCommand();
		command.setChild(p_proxyDependency);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyElementFromProxyDependency(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement, boolean)
	 */
	public Command createRemoveProxyElementFromProxyDependency(CMProxyDependency p_proxyDependency, CMProxyElement p_proxyElement, boolean p_doCMModel) {
		CMCoreRemoveElementFromDependencyCommand command = new CMCoreRemoveElementFromDependencyCommand();
		command.setChild(p_proxyElement);
		command.setParent(p_proxyDependency);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createAddProxyEffectToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMCoreAddEffectToCombinationCommand command = new CMCoreAddEffectToCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createRemoveProxyEffectFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMCoreRemoveEffectFromCombinationCommand command = new CMCoreRemoveEffectFromCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClassToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createAddProxyEquivalenceClassToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_doCMModel) {
		CMCoreAddEquivalenceClasstoCombinationCommand command = new CMCoreAddEquivalenceClasstoCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEquivalenceClassFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createRemoveProxyEquivalenceClassFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_doCMModel) {
		CMCoreRemoveEquivalenceFromCombinationCommand command = new CMCoreRemoveEquivalenceFromCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createReloadProxyCommand(biz.bi.cmcore.model.CMProxyObject)
	 */



	
}
