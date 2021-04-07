/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.editors.tools;


import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author hcanedo
 * @since 05-09-2005
 */
public class VBRBusinessTreeCreationToolEntry extends
		CombinedTemplateCreationEntry {

	private CreationFactory m_Factory;
	/**
	 * @param p_label
	 * @param p_shortDesc
	 * @param p_template
	 * @param p_factory
	 * @param p_iconSmall
	 * @param p_iconLarge
	 * @author hcanedo
	 * @since 05-09-2005
	 */
	public VBRBusinessTreeCreationToolEntry(String p_label, String p_shortDesc,
			Object p_template, CreationFactory p_factory,
			ImageDescriptor p_iconSmall, ImageDescriptor p_iconLarge) {
		super(p_label, p_shortDesc, p_template, p_factory, p_iconSmall,
				p_iconLarge);
		m_Factory=p_factory;
	}
	public Tool createTool(){
		return new VBRBusinessTreeCreationTool(m_Factory);
	}
}
