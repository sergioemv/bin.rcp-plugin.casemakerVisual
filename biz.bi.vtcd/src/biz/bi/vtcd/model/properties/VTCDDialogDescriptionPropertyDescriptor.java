/**
 * 
 */
package biz.bi.vtcd.model.properties;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.PropertyDescriptor;

/**
 * @author hcanedo
 * @Date 26-07-2005
 */
public class VTCDDialogDescriptionPropertyDescriptor extends PropertyDescriptor {

	/**
	 *@author hcanedo
	 * @param p_id
	 * @param p_displayName
	 */
	public VTCDDialogDescriptionPropertyDescriptor(VTCDPropertyId propertyId) {
		super(propertyId, propertyId.getDisplayName());
		setCategory(propertyId.getCategoryName());
	}
	/**
     * @see org.eclipse.ui.views.properties.IPropertyDescriptor#createPropertyEditor(Composite)
     */
    public CellEditor createPropertyEditor(Composite parent) {
       CellEditor editor = new VTCDDescriptionDialogCellEditor(parent);
       if (getValidator() != null)
          editor.setValidator(getValidator());
       return editor;
    }
	/**
	 * @param p_description
	 * @return
	 */
    public static String fromModel(String string) {
    	return string != null ? string : "";
    }

    public static String toModel(Object string) {
    	return (String) string;
    }

}
