
package biz.bi.vtcd.model.properties;

public abstract class VTCDModelPropertySource 
	extends VTCDAbstractPropertySource
{
	
private Object model;

public VTCDModelPropertySource(Object model) {
	this.model = model;
}

public Object getModel() {
	return model;
}

}