/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.policies;

import model.Dependency;
import model.Element;
import model.Structure;
import model.TestObject;

/**
 * @author smoreno
 *
 */
public interface CMProxyCasemakerPolicyFactory {
	
	CMProxyCasemakerPolicyFactory INSTANCE = new CMProxyCasemakerPolicyFactoryImpl();
	
	TestObject createTestObject(String p_FileName);
	
	void deleteDependency(Dependency dependency, Structure structure);
	
	void deleteElement(Structure structure, Element element);
	
    void insertElementInDependency(Element element, Dependency dependency, Structure structure);
    
    void removeElementInDependency(Element element, Dependency dependency,Structure structure);

	/**
	 * @param p_m_path
	 * @return
	 */
	TestObject readTestObject(String p_path);
	
	//void deleteCombination(Dependency parent, Combination child);
	
	//void addCombination
}
