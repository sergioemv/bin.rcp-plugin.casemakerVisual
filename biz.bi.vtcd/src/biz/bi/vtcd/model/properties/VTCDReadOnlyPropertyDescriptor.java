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

import org.eclipse.ui.views.properties.PropertyDescriptor;

public class VTCDReadOnlyPropertyDescriptor extends PropertyDescriptor
{

public VTCDReadOnlyPropertyDescriptor(VTCDPropertyId propertyId) {
	super(propertyId, propertyId.getDisplayName());
	setCategory(propertyId.getCategoryName());
}

public static String fromModel(Object object) {
	return object != null ? object.toString() : "";
}

}