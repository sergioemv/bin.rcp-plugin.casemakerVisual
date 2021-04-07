/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 D�az und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.vbrvm.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRTreeView;

/**
 * @author hcanedo
 * @since 12-09-2005
 */
public class VBRVMCreateBusinessTreeCommand extends Command {

	
	private MainDiagram m_Parent;
	private VBRTreeView m_Child;
	private Rectangle m_Constrains= new Rectangle(100,100,-1,-1);
	/**
	 * 
	 * @author hcanedo
	 * @since 12-09-2005
	 */
	public VBRVMCreateBusinessTreeCommand() {
		super();
	}
	
	public VBRVMCreateBusinessTreeCommand(MainDiagram p_Parent, VBRTreeView p_Child){
		m_Parent=p_Parent;
		m_Child=p_Child;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return (m_Parent != null) && (m_Child != null);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		m_Parent.getM_TreeView().add(m_Child);
		m_Child.setMainDiagram(m_Parent);
		m_Child.setHeigth(m_Constrains.height);
		m_Child.setWidth(m_Constrains.width);
		m_Child.setX(m_Constrains.x);
		m_Child.setY(m_Constrains.y);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#setLabel(java.lang.String)
	 */
	public void setLabel(String p_label) {
		// TODO Auto-generated method stub
		super.setLabel(p_label);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		m_Parent.getM_TreeView().remove(m_Child);
	}

	
	/**
	 * @param p_child The child to set.
	 * @author hcanedo
	 * @since 13-09-2005
	 */
	public void setChild(VBRTreeView p_child) {
		m_Child = p_child;
	}


	/**
	 * @param p_parent The parent to set.
	 * @author hcanedo
	 * @since 13-09-2005
	 */
	public void setParent(MainDiagram p_parent) {
		m_Parent = p_parent;
	}

	/**
	 * @param p_constrains The constrains to set.
	 * @author hcanedo
	 * @since 13-09-2005
	 */
	public void setConstrains(Rectangle p_constrains) {
		m_Constrains = p_constrains;
	}

	

}
