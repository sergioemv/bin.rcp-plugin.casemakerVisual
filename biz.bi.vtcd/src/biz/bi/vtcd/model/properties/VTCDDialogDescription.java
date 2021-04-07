/**
 * 
 */
package biz.bi.vtcd.model.properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author hcanedo
 *
 */
public class VTCDDialogDescription extends Dialog {
	private Shell sShell = null;  //  @jve:decl-index=0:visual-constraint="0,115"
	private Text m_TextAreaDescription = null;
	private Button m_ButtonOk = null;
	private Button m_ButtonCancel = null;
	private boolean okSelected=false;
	private String m_Description="";
	private Label label = null;
	private Label label1 = null;
	private Label label2 = null;
	/**
	 * @param p_parent
	 */
	public VTCDDialogDescription(Shell p_parent) {
		super(p_parent);
		createSShell();
		
	}


	/**
	 * @param p_parent
	 * @param p_style
	 */
	public VTCDDialogDescription(Shell p_parent, int p_style) {
		super(p_parent, p_style);
		createSShell();
		
	}
	
	public void placeDialogInCenter(){ 
	    Rectangle parentSize = this.getParent().getBounds(); 
	    Rectangle mySize = sShell.getBounds(); 

	    int locationX, locationY; 
	    locationX = (parentSize.width - mySize.width)/2+parentSize.x; 
	    locationY = (parentSize.height - mySize.height)/2+parentSize.y; 

	    sShell.setLocation(new Point(locationX, locationY)); 
	} 


	/**
	 * This method initializes sShell	
	 *
	 */
	private void createSShell() {
		sShell = new Shell(SWT.APPLICATION_MODAL | SWT.DIALOG_TRIM );
		sShell.setText("Description");
		sShell.setLayout(new GridLayout(5, true));
		sShell.setSize(new org.eclipse.swt.graphics.Point(430,300));
		m_TextAreaDescription = new Text(sShell, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
		GridData data = new GridData(GridData.FILL_BOTH);
	    data.horizontalSpan = 5;
	    m_TextAreaDescription.setLayoutData(data);
	    label = new Label(sShell, SWT.NONE);
	    label1 = new Label(sShell, SWT.NONE);
	    label2 = new Label(sShell, SWT.NONE);
	    m_ButtonOk = new Button(sShell, SWT.PUSH);
	    m_ButtonOk.setText("OK");
	    m_ButtonOk.setFocus();
	    m_ButtonOk.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	    m_ButtonCancel = new Button(sShell, SWT.PUSH);
	    m_ButtonCancel.setText("Cancel");
	    m_ButtonCancel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	    m_ButtonOk.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
	    	public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
	    		okSelected=true;
	    		m_Description=m_TextAreaDescription.getText();
	    		sShell.dispose();
	    	}
	    });
	    m_ButtonCancel.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
	    			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
	    				okSelected=false;
	    				sShell.dispose();
	    			}
	    		});
	    placeDialogInCenter();
	}

	public void setDescription(String p_Description){
		m_TextAreaDescription.setText(p_Description);
		m_Description=p_Description;
	}
	public String getDescription(){
		return m_TextAreaDescription.getText();
	}


	/**
	 * @return Returns the okSelected.
	 */
	public boolean isOkSelected() {
		return this.okSelected;
	}


	/**
	 * 
	 */
	public void open() {
		sShell.open();
		while (!sShell.isDisposed())
			if (!getParent().getDisplay().readAndDispatch()) getParent().getDisplay().sleep();

	}

	public void setM_Description(String p_Description){
		m_Description=p_Description;
	}
	public String getM_Description(){
		return m_Description;
	}
}  //  @jve:decl-index=0:visual-constraint="130,62"
