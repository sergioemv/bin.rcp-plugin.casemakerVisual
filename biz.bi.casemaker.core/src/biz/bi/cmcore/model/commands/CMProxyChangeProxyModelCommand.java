/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.cmcore.model.commands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyObject;

/**
 * @author smoreno
 *
 */
public class CMProxyChangeProxyModelCommand extends Command {
	
	private CMProxyObject proxy;
	private Object model,oldmodel;
	public Object getModel() {
		return this.model;
	}
	public void setModel(Object p_model) {
		this.model = p_model;
	}
	public CMProxyObject getProxy() {
		return this.proxy;
	}
	public void setProxy(CMProxyObject p_proxy) {
		this.proxy = p_proxy;
	}
	public boolean canExecute() {
		
		return this.model!=null&&this.proxy!=null;
	}
	public void execute() {
		oldmodel = proxy.getCMModel();
		proxy.setCMModel(model);
		
	
	}
	public void undo() 
	{
		proxy.setCMModel(oldmodel);
	}
	

}
