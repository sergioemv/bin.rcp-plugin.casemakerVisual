/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.model.properties;

import java.util.List;

import biz.bi.vtcd.model.VTCDFigureCombination;

/**
 * @author hcanedo
 * @since 25-08-2005
 * @hcanedo
 */
public class VTCDFigureCombinationPropertySource extends VTCDModelPropertySource
{
	
	private final VTCDPropertyId idX;
	private final VTCDPropertyId idY;

	public VTCDFigureCombinationPropertySource(String categoryName, Object model) {
		super(model);
		idX = new VTCDPropertyId(categoryName, "X");
		idY = new VTCDPropertyId(categoryName, "Y");

	}

	protected void createPropertyDescriptors(List list) {
		list.add(new VTCDIntegerPropertyDescriptor(idX));
		list.add(new VTCDIntegerPropertyDescriptor(idY));

	}

	protected VTCDFigureCombination getVTCDFigureCombination() {
		return (VTCDFigureCombination)getModel();
	}

	public Object getPropertyValue(Object id) {
		if (id == idX)
			return VTCDIntegerPropertyDescriptor.fromModel(getVTCDFigureCombination().getX());
		if (id == idY)
			return VTCDIntegerPropertyDescriptor.fromModel(getVTCDFigureCombination().getY());
				return null;
	}

	public boolean isPropertyResettable(Object id) {
		return false;
	}

	public boolean isPropertySet(Object id) {
		return false;
	}

	public void resetPropertyValue(Object id) {
		
	}

	public void setPropertyValue(Object id, Object value) {
		if (id == idX) {
			getVTCDFigureCombination().setX(VTCDIntegerPropertyDescriptor.toModel(value));
		} else if (id == idY) {
			getVTCDFigureCombination().setY(VTCDIntegerPropertyDescriptor.toModel(value));
		} 
	}
}
