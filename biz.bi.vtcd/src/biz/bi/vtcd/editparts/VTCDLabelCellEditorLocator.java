/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Text;

import biz.bi.vtcd.figures.VTCDFixedWidthLabel;

/**
 * @author svonborries
 * @09-08-2005
 * @svonborries
 */
final public class VTCDLabelCellEditorLocator implements CellEditorLocator {

	/* (non-Javadoc)
	 * @see org.eclipse.gef.tools.CellEditorLocator#relocate(org.eclipse.jface.viewers.CellEditor)
	 */
	protected IFigure fig;
	
	public VTCDLabelCellEditorLocator(IFigure Figure){
		this.fig = Figure;
	}
	
	public void relocate(CellEditor p_celleditor) {
		Text text = (Text)p_celleditor.getControl();
		Rectangle rec = fig.getClientArea(Rectangle.SINGLETON);
		
		if(this.fig instanceof VTCDFixedWidthLabel){
			fig.translateToAbsolute(rec);
			org.eclipse.swt.graphics.Rectangle trim = text.computeTrim(0, 0, 0, 0);
			rec.translate(trim.x,trim.y);
			rec.height += trim.height;
			text.setBounds(rec.x,rec.y,rec.width,rec.height);
			return;
		}
		
		if(this.fig instanceof Label){
			rec = ((Label)fig).getTextBounds().intersect(rec);
			fig.translateToAbsolute(rec);
			
			org.eclipse.swt.graphics.Rectangle trim = text.computeTrim(0, 0, 0, 0);
			rec.translate(trim.x,trim.y);
			rec.width += trim.width;
			rec.height += trim.height;
			
			text.setBounds(rec.x,rec.y,rec.width,rec.height);
			return;
		}
		
	}

}
