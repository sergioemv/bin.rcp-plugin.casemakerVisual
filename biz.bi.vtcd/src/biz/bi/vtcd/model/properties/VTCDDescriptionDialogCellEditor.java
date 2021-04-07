/**
 * 
 */
package biz.bi.vtcd.model.properties;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author hcanedo
 * @Date 26-07-2005
 */
public class VTCDDescriptionDialogCellEditor extends DialogCellEditor {

	/**
	 *@author hcanedo
	 */
	public VTCDDescriptionDialogCellEditor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *@author hcanedo
	 * @param p_parent
	 */
	public VTCDDescriptionDialogCellEditor(Composite p_parent) {
		super(p_parent);
		// TODO Auto-generated constructor stub
	}

	/**
	 *@author hcanedo
	 * @param p_parent
	 * @param p_style
	 */
	public VTCDDescriptionDialogCellEditor(Composite p_parent, int p_style) {
		super(p_parent, p_style);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.DialogCellEditor#openDialogBox(org.eclipse.swt.widgets.Control)
	 */
	protected Object openDialogBox(Control p_cellEditorWindow) {
		VTCDDialogDescription cmd=new VTCDDialogDescription(p_cellEditorWindow.getShell());
		String value = (String) getValue();

        if (getValue() != null) {
           cmd.setDescription(value);
        }
        cmd.open();
       if(cmd.isOkSelected()){
    	   value= cmd.getM_Description();

       }
        return value;

	}

}
