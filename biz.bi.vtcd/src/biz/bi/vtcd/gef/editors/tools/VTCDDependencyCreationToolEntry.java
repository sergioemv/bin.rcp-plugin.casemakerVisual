/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.gef.editors.tools;


import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;



/**
 * @author svonborries
 * @26-07-2005
 * @svonborries
 */
public class VTCDDependencyCreationToolEntry extends CombinedTemplateCreationEntry {
	private CreationFactory m_Factory;
	/**
	 * @param p_label
	 * @param p_shortDesc
	 * @param p_template
	 * @param p_factory
	 * @param p_iconSmall
	 * @param p_iconLarge
	 * 
	 */
	public VTCDDependencyCreationToolEntry(String p_label, String p_shortDesc, Object p_template, CreationFactory p_factory, ImageDescriptor p_iconSmall, ImageDescriptor p_iconLarge) {
		super(p_label, p_shortDesc, p_template, p_factory, p_iconSmall, p_iconLarge);
		this.m_Factory = p_factory;
	}
	
public Tool createTool(){
	return new VTCDDependencyCreationTool(this.m_Factory);
}

}
