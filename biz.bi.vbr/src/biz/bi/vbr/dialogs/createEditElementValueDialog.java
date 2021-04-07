/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.dialogs;


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import biz.bi.vbr.vbrvm.provider.VBRRiskLevelColor;

/**
 * @author cmendezroca
 *
 */
public class createEditElementValueDialog extends Dialog {

	public CCombo m_RiskCCombo;
	private Combo m_StateCombo;
	private Combo m_ValueCombo;
	private Combo m_ElementCombo;

	public Label RiskColors_label;
	public String m_ElementString;
	public String m_ValueString;
	public String m_StateString;
	public String m_RiskString;
	

	
	public createEditElementValueDialog(Shell parentShell) {
		super(parentShell);
	}

	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());

		final Label ElementLabel = new Label(container, SWT.NONE);
		final FormData formData = new FormData();
		formData.bottom = new FormAttachment(0, 28);
		formData.top = new FormAttachment(0, 15);
		formData.right = new FormAttachment(0, 60);
		formData.left = new FormAttachment(0, 15);
		ElementLabel.setLayoutData(formData);
		ElementLabel.setText("Element");

		m_ElementCombo = new Combo(container, SWT.NONE);
		final FormData formData_1 = new FormData();
		formData_1.bottom = new FormAttachment(ElementLabel, 21, SWT.TOP);
		formData_1.top = new FormAttachment(ElementLabel, 0, SWT.TOP);
		formData_1.right = new FormAttachment(ElementLabel, 295, SWT.LEFT);
		formData_1.left = new FormAttachment(ElementLabel, 45, SWT.LEFT);
		m_ElementCombo.setLayoutData(formData_1);

		final Label ValueLabel = new Label(container, SWT.NONE);
		final FormData formData_2 = new FormData();
		formData_2.bottom = new FormAttachment(ElementLabel, 48, SWT.TOP);
		formData_2.right = new FormAttachment(ElementLabel, 26, SWT.LEFT);
		formData_2.top = new FormAttachment(ElementLabel, 35, SWT.TOP);
		formData_2.left = new FormAttachment(ElementLabel, 0, SWT.LEFT);
		ValueLabel.setLayoutData(formData_2);
		ValueLabel.setText("Value");

		m_ValueCombo = new Combo(container, SWT.NONE);
		final FormData formData_3 = new FormData();
		formData_3.bottom = new FormAttachment(ElementLabel, 56, SWT.TOP);
		formData_3.top = new FormAttachment(ElementLabel, 35, SWT.TOP);
		formData_3.right = new FormAttachment(ElementLabel, 295, SWT.LEFT);
		formData_3.left = new FormAttachment(ElementLabel, 45, SWT.LEFT);
		m_ValueCombo.setLayoutData(formData_3);

		final Label RiskLabel = new Label(container, SWT.NONE);
		final FormData formData_4 = new FormData();
		formData_4.bottom = new FormAttachment(ElementLabel, 83, SWT.TOP);
		formData_4.right = new FormAttachment(ElementLabel, 19, SWT.LEFT);
		formData_4.top = new FormAttachment(ElementLabel, 70, SWT.TOP);
		formData_4.left = new FormAttachment(ElementLabel, 0, SWT.LEFT);
		RiskLabel.setLayoutData(formData_4);
		RiskLabel.setText("Risk");

		final Label StateLabel = new Label(container, SWT.NONE);
		final FormData formData_5 = new FormData();
		formData_5.right = new FormAttachment(ElementLabel, 216, SWT.LEFT);
		formData_5.bottom = new FormAttachment(ElementLabel, 83, SWT.TOP);
		formData_5.top = new FormAttachment(ElementLabel, 70, SWT.TOP);
		formData_5.left = new FormAttachment(ElementLabel, 190, SWT.LEFT);
		StateLabel.setLayoutData(formData_5);
		StateLabel.setText("State");

		m_StateCombo = new Combo(container, SWT.READ_ONLY);
		final FormData formData_6 = new FormData();
		formData_6.bottom = new FormAttachment(ElementLabel, 91, SWT.TOP);
		formData_6.top = new FormAttachment(ElementLabel, 70, SWT.TOP);
		formData_6.right = new FormAttachment(ElementLabel, 295, SWT.LEFT);
		formData_6.left = new FormAttachment(ElementLabel, 240, SWT.LEFT);
		m_StateCombo.setLayoutData(formData_6);

		m_RiskCCombo = new CCombo(container, SWT.READ_ONLY | SWT.BORDER);
		m_RiskCCombo.setItems(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
		
		m_RiskCCombo.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent p_e) {
				
			     if ((m_RiskCCombo.getSelectionIndex()) != -1){
			    	 String l_RiskLevel=getRiskLevel();
			    	
			    	 if ( l_RiskLevel == "0"){
			        	RiskColors_label.setBackground(VBRRiskLevelColor.darkgreen);
			         }
			    	 if ( l_RiskLevel == "1"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.flagGreen);
				        }
			    	 if ( l_RiskLevel == "2"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.green);
				        }
			    	 if ( l_RiskLevel == "3"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.lightGreen);
				        }
			    	 if ( l_RiskLevel == "4"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.greenTransparency);
				        }
			    	 if ( l_RiskLevel == "5"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.yellowGreen);
				        }
			    	 if ( l_RiskLevel == "6"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.yellow);
				        }
			    	 if ( l_RiskLevel == "7"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.pink);
				        }
			    	 if ( l_RiskLevel == "8"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.darkPink);
				        }
			    	 if ( l_RiskLevel == "9"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.red);
				        }
			    	 if ( l_RiskLevel == "10"){
				        	RiskColors_label.setBackground(VBRRiskLevelColor.darkRed);
				        }
			    	 
			     }
			}

			public void widgetDefaultSelected(SelectionEvent p_e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		m_RiskCCombo.setVisibleItemCount(10);
		m_RiskCCombo.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		final FormData formData_7 = new FormData();
		formData_7.right = new FormAttachment(0, 110);
		formData_7.top = new FormAttachment(RiskLabel, 0, SWT.TOP);
		formData_7.left = new FormAttachment(m_ValueCombo, 0, SWT.LEFT);
		m_RiskCCombo.setLayoutData(formData_7);

		RiskColors_label = new Label(container, SWT.NONE);
		RiskColors_label.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));

		final FormData formData_8 = new FormData();
		formData_8.left = new FormAttachment(0, 120);
		formData_8.bottom = new FormAttachment(m_RiskCCombo, 0, SWT.BOTTOM);
		formData_8.right = new FormAttachment(0, 190);
		formData_8.top = new FormAttachment(m_RiskCCombo, 0, SWT.TOP);
		RiskColors_label.setLayoutData(formData_8);
			
		return container;
	}
    
		
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	protected Point getInitialSize() {
		return new Point(329, 197);
	}
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Business Element Value Properties");
	}
	
	protected void buttonPressed(int buttonId) {
	        if (buttonId == IDialogConstants.OK_ID) {
	        		        	
	        	this.setElement(this.getElement());
	        	this.setValueString(this.getValue());
	        	this.setRiskLevel(this.getRiskLevel());
	        	this.setState(this.getState());
	        
	        }
	        super.buttonPressed(buttonId);
	 }
	
	public String getElement(){
		return  this.m_ElementCombo.getText();
	}
	
	public void setElement(String p_element){
		this.m_ElementString = p_element;
	}
	
	public String getValue(){
		return this.m_ValueCombo.getText();
	}
	 
	 public void setValueString(String p_valueText) {
			this.m_ValueString = p_valueText;
		} 
	 
	 public String getState(){
		return this.m_StateCombo.getText();
	 }
	 
	 public void setState(String p_state){
		this.m_StateString = p_state; 
	 }
	 
	 public String getRiskLevel(){
		 return this.m_RiskCCombo.getText();
	 }
	 
	 public void setRiskLevel(String p_riskLevel){
		 this.m_RiskString = p_riskLevel;
	 }
	
}
