/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package biz.bi.vtcd.model.properties;

import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class VTCDStringPropertyDescriptor extends TextPropertyDescriptor
{

public VTCDStringPropertyDescriptor(VTCDPropertyId propertyId) {
	super(propertyId, propertyId.getDisplayName());
	setCategory(propertyId.getCategoryName());
}

public static String fromModel(String string) {
	return string != null ? string : "";
}

public static String toModel(Object string) {
	return (String) string;
}

}