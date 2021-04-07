/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyRiskObject;

/**
 * @author svonborries
 *
 */
public class CMProxyChangeStateCommand extends Command {

	private CMProxyRiskObject m_RiskObject;
	private int m_newState;
	private int m_oldState;
	
	public CMProxyChangeStateCommand(CMProxyRiskObject p_ProxyRiskObject,int p_State){
		super("Change State");
		this.m_RiskObject = p_ProxyRiskObject;
		this.m_newState = p_State;
		this.m_oldState = p_ProxyRiskObject.getState();
	}
	public boolean canExecute(){
		return this.m_newState >=0 && this.m_newState <=3 && this.m_RiskObject!=null;
	}
	public void execute(){
		this.m_RiskObject.setState(this.m_newState);
	}
	public void undo(){
		this.m_RiskObject.setState(this.m_oldState);
	}
}
