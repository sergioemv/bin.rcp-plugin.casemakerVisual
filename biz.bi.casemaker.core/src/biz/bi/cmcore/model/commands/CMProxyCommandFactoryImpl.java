/**
 * 
 */
package biz.bi.cmcore.model.commands;



import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.CMProxyRiskObject;
import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author Sergio M
 *
 */
public class CMProxyCommandFactoryImpl implements CMProxyCommandFactory {


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
		CMProxyAddProxyCombinationCommand command = new CMProxyAddProxyCombinationCommand();
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
		
		CMProxyAddProxyEquivalenceClassCommand command = new  CMProxyAddProxyEquivalenceClassCommand();
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
		CMProxyAddProxyElementCommand command = new CMProxyAddProxyElementCommand();
		command.setChild(p_proxyElement);
		command.setParent(parent);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyDependencyCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyDependency)
	 */
	public Command createAddProxyDependencyCommand(CMProxyTestObject p_parent, CMProxyDependency p_child) {
		
		CMProxyAddProxyDependencyCommand command = new CMProxyAddProxyDependencyCommand();
		command.setChild(p_child);
		command.setParent(p_parent);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyElementToDependencyCommand(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement)
	 */
	public Command createAddProxyElementToProxyDependencyCommand(CMProxyDependency p_source, CMProxyElement p_target) {
		
		CMProxyAddProxyElementToProxyDependencyCommand command = new CMProxyAddProxyElementToProxyDependencyCommand();
		command.setParent(p_source);
		command.setChild(p_target);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClasstoCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createAddProxyEquivalenceClasstoCombinationCommand(CMProxyCombination p_source, CMProxyEquivalenceClass p_target) {
		CMProxyAddProxyEquivalenceClasstoCombinationCommand command = new CMProxyAddProxyEquivalenceClasstoCombinationCommand();
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
			CMProxyRemoveProxyEquivalenceFromProxyCombinationCommand command= new CMProxyRemoveProxyEquivalenceFromProxyCombinationCommand();
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
		CMProxyDeleteProxyCombinationCommand command = new CMProxyDeleteProxyCombinationCommand() ;
		command.setChild(p_combination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createDeleteProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_equivalence) {
		CMProxyDeleteProxyEquivalenceClassCommand command = new CMProxyDeleteProxyEquivalenceClassCommand();
		command.setChild(p_equivalence);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyElementCommand(biz.bi.cmcore.model.CMProxyElement)
	 */
	public Command createDeleteProxyElementCommand(CMProxyElement p_proxyElement) {
		
		CMProxyDeleteProxyElementCommand command = new CMProxyDeleteProxyElementCommand();
		command.setChild(p_proxyElement);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEffectCommand(biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createDeleteProxyEffectCommand(CMProxyEffect p_proxyEffect) {
		CMProxyDeleteProxyEffectCommand command = new CMProxyDeleteProxyEffectCommand();
		command.setChild(p_proxyEffect);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createAddProxyEffectCommand(CMProxyTestObject p_parent, CMProxyEffect p_proxyEffect) {
		CMProxyAddProxyEffectCommand command = new CMProxyAddProxyEffectCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_parent);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createAddProxyEffectToProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect) {
		CMProxyAddProxyEffectToProxyEquivalenceClassCommand command = new CMProxyAddProxyEffectToProxyEquivalenceClassCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromEquivalenceCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createRemoveProxyEffectFromEquivalenceCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect) {
		CMProxyRemoveProxyEffectFromProxyEquivalenceCommand command = new CMProxyRemoveProxyEffectFromProxyEquivalenceCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyDependencyCommand(biz.bi.cmcore.model.CMProxyDependency)
	 */
	public Command createDeleteProxyDependencyCommand(CMProxyDependency p_proxyDependency) {
		CMProxyDeleteProxyDependencyCommand command = new CMProxyDeleteProxyDependencyCommand();
		command.setChild(p_proxyDependency);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyElementFromProxyDependency(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement)
	 */
	public Command createRemoveProxyElementFromProxyDependency(CMProxyDependency p_proxyDependency, CMProxyElement p_proxyElement) {
	
		CMProxyRemoveProxyElementFromProxyDependencyCommand command = new CMProxyRemoveProxyElementFromProxyDependencyCommand();
		command.setChild(p_proxyElement);
		command.setParent(p_proxyDependency);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createAddProxyEffectToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect) {
		CMProxyAddProxyEffectToProxyCombinationCommand command = new CMProxyAddProxyEffectToProxyCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect)
	 */
	public Command createRemoveProxyEffectFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect) {
		CMProxyRemoveProxyEffectFromProxyCombinationCommand command = new CMProxyRemoveProxyEffectFromProxyCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClassToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createAddProxyEquivalenceClassToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass) {
		CMProxyAddProxyEquivalenceClasstoCombinationCommand command = new CMProxyAddProxyEquivalenceClasstoCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEquivalenceClassFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	public Command createRemoveProxyEquivalenceClassFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass) {
		CMProxyRemoveProxyEquivalenceFromProxyCombinationCommand command = new CMProxyRemoveProxyEquivalenceFromProxyCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		return command;
	}

		/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeNameCommand(biz.bi.cmcore.model.CMProxyObject, java.lang.String, int)
	 */
	public Command createChangeNameCommand(CMProxyElement p_proxyElement, String p_name) {
		CMProxyChangeNameCommand command = new CMProxyChangeNameCommand(p_proxyElement, p_name);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeValueCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, java.lang.String)
	 */
	public Command createChangeValueCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, String p_value) {
		CMProxyChangeValueCommand command = new CMProxyChangeValueCommand(p_proxyEquivalenceClass,p_value);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeDescriptionCommand(biz.bi.cmcore.model.CMProxyObject)
	 */
	public Command createChangeDescriptionCommand(CMProxyObject p_proxyObject, String p_Description) {
		CMProxyChangeDescriptionCommand command = new CMProxyChangeDescriptionCommand(p_proxyObject, p_Description);
		return command;
	}	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeProxyModelCommand(biz.bi.cmcore.model.CMProxyObject, java.lang.Object)
	 */
	public Command createChangeProxyModelCommand(CMProxyObject p_proxy, Object p_model) {
		CMProxyChangeProxyModelCommand command = new CMProxyChangeProxyModelCommand();
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
		CMProxyAddProxyElementCommand command = new CMProxyAddProxyElementCommand();
		command.setChild(p_child);
		command.setParent(p_parent);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyDependencyCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyDependency, boolean)
	 */
	public Command createAddProxyDependencyCommand(CMProxyTestObject p_parent, CMProxyDependency p_child, boolean p_doCMModel) {
		CMProxyAddProxyDependencyCommand command = new CMProxyAddProxyDependencyCommand();
		command.setChild(p_child);
		command.setParent(p_parent);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyElementToProxyDependencyCommand(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement, boolean)
	 */
	public Command createAddProxyElementToProxyDependencyCommand(CMProxyDependency p_source, CMProxyElement p_target, boolean p_doCMModel) {
		CMProxyAddProxyElementToProxyDependencyCommand command = new CMProxyAddProxyElementToProxyDependencyCommand();
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
		CMProxyAddProxyEquivalenceClasstoCombinationCommand command = new CMProxyAddProxyEquivalenceClasstoCombinationCommand();
		command.setParent(p_source);
		command.setChild(p_target);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyElement, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createAddProxyEquivalenceClassCommand(CMProxyElement p_element, CMProxyEquivalenceClass p_class, boolean p_doCMModel) {
		CMProxyAddProxyEquivalenceClassCommand command = new  CMProxyAddProxyEquivalenceClassCommand();
		command.setParent(p_element);
		command.setChild(p_class);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyCombinationCommand(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyCombination, boolean)
	 */
	public Command createAddProxyCombinationCommand(CMProxyDependency p_dependency, CMProxyCombination p_combination, boolean p_doCMModel) {
		CMProxyAddProxyCombinationCommand command = new CMProxyAddProxyCombinationCommand();
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
		CMProxyDeleteProxyCombinationCommand command = new CMProxyDeleteProxyCombinationCommand() ;
		command.setChild(p_combination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createDeleteProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_equivalence, boolean p_doCMModel) {
		CMProxyDeleteProxyEquivalenceClassCommand command = new CMProxyDeleteProxyEquivalenceClassCommand();
		command.setChild(p_equivalence);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyElementCommand(biz.bi.cmcore.model.CMProxyElement, boolean)
	 */
	public Command createDeleteProxyElementCommand(CMProxyElement p_proxyElement, boolean p_doCMModel) {
		CMProxyDeleteProxyElementCommand command = new CMProxyDeleteProxyElementCommand();
		command.setChild(p_proxyElement);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyEffectCommand(biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createDeleteProxyEffectCommand(CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMProxyDeleteProxyEffectCommand command = new CMProxyDeleteProxyEffectCommand();
		command.setChild(p_proxyEffect);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createAddProxyEffectCommand(CMProxyTestObject p_parent, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMProxyAddProxyEffectCommand command = new CMProxyAddProxyEffectCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_parent);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyEquivalenceClassCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createAddProxyEffectToProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMProxyAddProxyEffectToProxyEquivalenceClassCommand command = new CMProxyAddProxyEffectToProxyEquivalenceClassCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromEquivalenceCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createRemoveProxyEffectFromEquivalenceCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMProxyRemoveProxyEffectFromProxyEquivalenceCommand command = new CMProxyRemoveProxyEffectFromProxyEquivalenceCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyEquivalenceClass);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyDependencyCommand(biz.bi.cmcore.model.CMProxyDependency, boolean)
	 */
	public Command createDeleteProxyDependencyCommand(CMProxyDependency p_proxyDependency, boolean p_doCMModel) {
		CMProxyDeleteProxyDependencyCommand command = new CMProxyDeleteProxyDependencyCommand();
		command.setChild(p_proxyDependency);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyElementFromProxyDependency(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyElement, boolean)
	 */
	public Command createRemoveProxyElementFromProxyDependency(CMProxyDependency p_proxyDependency, CMProxyElement p_proxyElement, boolean p_doCMModel) {
		CMProxyRemoveProxyElementFromProxyDependencyCommand command = new CMProxyRemoveProxyElementFromProxyDependencyCommand();
		command.setChild(p_proxyElement);
		command.setParent(p_proxyDependency);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEffectToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createAddProxyEffectToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMProxyAddProxyEffectToProxyCombinationCommand command = new CMProxyAddProxyEffectToProxyCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEffectFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEffect, boolean)
	 */
	public Command createRemoveProxyEffectFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect, boolean p_doCMModel) {
		CMProxyRemoveProxyEffectFromProxyCombinationCommand command = new CMProxyRemoveProxyEffectFromProxyCombinationCommand();
		command.setChild(p_proxyEffect);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClassToProxyCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createAddProxyEquivalenceClassToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_doCMModel) {
		CMProxyAddProxyEquivalenceClasstoCombinationCommand command = new CMProxyAddProxyEquivalenceClasstoCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEquivalenceClassFromCombinationCommand(biz.bi.cmcore.model.CMProxyCombination, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createRemoveProxyEquivalenceClassFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_doCMModel) {
		CMProxyRemoveProxyEquivalenceFromProxyCombinationCommand command = new CMProxyRemoveProxyEquivalenceFromProxyCombinationCommand();
		command.setChild(p_proxyEquivalenceClass);
		command.setParent(p_proxyCombination);
		command.setDoCMModel(p_doCMModel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeRiskLevelCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, int)
	 */
	public Command createChangeRiskLevelCommand(CMProxyRiskObject p_ProxyRiskObject, int p_riskLevel) {
		CMProxyChangeRiskLevelCommand command = new CMProxyChangeRiskLevelCommand(p_ProxyRiskObject, p_riskLevel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeStateCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, int)
	 */
	public Command createChangeStateCommand(CMProxyRiskObject p_proxyRiskObject, int p_state) {
		CMProxyChangeStateCommand command = new CMProxyChangeStateCommand(p_proxyRiskObject,p_state);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyTestCaseCommand(biz.bi.cmcore.model.CMProxyTestObject, biz.bi.cmcore.model.CMProxyTestCase, boolean)
	 */
	public Command createAddProxyTestCaseCommand(CMProxyTestObject p_object, CMProxyTestCase p_proxyTestCase, boolean p_doCMmodel) {
		CMProxyAddProxyTestCaseCommand command = new CMProxyAddProxyTestCaseCommand();
		command.setChild(p_proxyTestCase);
		command.setParent(p_object);
		command.setDoCMModel(p_doCMmodel);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createDeleteProxyTestCaseCommand(biz.bi.cmcore.model.CMProxyTestCase, boolean)
	 */
	public Command createDeleteProxyTestCaseCommand(CMProxyTestCase p_proxyTestCase, boolean p_b) {
		CMProxyDeleteProxyTestCaseCommand command = new CMProxyDeleteProxyTestCaseCommand();
		command.setChild(p_proxyTestCase);
		command.setDoCMModel(p_b);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClasssToProxyDependencyCommand(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createAddProxyEquivalenceClasssToProxyDependencyCommand(CMProxyDependency p_proxyDependency, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_b) {
		CMProxyAddProxyEquivalenceClasstoDependencyCommand command = new CMProxyAddProxyEquivalenceClasstoDependencyCommand();
		command.setParent(p_proxyDependency);
		command.setChild(p_proxyEquivalenceClass);
		command.setDoCMModel(p_b);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEquivalenceClassFromProxyDependency(biz.bi.cmcore.model.CMProxyDependency, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createRemoveProxyEquivalenceClassFromProxyDependency(CMProxyDependency p_proxyDependency, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_b) {
		CMProxyRemoveProxyEquivalenceClassFromProxyDependencyCommand command = new CMProxyRemoveProxyEquivalenceClassFromProxyDependencyCommand();
		command.setParent(p_proxyDependency);
		command.setChild(p_proxyEquivalenceClass);
		command.setDoCMModel(p_b);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyEquivalenceClassToProxyTestCaseCommand(biz.bi.cmcore.model.CMProxyTestCase, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createAddProxyEquivalenceClassToProxyTestCaseCommand(CMProxyTestCase p_proxyTestCase, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_b) {
		
		CMProxyAddProxyEquivalenceClasstoTestCaseCommand command = new CMProxyAddProxyEquivalenceClasstoTestCaseCommand();
		command.setParent(p_proxyTestCase );
		command.setChild(p_proxyEquivalenceClass);
		command.setDoCMModel(p_b);
		return command;
		
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyEquivalenceClassFromTestCaseCommand(biz.bi.cmcore.model.CMProxyTestCase, biz.bi.cmcore.model.CMProxyEquivalenceClass, boolean)
	 */
	public Command createRemoveProxyEquivalenceClassFromTestCaseCommand(CMProxyTestCase p_proxyTestCase, CMProxyEquivalenceClass p_proxyEquivalenceClass, boolean p_b) {
		CMProxyRemoveProxyEquivalenceClassFromProxyTestCaseCommand command = new CMProxyRemoveProxyEquivalenceClassFromProxyTestCaseCommand();
		command.setParent(p_proxyTestCase);
		command.setChild(p_proxyEquivalenceClass);
		command.setDoCMModel(p_b);
		
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createAddProxyCombinationToProxyTestCaseCommand(biz.bi.cmcore.model.CMProxyTestCase, biz.bi.cmcore.model.CMProxyCombination, boolean)
	 */
	public Command createAddProxyCombinationToProxyTestCaseCommand(CMProxyTestCase p_proxyTestCase, CMProxyCombination p_proxyCombination, boolean p_b) {
		CMProxyAddProxyCombinationtoTestCaseCommand command = new CMProxyAddProxyCombinationtoTestCaseCommand();
		command.setParent(p_proxyTestCase );
		command.setChild(p_proxyCombination);
		command.setDoCMModel(p_b);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createRemoveProxyCombinationFromTestCaseCommand(biz.bi.cmcore.model.CMProxyTestCase, biz.bi.cmcore.model.CMProxyCombination, boolean)
	 */
	public Command createRemoveProxyCombinationFromTestCaseCommand(CMProxyTestCase p_proxyTestCase, CMProxyCombination p_proxyCombination, boolean p_b) {
		CMProxyRemoveProxyCombinationFromProxyTestCaseCommand command = new CMProxyRemoveProxyCombinationFromProxyTestCaseCommand();
		command.setParent(p_proxyTestCase);
		command.setChild(p_proxyCombination);
		command.setDoCMModel(p_b);
		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.model.commands.CMProxyCommandFactory#createChangeEffectCommand(biz.bi.cmcore.model.CMProxyEquivalenceClass, java.util.List)
	 */
	


	

	
}
