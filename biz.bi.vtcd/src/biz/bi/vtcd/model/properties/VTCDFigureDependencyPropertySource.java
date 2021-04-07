/**
 * 
 */
package biz.bi.vtcd.model.properties;

import java.util.List;

import biz.bi.vtcd.model.VTCDFigureDependency;

/**
 * @author hcanedo
 *
 */
public class VTCDFigureDependencyPropertySource extends
VTCDModelPropertySource {

	private final VTCDPropertyId idX;
	private final VTCDPropertyId idY;
	public VTCDFigureDependencyPropertySource(String categoryName, Object model) {
		super(model);
		idX = new VTCDPropertyId(categoryName, "X");
		idY = new VTCDPropertyId(categoryName, "Y");

	}

	protected void createPropertyDescriptors(List list) {
		list.add(new VTCDIntegerPropertyDescriptor(idX));
		list.add(new VTCDIntegerPropertyDescriptor(idY));
	}

	protected VTCDFigureDependency getVTCDFigureDependency() {
		return (VTCDFigureDependency)getModel();
	}

	public Object getPropertyValue(Object id) {
		if (id == idX)
			return VTCDIntegerPropertyDescriptor.fromModel(getVTCDFigureDependency().getX());
		if (id == idY)
			return VTCDIntegerPropertyDescriptor.fromModel(getVTCDFigureDependency().getY());
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
			getVTCDFigureDependency().setX(VTCDIntegerPropertyDescriptor.toModel(value));
		} else if (id == idY) {
			getVTCDFigureDependency().setY(VTCDIntegerPropertyDescriptor.toModel(value));
		} 
	}

}
