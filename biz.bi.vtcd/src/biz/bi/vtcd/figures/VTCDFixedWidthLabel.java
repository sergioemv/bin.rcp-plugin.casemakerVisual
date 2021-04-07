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
package biz.bi.vtcd.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

import biz.bi.vtcd.provider.VTCDGraphicConstants;

/**
 * @author Dan Lee
 * @since 3.1
 */
public class VTCDFixedWidthLabel 
	extends Label
{

private boolean selected;
private boolean hasFocus;
private int fixedWidth=-1; 

private Rectangle getSelectionRectangle() {
	Rectangle bounds = getTextBounds();
	bounds.width = fixedWidth;
	bounds.expand(new Insets(1,1,0,0));
	translateToParent(bounds);
	bounds.intersect(getBounds());
	return bounds;
}

/**
 * @see org.eclipse.draw2d.Label#paintFigure(org.eclipse.draw2d.Graphics)
 */
protected void paintFigure(Graphics graphics) {
	if (selected) {
		graphics.pushState();
		graphics.setBackgroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_SELECTED_COLOR);
				
		graphics.fillRectangle(getSelectionRectangle());
		graphics.popState();
		
		graphics.setForegroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_SELECTED_FONT_COLOR);
		graphics.setAlpha(95);
		graphics.setFont(VTCDGraphicConstants.EQUIVALENCECLASS_SELECTED_FONT);
		
	}
	if (hasFocus) {
		graphics.pushState();
		graphics.setXORMode(true);
		graphics.setForegroundColor(ColorConstants.menuBackgroundSelected);
		graphics.setBackgroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_SELECTED_FONT_COLOR);
		
		graphics.drawFocus(getSelectionRectangle().resize(-1, -1));
		graphics.popState();
	}
	super.paintFigure(graphics);
}

/**
 * Sets the selection state of this SimpleActivityLabel
 * @param b true will cause the label to appear selected
 */
public void setSelected(boolean b) {
	if (selected != b) {
		selected = b;
		repaint();
	}
}

/**
 * Sets the focus state of this SimpleActivityLabel
 * @param b true will cause a focus rectangle to be drawn around the text of the Label
 */
public void setFocus(boolean b) {
	if (hasFocus != b) {
		hasFocus = b;
		repaint();
		
		
	}
}

public Dimension getPreferredSize(int hHint, int wHint)
{
	Dimension dimension = super.getPreferredSize(hHint, wHint);
	//if (dimension.width <fixedWidth)
	if (fixedWidth!=-1)
		dimension.width =fixedWidth;
	return dimension;
}

/**
 * @return Returns the fixedWidth.
 */
public int getFixedWidth() {
	return this.fixedWidth;
}

/**
 * @param p_fixedWidth The fixedWidth to set.
 */
public void setFixedWidth(int p_fixedWidth) {
	this.fixedWidth = p_fixedWidth;
}
}
