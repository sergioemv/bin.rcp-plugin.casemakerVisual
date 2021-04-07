/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 D�az und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.dialogs;

import java.io.File;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseEvent;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;


/**
 * @author svonborries
 * @08-ago-2005
 * @Malon
 */
public class VTCDElementDialog extends Dialog{

	 	private Text m_DescriptionText;
	    private Text m_IDText;
	    private Text m_NameText;
	    private Text m_BrowseText;
	    
	    private String m_DescriptionString="";
	    private String m_NameString="";
	    private String m_AssignIcon="";
	    private String m_BrowseString="";
	    private String m_IDString="";
		private boolean m_isOk = false;
		private String m_oldPathString="";
	    
	    public VTCDElementDialog(Shell parentShell) {
	        super(parentShell);
	    }
	
	    protected Control createDialogArea(Composite parent) {
	        Composite container = (Composite) super.createDialogArea(parent);
	        container.setLayout(new FormLayout());

	        Group elementGroup = new Group(container, SWT.NONE);
	        elementGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementDialog_elementGroup"));
	        FormData formData = new FormData();
	        formData.right = new FormAttachment(100, -5);
	        formData.bottom = new FormAttachment(100, -5);
	        formData.top = new FormAttachment(0, 5);
	        formData.left = new FormAttachment(0, 5);
	        elementGroup.setLayoutData(formData);
	        FormLayout formDataElementGroup = new FormLayout();
	        elementGroup.setLayout(formDataElementGroup);

	        Label nameLabel = new Label(elementGroup, SWT.NONE);
	        FormData formDataNameLabel = new FormData();
	        formDataNameLabel.right = new FormAttachment(0, 40);
	        formDataNameLabel.top = new FormAttachment(0, 10);
	        formDataNameLabel.left = new FormAttachment(0, 5);
	        nameLabel.setLayoutData(formDataNameLabel);
	        nameLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementDialog_nameLabel"));

	        m_NameText = new Text(elementGroup, SWT.BORDER);
	        FormData formDataNameText = new FormData();
	        formDataNameText.top = new FormAttachment(0, 10);
	        formDataNameText.left = new FormAttachment(0, 45);
	        formDataNameText.right = new FormAttachment(0, 135);
	        formDataNameText.bottom = new FormAttachment(0, 30);
	        m_NameText.setLayoutData(formDataNameText);
	        m_NameText.setText(getNameString());

	        Label IdLabel = new Label(elementGroup, SWT.NONE);
	        FormData formDataIdLabel = new FormData();
	        formDataIdLabel.left = new FormAttachment(0, 23);
	        formDataIdLabel.top = new FormAttachment(0, 40);
	        IdLabel.setLayoutData(formDataIdLabel);
	        IdLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementDialog_IdLabel"));

	        m_IDText = new Text(elementGroup, SWT.BORDER);
	        m_IDText.setEnabled(false);
	        FormData formData_1 = new FormData();
	        formData_1.top = new FormAttachment(0, 40);
	        formData_1.left = new FormAttachment(0, 45);
	        formData_1.right = new FormAttachment(0, 135);
	        formData_1.bottom = new FormAttachment(0, 60);
	        m_IDText.setLayoutData(formData_1);
	        m_IDText.setText(this.getIDString());

	        Label assignIconLabel = new Label(elementGroup, SWT.NONE);
	        FormData formDataAssignIconLabel = new FormData();
	        formDataAssignIconLabel.top = new FormAttachment(0, 10);
	        formDataAssignIconLabel.left = new FormAttachment(0, 154);
	        assignIconLabel.setLayoutData(formDataAssignIconLabel);
	        assignIconLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementDialog_assignIconLabel"));

	        Button browseButton = new Button(elementGroup, SWT.NONE);
	        browseButton.addMouseListener(new MouseListener() {
	            public void mouseDoubleClick(MouseEvent e) {
	            }
	            public void mouseDown(MouseEvent e) {
	            }
	            public void mouseUp(MouseEvent e) {
	            	Display d = Display.getDefault();
					Shell s = d.getActiveShell();
					FileDialog fd = new FileDialog(s, SWT.OPEN);
					fd.setText("Select an Icon");
					if (getBrowseString().equalsIgnoreCase(""))
						fd.setFilterPath("C:/");
					else
						fd.setFilterPath(new File(getBrowseString()).getParent());
					String[] filterExtention = {"*.gif"};
					fd.setFilterExtensions(filterExtention);
					String res = fd.open();
					if (res!=null)
					setAssignIcon(res);
	            }
	        });
	        FormData formDataBrowseButton = new FormData();
	        formDataBrowseButton.right = new FormAttachment(0, 474);
	        formDataBrowseButton.top = new FormAttachment(0, 6);
	        formDataBrowseButton.left = new FormAttachment(0, 409);
	        browseButton.setLayoutData(formDataBrowseButton);
	        browseButton.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementDialog_browseButton"));

	        Group descriptionGroup = new Group(elementGroup, SWT.NONE);
	        descriptionGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementDialog_descriptionGroup"));
	        FormData formDataDescriptionGroup = new FormData();
	        formDataDescriptionGroup.right = new FormAttachment(100, -5);
	        formDataDescriptionGroup.bottom = new FormAttachment(100, -5);
	        formDataDescriptionGroup.top = new FormAttachment(0, 70);
	        formDataDescriptionGroup.left = new FormAttachment(IdLabel, 0, SWT.LEFT);
	        descriptionGroup.setLayoutData(formDataDescriptionGroup);
	        descriptionGroup.setLayout(new FormLayout());

	        m_DescriptionText = new Text(descriptionGroup, SWT.V_SCROLL | SWT.BORDER | SWT.H_SCROLL);
	        FormData formDataDescriptionText = new FormData();
	        formDataDescriptionText.right = new FormAttachment(100, -5);
	        formDataDescriptionText.bottom = new FormAttachment(100, -5);
	        formDataDescriptionText.top = new FormAttachment(0, 5);
	        formDataDescriptionText.left = new FormAttachment(0, 5);
	        m_DescriptionText.setLayoutData(formDataDescriptionText);
	        m_DescriptionText.setText(this.getDescriptionString());
	        
	        m_BrowseText = new Text(elementGroup,SWT.READ_ONLY | SWT.BORDER);
	        FormData formDataBrowseText = new FormData();
	        formDataBrowseText.right = new FormAttachment(browseButton, -5, SWT.LEFT);
	        formDataBrowseText.bottom = new FormAttachment(m_NameText, 0, SWT.BOTTOM);
	        formDataBrowseText.top = new FormAttachment(assignIconLabel, 0, SWT.TOP);
	        formDataBrowseText.left = new FormAttachment(assignIconLabel, 5, SWT.RIGHT);
	        m_BrowseText.setLayoutData(formDataBrowseText);
	        m_BrowseText.setText(this.getBrowseString());
	        if (m_BrowseText.getText()!=null)
	        this.m_oldPathString = m_BrowseText.getText();
	        return container;
	    }

	    protected void createButtonsForButtonBar(Composite parent) {
	        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
	                true);
	        createButton(parent, IDialogConstants.CANCEL_ID,
	                IDialogConstants.CANCEL_LABEL, false);
	    }

	    protected Point getInitialSize() {
	        return new Point(500, 338);
	    }
	    protected void configureShell(Shell newShell) {
	        super.configureShell(newShell);
	        newShell.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementDialog_DialogTitle"));
	    }
	    protected void buttonPressed(int buttonId) {
	        if (buttonId == IDialogConstants.OK_ID) {
	        	getNameText();
	        	getDescriptionText();
	        	getAssignIcon();
	        	
	        	this.setBrowseString(this.m_BrowseText.getText());
	        	this.setDescriptionString(this.m_DescriptionText.getText());
	        	this.setNameString(this.m_NameText.getText());
	        	
	        	if(!this.getBrowseString().equalsIgnoreCase(""))
	        		if(this.checkIcon(this.getBrowseString())==false){
	      
	        			this.setAssignIcon(this.m_oldPathString);
	        			this.open();
	        			return;
	        		}
	        	this.set_isOk(true);
	        	/*if (this.s_NameText == ""){
					Throwable error = new Throwable();
					
					VTCDElementErrorDialog errorDialog = new VTCDElementErrorDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),
							VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementErrorDialog_Title"),
							null, 
							VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementErrorDialog_ErrorDescription"), 
							error,
							VTCDImages.getImage(VTCDImages.PALETTE_ELEMENT));
					if(errorDialog.open() == Window.OK){
						this.open();
					}
				}*/
	        }
	        super.buttonPressed(buttonId);
	    }

		/**
		 * @return Returns the descriptionText.
		 */
		public String getDescriptionText() {
			this.m_DescriptionString = this.m_DescriptionText.getText();
			return this.m_DescriptionString;
		}

		/**
		 * @param p_descriptionText The descriptionText to set.
		 */
		public void setDescriptionText(String p_descriptionText) {
			if(!p_descriptionText.equals(""))
				this.m_DescriptionText.setText(p_descriptionText);
		}

		/**
		 * @return Returns the nameText.
		 */
		public String getNameText() {
			m_NameString = this.m_NameText.getText();
			return m_NameString;
		}

		/**
		 * @param p_nameText The nameText to set.
		 */
		public void setNameText(String p_nameText) {
			if(!p_nameText.equals(""))
				this.m_NameText.setText(p_nameText);
		}

		/**
		 * @return Returns the text.
		 */
		public String getIDText() {
			return this.m_IDText.getText();
		}

		/**
		 * @param p_text The text to set.
		 */
		public void setIDText(String p_text) {
			if(!p_text.equals(""))
				this.m_IDText.setText(p_text);
		}

		/**
		 * @return Returns the assignIcon.
		 */
		public String getAssignIcon() {
			
			
			return this.m_AssignIcon;
		}

		/**
		 * @param p_assignIcon The assignIcon to set.
		 */
		public void setAssignIcon(String p_assignIcon) {
			
				this.m_AssignIcon = p_assignIcon;
				this.m_BrowseString = m_AssignIcon;
				this.m_BrowseText.setText(p_assignIcon);
				
			
		}

		public String getBrowseString() {
			return this.m_BrowseString;
		}

		public void setBrowseString(String p_browseText) {
			if(p_browseText!=null)
				this.m_BrowseString = p_browseText;

		}

		public String getDescriptionString() {
			return this.m_DescriptionString;
		}

		public void setDescriptionString(String p_descriptionText) {
			this.m_DescriptionString = p_descriptionText;
		}

		public String getNameString() {
			return this.m_NameString;
		}

		public void setNameString(String p_nameText) {
			this.m_NameString = p_nameText;
		}

		public String getIDString() {
			return this.m_IDString;
		}

		public void setIDString(String p_text) {
			this.m_IDString = p_text;
		}

	    public boolean checkIcon(String path){
	    	Image image = VTCDImages.getImageFromDir(path);
	    	if((image.getBounds().height>16) && (image.getBounds().width>16)){
				MessageDialog.openError(this.getShell(),VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementErrorDialog_Title"),VTCDEditPlugin.INSTANCE.getString("_UI_VTCDElementErrorDialog_IconError"));
			
				return false;}
	    	else
	    		return true;
	    }
	    
	public boolean set_isOk(boolean p_ok){
		m_isOk  = p_ok;
		return m_isOk;
		
	}
	public boolean get_isOk(){
		return m_isOk;
	}
	
}
