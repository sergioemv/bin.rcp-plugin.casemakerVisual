/**
 * 
 */
package biz.bi.cmcore.policies;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import model.BRulesReference;
import model.BusinessRules;
import model.Dependency;
import model.Element;
import model.EquivalenceClass;
import model.Structure;
import model.TDStructure;
import model.TDStructureReference;
import model.TestObject;
import model.TestObjectReference;
import bi.controller.WorkspaceManager;
import bi.view.utils.CMMessages;
import biz.bi.cmcore.CMCorePlugin;

/**
 * @author hcanedo
 *
 */
public class CMProxyCasemakerPolicyFactoryImpl implements CMProxyCasemakerPolicyFactory {

	private WorkspaceManager m_WorkspaceManager;

	/**
	 * 
	 */
	public CMProxyCasemakerPolicyFactoryImpl() {
		super();
		m_WorkspaceManager=CMCorePlugin.INSTANCE.getM_SessionManager()
		.getM_WorkspaceManager();
	}

	/**
	 * @author hcanedo
	 * @param p_FileName
	 * @return new TestObject
	 */
	public TestObject createTestObject(String p_FileName) {
		File i = new File(p_FileName);
		String newName=i.getName();
		newName= newName.substring(0,newName.indexOf(".cto.xml"));
        TestObject newTestObject = m_WorkspaceManager.createTestObject();
        TestObjectReference newTestObjectReference = m_WorkspaceManager.createTestObjectReference();
        newTestObjectReference.setM_Name(newName);
        newTestObject.setM_Name(newName);
        newTestObject.setM_User(System.getProperty("user.name"));
        newTestObjectReference.setM_TimeStamp(newTestObject.getM_TimeStamp());
        BRulesReference newBRulesReference = m_WorkspaceManager.createNewBRulesReference();
        newTestObject.setM_BRulesReference(newBRulesReference);
        TDStructureReference newTDStructureReference = m_WorkspaceManager.createTDStructureReference();
        TDStructure newTDStructure = m_WorkspaceManager.createTDStructure();
        newTDStructureReference.setM_Name(newTDStructure.getM_Name(), newTestObjectReference.getM_Path(), newName);
        newTDStructureReference.setM_TimeStamp(newTDStructure.getM_TimeStamp());
        m_WorkspaceManager.addTestDataReferenceToTestObject(newTDStructureReference, newTestObject);
        m_WorkspaceManager.addTDStructure(newTDStructure, newTestObject, newTestObjectReference);
        return newTestObject;
    }
	
	public void deleteElement(Structure structure, Element element)
	{
	      
	        java.util.List indexesDeleted = new ArrayList();
	        java.util.List dependenciesDeleted = CMCorePlugin.INSTANCE.getM_SessionManager().getElementManager().areThereDependenciesDeleted(structure, element, indexesDeleted);
	        
	            if (dependenciesDeleted != null)   
	            	for (Iterator iteratorDependencies = dependenciesDeleted.iterator(); iteratorDependencies.hasNext();) 
                    {
	            		Dependency dependency = (Dependency) iteratorDependencies.next();
	            		deleteDependency(dependency,structure);
                    }
	            java.util.List indexesModified = new ArrayList();
		        java.util.List dependenciesModified = CMCorePlugin.INSTANCE.getM_SessionManager().getElementManager().areThereDependenciesModified(structure, element, indexesModified);        
		       
	            if (dependenciesModified != null) 
                    for (Iterator iteratorDependencies = dependenciesModified.iterator(); iteratorDependencies.hasNext();) 
                    {
                        Dependency dependency = (Dependency) iteratorDependencies.next();
                        removeElementInDependency(element, dependency, structure);
                    }
	            
        
	        CMCorePlugin.INSTANCE.getM_SessionManager().getElementManager().deleteElement(element,structure);      
	    }
	public void removeElementInDependency(Element element, Dependency dependency,Structure structure) 
	{
    Vector oldElements = (Vector) dependency.getLnkElements().clone();
    dependency.getLnkElements().remove(element);
    int numEquivalenceClasses = element.getLnkEquivalenceClasses().size();
    for( int i = 0; i < numEquivalenceClasses; i++) {
        EquivalenceClass equivalenceClass = (EquivalenceClass) element.getLnkEquivalenceClasses().elementAt(i);
   	    dependency.getLnkEquivalenceClasses().remove(equivalenceClass);
    	}
    StringBuffer sBuffer = new StringBuffer();
    sBuffer.append(getDescriptionBasedOnExistingElements(dependency));
    dependency.setDescription(sBuffer.toString()); 
    
    CMCorePlugin.INSTANCE.getM_SessionManager().getCombinationManager().updateCombinationsByPermutation(dependency, BusinessRules.MAX_NUMBER_OF_COMBINATIONS,structure, oldElements);
	}
    
    private String getDescriptionBasedOnExistingElements(Dependency dependency) {
        Vector dependentElements = dependency.getLnkElements();
        StringBuffer descriptionView = new StringBuffer();
        int numElements = dependentElements.size();
        for (int i = 0; i < numElements; i++) {
            Element element = (Element) dependentElements.elementAt(i);
            descriptionView.append(element.getName());
            if (i < (numElements - 1)) {
                descriptionView.append(" | ");
            }
        }
        descriptionView.insert(0, CMMessages.getString("LABEL_DEPENDENT_ELEMENTS_DESCRIPTION")); //$NON-NLS-1$
        return descriptionView.toString();
    }    
    
    public void deleteDependency(Dependency dependency, Structure structure)
    {
    	 CMCorePlugin.INSTANCE.getM_SessionManager().getDependencyManager().getLnkTestCaseManager().deleteCombinationsOfDependencyInTestCases(dependency,structure);
    	 structure.getLnkDependencies().remove(dependency);
    }
    
    public void insertElementInDependency(Element element, Dependency dependency, Structure structure) {
    	Vector oldElements = (Vector) dependency.getLnkElements().clone();
        dependency.getLnkElements().add(element);
        int numEquivalenceClasses = element.getLnkEquivalenceClasses().size();
        for( int i = 0; i < numEquivalenceClasses; i++) {
            EquivalenceClass equivalenceClass = (EquivalenceClass) element.getLnkEquivalenceClasses().elementAt(i);
            if( equivalenceClass.getState() == BusinessRules.STATE_POSITIVE) {
       	    	dependency.getLnkEquivalenceClasses().add(equivalenceClass);
            }
        }
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append(getDescriptionBasedOnExistingElements(dependency));
        dependency.setDescription(sBuffer.toString()); 
        CMCorePlugin.INSTANCE.getM_SessionManager().getCombinationManager().updateCombinationsByPermutation(dependency, BusinessRules.MAX_NUMBER_OF_COMBINATIONS,structure, oldElements);

    }

	/* (non-Javadoc)
	 * @see biz.bi.cmcore.policies.CMProxyCasemakerPolicyFactory#readTestObject(java.lang.String)
	 */
	public TestObject readTestObject(String p_path) {
		return m_WorkspaceManager
		.readTestObject2(p_path);
	}
}

