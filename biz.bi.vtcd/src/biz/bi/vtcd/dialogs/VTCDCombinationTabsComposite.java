/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 D�az und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.dialogs;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;




/**
 * @author hcanedo
 * @since 16-08-2005
 * @hcanedo
 */
public class VTCDCombinationTabsComposite extends Composite {

	private Group availablesGroup = null;
	private List avalilablesList = null;
	private Label label = null;
	private Group assignGroup = null;
	private List assignList = null;
	private Button addButton = null;
	private Button deleteButton = null;
	private Label label1 = null;
	private Button addAllButton = null;
	private Button deleteAllButton = null;
	private Label label3 = null;
	private Label label4 = null;
	private Label label5 = null;
	private Label label2 = null;
	private java.util.List m_AviablesObject=null;
	private java.util.List m_AssignObject=null;
	/**
	 * @param p_parent
	 * @param p_style
	 */
	public VTCDCombinationTabsComposite(Composite p_parent, int p_style) {
		super(p_parent, p_style);
		initialize();
	}

	private void initialize() {
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = GridData.FILL;
		gridData5.verticalAlignment = GridData.FILL;
		GridData gridData4 = new GridData();
		gridData4.horizontalAlignment = GridData.FILL;
		gridData4.verticalAlignment = GridData.FILL;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = GridData.FILL;
		gridData3.verticalAlignment = GridData.FILL;
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = GridData.FILL;
		gridData2.verticalAlignment = GridData.FILL;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 7;
		gridLayout.verticalSpacing = 8;
		gridLayout.makeColumnsEqualWidth = true;
		this.setLayout(gridLayout);
		createavailablesGroup();
		label = new Label(this, SWT.NONE);
		createassignGroup();
		label1 = new Label(this, SWT.NONE);
		addButton = new Button(this, SWT.NONE);
		addButton.setText(">");
		addButton.setLayoutData(gridData2);
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				addButtonWidgetSelected(evt);
			}
		});
		deleteButton = new Button(this, SWT.NONE);
		deleteButton.setText("<");
		deleteButton.setLayoutData(gridData3);
		deleteButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				deleteButtonWidgetSelected(evt);
			}
		});
		addAllButton = new Button(this, SWT.NONE);
		addAllButton.setText(">>");
		addAllButton.setLayoutData(gridData4);
		addAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				addAllButtonWidgetSelected(evt);
			}
		});
		deleteAllButton = new Button(this, SWT.NONE);
		deleteAllButton.setText("<<");
		deleteAllButton.setLayoutData(gridData5);
		deleteAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				deleteAllButtonWidgetSelected(evt);
			}
		});
		label2 = new Label(this, SWT.NONE);
		label3 = new Label(this, SWT.NONE);
		label3.setText("");
		
	}

	/**
	 * This method initializes availablesGroup	
	 *
	 */
	private void createavailablesGroup() {
		GridData gridData = new GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.horizontalSpan = 3;
		gridData.verticalSpan = 8;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		availablesGroup = new Group(this, SWT.NONE);
		availablesGroup.setText("Availables");
		availablesGroup.setLayout(new FillLayout());
		availablesGroup.setLayoutData(gridData);
		{
			avalilablesList = new List(availablesGroup, SWT.BORDER |SWT.V_SCROLL | SWT.H_SCROLL |SWT.MULTI);
		}
	}

	/**
	 * This method initializes assignGroup	
	 *
	 */
	private void createassignGroup() {
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.verticalSpan = 8;
		gridData1.horizontalSpan = 3;
		gridData1.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		assignGroup = new Group(this, SWT.NONE);
		assignGroup.setLayout(new FillLayout());
		assignGroup.setText("Assigned");
		assignGroup.setLayoutData(gridData1);
		assignList = new List(assignGroup, SWT.BORDER |SWT.V_SCROLL | SWT.H_SCROLL |SWT.MULTI);
	}
	
	public void setLabelToRightGroup(String p_Label){
		assignGroup.setText(p_Label);
	}
	
	public void setLabelToLeftGroup(String p_Label){
		availablesGroup.setText(p_Label);
	}
	
	public void setShuttleContents(java.util.List p_AvailableContents,java.util.List p_AssignedContents ){
		if(p_AssignedContents != null)
			m_AssignObject=makeListClone(p_AssignedContents);
		else 
			m_AssignObject= new Vector(0);
		if(p_AvailableContents != null)
			m_AviablesObject=makeListClone(p_AvailableContents);
		else
			m_AviablesObject=new Vector(0);
		m_AviablesObject.removeAll(m_AssignObject);
		setListToAvailablesGroup();
		setListToAssignedGroup();
	}
	
	private void setListToAvailablesGroup(){
		avalilablesList.removeAll();
		for(Iterator i=m_AviablesObject.iterator();i.hasNext();){
			avalilablesList.add(i.next().toString());
		}
	}
	private void setListToAssignedGroup(){
		assignList.removeAll();
		for(Iterator i=m_AssignObject.iterator();i.hasNext();){
			assignList.add(i.next().toString());
		}
	}
	
	private void addButtonWidgetSelected(SelectionEvent evt) {
		int[] cantSelected=avalilablesList.getSelectionIndices();
		for (int i = 0; i < cantSelected.length; i++) {
			int index = cantSelected[i];
			Object selected=m_AviablesObject.get(index);
			m_AssignObject.add(selected);
		}
		m_AviablesObject.removeAll(m_AssignObject);
		setListToAssignedGroup();
		setListToAvailablesGroup();
	}
	
	

	private void deleteButtonWidgetSelected(SelectionEvent evt) {
		int[] cantSelected=assignList.getSelectionIndices();
		for (int i = 0; i < cantSelected.length; i++) {
			int index = cantSelected[i];
			Object selected=m_AssignObject.get(index);
			m_AviablesObject.add(selected);
		}
		m_AssignObject.removeAll(m_AviablesObject);
		setListToAssignedGroup();
		setListToAvailablesGroup();
	}
	
	private void addAllButtonWidgetSelected(SelectionEvent evt) {
		for (Iterator iter = m_AviablesObject.iterator(); iter.hasNext();) {
			Object element = (Object) iter.next();
			m_AssignObject.add(element);
		}		
		m_AviablesObject.clear();
		setListToAssignedGroup();
		setListToAvailablesGroup();
	}
	
	private void deleteAllButtonWidgetSelected(SelectionEvent evt) {
		for (Iterator iter = m_AssignObject.iterator(); iter.hasNext();) {
			Object element = (Object) iter.next();
			m_AviablesObject.add(element);
		}		
		m_AssignObject.clear();
		setListToAssignedGroup();
		setListToAvailablesGroup();
	}

	/**
	 * @return Returns the assignObject.
	 */
	public java.util.List getAssignObject() {
		return this.m_AssignObject;
	}

	/**
	 * @return Returns the aviablesObject.
	 */
	public java.util.List getAviablesObject() {
		return this.m_AviablesObject;
	}

	private java.util.List makeListClone(java.util.List p_toClone){
		Vector vector=new Vector(p_toClone);
		return vector;
	}

	
}  //  @jve:decl-index=0:visual-constraint="10,10"
