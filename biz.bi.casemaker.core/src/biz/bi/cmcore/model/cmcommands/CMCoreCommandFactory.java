/**
 * 
 */
package biz.bi.cmcore.model.cmcommands;


import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * Interface for all commands that affect the proxy model
 * @author Sergio M
 *
 */
public interface CMCoreCommandFactory {
	
	public static final CMCoreCommandFactory INSTANCE = new CMCoreCommandFactoryImpl();
	
	Command createAddNewProxyObjectCommand(CMProxyObject parent,CMProxyObject child);
	
	Command createAddProxyElementCommand(CMProxyTestObject parent,CMProxyElement child);
	
	Command createAddProxyDependencyCommand(CMProxyTestObject parent, CMProxyDependency child);

	Command createAddProxyElementToProxyDependencyCommand(CMProxyDependency source, CMProxyElement target);
	
	Command createAddExistentProxyObjectCommand(CMProxyObject parent , CMProxyObject child);
	
	Command createAddProxyEquivalenceClasstoCombinationCommand(CMProxyCombination source, CMProxyEquivalenceClass target);
	
	Command createAddProxyEquivalenceClassCommand(CMProxyElement p_element, CMProxyEquivalenceClass p_class);

	Command createAddProxyCombinationCommand(CMProxyDependency p_dependency, CMProxyCombination p_combination);

	/**
	 * @param p_combination
	 * @param p_equivalenceClass
	 * @return
	 */ 
	Command createRemoveReferenceCommand(CMProxyObject p_source, CMProxyObject p_target);

	/**
	 * @param p_combination
	 * @return
	 */
	Command createDeleteProxyCombinationCommand(CMProxyCombination p_combination);

	/**
	 * @param p_equivalence
	 * @return
	 */
	Command createDeleteProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_equivalence);

	/**
	 * @param p_proxyElement
	 * @return
	 */
	Command createDeleteProxyElementCommand(CMProxyElement p_proxyElement);

	/**
	 * @param p_proxyEffect
	 * @return
	 */
	Command createDeleteProxyEffectCommand(CMProxyEffect p_proxyEffect);

	/**
	 * @param p_parent
	 * @param p_proxyEffect
	 * @return
	 */
	Command createAddProxyEffectCommand(CMProxyTestObject p_parent, CMProxyEffect p_proxyEffect);

	/**
	 * @param p_proxyEquivalenceClass
	 * @param p_proxyEffect
	 * @return
	 */
	Command createAddProxyEffectToProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect);

	/**
	 * @param p_proxyEquivalenceClass
	 * @param p_proxyEffect
	 * @return
	 */
	Command createRemoveProxyEffectFromEquivalenceCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect);

	/**
	 * @param p_proxyDependency
	 * @return
	 */
	Command createDeleteProxyDependencyCommand(CMProxyDependency p_proxyDependency);

	/**
	 * @param p_proxyDependency
	 * @param p_proxyElement
	 * @return
	 */
	Command createRemoveProxyElementFromProxyDependency(CMProxyDependency p_proxyDependency, CMProxyElement p_proxyElement);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEffect
	 * @return
	 */
	Command createAddProxyEffectToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEffect
	 * @return
	 */
	Command createRemoveProxyEffectFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEquivalenceClass
	 * @return
	 */
	Command createAddProxyEquivalenceClassToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEquivalenceClass
	 * @return
	 */
	Command createRemoveProxyEquivalenceClassFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass);


	
	/**
	 * @param p_proxyElement
	 * @return
	 */
	 
	 Command createChangeNameCommand(CMProxyElement p_proxyElement, String p_name);
	
	Command createChangeValueCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, String p_value);

	/**
	 * @param p_proxyEffect
	 * @return
	 */
	Command createChangeDescriptionCommand(CMProxyObject p_proxyObject, String p_Description);
	
Command createChangeProxyModelCommand(CMProxyObject proxy, Object model);

	/**
	 * @param p_object
	 * @return
	 */
	Command createAddNewProxyObjectCommand(CMProxyObject parent,CMProxyObject child,boolean doCMModel);
	
	Command createAddProxyElementCommand(CMProxyTestObject parent,CMProxyElement child,boolean doCMModel);
	
	Command createAddProxyDependencyCommand(CMProxyTestObject parent, CMProxyDependency child,boolean doCMModel);

	Command createAddProxyElementToProxyDependencyCommand(CMProxyDependency source, CMProxyElement target, boolean doCMModel);
	
	Command createAddExistentProxyObjectCommand(CMProxyObject parent , CMProxyObject child,boolean doCMModel);
	
	Command createAddProxyEquivalenceClasstoCombinationCommand(CMProxyCombination source, CMProxyEquivalenceClass target,boolean doCMModel);
	
	Command createAddProxyEquivalenceClassCommand(CMProxyElement p_element, CMProxyEquivalenceClass p_class ,boolean doCMModel);

	Command createAddProxyCombinationCommand(CMProxyDependency p_dependency, CMProxyCombination p_combination, boolean doCMModel);

	/**
	 * @param p_combination
	 * @param p_equivalenceClass
	 * @return
	 */ 
	Command createRemoveReferenceCommand(CMProxyObject p_source, CMProxyObject p_target,boolean doCMModel);

	/**
	 * @param p_combination
	 * @return
	 */
	Command createDeleteProxyCombinationCommand(CMProxyCombination p_combination,boolean doCMModel);

	/**
	 * @param p_equivalence
	 * @return
	 */
	Command createDeleteProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_equivalence,boolean doCMModel);

	/**
	 * @param p_proxyElement
	 * @return
	 */
	Command createDeleteProxyElementCommand(CMProxyElement p_proxyElement,boolean doCMModel);

	/**
	 * @param p_proxyEffect
	 * @return
	 */
	Command createDeleteProxyEffectCommand(CMProxyEffect p_proxyEffect,boolean doCMModel);

	/**
	 * @param p_parent
	 * @param p_proxyEffect
	 * @return
	 */
	Command createAddProxyEffectCommand(CMProxyTestObject p_parent, CMProxyEffect p_proxyEffect,boolean doCMModel);

	/**
	 * @param p_proxyEquivalenceClass
	 * @param p_proxyEffect
	 * @return
	 */
	Command createAddProxyEffectToProxyEquivalenceClassCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect,boolean doCMModel);

	/**
	 * @param p_proxyEquivalenceClass
	 * @param p_proxyEffect
	 * @return
	 */
	Command createRemoveProxyEffectFromEquivalenceCommand(CMProxyEquivalenceClass p_proxyEquivalenceClass, CMProxyEffect p_proxyEffect,boolean doCMModel);

	/**
	 * @param p_proxyDependency
	 * @return
	 */
	Command createDeleteProxyDependencyCommand(CMProxyDependency p_proxyDependency,boolean doCMModel);

	/**
	 * @param p_proxyDependency
	 * @param p_proxyElement
	 * @return
	 */
	Command createRemoveProxyElementFromProxyDependency(CMProxyDependency p_proxyDependency, CMProxyElement p_proxyElement,boolean doCMModel);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEffect
	 * @return
	 */
	Command createAddProxyEffectToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect,boolean doCMModel);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEffect
	 * @return
	 */
	Command createRemoveProxyEffectFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEffect p_proxyEffect,boolean doCMModel);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEquivalenceClass
	 * @return
	 */
	Command createAddProxyEquivalenceClassToProxyCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass,boolean doCMModel);

	/**
	 * @param p_proxyCombination
	 * @param p_proxyEquivalenceClass
	 * @return
	 */
	Command createRemoveProxyEquivalenceClassFromCombinationCommand(CMProxyCombination p_proxyCombination, CMProxyEquivalenceClass p_proxyEquivalenceClass,boolean doCMModel);

}
