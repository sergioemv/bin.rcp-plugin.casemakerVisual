/* This Software has been developed by Business Software Innovations  .
Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. */

package biz.bi.vtcd.policies;

import java.util.Collection;
import java.util.Iterator;

import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.figures.VTCDFigureEquivalenceClassView;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDLinkCombinationEClass;
import biz.bi.vtcd.model.VTCDLinkDependencyElement;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * Helper class responsible of loading an existent TestObject model into a figure model
 * @author smoreno
 *
 */
public class VTCDModelLoader {
	
 //private VTCDDiagramMain m_DiagramMain;
 public VTCDModelLoader()
 {

 }
   

 public VTCDDiagramMain loadModelForTestObject(String p_filename, boolean newTestObject)
 { 
     VTCDDiagramMain l_DiagramMain = VTCDPackage.eINSTANCE.getVTCDFactory().createVTCDDiagramMain(p_filename,newTestObject);
	 loadFigureElementsToMain(l_DiagramMain);
	 loadFigureDependencies(l_DiagramMain); 
	  //call the Initial layout manager to define the initial positions
	 new VTCDAutomaticLayoutPolicy(l_DiagramMain).getCCommand().execute(); 
	 return l_DiagramMain;
	 
	 
 }
 /**
  * Load the related dependecies  
 * @param p_DiagramMain
 */
private void loadFigureDependencies(VTCDDiagramMain p_DiagramMain)
 {
	 Collection candidateDependencies = p_DiagramMain.getM_TestObject().getProxyDependency();
	 //delete invalid  Dependency figures
	 for (Iterator i = p_DiagramMain.getM_VTCDFigureDependency().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureDependency  l_FigureDependency = (VTCDFigureDependency) i.next();
		 
		if (!candidateDependencies.contains(l_FigureDependency.getM_Dependency()))
				p_DiagramMain.getM_VTCDFigureDependency().remove(
						(l_FigureDependency));
		
	 }
	 //check the Dependencies that are in the model
	 for (Iterator j = candidateDependencies.iterator(); j.hasNext();)
	 {
		 CMProxyDependency l_ProxyDependency = (CMProxyDependency) j.next(); 
		 if (p_DiagramMain.getM_VTCDFigureDependency(l_ProxyDependency) == null) 
		 {
				 VTCDFigureDependency l_FigureDependency = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureDependency(l_ProxyDependency);
				 //add the Dependency figures to the model
				 p_DiagramMain.getM_VTCDFigureDependency().add(l_FigureDependency);				 
	         	 //load links to elements
				 loadLinkDependencyElements(l_FigureDependency);
				 loadDiagramCombination(l_FigureDependency);
	
		 }
	 }

 }

/**
 * Load the related combination diagram to the figure dependency  
* @param p_DiagramMain
*/
private void loadDiagramCombination(VTCDFigureDependency p_FigureDependency)
{
	
				 VTCDDiagramCombination l_DiagramCombination = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDDiagramCombination(p_FigureDependency);
				 //add the Dependency figures to the model
				 p_FigureDependency.setM_VTCDDiagramCombination(l_DiagramCombination);
				 l_DiagramCombination.setM_FigureDependency(p_FigureDependency);
				 //create a default position values for the new Dependency
				 
				 //check for children elements
				 loadFigureElementsToCombinationDiagram(l_DiagramCombination);
				 //check for children combinations
				 loadFigureCombinations(l_DiagramCombination);
				 new VTCDAutomaticLayoutPolicy(l_DiagramCombination).getCCommand().execute();
}

 /**
 *  load the figure elements for the related element model 
 * 	@return
 */
private void loadFigureElementsToMain(VTCDDiagramMain p_DiagramMain)
 {
	 Collection candidateElements = p_DiagramMain.getM_TestObject().getProxyElement();
	 //delete invalid  element figures
	 for (Iterator i = p_DiagramMain.getM_VTCDFigureElement().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureElement  l_FigureElement = (VTCDFigureElement) i.next();
		 
		if (!candidateElements.contains(l_FigureElement.getM_Element()))
				p_DiagramMain.getM_VTCDFigureElement().remove(
						(l_FigureElement));
		
	 }
	 //check the Elements that are in the model
	 for (Iterator j = candidateElements.iterator(); j.hasNext();)
	 {
		 CMProxyElement l_ProxyElement = (CMProxyElement) j.next(); 
		 if (p_DiagramMain.getM_VTCDFigureElement(l_ProxyElement) == null) 
		 {
				 VTCDFigureElement l_FigureElement = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureElement(l_ProxyElement);
				 //add the element figures to the model
				 p_DiagramMain.getM_VTCDFigureElement().add(l_FigureElement);				 
				 //by default all elements in the main diagram are folded
				 l_FigureElement.setFolded(true);
				 //check for children equivalenceClasses
				 loadFigureEquivalenceClasses(l_FigureElement);
				 //((CMProxyEquivalenceClassImpl)l_ProxyEquivalenceClass).checkEffects();
		 }
	 }

 }
private void loadFigureElementsToCombinationDiagram(VTCDDiagramCombination p_DiagramCombination)
{
	 Collection candidateElements = p_DiagramCombination.getM_FigureDependency().getM_Dependency().getProxyElement();
	 //delete invalid  element figures
	 for (Iterator i = p_DiagramCombination.getM_VTCDFigureElement().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureElement  l_FigureElement = (VTCDFigureElement) i.next();
		 
		if (!candidateElements.contains(l_FigureElement.getM_Element()))
			p_DiagramCombination.getM_VTCDFigureElement().remove(
						(l_FigureElement));
		
	 }
	 //check the Elements that are in the model
	 for (Iterator j = candidateElements.iterator(); j.hasNext();)
	 {
		 CMProxyElement l_ProxyElement = (CMProxyElement) j.next(); 
		 if (p_DiagramCombination.getM_VTCDFigureElement(l_ProxyElement) == null) 
		 {
				 VTCDFigureElement l_FigureElement = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureElement(l_ProxyElement);
				 //add the element figures to the model
				 p_DiagramCombination.getM_VTCDFigureElement().add(l_FigureElement);				 
				 //by default all elements in the combination diagram are unfolded
				 l_FigureElement.setFolded(false);
				 //check for children equivalenceClasses
				 loadFigureEquivalenceClasses(l_FigureElement);
				 //((CMProxyEquivalenceClassImpl)l_ProxyEquivalenceClass).checkEffects();
		 }
	 }

}
private void loadFigureEquivalenceClasses(VTCDFigureElement p_FigureElement)
{
	 Collection candidateEquivalenceClasses = p_FigureElement.getM_Element().getProxyEquivalenceClass();
	 //check invalid  EquivalenceClass figures
	 for (Iterator i = p_FigureElement.getM_VTCDFigureEquivalenceClass().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureEquivalenceClass  l_FigureEquivalenceClass = (VTCDFigureEquivalenceClass) i.next();
		 
		if (!candidateEquivalenceClasses.contains(l_FigureEquivalenceClass.getM_EquivalenceClass()))
				p_FigureElement.getM_VTCDFigureEquivalenceClass().remove(
						(l_FigureEquivalenceClass));
		
	 }
	 //check the EquivalenceClasses that are in the model
	 for (Iterator j = candidateEquivalenceClasses.iterator(); j.hasNext();)
	 {
		 CMProxyEquivalenceClass l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) j.next(); 
		 if (p_FigureElement.getM_VTCDFigureEquivalenceClass(l_ProxyEquivalenceClass) == null) {
				 VTCDFigureEquivalenceClass l_FigureEquivalenceClass = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureEquivalenceClass(l_ProxyEquivalenceClass);
				 //add the EquivalenceClass figures to the model
				 p_FigureElement.getM_VTCDFigureEquivalenceClass().add(l_FigureEquivalenceClass);				 
				 //create a default position for the new EquivalenceClass
				 
				 //check for children equivalenceClasses
				 //((CMProxyEquivalenceClassImpl)l_ProxyEquivalenceClass).checkEffects();
		
		 }
		 
	 }

}
private void loadLinkDependencyElements(VTCDFigureDependency p_FigureDependency)
{
	 Collection candidateElements = p_FigureDependency.getM_Dependency().getProxyElement();
	 VTCDLinkDependencyElement  l_LinkDependencyElement=null;
	 //delete invalid  element figures
	 for (Iterator i = p_FigureDependency.getM_VTCDLinkDependencyElement().iterator(); i
		.hasNext();)
	 {
		 l_LinkDependencyElement = (VTCDLinkDependencyElement) i.next();
			 
			if (!candidateElements.contains(l_LinkDependencyElement.getDestElement().getM_Element()))
					p_FigureDependency.getM_VTCDLinkDependencyElement().remove(
							(l_LinkDependencyElement));
			
	}
		 //check the Figure Elements that are in the model
		 for (Iterator j = candidateElements.iterator(); j.hasNext();)
		 {
			 CMProxyElement l_ProxyElement = (CMProxyElement) j.next(); 
			 if (p_FigureDependency.getM_VTCDLinkDependencyElement(l_ProxyElement) == null) 
			 {
				 VTCDFigureElement l_FigureElement =p_FigureDependency.getM_VTCDDiagramMain()
				 .getM_VTCDFigureElement(l_ProxyElement);				 
				 if (l_FigureElement!=null)
					 l_LinkDependencyElement = VTCDPackage.eINSTANCE.getVTCDFactory().createVTCDLinkDependencyElement(p_FigureDependency,l_FigureElement);
				 	 	
					 //add the link to the dependency
					 p_FigureDependency.getM_VTCDLinkDependencyElement().add(l_LinkDependencyElement);				 
					 //create a default position values for the new element
					 
	
			 }
		 }
	 }

private void loadLinkCombinationEClasses(VTCDFigureCombination p_FigureCombination)
{
	 Collection candidateEquivalenceClasses = p_FigureCombination.getM_Combination().getProxyEquivalenceClass();
	 VTCDLinkCombinationEClass  l_LinkCombinationEClass=null;
	 //delete invalid  element figures
	 for (Iterator i = p_FigureCombination.getM_VTCDLinkCombinationEClass().iterator(); i
		.hasNext();)
	 {
		 l_LinkCombinationEClass = (VTCDLinkCombinationEClass) i.next();
			 
			if (!candidateEquivalenceClasses.contains(l_LinkCombinationEClass.getDestEquivalenceClass().getM_EquivalenceClass()))
					p_FigureCombination.getM_VTCDLinkCombinationEClass().remove(
							(l_LinkCombinationEClass));
			
	}
		 //check the Figure Equivalence Classes that are in the model
		 for (Iterator j = candidateEquivalenceClasses.iterator(); j.hasNext();)
		 {
			 CMProxyEquivalenceClass l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) j.next(); 
			 if (p_FigureCombination.getM_VTCDLinkCombinationEClass(l_ProxyEquivalenceClass) == null) 
			 {
				 VTCDFigureEquivalenceClass l_FigureEquivalenceClass =p_FigureCombination.getM_VTCDDiagramCombination()
				 .getM_VTCDFigureEquivalenceClass(l_ProxyEquivalenceClass);				 
				 if (l_FigureEquivalenceClass!=null)
					 l_LinkCombinationEClass = VTCDPackage.eINSTANCE.getVTCDFactory().createVTCDLinkCombinationEClass(p_FigureCombination,l_FigureEquivalenceClass);
				     l_LinkCombinationEClass.setTargetTerminal(VTCDFigureEquivalenceClassView.TERMINAL_1_IN);
				 	 	
					 //add the link to the Combination
					 p_FigureCombination.getM_VTCDLinkCombinationEClass().add(l_LinkCombinationEClass);				 
					 //create a default position values for the new EquivalenceClass
					 
	
			 }
		 }
	 }

private void loadFigureCombinations(VTCDDiagramCombination p_DiagramCombination)
{
	 Collection candidateCombinations = p_DiagramCombination.getM_FigureDependency().getM_Dependency().getProxyCombination();
	 //delete invalid  Combination figures
	 for (Iterator i = p_DiagramCombination.getM_VTCDFigureCombination().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureCombination  l_FigureCombination = (VTCDFigureCombination) i.next();
		 
		if (!candidateCombinations.contains(l_FigureCombination.getM_Combination()))
			p_DiagramCombination.getM_VTCDFigureCombination().remove(
						(l_FigureCombination));
		
	 }
	 //check the Combinations that are in the model
	 for (Iterator j = candidateCombinations.iterator(); j.hasNext();)
	 {
		 CMProxyCombination l_ProxyCombination = (CMProxyCombination) j.next(); 
		 if (p_DiagramCombination.getM_VTCDFigureCombination(l_ProxyCombination) == null) 
		 {
				 VTCDFigureCombination l_FigureCombination = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureCombination(l_ProxyCombination);
				 //add the Combination figures to the model
				 p_DiagramCombination.getM_VTCDFigureCombination().add(l_FigureCombination);				 
				 //create a default position values for the new Combination
				 
				 //check for children equivalenceClasses
				 loadLinkCombinationEClasses(l_FigureCombination);
		 }
	 }
	
}
}

