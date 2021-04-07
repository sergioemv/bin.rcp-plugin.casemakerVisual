/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyEquivalenceClass;

/**
 * @author svonborries
 *
 */
public class CMProxyChangeValueCommand extends Command{
	private CMProxyEquivalenceClass m_EquivalenceClass;
	private String newName, oldName;
	
	public CMProxyChangeValueCommand(CMProxyEquivalenceClass p_EquivalenceClass, String p_Value){
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
