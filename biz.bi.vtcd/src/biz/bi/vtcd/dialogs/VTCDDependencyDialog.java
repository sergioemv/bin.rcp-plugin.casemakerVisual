/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.dialogs;


import java.util.Iterator;
import java.util.Vector;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;


/**
 * @author svonborries
 * @version
 */
public class VTCDDependencyDialog extends Dialog {

	private Text m_textName;
	private Text m_Description;
	private List m_AvailableElements ;
	private List m_DependentElements;

	
	
	private boolean m_Cancelled = false;
	private java.util.List m_lavailableElements;
	private java.util.List m_ldependentElements;
	public boolean elementSelected = false;
	public String s_Description;
	public VTCDDependencyDialog(Shell parentShell){
		super(parentShell);

		m_ldependentElements = new Vector();
		m_lavailableElements = new Vector();
		
	}
	
	protected Control createDialogArea (Composite p_Parent){
		Composite VTCDDependencyContainer = new Composite(p_Parent,SWT.NONE);
		VTCDDependencyContainer.setLayout(new FormLayout());
		
		Group dependencyGroup = new Group(VTCDDependencyContainer,SWT.NONE);
		dependencyGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyDialog_DependencyGroup"));
		dependencyGroup.setLayout(new FormLayout());
		FormData formDataDependencyGroup = new FormData();
		formDataDependencyGroup.bottom =  new FormAttachment(1000, 1000, -7);
		formDataDependencyGroup.left =  new FormAttachment(0, 1000, 5);
		formDataDependencyGroup.right =  new FormAttachment(1000, 1000, -1);
		formDataDependencyGroup.top =  new FormAttachment(0, 1000, -1);
		formDataDependencyGroup.width = 431;
		formDataDependencyGroup.height = 280;
		dependencyGroup.setLayoutData(formDataDependencyGroup);
		
		
		Label l_Name = new Label(dependencyGroup,SWT.NONE);
		FormData formDataName = new FormData();
		formDataName.right = new FormAttachment(0, 37);
		formDataName.left = new FormAttachment(0,7);
		formDataName.top = new FormAttachment(0,9);
		l_Name.setLayoutData(formDataName);
		l_Name.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyDialog_TextName"));
		
		m_textName = new Text(dependencyGroup,SWT.BORDER);
		m_textName.setEnabled(false);
		FormData formDataTextName = new FormData();
		formDataTextName.left =  new FormAttachment(l_Name, 5, SWT.RIGHT);
		formDataTextName.top =  new FormAttachment(0, 1000, 5);
		formDataTextName.bottom =  new FormAttachment(l_Name, 0, SWT.BOTTOM);
		formDataTextName.width = 131;
		formDataTextName.height = 9;
		m_textName.setLayoutData(formDataTextName);
		
			Group descriptionGroup = new Group(dependencyGroup,SWT.NONE);
		descriptionGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyDialog_DescriptionGroup"));
		FormData formdataDescriptionGroup = new FormData();
		formdataDescriptionGroup.bottom = new FormAttachment(0,115);
		formdataDescriptionGroup.top = new FormAttachment(0,35);
		formdataDescriptionGroup.left = new FormAttachment(0,5);
		formdataDescriptionGroup.right = new FormAttachment(100,-5);
		descriptionGroup.setLayoutData(formdataDescriptionGroup);
		descriptionGroup.setLayout(new FormLayout());
		
			m_Description = new Text(descriptionGroup,SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		FormData formdataDescriptionText = new FormData();
		formdataDescriptionText.bottom = new FormAttachment(100,-5);
		formdataDescriptionText.top = new FormAttachment(0, 5);
		formdataDescriptionText.left = new FormAttachment(0, 5);
		formdataDescriptionText.right = new FormAttachment(100,-5);
		m_Description.setLayoutData(formdataDescriptionText);
		
		Group availableElementsGroup = new Group(dependencyGroup,SWT.NONE);
		availableElementsGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyDialog_AvailableElementsGroup"));
		FormData formDataAvailableElementGroup = new FormData(168, 144);
		formDataAvailableElementGroup.bottom =  new FormAttachment(1000, 1000, 0);
		formDataAvailableElementGroup.top =  new FormAttachment(descriptionGroup, 5, SWT.BOTTOM);
		formDataAvailableElementGroup.left =  new FormAttachment(descriptionGroup, 0, SWT.LEFT);
		formDataAvailableElementGroup.width = 168;
		formDataAvailableElementGroup.height = 144;
		availableElementsGroup.setLayoutData(formDataAvailableElementGroup);
		availableElementsGroup.setLayout(new FormLayout());
		availableElementsGroup.setSize(168, 144);

		this.m_AvailableElements = new List (availableElementsGroup,SWT.BORDER |SWT.V_SCROLL | SWT.H_SCROLL |SWT.MULTI);
		FormData formDataAvaibleElements = new FormData();
		formDataAvaibleElements.bottom = new FormAttachment(100,-5);
		formDataAvaibleElements.top = new FormAttachment(0,5);
		formDataAvaibleElements.left = new FormAttachment(0,5);
		formDataAvaibleElements.right = new FormAttachment(100,-5);
		this.m_AvailableElements.setLayoutData(formDataAvaibleElements);
		for (Iterator i = m_lavailableElements.iterator();i.hasNext();)
			this.m_AvailableElements.add(((VTCDFigureElement)i.next()).getM_Element().getName());
		
		
		
		Group dependentElementGroup = new Group(dependencyGroup,SWT.NONE);
		dependentElementGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyDialog_DependentElementsGroup"));
		FormData formDataDependentElementGroup = new FormData();
		formDataDependentElementGroup.bottom =  new FormAttachment(availableElementsGroup, 0, SWT.BOTTOM);
		formDataDependentElementGroup.top =  new FormAttachment(0, 1000, 119);
		formDataDependentElementGroup.left =  new FormAttachment(0, 1000, 252);
		formDataDependentElementGroup.right =  new FormAttachment(descriptionGroup, 0, SWT.RIGHT);
		formDataDependentElementGroup.width = 146;
		formDataDependentElementGroup.height = 145;
		//formDataDependentElementGroup.right = new FormAttachment(descriptionGroup, 0, SWT.RIGHT);
		dependentElementGroup.setLayoutData(formDataDependentElementGroup);
		dependentElementGroup.setLayout(new FormLayout());
		
		this.m_DependentElements = new List (dependentElementGroup,SWT.BORDER |SWT.V_SCROLL | SWT.H_SCROLL |SWT.MULTI);
		FormData formDataDependentElements = new FormData();
		formDataDependentElements.bottom = new FormAttachment(100,-5);
		formDataDependentElements.top = new FormAttachment(0,5);
		formDataDependentElements.left = new FormAttachment(0,5);
		formDataDependentElements.right = new FormAttachment(100,-5);
		this.m_DependentElements.setLayoutData(formDataDependentElements);
		/*for (Iterator i = m_ldependentElements.iterator();i.hasNext();) 	
			this.m_DependentElements.add(((VTCDFigureElement)i.next()).getM_VTCDLinkDependencyElement().);*/
		
		
		Button forwardElement = new Button(dependencyGroup,SWT.NONE);
		forwardElement.addMouseListener(new MouseListener() {
			
			public void mouseDoubleClick(MouseEvent p_e) {		
			}
			public void mouseDown(MouseEvent p_e) {	
			}
			public void mouseUp(MouseEvent p_e) {
				if((m_AvailableElements.getItemCount() != 0)&&(m_AvailableElements.getSelectionIndex()>-1)){
					
					for (int i = 0; i < m_AvailableElements.getItemCount(); i++) {
						if(m_AvailableElements.isSelected(i)){
							
							m_DependentElements.add(m_AvailableElements.getItem(i));
							//m_ldependentElements.add(m_lavailableElements.remove(i));
							m_ldependentElements.add(m_lavailableElements.get(i));
							//m_lavailableElements.remove(i);
							
						}
					}
					
					java.util.List tempAvailableElements;
					tempAvailableElements = new Vector();
					tempAvailableElements.addAll(m_lavailableElements);
					java.util.List tempDependentElements;
					tempDependentElements = new Vector();
					tempDependentElements.addAll(m_ldependentElements);
					
						for (Iterator iter = tempAvailableElements.iterator(); iter.hasNext();) {
							VTCDFigureElement element = (VTCDFigureElement) iter.next();
							for (Iterator iterator = m_ldependentElements.iterator(); iterator
									.hasNext();) {
								VTCDFigureElement element1 = (VTCDFigureElement) iterator.next();
								if (element.equals(element1)){
									m_lavailableElements.remove(element1);
								}
							}
						}
						m_AvailableElements.remove(m_AvailableElements.getSelectionIndices());	
					}
				
				isTwoOrMoreElementsSelected();
			
			}
		});
		FormData formDataForwardElement = new FormData();
		formDataForwardElement.top =  new FormAttachment(0, 1000, 167);
		formDataForwardElement.left =  new FormAttachment(0, 1000, 198);
		formDataForwardElement.width = 34;
		formDataForwardElement.height = 30;
		forwardElement.setLayoutData(formDataForwardElement);
		forwardElement.setText(">");
		
		Button backwardElement = new Button(dependencyGroup,SWT.NONE);
		backwardElement.addMouseListener(new MouseListener(){

			public void mouseDoubleClick(MouseEvent p_e) {	
			}

			public void mouseDown(MouseEvent p_e) {	
			}

			public void mouseUp(MouseEvent p_e) {
				if ((m_DependentElements.getItemCount() != 0) && (m_DependentElements.getSelectionIndex()>-1)){
					for (int i = 0; i < m_DependentElements.getItemCount(); i++) {
						if (m_DependentElements.isSelected(i))
						{
							
							m_AvailableElements.add(m_DependentElements.getItem(i));
							m_lavailableElements.add(m_ldependentElements.get(i));
						}
					}
					java.util.List tempAvailableElements;
					tempAvailableElements = new Vector();
					tempAvailableElements.addAll(m_lavailableElements);
					java.util.List tempDependentElements;
					tempDependentElements = new Vector();
					tempDependentElements.addAll(m_ldependentElements);
					
					for (Iterator iter = tempDependentElements.iterator(); iter.hasNext();) {
						VTCDFigureElement element = (VTCDFigureElement) iter.next();
						for (Iterator iterator = m_lavailableElements.iterator(); iterator
								.hasNext();) {
							VTCDFigureElement element1 = (VTCDFigureElement) iterator.next();
							if (element.equals(element1)){
								m_ldependentElements.remove(element1);
							}
						}
					}
					
					m_DependentElements.remove(m_DependentElements.getSelectionIndices());
					
				}
				isTwoOrMoreElementsSelected();
			}
			
		});
		FormData formDataBackwardElement = new FormData();
		//formDataBackwardElement.bottom = new FormAttachment();
		formDataBackwardElement.top =  new FormAttachment(0, 1000, 134);
		formDataBackwardElement.left =  new FormAttachment(0, 1000, 198);
		formDataBackwardElement.width = 34;
		formDataBackwardElement.height = 30;
		backwardElement.setLayoutData(formDataBackwardElement);
		backwardElement.setText("<");
		
		Button allForwardElements = new Button(dependencyGroup,SWT.NONE);
		allForwardElements.addMouseListener(new MouseListener(){

			public void mouseDoubleClick(MouseEvent p_e) {
			}

			public void mouseDown(MouseEvent p_e) {
			}

			public void mouseUp(MouseEvent p_e) {

					for (int i = 0; i < m_AvailableElements.getItemCount(); i++) {
						m_DependentElements.add(m_AvailableElements.getItem(i));
						m_ldependentElements.add(m_lavailableElements.get(i));
					}

					java.util.List tempAvailableElements;
					tempAvailableElements = new Vector();
					tempAvailableElements.addAll(m_lavailableElements);
					java.util.List tempDependentElements;
					tempDependentElements = new Vector();
					tempDependentElements.addAll(m_ldependentElements);
					
						for (Iterator iter = tempAvailableElements.iterator(); iter.hasNext();) {
							VTCDFigureElement element = (VTCDFigureElement) iter.next();
							for (Iterator iterator = m_ldependentElements.iterator(); iterator
									.hasNext();) {
								VTCDFigureElement element1 = (VTCDFigureElement) iterator.next();
								if (element.equals(element1)){
									m_lavailableElements.remove(element1);
								}
							}
						}	
					
				m_AvailableElements.removeAll();
				isTwoOrMoreElementsSelected();
			}
		});
		FormData formDataAllForwardElements = new FormData();
		formDataAllForwardElements.top =  new FormAttachment(0, 1000, 233);
		formDataAllForwardElements.left =  new FormAttachment(0, 1000, 198);
		formDataAllForwardElements.width = 34;
		formDataAllForwardElements.height = 30;
		allForwardElements.setLayoutData(formDataAllForwardElements);
		allForwardElements.setText(">>");
		
		Button allBackwardElements = new Button(dependencyGroup,SWT.NONE);
		allBackwardElements.addMouseListener(new MouseListener(){

			public void mouseDoubleClick(MouseEvent p_e) {
			}

			public void mouseDown(MouseEvent p_e) {
			}

			public void mouseUp(MouseEvent p_e) {

					for (int i = 0; i < m_DependentElements.getItemCount(); i++) {
						m_AvailableElements.add(m_DependentElements.getItem(i));
						m_lavailableElements.add(m_ldependentElements.get(i));
						
					}
			
					java.util.List tempAvailableElements;
					tempAvailableElements = new Vector();
					tempAvailableElements.addAll(m_lavailableElements);
					java.util.List tempDependentElements;
					tempDependentElements = new Vector();
					tempDependentElements.addAll(m_ldependentElements);
					
					for (Iterator iter = tempDependentElements.iterator(); iter.hasNext();) {
						VTCDFigureElement element = (VTCDFigureElement) iter.next();
						for (Iterator iterator = m_lavailableElements.iterator(); iterator
								.hasNext();) {
							VTCDFigureElement element1 = (VTCDFigureElement) iterator.next();
							if (element.equals(element1)){
								m_ldependentElements.remove(element1);
							}
						}
					}
					
					
				m_DependentElements.removeAll();
				isTwoOrMoreElementsSelected();
			}
			
		});
		FormData formDataAllBackwardElements = new FormData();
		formDataAllBackwardElements.top =  new FormAttachment(0, 1000, 200);
		formDataAllBackwardElements.left =  new FormAttachment(0, 1000, 198);
		formDataAllBackwardElements.width = 34;
		formDataAllBackwardElements.height = 30;
		allBackwardElements.setLayoutData(formDataAllBackwardElements);
		allBackwardElements.setText("<<");
		
		
		return VTCDDependencyContainer;
	}
	protected void createButtonsOkCancel(Composite p_Parent){
		 createButton(p_Parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
	                true);
	        createButton(p_Parent, IDialogConstants.CANCEL_ID,
	                IDialogConstants.CANCEL_LABEL, false);
	}
	
	/*protected Point getInitialSize() {
        return new Point(604, 408);
    }*/
	
	protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyDialog_DependencyDialogTitle"));
         
    }
	
	protected void buttonPressed (int buttonId) {
		if(buttonId == IDialogConstants.OK_ID){
			
			this.setCancelled(false);
			getDescription();
			int i=0;
			for (Iterator iter = m_ldependentElements.iterator(); iter.hasNext();) {
				VTCDFigureElement element = (VTCDFigureElement) iter.next();
				i +=1;
			}
			if (i<=1){
				Throwable error = new Throwable();
				

				VTCDDependencyErrorDialog errorDialog = new VTCDDependencyErrorDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(),
						VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyErrorDialog_Title"),
						null, 
						VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyErrorDialog_ErrorDescription"), 
						error,
						VTCDImages.getImage(VTCDImages.PALETTE_DEPENDENCY));
				if(errorDialog.open() == Window.OK){
					this.open();
				}
			}
		}
		else{
			this.setCancelled(true);
			
		}
		super.buttonPressed(buttonId);
			
	}

	public java.util.List getAvailableElements() {
		return (java.util.List) this.m_AvailableElements;
	}

	public void setAvailableElements(java.util.List p_availableElements) {
		/*if (m_AvailableElements.getItemCount()>0)
			this.m_AvailableElements.removeAll();
		for (Iterator i = p_availableElements.iterator();i.hasNext();) 	
		this.m_AvailableElements.add(((VTCDFigureElement)p_availableElements).getM_Element().getName());*/
		
		m_lavailableElements.addAll(p_availableElements);
	}

	public java.util.List getDependentElements() {
		/*for (Iterator i = m_lavailableElements.iterator();i.hasNext();) 	
			this.m_AvailableElements.add(((VTCDFigureElement)i.next()).getM_Element().getName());*/
		/*for (Iterator iter = m_lavailableElements.iterator(); iter.hasNext();) {
			VTCDFigureElement element = (VTCDFigureElement) iter.next();
			
		}*/
	/*	for (Iterator iter = m_lavailableElements.iterator(); iter.hasNext();) {
			VTCDFigureElement element = (VTCDFigureElement) iter.next();
			
			m_ldependentElements.add();*/
		
		return m_ldependentElements;
	}

	public void setDependentElements(java.util.List p_dependentElements) {
		m_DependentElements = (List) p_dependentElements;
	}

	public String getDescription() {
		s_Description = m_Description.getText();
		return m_Description.getText();
	}

	public void setDescription(String p_description) {
		this.m_Description.setText(p_description);
	}

	public String getTextName() {
		return m_textName.getText();
	}

	public void setTextName(String p_textName) {
		this.m_textName.setText(p_textName);
	}

	public boolean isCancelled() {
		return this.m_Cancelled;
	}

	public void setCancelled(boolean p_cancelled) {
		this.m_Cancelled = p_cancelled;
	}
	public boolean isTwoOrMoreElementsSelected() {
		int i=0;
		for (Iterator iter = m_ldependentElements.iterator(); iter.hasNext();) {
			VTCDFigureElement element = (VTCDFigureElement) iter.next();
			i +=1;
		}
		if(i>=2){
			elementSelected = true;
		}
		else
		{
			elementSelected = false;
		}
		return elementSelected;
	}
	public boolean enabledButton(){
		return m_Cancelled;
		
	}
}
