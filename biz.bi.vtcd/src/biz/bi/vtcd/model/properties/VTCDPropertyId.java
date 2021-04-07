
package biz.bi.vtcd.model.properties;

/**
 * A PropertyId combines the category name and display name for a
 * IPropertyDescriptor in a single object. The same set of diaplayNames
 * may therefore appear more than once in a property list as is necessary
 * to display both ends of an EReference.
 */
public class VTCDPropertyId
{
private final String categoryName;
private final String displayName;

public VTCDPropertyId(String categoryName, String displayName) {
	this.categoryName = categoryName;
	this.displayName = displayName;
}

public String getCategoryName() { return categoryName; }
public String getDisplayName() { return displayName; }

public String toString() { return categoryName + " : " + displayName; }

}