/*******************************************************************************
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package biz.bi.vtcd.editpolicies;

import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import biz.bi.vtcd.figures.VTCDFigureEquivalenceClassView;

/**
 * @author Dan Lee
 * @since 3.1
 */
public class VTCDFigureEquivalenceClassSelectionEditPolicy 
	extends NonResizableEditPolicy
{
	
protected VTCDFigureEquivalenceClassView getEquivalenceClassFigure() {
	return (VTCDFigureEquivalenceClassView)getHostFigure();
}
	
/**
 * @see org.eclipse.gef.editpolicies.NonResizableEditPolicy#hideFocus()
 */
protected void hideFocus() {
	getEquivalenceClassFigure().setFocus(false);
}

/**
 * @see org.eclipse.gef.editpolicies.SelectionHandlesEditPolicy#hideSelection()
 */
protected void hideSelection() {
	getEquivalenceClassFigure().setSelected(false);
	getEquivalenceClassFigure().setFocus(false);
	
}

/**
 * @see org.eclipse.gef.editpolicies.NonResizableEditPolicy#showFocus()
 */
protected void showFocus() {
	getEquivalenceClassFigure().setFocus(true);
}

/**
 * @see org.eclipse.gef.editpolicies.SelectionHandlesEditPolicy#showSelection()
 */
protected void showPrimarySelection() {
	getEquivalenceClassFigure().setSelected(true);
	getEquivalenceClassFigure().setFocus(true);
}

/**
 * @see org.eclipse.gef.editpolicies.SelectionHandlesEditPolicy#showSelection()
 */
protected void showSelection() {
	getEquivalenceClassFigure().setSelected(true);
	getEquivalenceClassFigure().setFocus(false);
}

}
