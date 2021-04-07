/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author cmendezroca
 * 
 */
public class createEditTreeDialog extends Dialog {

	private Text m_TreeDescriptionText;
	
	public String m_DescriptionString;
	
	public createEditTreeDialog(Shell parentShell) {
		super(parentShell);
	}

	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());

		final Label DescriptionLabel = new Label(container, SWT.NONE);
		final FormData formData = new FormData();
		formData.bottom = new FormAttachment(0, 45);
		formData.top = new FormAttachment(0, 25);
		formData.right = new FormAttachment(0, 75);
		formData.left = new FormAttachment(0, 15);
		DescriptionLabel.setLayoutData(formData);
		DescriptionLabel.setText("Description");

		m_TreeDescriptionText = new Text(container, SWT.V_SCROLL | SWT.BORDER | SWT.H_SCROLL);
		final FormData formData_1 = new FormData();
		formData_1.bottom = new FormAttachment(DescriptionLabel, 110, SWT.TOP);
		formData_1.top = new FormAttachment(DescriptionLabel, 0, SWT.TOP);
		formData_1.right = new FormAttachment(DescriptionLabel, 295, SWT.LEFT);
		formData_1.left = new FormAttachment(DescriptionLabel, 60, SWT.LEFT);
		m_TreeDescriptionText.setLayoutData(formData_1);
		//
		return container;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	protected Point getInitialSize() {
		return new Point(343, 222);
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Business Rule Tree Dialog");
	}
    
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			getDescription();
			this.setDescription(this.m_TreeDescriptionText.getText());
		}
		super.buttonPressed(buttonId);
	}
	
	public String getDescription(){
		return this.m_DescriptionString;
		
	}
	
	public void setDescription(String p_desc){
		this.m_DescriptionString = p_desc;
	}
}
