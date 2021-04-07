/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.vbrvm.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRElementView;

/**
 * @author hcanedo
 * @since 14-09-2005
 */
public class VBRVMCreateElementCommand extends Command {

	private MainDiagram m_Parent;
	private VBRElementView m_Child;
	private Rectangle m_Constrains= new Rectangle(20,20,-1,-1);

	/**
	 * 
	 * @author hcanedo
	 * @param p_child 
	 * @param p_parent 
	 * @since 14-09-2005
	 */
	public VBRVMCreateElementCommand(MainDiagram p_parent, VBRElementView p_child) {
		super();
		m_Child=p_child;
		m_Parent=p_parent;
	}

	/**
	 * @return Returns the child.
	 * @author hcanedo
	 * @since 14-09-2005
	 */
	public VBRElementView getChild() {
		return m_Child;
	}

	/**
	 * @param p_child The child to set.
	 * @author hcanedo
	 * @since 14-09-2005
	 */
	public void setChild(VBRElementView p_child) {
		m_Child = p_child;
	}

	/**
	 * @return Returns the constrains.
	 * @author hcanedo
	 * @since 14-09-2005
	 */
	public Rectangle getConstrains() {
		return m_Constrains;
	}

	/**
	 * @param p_constrains The constrains to set.
	 * @author hcanedo
	 * @since 14-09-2005
	 */
	public void setConstrains(Rectangle p_constrains) {
		m_Constrains = p_constrains;
	}

	/**
	 * @return Returns the parent.
	 * @author hcanedo
	 * @since 14-09-2005
	 */
	public MainDiagram getParent() {
		return m_Parent;
	}

	/**
	 * @param p_parent The parent to set.
	 * @author hcanedo
	 * @since 14-09-2005
	 */
	public void setParent(MainDiagram p_parent) {
		m_Parent = p_parent;
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
		m_Parent.getM_VBRElementView().add(m_Child);
		m_Child.setM_MainDiagram(m_Parent);
		m_Child.setHeigth(m_Constrains.height);
		m_Child.setWidth(m_Constrains.width);
		m_Child.setX(m_Constrains.x);
		m_Child.setY(m_Constrains.y);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#setLabel(java.lang.String)
	 */
	public void setLabel(String p_label) {
		super.setLabel(p_label);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		m_Parent.getM_VBRElementView().remove(m_Child);
	}

	

}
