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
public class CMProxyChangeRiskLevelCommand extends Command {

	private CMProxyRiskObject m_RiskObject;
	private int oldRiskLevel = 0;
	private int newRiskLevel = 0;
	
	public CMProxyChangeRiskLevelCommand(CMProxyRiskObject p_proxyRiskObject,int p_riskLevel){
		super("Change Risk Level");
		m_RiskObject = p_proxyRiskObject;
		this.newRiskLevel = p_riskLevel;
		this.oldRiskLevel = p_proxyRiskObject.getRiskLevel();
		
	}
	
	public boolean canExecute(){
		return newRiskLevel>=0 && newRiskLevel<=10 && m_RiskObject!=null;
	}
	public void execute(){
		this.m_RiskObject.setRiskLevel(newRiskLevel);
	}
	public void undo(){
		this.m_RiskObject.setRiskLevel(oldRiskLevel);
	}
}
