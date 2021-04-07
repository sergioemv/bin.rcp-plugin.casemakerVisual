/**
 * 
 */
package biz.bi.vtcd.model.properties;

import java.util.List;

import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;

/**
 * @author hcanedo
 * 
 */
public class VTCDEquivalenceClassPropertySource extends VTCDModelPropertySource {

	private final VTCDPropertyId idName;

	private final VTCDPropertyId idDescription;

	private final VTCDPropertyId idRiskLevel;

	private final VTCDPropertyId idState;

	private final VTCDPropertyId idValue;

	/**
	 * @param p_model
	 */
	public VTCDEquivalenceClassPropertySource(String categoryName,
			Object p_model) {
		super(p_model);
		idName = new VTCDPropertyId(categoryName + READ_ONLY, "Name");
		idDescription = new VTCDPropertyId(categoryName, "Description");
		idRiskLevel = new VTCDPropertyId(categoryName, "RiskLevel");
		idState = new VTCDPropertyId(categoryName, "State");
		idValue = new VTCDPropertyId(categoryName, "Value");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see biz.bi.vtcd.model.properties.VTCDAbstractPropertySource#createPropertyDescriptors(java.util.List)
	 */
	protected void createPropertyDescriptors(List p_list) {
		p_list.add(new VTCDReadOnlyPropertyDescriptor(idName));
		p_list.add(new VTCDDialogDescriptionPropertyDescriptor(idDescription));
		p_list.add(new VTCDStatePropertyDescriptor(idState));
		p_list.add(new VTCDStringPropertyDescriptor(idValue));
		p_list.add(new VTCDRiskLevelPropertyDescriptor(idRiskLevel));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertyResettable(java.lang.Object)
	 */
	public boolean isPropertyResettable(Object p_id) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object p_id) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object p_id) {
		if (p_id == idName) {
			return VTCDReadOnlyPropertyDescriptor.fromModel(getCMProxyEquivalenceClass().getName());
		} else if (p_id == idDescription) {
			return VTCDDialogDescriptionPropertyDescriptor.fromModel(getCMProxyEquivalenceClass().getDescription());
		} else if (p_id == idState) {
			return VTCDStatePropertyDescriptor.fromModel(getCMProxyEquivalenceClass().getState());
		} else if (p_id == idValue) {
			return VTCDStringPropertyDescriptor.fromModel(getCMProxyEquivalenceClass().getValue());
		} else if (p_id == idRiskLevel) {
			return VTCDRiskLevelPropertyDescriptor.fromModel(getCMProxyEquivalenceClass().getRiskLevel());
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object p_id) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object,
	 *      java.lang.Object)
	 */
	public void setPropertyValue(Object p_id, Object p_value) {
		if (p_id == idDescription) {
			getCMProxyEquivalenceClass().setDescription(VTCDDialogDescriptionPropertyDescriptor.toModel(p_value));
		} else if (p_id == idState) {
			getCMProxyEquivalenceClass().setState(VTCDStatePropertyDescriptor.toModel(p_value));
		} else if (p_id == idValue) {
			 getCMProxyEquivalenceClass().setValue(VTCDStringPropertyDescriptor.toModel(p_value));
		} else if (p_id == idRiskLevel) {
			getCMProxyEquivalenceClass().setRiskLevel(VTCDRiskLevelPropertyDescriptor.toModel(p_value));
		}
		

	}
	
	protected CMProxyEquivalenceClass getCMProxyEquivalenceClass() {
		return ((VTCDFigureEquivalenceClass)getModel()).getM_EquivalenceClass();
	}

}
