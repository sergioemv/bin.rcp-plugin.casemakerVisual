/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.policies;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyObject;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * @author smoreno
 *
 */
public interface CMProxyPolicyFactory {
	
	public static final CMProxyPolicyFactory INSTANCE = new CMProxyPolicyFactoryImpl();
	
	Command createDeleteEquivalenceClassPolicy(CMProxyEquivalenceClass equivalence);

	Command createReloadProxyPolicy(CMProxyObject object);
	
	Command createReloadProxyTestObjectPolicy(CMProxyTestObject p_testObject);

	Command createReloadProxyCombinationPolicy(CMProxyCombination p_combination);
	
	Command createReloadProxyDependencyPolicy(CMProxyDependency p_dependency);
	
	Command createReloadProxyElementPolicy(CMProxyElement p_element);
	
	Command createReloadProxyEquivalenceClass(CMProxyEquivalenceClass p_class);
	
	Command createRereadProxyTestObjectPolicy(CMProxyTestObject p_object);
}
