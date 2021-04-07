/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.dialogs;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColorCellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

/**
 * @author cmendezroca
 *
 */
public class createEditElement extends Dialog {

	private Table m_Table;
	private Text m_DescriptionText;
	private Text m_NameText;
	
	private String m_DescriptionString="";
    private String m_NameString="";
    
    public int[] arrayOfItems;
    
	public createEditElement(Shell parentShell) {
		super(parentShell);
	}

	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());

		final Composite DialogComposite = new Composite(container, SWT.NONE);
		final FormData formData_1 = new FormData();
		formData_1.right = new FormAttachment(100, -5);
		formData_1.bottom = new FormAttachment(0, 270);
		formData_1.top = new FormAttachment(0, 5);
		formData_1.left = new FormAttachment(0, 5);
		DialogComposite.setLayoutData(formData_1);
		DialogComposite.setLayout(new FormLayout());

		final TabFolder PropertiesTabFolder = new TabFolder(DialogComposite, SWT.NONE);
		final FormData formData = new FormData();
		formData.right = new FormAttachment(100, -5);
		formData.left = new FormAttachment(0, 5);
		formData.top = new FormAttachment(0, 5);
		formData.bottom = new FormAttachment(0, 260);
		PropertiesTabFolder.setLayoutData(formData);

		final TabItem l_PropertiesTabItem = new TabItem(PropertiesTabFolder, SWT.NONE);
		l_PropertiesTabItem.setText("Properties");

		final Group propertyGroup = new Group(PropertiesTabFolder, SWT.NONE);
		propertyGroup.setLayout(new FormLayout());
		l_PropertiesTabItem.setControl(propertyGroup);

		final Label NameLabel = new Label(propertyGroup, SWT.NONE);
		final FormData formData_2 = new FormData();
		formData_2.bottom = new FormAttachment(0, 23);
		formData_2.top = new FormAttachment(0, 10);
		formData_2.right = new FormAttachment(0, 35);
		formData_2.left = new FormAttachment(0, 5);
		NameLabel.setLayoutData(formData_2);
		NameLabel.setText("Name");

		m_NameText = new Text(propertyGroup, SWT.BORDER);
		final FormData formData_3 = new FormData();
		formData_3.left = new FormAttachment(NameLabel, 0, SWT.RIGHT);
		formData_3.bottom = new FormAttachment(NameLabel, 19, SWT.TOP);
		formData_3.top = new FormAttachment(NameLabel, 0, SWT.TOP);
		formData_3.right = new FormAttachment(100, -6);
		m_NameText.setLayoutData(formData_3);

		final Label DesLabel = new Label(propertyGroup, SWT.NONE);
		final FormData formData_4 = new FormData();
		formData_4.bottom = new FormAttachment(0, 53);
		formData_4.top = new FormAttachment(0, 40);
		formData_4.right = new FormAttachment(NameLabel, 53, SWT.LEFT);
		formData_4.left = new FormAttachment(NameLabel, 0, SWT.LEFT);
		DesLabel.setLayoutData(formData_4);
		DesLabel.setText("Description");

		m_DescriptionText = new Text(propertyGroup, SWT.V_SCROLL | SWT.BORDER | SWT.H_SCROLL);
		final FormData formData_5 = new FormData();
		formData_5.bottom = new FormAttachment(DesLabel, 135, SWT.BOTTOM);
		formData_5.top = new FormAttachment(DesLabel, 5, SWT.BOTTOM);
		formData_5.right = new FormAttachment(m_NameText, 195, SWT.LEFT);
		formData_5.left = new FormAttachment(m_NameText, 0, SWT.LEFT);
		m_DescriptionText.setLayoutData(formData_5);

		final TabItem l_BusinessValueTabItem = new TabItem(PropertiesTabFolder, SWT.NONE);
		l_BusinessValueTabItem.setText("Business Value");

		final Composite bValueComposite = new Composite(PropertiesTabFolder, SWT.NONE);
		bValueComposite.setLayout(new GridLayout());
		l_BusinessValueTabItem.setControl(bValueComposite);
	
		
		final TableViewer m_BValueTableViewer = new TableViewer(bValueComposite, SWT.BORDER);
		m_BValueTableViewer.setItemCount(20);
		m_Table = m_BValueTableViewer.getTable();
		m_Table.setHeaderVisible(true);
		m_Table.setLinesVisible(true);
		final GridData gridData = new GridData(GridData.END, GridData.FILL, false, false);
		gridData.heightHint = 201;
		gridData.widthHint = 226;
		m_Table.setLayoutData(gridData);

		TableColumn l_ValueTableColumn = new TableColumn(m_Table, SWT.NONE);
		l_ValueTableColumn.setResizable(false);
		l_ValueTableColumn.setWidth(141);
		l_ValueTableColumn.setText("Value");

		TableColumn l_RiskTableColumn = new TableColumn(m_Table, SWT.NONE);
		l_RiskTableColumn.setResizable(false);
		l_RiskTableColumn.setWidth(54);
		l_RiskTableColumn.setText("Risk");
		m_BValueTableViewer.setInput(new Object());
		//l_NewItemTableItem.setText(new String[] {"rtyurtyu", "iouo9ui"});

		final TableColumn l_riskColorsTableColumn = new TableColumn(m_Table, SWT.NONE);
		l_riskColorsTableColumn.setWidth(41);
		l_riskColorsTableColumn.setText("Color");
		
			
		final TableItem l_NewItemTableItem_1 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_1.setBackground(ColorConstants.yellow);
		
		final TableItem l_NewItemTableItem = new TableItem(m_Table, SWT.BORDER);

		final TableItem l_NewItemTableItem_2 = new TableItem(m_Table, SWT.BORDER);
		

		final TableItem l_NewItemTableItem_3 = new TableItem(m_Table, SWT.BORDER);
		
		
		final TableItem l_NewItemTableItem_4 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_4.setText("New item");

		final TableItem l_NewItemTableItem_5 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_5.setText("New item");

		final TableItem l_NewItemTableItem_6 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_6.setText("New item");

		final TableItem l_NewItemTableItem_7 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_7.setText("New item");

		final TableItem l_NewItemTableItem_8 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_8.setText("New item");

		final TableItem l_NewItemTableItem_9 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_9.setText("New item");

		final TableItem l_NewItemTableItem_10 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_10.setText("New item");

		final TableItem l_NewItemTableItem_11 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_11.setText("New item");

		final TableItem l_NewItemTableItem_12 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_12.setText("New item");

		final TableItem l_NewItemTableItem_13 = new TableItem(m_Table, SWT.BORDER);
		l_NewItemTableItem_13.setText("New item");
		//editors[0] = textEditor; 
		
		CellEditor[] editors = new CellEditor[1];
		
		TextCellEditor textEditor = new TextCellEditor(m_Table);
		((Text) textEditor.getControl()).setTextLimit(60);
		editors[0] = (CellEditor) textEditor;
		
		String[] riesgos = {"0","1","2","3","4","5","6","7","8","9","10"};
		editors[1] = (CellEditor) new ComboBoxCellEditor(m_Table, riesgos, SWT.READ_ONLY);
		
		editors[2] = new ColorCellEditor(bValueComposite);
	
		m_BValueTableViewer.setCellEditors(editors);
		
		return container;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	protected Point getInitialSize() {
		return new Point(285, 346);
	}
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Business Element Properties");
	}

	 protected void buttonPressed(int buttonId) {
	        if (buttonId == IDialogConstants.OK_ID) {
	        	getNameText();
	        	getDescriptionText();
	        	obteinItems();
	        }
	        super.buttonPressed(buttonId);
	 }
	 
	 public String getNameText() {
		return m_NameText.getText();
		 
	 }
	 
	 public String getDescriptionText() {
		return m_DescriptionText.getText();
		 
	 }
	 
	 public void obteinItems(){
		 
		 arrayOfItems = m_Table.getColumnOrder();
		 int temp  = arrayOfItems.length;
		
		 for (int i=0; i == temp; i++ ){
			  TableItem item = m_Table.getItem(i);
			  item.getText();
			  
		 }
	 }
}
