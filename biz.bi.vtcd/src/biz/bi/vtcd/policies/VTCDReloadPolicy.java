/* This Software has been developed by Business Software Innovations  .
Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. */

package biz.bi.vtcd.policies;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;

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
import biz.bi.vtcd.model.commands.VTCDCommandFactory;

/**
 * Helper class responsible of loading an existent TestObject model into a figure model
 * @author smoreno
 *
 */
public class VTCDReloadPolicy {

  
  private Rectangle defaultConstraint = new Rectangle(0,0,-1,-1); 
  private HashMap createdObjects;

 
 
 public CompoundCommand reloadVTCDDiagramPolicy(VTCDDiagramMain p_diagram)
 {
	 CompoundCommand cc = new CompoundCommand();
	 createdObjects = new HashMap();
	 cc.add(loadFigureElementsToMainPolicy(p_diagram));
	 cc.add(loadFigureDependenciespPolicy(p_diagram));
//	 System.out.println("Main");
//	 for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//		 System.out.println(((Command)i.next()).canExecute());
//	 //	if (cc.canExecute())
	
		if (cc.getCommands().size()>0)
			return cc;
		else
			return null;

 }
 
 /**
 * @param p_diagram
 * @return
 */
private CompoundCommand loadFigureDependenciespPolicy(VTCDDiagramMain p_diagram) {
	 CompoundCommand cc = new CompoundCommand();
	 Collection candidateDependencies = p_diagram.getM_TestObject().getProxyDependency();
	 
	 //check the Dependencies that are in the model
	 for (Iterator j = candidateDependencies.iterator(); j.hasNext();)
	 {
		 CMProxyDependency l_ProxyDependency = (CMProxyDependency) j.next(); 
		 VTCDFigureDependency l_FigureDependency = p_diagram.getM_VTCDFigureDependency(l_ProxyDependency);
		 if ( l_FigureDependency== null) 
		 {
				 l_FigureDependency = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureDependency(l_ProxyDependency);
				 //add the Dependency figures to the model
				 createdObjects.put(l_ProxyDependency,l_FigureDependency);
				 cc.add(VTCDCommandFactory.INSTANCE.createFigureDependencyCommand(p_diagram,l_FigureDependency,defaultConstraint));	
	
		 }
		 			 
     	 //load links to elements
		 cc.add(loadLinkDependencyElementsPolicy(l_FigureDependency,p_diagram));
		 cc.add(loadDiagramCombinationPolicy(l_FigureDependency));
	 }
	 for (Iterator i = p_diagram.getM_VTCDFigureDependency().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureDependency  l_FigureDependency = (VTCDFigureDependency) i.next();
		 
		if (!candidateDependencies.contains(l_FigureDependency.getM_Dependency()))
		{
			//delete the children too
			cc.add(loadLinkDependencyElementsPolicy(l_FigureDependency,p_diagram));
			cc.add(loadDiagramCombinationPolicy(l_FigureDependency));	
			cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureDependencyCommand(l_FigureDependency));
				
		}
	 }
	if (cc.getCommands().size()>0)
		{
		
//			System.out.println("Dependency");
//			 for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			 {
//				 Command c = (Command)i.next();
//			 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			 }
		     return cc;
			
		}
	else
		return null;

	
}
/**
 * @param p_figureDependency
 * @return
 */
private Command loadDiagramCombinationPolicy(VTCDFigureDependency p_figureDependency) {
	CompoundCommand cc = new CompoundCommand();
	VTCDDiagramCombination l_DiagramCombination = p_figureDependency.getM_VTCDDiagramCombination();
	if (l_DiagramCombination == null)
	{
		l_DiagramCombination = VTCDPackage.eINSTANCE.getVTCDFactory()
	 .createVTCDDiagramCombination();
		createdObjects.put(l_DiagramCombination,p_figureDependency);
		cc.add(VTCDCommandFactory.INSTANCE.createAddDiagramCombination(p_figureDependency,l_DiagramCombination));
	
	}
	 //check for children elements
	 cc.add(loadFigureElementsToCombinationDiagramPolicy(l_DiagramCombination));
	 //check for children combinations
	 cc.add(loadFigureCombinationsPolicy(l_DiagramCombination));
	
//	 if (cc.getCommands().size()>0)
	 cc.add(VTCDCommandFactory.INSTANCE.createAutomaticLayoutCommand(l_DiagramCombination));
	if (cc.getCommands().size()>0)
	{
		{
//			System.out.println("Combination d");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//				 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
		     return cc;
			}
		}
	else
		return null;

}

/**
 * @param p_diagramCombination
 * @return
 */
private Command loadFigureCombinationsPolicy(VTCDDiagramCombination p_diagramCombination) {
	CompoundCommand cc = new CompoundCommand();
	Collection candidateCombinations;
	if (p_diagramCombination.getM_FigureDependency()!=null)
		  candidateCombinations = p_diagramCombination.getM_FigureDependency().getM_Dependency().getProxyCombination();
		else
			candidateCombinations = ((VTCDFigureDependency)createdObjects.get(p_diagramCombination)).getM_Dependency().getProxyCombination();
		
	
	
	 //check the Combinations that are in the model
	 for (Iterator j = candidateCombinations.iterator(); j.hasNext();)
	 {
		 CMProxyCombination l_ProxyCombination = (CMProxyCombination) j.next();
		 VTCDFigureCombination l_FigureCombination =p_diagramCombination.getM_VTCDFigureCombination(l_ProxyCombination);
		 if (l_FigureCombination == null) 
		 {
				 l_FigureCombination= VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureCombination(l_ProxyCombination);
				 //add the Combination figures to the model
				 createdObjects.put(l_ProxyCombination,l_FigureCombination);
				 cc.add(VTCDCommandFactory.INSTANCE.createFigureCombinationCommand(p_diagramCombination,l_FigureCombination,defaultConstraint));
			 
		 }
		 cc.add(loadLinkCombinationEClassesPolicy(l_FigureCombination,p_diagramCombination));

	 }
	 //delete invalid  Combination figures
	 for (Iterator i = p_diagramCombination.getM_VTCDFigureCombination().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureCombination  l_FigureCombination1 = (VTCDFigureCombination) i.next();
		 
		if (!candidateCombinations.contains(l_FigureCombination1.getM_Combination()))
		{
			//delete all children too
			
			cc.add(loadLinkCombinationEClassesPolicy(l_FigureCombination1,p_diagramCombination));
			cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureCombinationCommand(l_FigureCombination1));

		}
	 }
	if (cc.getCommands().size()>0)
	{
//		System.out.println("Combination figure");
//		for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//		{
//			Command c = (Command)i.next();
//			System.out.println((c.canExecute()+" "+c.getClass().toString()));
//		}
	     return cc;
		}
	else
		return null;

}
/**
 * @param p_figureCombination
 * @return
 */
private Command loadLinkCombinationEClassesPolicy(VTCDFigureCombination p_figureCombination,VTCDDiagramCombination p_diagran) {
	CompoundCommand cc = new CompoundCommand();
	Collection candidateEquivalenceClasses = p_figureCombination.getM_Combination().getProxyEquivalenceClass();
	 VTCDLinkCombinationEClass  l_LinkCombinationEClass=null;
	
		 //check the Figure Equivalence Classes that are in the model
		 for (Iterator j = candidateEquivalenceClasses.iterator(); j.hasNext();)
		 {
			 CMProxyEquivalenceClass l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) j.next(); 
			 if (p_figureCombination.getM_VTCDLinkCombinationEClass(l_ProxyEquivalenceClass) == null) 
			 {
				 VTCDFigureEquivalenceClass l_FigureEquivalenceClass =p_diagran
				 .getM_VTCDFigureEquivalenceClass(l_ProxyEquivalenceClass);	
				 	if (l_FigureEquivalenceClass == null)
				 	 l_FigureEquivalenceClass =(VTCDFigureEquivalenceClass) createdObjects.get(l_ProxyEquivalenceClass);
				l_LinkCombinationEClass = VTCDPackage.eINSTANCE.getVTCDFactory().createVTCDLinkCombinationEClass();
				cc.add(VTCDCommandFactory.INSTANCE.createLinkCombinationEClassCommand(p_figureCombination,l_LinkCombinationEClass,l_FigureEquivalenceClass));
				cc.add(VTCDCommandFactory.INSTANCE.createChangeTerminalCommand(l_LinkCombinationEClass,VTCDFigureEquivalenceClassView.TERMINAL_1_IN,true));
				 	
			 }
		 }
	 
		 //delete invalid  element figures
		 for (Iterator i = p_figureCombination.getM_VTCDLinkCombinationEClass().iterator(); i
		 .hasNext();)
		 {
			 l_LinkCombinationEClass = (VTCDLinkCombinationEClass) i.next();
		 
			 if (!candidateEquivalenceClasses.contains(l_LinkCombinationEClass.getDestEquivalenceClass().getM_EquivalenceClass()))
				cc.add(VTCDCommandFactory.INSTANCE.createDeleteLinkCombinationEClassCommand(l_LinkCombinationEClass));
		
		 }
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Link Combination Eclass");
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
 * @param p_diagramCombination
 * @return
 */
private Command loadFigureElementsToCombinationDiagramPolicy(VTCDDiagramCombination p_diagramCombination) {
	CompoundCommand cc = new CompoundCommand();
	Collection candidateElements;
	if (p_diagramCombination.getM_FigureDependency()!=null)
	  candidateElements = p_diagramCombination.getM_FigureDependency().getM_Dependency().getProxyElement();
	else
		candidateElements = ((VTCDFigureDependency)createdObjects.get(p_diagramCombination)).getM_Dependency().getProxyElement();
	 //check the Elements that are in the model
	 for (Iterator j = candidateElements.iterator(); j.hasNext();)
	 {
		 CMProxyElement l_ProxyElement = (CMProxyElement) j.next(); 
		 VTCDFigureElement l_FigureElement = p_diagramCombination.getM_VTCDFigureElement(l_ProxyElement);
		 if (l_FigureElement == null) 
		 {
				  l_FigureElement= VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureElement(l_ProxyElement);
				 //add the element figures to the model
				  //createdObjects.put(l_ProxyElement,l_FigureElement);
				  cc.add(VTCDCommandFactory.INSTANCE.createFigureElementCommand(p_diagramCombination,l_FigureElement,defaultConstraint));
				 //by default all elements in the combination diagram are unfolded
				 cc.add(VTCDCommandFactory.INSTANCE.createChangeFoldedCommand(l_FigureElement,false)); 
		 }
		 //check for children equivalenceClasses
		cc.add(loadFigureEquivalenceClassesPolicy(l_FigureElement));
		 
	 }
//	delete invalid  element figures
	 for (Iterator i = p_diagramCombination.getM_VTCDFigureElement().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureElement  l_FigureElement = (VTCDFigureElement) i.next();
		 
		if (!candidateElements.contains(l_FigureElement.getM_Element()))
			cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureElement(l_FigureElement));
		
	 }
	if (cc.getCommands().size()>0)
	{
//		System.out.println("Elements to combination");
//		for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//		{
//			 Command c = (Command)i.next();
//			 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//		}
	     return cc;
		}
	else
		return null;

}

/**
 * @param p_figureDependency
 * @return
 */
private Command loadLinkDependencyElementsPolicy(VTCDFigureDependency p_figureDependency, VTCDDiagramMain p_diagram) {
	CompoundCommand cc = new CompoundCommand();
	Collection candidateElements = p_figureDependency.getM_Dependency().getProxyElement();
	 VTCDLinkDependencyElement  l_LinkDependencyElement=null;
	
		 //check the Figure Elements that are in the model
		 for (Iterator j = candidateElements.iterator(); j.hasNext();)
		 {
			 CMProxyElement l_ProxyElement = (CMProxyElement) j.next(); 
			 if (p_figureDependency.getM_VTCDLinkDependencyElement(l_ProxyElement) == null) 
			 {
				 VTCDFigureElement l_FigureElement =p_diagram
				 .getM_VTCDFigureElement(l_ProxyElement);
				 if (l_FigureElement==null)
				 l_FigureElement = (VTCDFigureElement) createdObjects.get(l_ProxyElement);
					 l_LinkDependencyElement = VTCDPackage.eINSTANCE.getVTCDFactory().createVTCDLinkDependencyElement();
				 	 cc.add(VTCDCommandFactory.INSTANCE.createLinkDependencyElementCommand(p_figureDependency,l_LinkDependencyElement,l_FigureElement));
				 
			 }
		 }
		 for (Iterator i = p_figureDependency.getM_VTCDLinkDependencyElement().iterator(); i
			.hasNext();)
		 {
			 l_LinkDependencyElement = (VTCDLinkDependencyElement) i.next();
				 
				if (!candidateElements.contains(l_LinkDependencyElement.getDestElement().getM_Element()))
						cc.add(VTCDCommandFactory.INSTANCE.createDeleteLinkDependencyElementCommand(l_LinkDependencyElement));
				
		}
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Link Dependency element");
//			for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//			{
//							 Command c = (Command)i.next();
//				 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//			}
		     return cc;
			}
		else
			return null;

}


private CompoundCommand loadFigureElementsToMainPolicy(VTCDDiagramMain p_DiagramMain)
 {
	 CompoundCommand cc = new CompoundCommand();
	 
	 Collection candidateElements = p_DiagramMain.getM_TestObject().getProxyElement();
	 //	check the Elements that are in the model
	 for (Iterator j = candidateElements.iterator(); j.hasNext();)
	 {
		 CMProxyElement l_ProxyElement = (CMProxyElement) j.next(); 
		 VTCDFigureElement l_FigureElement = p_DiagramMain.getM_VTCDFigureElement(l_ProxyElement);
		 if ( l_FigureElement== null) 
		 {
				 l_FigureElement= VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureElement(l_ProxyElement);
				 //add the element figures to the model
				 createdObjects.put(l_ProxyElement,l_FigureElement);
				 cc.add(VTCDCommandFactory.INSTANCE.createFigureElementCommand(p_DiagramMain,l_FigureElement,defaultConstraint));
				 //by default all elements in the main diagram are folded
				 cc.add(VTCDCommandFactory.INSTANCE.createChangeFoldedCommand(l_FigureElement,true));
				 //check for children equivalenceClasses
				
		 }
		 cc.add(loadFigureEquivalenceClassesPolicy(l_FigureElement));
		 //((CMProxyEquivalenceClassImpl)l_ProxyEquivalenceClass).checkEffects();
	 }

	 
	 //delete invalid  element figures
	 for (Iterator i = p_DiagramMain.getM_VTCDFigureElement().iterator(); i
		.hasNext();)
	 {
		 VTCDFigureElement  l_FigureElement = (VTCDFigureElement) i.next();
		 
		if (!candidateElements.contains(l_FigureElement.getM_Element()))
				cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureElement(l_FigureElement));
		
	 }
		if (cc.getCommands().size()>0)
		{
//			System.out.println("Elements to main");
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
 * @param p_figureElement
 */
private CompoundCommand loadFigureEquivalenceClassesPolicy(VTCDFigureElement p_figureElement) {
	CompoundCommand cc = new CompoundCommand();
	 Collection candidateEquivalenceClasses = p_figureElement.getM_Element().getProxyEquivalenceClass();
	 
	 //check the EquivalenceClasses that are in the model
	 for (Iterator j = candidateEquivalenceClasses.iterator(); j.hasNext();)
	 {
		 CMProxyEquivalenceClass l_ProxyEquivalenceClass = (CMProxyEquivalenceClass) j.next(); 
		 if (p_figureElement.getM_VTCDFigureEquivalenceClass(l_ProxyEquivalenceClass) == null) {
				 VTCDFigureEquivalenceClass l_FigureEquivalenceClass = VTCDPackage.eINSTANCE.getVTCDFactory()
				 .createVTCDFigureEquivalenceClass(l_ProxyEquivalenceClass);
				 createdObjects.put(l_ProxyEquivalenceClass,l_FigureEquivalenceClass);
				 //add the EquivalenceClass figures to the model
				 cc.add(VTCDCommandFactory.INSTANCE.createFigureEquivalenceClassCommand(p_figureElement,l_FigureEquivalenceClass));				 
		
		 }
	 	}
		 //		check invalid  EquivalenceClass figures
		 for (Iterator i = p_figureElement.getM_VTCDFigureEquivalenceClass().iterator(); i
			.hasNext();)
		 {
			 VTCDFigureEquivalenceClass  l_FigureEquivalenceClass = (VTCDFigureEquivalenceClass) i.next();
			 
			if (!candidateEquivalenceClasses.contains(l_FigureEquivalenceClass.getM_EquivalenceClass()))
					cc.add(VTCDCommandFactory.INSTANCE.createDeleteFigureEquivalenceClassCommand(l_FigureEquivalenceClass));
			
		 }
	 
	if (cc.getCommands().size()>0)
	{
//		System.out.println("Equivalence Classes");
//		for (Iterator i = cc.getCommands().iterator();i.hasNext();)
//		{
//			 Command c = (Command)i.next();
//			 System.out.println((c.canExecute()+" "+c.getClass().toString()));
//		}
	     return cc;
	}
	else
		return null;
}


}