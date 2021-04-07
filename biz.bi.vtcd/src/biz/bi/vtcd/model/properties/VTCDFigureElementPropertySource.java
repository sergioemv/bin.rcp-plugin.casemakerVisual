
package biz.bi.vtcd.model.properties;

import java.util.List;

import biz.bi.vtcd.model.VTCDFigureElement;

public class VTCDFigureElementPropertySource 
	extends VTCDModelPropertySource
{
	
private final VTCDPropertyId idX;
private final VTCDPropertyId idY;
private final VTCDPropertyId idWidth;

public VTCDFigureElementPropertySource(String categoryName, Object model) {
	super(model);
	idX = new VTCDPropertyId(categoryName, "X");
	idY = new VTCDPropertyId(categoryName, "Y");
	idWidth = new VTCDPropertyId(categoryName, "Width");
}

protected void createPropertyDescriptors(List list) {
	list.add(new VTCDIntegerPropertyDescriptor(idX));
	list.add(new VTCDIntegerPropertyDescriptor(idY));
	list.add(new VTCDIntegerPropertyDescriptor(idWidth));
}

protected VTCDFigureElement getVTCDFigureElement() {
	return (VTCDFigureElement)getModel();
}

public Object getPropertyValue(Object id) {
	if (id == idX)
		return VTCDIntegerPropertyDescriptor.fromModel(getVTCDFigureElement().getX());
	if (id == idY)
		return VTCDIntegerPropertyDescriptor.fromModel(getVTCDFigureElement().getY());
	if (id == idWidth)
		return VTCDIntegerPropertyDescriptor.fromModel(getVTCDFigureElement().getWidth());
	return null;
}

public boolean isPropertyResettable(Object id) {
	return id == idWidth;
}

public boolean isPropertySet(Object id) {
	if (id == idWidth)
		return getVTCDFigureElement().getWidth() != -1;
	return false;
}

public void resetPropertyValue(Object id) {
	if (id == idWidth)
		getVTCDFigureElement().setWidth(-1);
}

public void setPropertyValue(Object id, Object value) {
	if (id == idX) {
		getVTCDFigureElement().setX(VTCDIntegerPropertyDescriptor.toModel(value));
	} else if (id == idY) {
		getVTCDFigureElement().setY(VTCDIntegerPropertyDescriptor.toModel(value));
	} else if (id == idWidth)
		getVTCDFigureElement().setWidth(VTCDIntegerPropertyDescriptor.toModel(value));
}

}