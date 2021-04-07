/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author hcanedo
 * @09-08-2005
 * @hcanedo
 */
public class VTCDCreateEditEffectDialog extends Dialog {

	private Composite m_Shell = null;  //  @jve:decl-index=0:visual-constraint="1,0"
	private Label m_NameLabel = null;
	private Text m_NameTextField = null;
	private Text m_DescriptionTextArea = null;
	private Label label = null;
	private Label label1 = null;
	private Label label2 = null;
	private Label label5 = null;
	private Label label6 = null;
	private Label label4 = null;
	
	private Label m_Descriptionlabel = null;
	private String m_Description="";
	private String m_Title="";
	private Image m_TitleImage=null;
	private boolean okSelected= false;
	/**
	 * @param p_parentShell
	 */
	public VTCDCreateEditEffectDialog(Shell p_parentShell, String p_Title, Image p_TitleImage) {
		super(p_parentShell);
		m_Title=p_Title;
		m_TitleImage=p_TitleImage;
	}


	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return this.m_Description;
	}

	/**
	 * @param p_description The description to set.
	 */
	public void setDescription(String p_description) {
		this.m_Description = p_description;
		this.m_DescriptionTextArea.setText(m_Description);
	}

	public void setName(String p_Name){
		this.m_NameTextField.setText(p_Name);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#cancelPressed()
	 */
	protected void cancelPressed() {
		okSelected=false;
		super.cancelPressed();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite p_parent) {
		GridData gridData6 = new GridData();
		gridData6.grabExcessHorizontalSpace = true;
		gridData6.grabExcessVerticalSpace = true;
		gridData6.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData6.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;

		GridData gridData5 = new GridData();
		gridData5.grabExcessHorizontalSpace = true;
		gridData5.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData4 = new GridData();
		gridData4.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData4.grabExcessHorizontalSpace = true;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData3.grabExcessHorizontalSpace = true;
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData = new GridData();
		gridData.horizontalSpan = 5;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalSpan = 5;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 5;
		gridLayout.makeColumnsEqualWidth = true;
		m_Shell = new Composite(p_parent,SWT.NONE);
		m_Shell.setLayout(gridLayout);
		m_Shell.setLayoutData(gridData6);
		m_NameLabel = new Label(m_Shell, SWT.NONE);
		m_NameLabel.setText("Name");
		m_NameLabel.setLayoutData(gridData2);
		m_NameTextField = new Text(m_Shell, SWT.BORDER);
		m_NameTextField.setEditable(false);
		m_NameTextField.setLayoutData(gridData1);
		label = new Label(m_Shell, SWT.NONE);
		label1 = new Label(m_Shell, SWT.NONE);
		label2 = new Label(m_Shell, SWT.NONE);
		m_Descriptionlabel = new Label(m_Shell, SWT.NONE);
		m_Descriptionlabel.setText("Description");
		m_Descriptionlabel.setLayoutData(gridData5);
		m_DescriptionTextArea = new Text(m_Shell, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
		m_DescriptionTextArea.setLayoutData(gridData);
		m_DescriptionTextArea.setFocus();
		label4 = new Label(m_Shell, SWT.NONE);
		label5 = new Label(m_Shell, SWT.NONE);
		label6 = new Label(m_Shell, SWT.NONE);
		return m_Shell;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed() {
		m_Description=this.m_DescriptionTextArea.getText();
		okSelected=true;
		super.okPressed();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	protected void configureShell(Shell p_newShell) {
		super.configureShell(p_newShell);
		p_newShell.setSize(new org.eclipse.swt.graphics.Point(449,317));
		placeDialogInCenter(p_newShell);
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
}  //  @jve:decl-index=0:visual-constraint="466,10"
