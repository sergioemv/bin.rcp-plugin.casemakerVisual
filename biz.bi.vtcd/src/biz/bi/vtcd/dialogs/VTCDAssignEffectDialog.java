/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.dialogs;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import biz.bi.vtcd.provider.VTCDEditPlugin;


/**
 * @author hcanedo
 * @Date 16-08-2005
 * @hcanedo
 */
public class VTCDAssignEffectDialog extends Dialog {

	private VTCDShuttleComposite m_shuttle=null;
	private List m_Availables= null;
	private List m_Assigned= null;
	private String m_Title="";
	private Image m_TitleImage=null;
	private boolean okSelected=false;
	/**
	 * @author hcanedo
	 * @param p_parentShell
	 * @param p_Title
	 * @param p_TitleImage
	 * @param p_Availables
	 * @param p_Assigned
	 * The Constructor
	 */
	public VTCDAssignEffectDialog(Shell p_parentShell, String p_Title,Image p_TitleImage, List p_Availables, List p_Assigned) {
		super(p_parentShell);
		m_Assigned=p_Assigned;
		m_Availables=p_Availables;
		m_Title=p_Title;
		m_TitleImage=p_TitleImage;
	}

	/**
	 * @author hcanedo
	 * @param p_parentShell
	 * @param p_Title
	 * @param p_TitleImage
	 * @param p_Availables
	 * @param p_Assigned
	 * The Constructor
	 */
	public VTCDAssignEffectDialog(IShellProvider p_parentShell,String p_Title,Image p_TitleImage, List p_Availables, List p_Assigned) {
		super(p_parentShell);
		m_Assigned=p_Assigned;
		m_Availables=p_Availables;
		m_Title=p_Title;
		m_TitleImage=p_TitleImage;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite p_parent) {

		m_shuttle= new VTCDShuttleComposite(p_parent,SWT.NONE);
		String assignedEffects= VTCDEditPlugin.INSTANCE.getString("_UI_VTCDAssignedEffect_Group_Label");
		String availablesEffects=VTCDEditPlugin.INSTANCE.getString("_UI_VTCDAvailableEffect_Group_Label");
		setAssignedlistLabel(assignedEffects);
		setAvailablesListLabel(availablesEffects);
		setShuttleContents(m_Availables,m_Assigned);
		return m_shuttle;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed() {
		okSelected=true;
		super.okPressed();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#cancelPressed()
	 */
	protected void cancelPressed() {
		okSelected=false;
		super.cancelPressed();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	protected void configureShell(Shell p_newShell) {
		super.configureShell(p_newShell);
		p_newShell.setText(m_Title);
		p_newShell.setImage(m_TitleImage);
	}
	public void placeDialogInCenter(Shell p_newShell){ 
	    Rectangle parentSize = p_newShell.getParent().getBounds(); 
	    Rectangle mySize = p_newShell.getBounds(); 

	    int locationX, locationY; 
	    locationX = (parentSize.width - mySize.width)/2+parentSize.x; 
	    locationY = (parentSize.height - mySize.height)/2+parentSize.y; 

	    p_newShell.setLocation(new Point(locationX, locationY)); 
	}
	/**
	 * @author hcanedo
	 * @param p_AvailableContent
	 * @param p_AssignedContent
	 * Set the Shuttle content
	 */
	private void setShuttleContents(List p_AvailableContent,List p_AssignedContent){
		m_shuttle.setShuttleContents(p_AvailableContent,p_AssignedContent);
	}

	
	private void setAvailablesListLabel(String p_Title){
		m_shuttle.setLabelToLeftGroup(p_Title);
	}
	private void setAssignedlistLabel(String p_Title){
		m_shuttle.setLabelToRightGroup(p_Title);
	}

	/**
	 * @return Returns the okSelected.
	 */
	public boolean isOkSelected() {
		return this.okSelected;
	}

	/**
	 * @param p_okSelected The okSelected to set.
	 */
	public void setOkSelected(boolean p_okSelected) {
		this.okSelected = p_okSelected;
	}

	public List getSelectProxyEffects(){
		return m_shuttle.getAssignObject();
	}
	public List getAvailablesProxyEffects(){
		return m_shuttle.getAviablesObject();
	}
}
