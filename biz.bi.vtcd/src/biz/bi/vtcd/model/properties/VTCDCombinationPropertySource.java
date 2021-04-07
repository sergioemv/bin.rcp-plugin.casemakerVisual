/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.properties;

import java.util.List;

import biz.bi.cmcore.model.CMProxyCombination;

/**
 * @author hcanedo
 * @25-08-2005
 * @hcanedo
 */
public class VTCDCombinationPropertySource extends VTCDModelPropertySource {

	private final VTCDPropertyId idName;
	private final VTCDPropertyId idDescription;
	private final VTCDPropertyId idRiskLevel;
	private final VTCDPropertyId idState;
	/**
	 * @param p_model
	 */
	public VTCDCombinationPropertySource(String categoryName, Object p_model) {
		super(p_model);
		idName = new VTCDPropertyId(categoryName, "Name");
		idDescription = new VTCDPropertyId(categoryName, "Description");
		idRiskLevel = new VTCDPropertyId(categoryName, "RiskLevel");
		idState = new VTCDPropertyId(categoryName, "State");

		
	}

	/* (non-Javadoc)
	 * @see biz.bi.vtcd.model.properties.VTCDAbstractPropertySource#createPropertyDescriptors(java.util.List)
	 */
	protected void createPropertyDescriptors(List p_list) {
		p_list.add(new VTCDStringPropertyDescriptor(idName));
		p_list.add(new VTCDDialogDescriptionPropertyDescriptor(idDescription));
		p_list.add(new VTCDStatePropertyDescriptor(idState));
		p_list.add(new VTCDRiskLevelPropertyDescriptor(idRiskLevel));

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
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object p_id) {
		if (p_id == idName)
			return VTCDStringPropertyDescriptor.fromModel(getCMProxyCombination().getName());
		else if (p_id == idDescription)
			return VTCDDialogDescriptionPropertyDescriptor.fromModel(getCMProxyCombination().getDescription());
		else if (p_id == idRiskLevel) 
			return VTCDRiskLevelPropertyDescriptor.fromModel(getCMProxyCombination().getRiskLevel());
		else if (p_id == idState) 
			return VTCDStatePropertyDescriptor.fromModel(getCMProxyCombination().getState());
		else
			return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object p_id) {
	}

	protected CMProxyCombination getCMProxyCombination() {
		return (CMProxyCombination)getModel();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object p_id, Object p_value) {
		if (p_id == idName) {
			getCMProxyCombination().setName(VTCDStringPropertyDescriptor.toModel(p_value));
		} 
		else if (p_id == idDescription) {
			getCMProxyCombination().setDescription(VTCDDialogDescriptionPropertyDescriptor.toModel(p_value));
		}
		else if (p_id == idRiskLevel) {
			getCMProxyCombination().setRiskLevel(VTCDRiskLevelPropertyDescriptor.toModel(p_value));
		}
		else if (p_id == idState) {
			getCMProxyCombination().setState(VTCDStatePropertyDescriptor.toModel(p_value));
		}

	}


}
