/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyElement;
/**
 * @author svonborries
 *
 */
public class CMProxyChangeNameCommand extends Command{

	private CMProxyElement m_proxyElement;
	private String newName, oldName;
	
	public CMProxyChangeNameCommand(CMProxyElement p_proxyElement, String p_name){
		super("Change Name");
					this.m_proxyElement = p_proxyElement;
					this.oldName = p_proxyElement.getName();
					this.newName = p_name.trim();
		}
	
	public void execute() {
			m_proxyElement.setName(this.newName);
		}
		
	public void undo() {
			m_proxyElement.setName(this.oldName);
		}
		public boolean canExecute()
		{return newName!=null && m_proxyElement!=null;}
	
}
