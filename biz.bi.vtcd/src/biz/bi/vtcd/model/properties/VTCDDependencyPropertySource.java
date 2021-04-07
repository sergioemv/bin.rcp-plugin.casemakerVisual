/**
 * 
 */
package biz.bi.vtcd.model.properties;

import java.util.List;

import biz.bi.cmcore.model.CMProxyDependency;

/**
 * @author hcanedo
 *
 */
public class VTCDDependencyPropertySource extends VTCDModelPropertySource {

	private final VTCDPropertyId idName;
	private final VTCDPropertyId idDescription;
	/**
	 * @param p_model
	 */
	public VTCDDependencyPropertySource(String categoryName, Object p_model) {
		super(p_model);
		idName = new VTCDPropertyId(categoryName+ READ_ONLY, "Name");
		idDescription = new VTCDPropertyId(categoryName, "Description");
		
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.properties.VTCDAbstractPropertySource#createPropertyDescriptors(java.util.List)
	 */
	protected void createPropertyDescriptors(List p_list) {
		p_list.add(new VTCDReadOnlyPropertyDescriptor(idName));
		p_list.add(new VTCDDialogDescriptionPropertyDescriptor(idDescription));

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertyResettable(java.lang.Object)
	 */
	public boolean isPropertyResettable(Object p_id) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object p_id) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object p_id) {
		if (p_id == idName)
			return VTCDReadOnlyPropertyDescriptor.fromModel(getCMProxyDependency().getName());
		if (p_id == idDescription)
			return VTCDDialogDescriptionPropertyDescriptor.fromModel(getCMProxyDependency().getDescription());
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object p_id) {
		// TODO Auto-generated method stub

	}

	protected CMProxyDependency getCMProxyDependency() {
		return (CMProxyDependency)getModel();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object p_id, Object p_value) {
		if (p_id == idDescription) {
			getCMProxyDependency().setDescription(VTCDDialogDescriptionPropertyDescriptor.toModel(p_value));
		}
	}

}
