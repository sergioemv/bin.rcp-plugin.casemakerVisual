/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.vtcd.model.VTCDFigureElement;

/**
 * @author svonborries
 * @26-08-2005
 * @svonborries
 */
public class VTCDChangeElementIconCommand extends Command{

	private VTCDFigureElement m_figureElement;
	private String m_newPath, m_oldPath;
	
	public VTCDChangeElementIconCommand(VTCDFigureElement p_figureElement, String p_path){
		m_figureElement = p_figureElement;
		this.m_oldPath = m_figureElement.getIcon();
		this.m_newPath = p_path;
	}
	
	public boolean canExecute(){
		return this.m_figureElement!=null && this.m_newPath != null;
	}
	
	public void execute(){
		this.m_figureElement.setIcon(m_newPath);
	}
	
	public void undo(){
		this.m_figureElement.setIcon(m_oldPath);
	}
	
}
