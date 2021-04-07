/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 D�az und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.policies;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import model.Combination;
import model.Dependency;
import model.Effect;
import model.Element;
import model.EquivalenceClass;
import model.TestCase;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestCase;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.cmcore.model.impl.CMProxyCombinationImpl;
import biz.bi.cmcore.model.impl.CMProxyDependencyImpl;
import biz.bi.cmcore.model.impl.CMProxyElementImpl;
import biz.bi.cmcore.model.impl.CMProxyEquivalenceClassImpl;
import biz.bi.cmcore.model.impl.CMProxyTestCaseImpl;
import biz.bi.cmcore.model.impl.CMProxyTestObjectImpl;

/**
 * @author smoreno
 *
 */
public class CMProxyReloadPolicy{

	
	private HashMap createdObjects;

	/**
	 * @param p_object
	 * @return
	 */
	public CompoundCommand reloadProxyTestObjectPolicy(CMProxyTestObject p_object) {
		createdObjects = new HashMap();
		CompoundCommand cc = new CompoundCommand();
		
	    //check the cause effects
		cc.add(checkEffectsPolicy(p_object));
		//check the elements
		cc.add(checkElementsPolicy(p_object));
		//check the dependencies
		cc.add(checkDependenciesPolicy(p_object));
		//check the Test Cases
		cc.add(checkTestCasesPolicy(p_object));
		//check the standart combinations
		cc.add(checkSTDCombinations(p_object));
		
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Test Object");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;
	}

	
	/**
	 * @param p_object
	 * @return
	 */
	private Command checkSTDCombinations(CMProxyTestObject p_object) {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @param p_object
	 * @return
	 */
	private Command checkTestCasesPolicy(CMProxyTestObject p_object) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateTestCases = p_object.getM_TestObject()
		.getM_Structure().getLnkTestCases();
		
		
		for (Iterator j = candidateTestCases.iterator(); j.hasNext();) {
			TestCase l_TestCase = (TestCase) j.next();
			CMProxyTestCase l_ProxyTestCase = ((CMProxyTestObjectImpl)p_object).getProxyTestCase(l_TestCase); 
			if (l_ProxyTestCase == null) {

				l_ProxyTestCase = CMCorePackage.eINSTANCE
						.getCMCoreFactory().createCMProxyTestCase(l_TestCase);
				
				cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyTestCaseCommand(p_object,l_ProxyTestCase,false));
					
				
			}
			createdObjects.put(l_TestCase,l_ProxyTestCase);
			cc.add(checkEquivalenceClassesOfTestCasePolicy(l_ProxyTestCase));
			
			cc.add(checkCombinationsOfTestCasePolicy(l_ProxyTestCase));
		}
		for (Iterator i = p_object.getProxyTestCase().iterator(); i.hasNext();) 
		{
			CMProxyTestCase l_proxyTestCase = (CMProxyTestCase) i.next();
			if (!candidateTestCases.contains((l_proxyTestCase).getM_TestCase()))
			{
				cc.add(checkEquivalenceClassesOfTestCasePolicy(l_proxyTestCase));
				cc.add(checkCombinationsOfTestCasePolicy(l_proxyTestCase));
				cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyTestCaseCommand(l_proxyTestCase,false));
			}
		}
		if (cc.getCommands().size()>0)
		{
			System.out.println("Test Cases ");
			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
			{
				 Command c = (Command)i.next();
				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
			}
	
			return cc;
		}
		else
			return null;
	}


	/**
	 * @param p_proxyTestCase
	 * @return
	 */
	private Command checkCombinationsOfTestCasePolicy(CMProxyTestCase p_proxyTestCase) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateCombinations = p_proxyTestCase.getM_TestCase().getLnkCombinations();
		CMProxyCombination l_CMProxyCombination = null;
		for (Iterator i = candidateCombinations.iterator(); i.hasNext();) {
			Combination l_combination = (Combination) i.next();
			if (((CMProxyTestCaseImpl)p_proxyTestCase).getProxyCombination(l_combination) == null) {
						l_CMProxyCombination = (CMProxyCombination)createdObjects.get(l_combination);
				if (l_CMProxyCombination != null) {
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyCombinationToProxyTestCaseCommand(p_proxyTestCase,l_CMProxyCombination,false));
				}
			}
		}
		for (Iterator j=p_proxyTestCase.getProxyCombination().iterator();j.hasNext();)
		{
			CMProxyCombination l_proxyCombination = (CMProxyCombination) j.next();
			if (!candidateCombinations.contains(l_proxyCombination.getM_Combination()))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyCombinationFromTestCaseCommand(p_proxyTestCase,l_proxyCombination,false));
		}
	
		if (cc.getCommands().size()>0)
		{
			System.out.println("Combinations of TestCase");
			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
			{
				 Command c = (Command)i.next();
				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
			}
	
			return cc;
		}
		else
			
			return null;
	}


	/**
	 * @param p_proxyTestCase
	 * @return
	 */
	private Command checkEquivalenceClassesOfTestCasePolicy(CMProxyTestCase p_proxyTestCase) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateEquivalenceClasses = p_proxyTestCase.getM_TestCase().getLnkEquivalenceClasses();
		CMProxyEquivalenceClass l_CMProxyEquivalenceClass = null;
		for (Iterator i = candidateEquivalenceClasses.iterator(); i.hasNext();) {
			EquivalenceClass l_equivalenceClass = (EquivalenceClass) i.next();
			if (((CMProxyTestCaseImpl)p_proxyTestCase).getProxyEquivalenceClass(l_equivalenceClass) == null) {
						l_CMProxyEquivalenceClass = (CMProxyEquivalenceClass)createdObjects.get(l_equivalenceClass);
				if (l_CMProxyEquivalenceClass != null) {
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEquivalenceClassToProxyTestCaseCommand(p_proxyTestCase,l_CMProxyEquivalenceClass,false));
				}
			}
		}
		for (Iterator j=p_proxyTestCase.getProxyEquivalenceClass().iterator();j.hasNext();)
		{
			CMProxyEquivalenceClass l_proxyEquivalenceClass = (CMProxyEquivalenceClass) j.next();
			if (!candidateEquivalenceClasses.contains(l_proxyEquivalenceClass.getM_EquivalenceClass()))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyEquivalenceClassFromTestCaseCommand(p_proxyTestCase,l_proxyEquivalenceClass,false));
		}
	
		if (cc.getCommands().size()>0)
		{
			System.out.println("EquivalenceClasses of TestCase");
			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
			{
				 Command c = (Command)i.next();
				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
			}
	
			return cc;
		}
		else
			return null;
	}


	/**
	 * @param p_object
	 * @return
	 */
	private Command checkDependenciesPolicy(CMProxyTestObject p_object) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateDependencies = p_object.getM_TestObject()
		.getM_Structure().getLnkDependencies();
		
		
		for (Iterator j = candidateDependencies.iterator(); j.hasNext();) {
			Dependency l_Dependency = (Dependency) j.next();
			CMProxyDependency l_ProxyDependency = ((CMProxyTestObjectImpl)p_object).getProxyDependency(l_Dependency); 
			if (l_ProxyDependency == null) {

				l_ProxyDependency = CMCorePackage.eINSTANCE
						.getCMCoreFactory().createCMProxyDependency(l_Dependency);
				
				cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyDependencyCommand(p_object,l_ProxyDependency,false));
					
				
			}
			createdObjects.put(l_Dependency,l_ProxyDependency);
			cc.add(checkElementsOfDependencyPolicy(l_ProxyDependency));
			
			cc.add(checkCombinationsPolicy(l_ProxyDependency));
		}
		for (Iterator i = p_object.getProxyDependency().iterator(); i.hasNext();) 
		{
			CMProxyDependency l_ProxyDependency = (CMProxyDependency) i.next();
			if (!candidateDependencies.contains((l_ProxyDependency).getM_Dependency()))
			{
				cc.add(checkElementsOfDependencyPolicy(l_ProxyDependency));
				cc.add(checkCombinationsPolicy(l_ProxyDependency));
				cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyDependencyCommand(l_ProxyDependency,false));
			}
		}
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Dependencies");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;
		
	}

	/**
	 * @param p_proxyDependency
	 * @return
	 */
	private Command checkCombinationsPolicy(CMProxyDependency p_proxyDependency) {
		CompoundCommand cc = new CompoundCommand();
		
		Collection candidateCombinations = p_proxyDependency.getM_Dependency().getLnkCombinations();
			for (Iterator j = candidateCombinations.iterator(); j.hasNext();) 
			{
				Combination l_Combination = (Combination) j.next();
				CMProxyCombination l_ProxyCombination =((CMProxyDependencyImpl)p_proxyDependency).getProxyCombination(l_Combination);
				
				if ( l_ProxyCombination == null) {
					l_ProxyCombination = CMCorePackage.eINSTANCE
							.getCMCoreFactory().createCMProxyCombination(
									l_Combination);
					
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyCombinationCommand(p_proxyDependency,l_ProxyCombination,false));
					}
				createdObjects.put(l_Combination,l_ProxyCombination);
				//check for related effects of the combination
				cc.add(checkEffectsOfCombinationPolicy(l_ProxyCombination));
				//check for relted equivalence classes
				cc.add(checkEquivalenceClassesOfCombinationPolicy(l_ProxyCombination));
	
			}
			for (Iterator i = p_proxyDependency.getProxyCombination().iterator(); i
			.hasNext();) 
			{
			CMProxyCombination l_ProxyCombination = (CMProxyCombination) i.next();
			if (!candidateCombinations.contains(l_ProxyCombination
			.getM_Combination()))
			{
				cc.add(checkEffectsOfCombinationPolicy(l_ProxyCombination));
				cc.add(checkEquivalenceClassesOfCombinationPolicy(l_ProxyCombination));
				cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyCombinationCommand(l_ProxyCombination,false));
			}
			}
			if (cc.getCommands().size()>0)
			{
//				System.out.println("Combinations");
//				for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//				{
//					 Command c = (Command)i.next();
//					 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//				}
		
				return cc;
			}
		else
				return null;
	}

	/**
	 * @param p_proxyCombination
	 * @return
	 */
	private Command checkEquivalenceClassesOfCombinationPolicy(CMProxyCombination p_proxyCombination) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateEquivalenceClasses = p_proxyCombination.getM_Combination().getLnkEquivalenceClasses();
		CMProxyEquivalenceClass l_ProxyEquivalenceClass = null;
		for (Iterator i = candidateEquivalenceClasses.iterator(); i.hasNext();) {
			EquivalenceClass l_EquivalenceClass = (EquivalenceClass) i.next();
			if (((CMProxyCombinationImpl)p_proxyCombination).getProxyEquivalenceClass(l_EquivalenceClass) == null) {
						l_ProxyEquivalenceClass = (CMProxyEquivalenceClass)createdObjects.get(l_EquivalenceClass);
				if (l_ProxyEquivalenceClass != null) {
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEquivalenceClassToProxyCombinationCommand(p_proxyCombination,l_ProxyEquivalenceClass,false));
				}
			}
		}
		for (Iterator j=p_proxyCombination.getProxyEquivalenceClass().iterator();j.hasNext();)
		{
			l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) j.next();
			if (!candidateEquivalenceClasses.contains(l_ProxyEquivalenceClass.getM_EquivalenceClass()))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyEquivalenceClassFromCombinationCommand(p_proxyCombination,l_ProxyEquivalenceClass,false));
		}
	
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Equiv of combis");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;
	}

	/**
	 * @param p_proxyCombination
	 * @return
	 */
	private Command checkEffectsOfCombinationPolicy(CMProxyCombination p_proxyCombination) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateEffects = p_proxyCombination.getM_Combination().getLnkEffects();
		CMProxyEffect l_CMProxyEffect = null;
		for (Iterator i = candidateEffects.iterator(); i.hasNext();) {
			Effect l_Effect = (Effect) i.next();
			if (((CMProxyCombinationImpl)p_proxyCombination).getProxyEffect(l_Effect) == null) {
						l_CMProxyEffect = (CMProxyEffect)createdObjects.get(l_Effect);
				if (l_CMProxyEffect != null) {
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEffectToProxyCombinationCommand(p_proxyCombination,l_CMProxyEffect,false));
				}
			}
		}
		for (Iterator j=p_proxyCombination.getProxyEffect().iterator();j.hasNext();)
		{
			CMProxyEffect l_ProxyEffect = (CMProxyEffect) j.next();
			if (!candidateEffects.contains(l_ProxyEffect.getM_Effect()))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromCombinationCommand(p_proxyCombination,l_ProxyEffect,false));
		}
	
		if (cc.getCommands().size()>0)
		{
//			System.out.println("effects of combination");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;	}

	/**
	 * @param p_proxyDependency
	 * @return
	 */
	private Command checkElementsOfDependencyPolicy(CMProxyDependency p_proxyDependency) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateElements = p_proxyDependency.getM_Dependency().getLnkElements();
		CMProxyElement l_CMProxyElement = null;
		for (Iterator i = candidateElements.iterator(); i.hasNext();) {
			Element l_Element = (Element) i.next();
			if (((CMProxyDependencyImpl)p_proxyDependency).getProxyElement(l_Element) == null) {
						l_CMProxyElement = (CMProxyElement)createdObjects.get(l_Element);
				if (l_CMProxyElement != null) {
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyElementToProxyDependencyCommand(p_proxyDependency,l_CMProxyElement,false));
				}
			}
		}
		for (Iterator j=p_proxyDependency.getProxyElement().iterator();j.hasNext();)
		{
			CMProxyElement l_proxyElement = (CMProxyElement) j.next();
			if (!candidateElements.contains(l_proxyElement.getM_Element()))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyElementFromProxyDependency(p_proxyDependency,l_proxyElement,false));
		}
	
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Elements on dependency");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;
	}


	private Command checkElementsPolicy(CMProxyTestObject p_object) {
	
		CompoundCommand cc = new CompoundCommand();
		Collection candidateElements = p_object.getM_TestObject().getM_Structure()
		.getLnkElements();
	
		
		for (Iterator j = candidateElements.iterator(); j.hasNext();) 
		{
			Element l_Element = (Element) j.next();
			CMProxyElement l_ProxyElement = ((CMProxyTestObjectImpl)p_object).getProxyElement(l_Element);
			if ( l_ProxyElement== null) {
			l_ProxyElement = CMCorePackage.eINSTANCE
						.getCMCoreFactory().createCMProxyElement(l_Element);
				
				cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyElementCommand(p_object,l_ProxyElement,false));
			}
			createdObjects.put(l_Element,l_ProxyElement);
			cc.add(checkEquivalenceClassesPolicy(l_ProxyElement));
		}
		for (Iterator i = p_object.getProxyElement().iterator(); i.hasNext();) {
			CMProxyElement l_ProxyElement = (CMProxyElement) i.next();
			if (!candidateElements.contains((l_ProxyElement).getM_Element()))
			{
				cc.add(checkEquivalenceClassesPolicy(l_ProxyElement));	
				cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyElementCommand(l_ProxyElement,false));
			}
		}
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Elements");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;
	}

	private Command checkEquivalenceClassesPolicy(CMProxyElement p_element)
	{
		CompoundCommand cc = new CompoundCommand();
		CMProxyEquivalenceClass l_ProxyEquivalenceClass =null;
		Collection candidateEquivalenceClasses = p_element.getM_Element().getLnkEquivalenceClasses();
			for (Iterator j = candidateEquivalenceClasses.iterator(); j.hasNext();) 
			{
				EquivalenceClass l_EquivalenceClass = (EquivalenceClass) j.next();
				l_ProxyEquivalenceClass = ((CMProxyElementImpl)p_element).getProxyEquivalenceClass(l_EquivalenceClass); 
				if (l_ProxyEquivalenceClass == null) {
					l_ProxyEquivalenceClass = CMCorePackage.eINSTANCE
							.getCMCoreFactory().createCMProxyEquivalenceClass(
									l_EquivalenceClass);
					//add the equivalenceclass to the model
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEquivalenceClassCommand(p_element,l_ProxyEquivalenceClass,false));		
				}
				createdObjects.put(l_EquivalenceClass,l_ProxyEquivalenceClass);
				cc.add(checkEffectsOfEquivalenceClassPolicy(l_ProxyEquivalenceClass));
			}
			for (Iterator i = p_element.getProxyEquivalenceClass().iterator(); i
			.hasNext();) 
			{
				l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) i.next();
				if (!candidateEquivalenceClasses.contains(l_ProxyEquivalenceClass.getM_EquivalenceClass()))
				{
					cc.add(checkEffectsOfEquivalenceClassPolicy(l_ProxyEquivalenceClass));
					cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyEquivalenceClassCommand(l_ProxyEquivalenceClass,false));
				}
			}
		
			if (cc.getCommands().size()>0)
			{
//				System.out.println("Equivalence");
//				for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//				{
//					 Command c = (Command)i.next();
//					 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//				}
		
				return cc;
			}
			else
				return null;
	}
	/**
	 * @param p_proxyEquivalenceClass
	 * @return
	 */
	private Command checkEffectsOfEquivalenceClassPolicy(CMProxyEquivalenceClass p_proxyEquivalenceClass) {
		CompoundCommand cc = new CompoundCommand();
		
		
		Collection candidateEffects = p_proxyEquivalenceClass.getM_EquivalenceClass().getLnkEffects();
		CMProxyEffect l_CMProxyEffect = null;
		for (Iterator i = candidateEffects.iterator(); i.hasNext();) {
			Effect l_Effect = (Effect) i.next();
			if (((CMProxyEquivalenceClassImpl)p_proxyEquivalenceClass).getProxyEffect(l_Effect) == null) {
						l_CMProxyEffect = (CMProxyEffect)createdObjects.get(l_Effect);
				if (l_CMProxyEffect != null) {
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEffectToProxyEquivalenceClassCommand(p_proxyEquivalenceClass,l_CMProxyEffect,false));
				}
			}
		}
		for (Iterator j=p_proxyEquivalenceClass.getProxyEffect().iterator();j.hasNext();)
		{
			CMProxyEffect l_ProxyEffect = (CMProxyEffect) j.next();
			if (!candidateEffects.contains(l_ProxyEffect.getM_Effect()))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromEquivalenceCommand(p_proxyEquivalenceClass,l_ProxyEffect,false));
		}
	
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Effecst on eq");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;
	}

	/**
	 * @param p_proxyEquivalenceClass
	 * @return
	 */
	private Command checkEffectsPolicy(CMProxyTestObject p_parent) {
		CompoundCommand cc = new CompoundCommand();
		Collection candidateEffects = p_parent.getM_TestObject().getM_Structure()
		.getLnkEffects();
		for (Iterator j = candidateEffects.iterator(); j.hasNext();) 
		{
			Effect l_Effect = (Effect) j.next();
			CMProxyEffect l_ProxyEffect = ((CMProxyTestObjectImpl)p_parent).getProxyEffect(l_Effect);
			 if ( l_ProxyEffect== null) 
			 {
			   l_ProxyEffect =CMCorePackage.eINSTANCE.getCMCoreFactory()
								.createCMProxyEffect(l_Effect);
				
				cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEffectCommand(p_parent,l_ProxyEffect,false));
			}
			 createdObjects.put(l_Effect,l_ProxyEffect);
		}
		for (Iterator i = p_parent.getProxyEffect().iterator(); i.hasNext();) 
		{
					CMProxyEffect l_ProxyEffect = (CMProxyEffect) i.next();
					if (!candidateEffects.contains((l_ProxyEffect).getM_Effect()))
						cc.add(CMProxyCommandFactory.INSTANCE.createDeleteProxyEffectCommand(l_ProxyEffect,false));

				
		}		
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Effects");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
	
			return cc;
		}
		else
			return null;
			
	}

	/**
	 * @param p_element
	 * @return
	 */
	public CompoundCommand reloadProxyElementPolicy(CMProxyElement p_element) {
		createdObjects = new HashMap();
		CompoundCommand cc = new CompoundCommand();
		cc.add(checkEquivalenceClassesPolicy(p_element));
		return cc;
	}
	
	public CompoundCommand reloadProxyEquivalenceClassPolicy(CMProxyEquivalenceClass p_equivalence)
	{
		createdObjects = new HashMap();
		CompoundCommand cc = new CompoundCommand();
		cc.add(checkEffectsOfEquivalenceClassPolicy(p_equivalence));
		return cc;
	}
	
	public CompoundCommand reloadProxyDependencyPolicy(CMProxyDependency p_dependency)
	{
		createdObjects = new HashMap();
		CompoundCommand cc = new CompoundCommand();
		cc.add(checkCombinationsPolicy(p_dependency));
		cc.add(checkElementsOfDependencyPolicy(p_dependency));
		cc.add(checkEquivalenceClassesOfDependencyPolicy(p_dependency));
		return cc;
	}
	/**
	 * @param p_dependency
	 * @return
	 */
	private Command checkEquivalenceClassesOfDependencyPolicy(CMProxyDependency p_proxyDependency) {
		
		CompoundCommand cc = new CompoundCommand();
		Collection candidateEquivalenceClasses = p_proxyDependency.getM_Dependency().getLnkEquivalenceClasses();
		CMProxyEquivalenceClass l_CMProxyEquivalenceClass = null;
		for (Iterator i = candidateEquivalenceClasses.iterator(); i.hasNext();) {
			EquivalenceClass l_EquivalenceClass = (EquivalenceClass) i.next();
			if (((CMProxyDependencyImpl)p_proxyDependency).getProxyEquivalenceClass(l_EquivalenceClass) == null) {
						l_CMProxyEquivalenceClass = (CMProxyEquivalenceClass)createdObjects.get(l_EquivalenceClass);
				if (l_CMProxyEquivalenceClass != null) {
					cc.add(CMProxyCommandFactory.INSTANCE.createAddProxyEquivalenceClasssToProxyDependencyCommand(p_proxyDependency,l_CMProxyEquivalenceClass,false));
				}
			}
		}
		for (Iterator j=p_proxyDependency.getProxyEquivalenceClass().iterator();j.hasNext();)
		{
			CMProxyEquivalenceClass l_proxyEquivalenceClass = (CMProxyEquivalenceClass) j.next();
			if (!candidateEquivalenceClasses.contains(l_proxyEquivalenceClass.getM_EquivalenceClass()))
				cc.add(CMProxyCommandFactory.INSTANCE.createRemoveProxyEquivalenceClassFromProxyDependency(p_proxyDependency,l_proxyEquivalenceClass,false));
		}
	
		if (cc.getCommands().size()>0)
		{
			System.out.println("Equivalence Classes on dependency");
			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
			{
				 Command c = (Command)i.next();
				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
			}
	
			return cc;
		}
		else
			return null;
	}


	public CompoundCommand reloadProxyCombinationPolicy(CMProxyCombination p_combination)
	{
		createdObjects = new HashMap();
		CompoundCommand cc = new CompoundCommand();
		cc.add(checkEffectsOfCombinationPolicy(p_combination));
		return cc;
	}
	
}
