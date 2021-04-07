/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.policies;

import model.TestObject;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;


/**
 * @author smoreno
 *
 */
public class CMProxyPolicyFactoryImpl implements CMProxyPolicyFactory {

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.policies.CMProxyPolicyFactory#createDeleteEquivalenceClassPolicy(biz.bi.cmcore.model.CMProxyEquivalenceClass)
	 */
	private CMProxyReloadPolicy reloadPolicy = new CMProxyReloadPolicy();
	public Command createDeleteEquivalenceClassPolicy(
			CMProxyEquivalenceClass p_equivalence) {
		CompoundCommand cc = new CompoundCommand();
		cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyEquivalenceClassCommand(p_equivalence));
		
	//	cc.add(CMProxyCommandFactory.INSTANCE.createReloadCommand((CMProxyObject)p_equivalence.getProxyElement().getProxyTestObject()));
		//delete all related combinations
		
		return cc;
	}
	/* (non-Javadoc)
	 * @see biz.bi.cmcore.policies.CMProxyPolicyFactory#createReloadProxyPolicy(biz.bi.cmcore.model.CMProxyObject)
	 */
	public Command createReloadProxyPolicy(CMProxyObject object)
	{
		switch (object.eClass().getClassifierID()) {
		case CMCorePackage.CM_PROXY_TEST_OBJECT:
			return createReloadProxyTestObjectPolicy((CMProxyTestObject)object);
		case CMCorePackage.CM_PROXY_COMBINATION:
			return createReloadProxyCombinationPolicy((CMProxyCombination)object);
		case CMCorePackage.CM_PROXY_DEPENDENCY:
			return createReloadProxyDependencyPolicy((CMProxyDependency)object);
		case CMCorePackage.CM_PROXY_ELEMENT:
			return createReloadProxyElementPolicy((CMProxyElement)object);
		case CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS:
			return createReloadProxyEquivalenceClass((CMProxyEquivalenceClass)object);
		default:
			break;
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @param p_class
	 * @return
	 */
	public Command createReloadProxyEquivalenceClass(CMProxyEquivalenceClass p_class) {
		final CMProxyEquivalenceClass l_class=p_class;
		return new Command()
		{
			CompoundCommand policy;
			public void execute(){policy= reloadPolicy.reloadProxyEquivalenceClassPolicy(l_class);
									policy.execute();}
			public void undo(){policy.undo();}
		};
		
	}
	/**
	 * @param p_element
	 * @return
	 */
	public Command createReloadProxyElementPolicy(CMProxyElement p_element) {
		final CMProxyElement l_element=p_element;
		return new Command()
		{
			CompoundCommand policy;
			public void execute(){policy= reloadPolicy.reloadProxyElementPolicy(l_element);
									policy.execute();}
			public void undo(){policy.undo();}
		};
	}
	/**
	 * @param p_dependency
	 * @return
	 */
	public Command createReloadProxyDependencyPolicy(CMProxyDependency p_dependency) {
		final CMProxyDependency l_dependency=p_dependency;
		return new Command()
		{
			CompoundCommand policy;
			public void execute(){policy= reloadPolicy.reloadProxyDependencyPolicy(l_dependency);
							if (policy!=null)		
							policy.execute();}
			public void undo(){
				if (policy!=null)
				policy.undo();}
		};
	}
	/**
	 * @param p_combination
	 * @return
	 */
	public Command createReloadProxyCombinationPolicy(CMProxyCombination p_combination) {
		final CMProxyCombination l_combination=p_combination;
		return new Command()
		{
			CompoundCommand policy;
			public void execute(){policy= reloadPolicy.reloadProxyCombinationPolicy(l_combination);
									policy.execute();}
			public void undo(){policy.undo();}
		};
	}
	public Command createReloadProxyTestObjectPolicy(CMProxyTestObject p_testObject)
	{
		final CMProxyTestObject l_testObject=p_testObject;
		return new Command()
		{
			CompoundCommand policy;
			public void execute(){policy= reloadPolicy.reloadProxyTestObjectPolicy(l_testObject);
								if (policy!=null)	
								 policy.execute();}
			public void undo(){
				if (policy!=null)
				policy.undo();}
		};
		
	}
	
	/* (non-Javadoc)
	 * @see biz.bi.cmcore.policies.CMProxyPolicyFactory#createRereadProxyTestObjectPolicy(biz.bi.cmcore.model.CMProxyTestObject)
	 */
	public Command createRereadProxyTestObjectPolicy(CMProxyTestObject p_object) {
		CompoundCommand cc = new CompoundCommand();
		TestObject newTestObject = CMProxyCasemakerPolicyFactory.INSTANCE.readTestObject(p_object.getM_path());
		//set the model
		cc.add(CMProxyCommandFactory.INSTANCE.createChangeProxyModelCommand(p_object,newTestObject));
		//perform a dinamic update of the model
		cc.add(CMProxyPolicyFactory.INSTANCE.createReloadProxyPolicy(p_object));
		return cc;
	}
}
