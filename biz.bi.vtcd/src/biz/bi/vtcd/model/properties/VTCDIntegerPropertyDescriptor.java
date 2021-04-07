package biz.bi.vtcd.model.properties;

import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class VTCDIntegerPropertyDescriptor extends TextPropertyDescriptor
{

public VTCDIntegerPropertyDescriptor(VTCDPropertyId propertyId) {
	super(propertyId, propertyId.getDisplayName());
	setCategory(propertyId.getCategoryName());
}

public static String fromModel(int i) {
	return String.valueOf(i);
}

public static int toModel(Object string) {
	try {
		return Integer.parseInt((String)string);
	} catch (NumberFormatException e) {	// FIXME logException
		return 0;
	}
}

}