/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 D�az und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.cmcore.model.cmcommands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * @author svonborries
 *
 */
public class CMCoreChangeValueCommand extends Command{
	private CMProxyEquivalenceClass m_EquivalenceClass;
	private String newName, oldName;
	
	public CMCoreChangeValueCommand(CMProxyEquivalenceClass p_EquivalenceClass, String p_Value){
		super("Change Name");
		m_EquivalenceClass = p_EquivalenceClass;
		this.oldName = p_EquivalenceClass.getValue();
		this.newName = p_Value.trim();
	}
	
	public void execute(){
		this.m_EquivalenceClass.setValue(this.newName);
	}
	
	public void undo(){
		this.m_EquivalenceClass.setValue(this.oldName);
	}
	
}
