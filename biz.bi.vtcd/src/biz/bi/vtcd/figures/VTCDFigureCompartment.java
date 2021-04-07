/* This Software has been developed by Business Software Innovations  .
Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. */
package biz.bi.vtcd.figures;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.ScrollPaneLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;

import biz.bi.vtcd.provider.VTCDGraphicConstants;

public class VTCDFigureCompartment extends Figure {

	public VTCDFigureCompartment(){
		ScrollPane parent = new ScrollPane();
		parent.setLayoutManager(new ScrollPaneLayout());
		parent.add(this);
		ToolbarLayout layout = new ToolbarLayout();
		layout.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);
		layout.setStretchMinorAxis(false);
		layout.setSpacing(2);
		setLayoutManager(layout);
		//setBorder(new CompoundBorder(new VTCDElementFigureBorder(),new MarginBorder(1)));
	}
		public static class VTCDElementFigureBorder extends AbstractBorder{
			private static final Insets INSETS= new Insets (2,0,0,1);
			
			public Insets getInsets(IFigure p_Figure){
				return INSETS;
			}
			public void paint (IFigure p_Figure, Graphics p_Graphics, Insets p_Insets){
				p_Graphics.setForegroundColor(VTCDGraphicConstants.ELEMENT_FOREGROUND);
				p_Graphics.drawLine(getPaintRectangle(p_Figure,p_Insets).getTopLeft(),tempRect.getTopRight());
				
			}
		}
		public Dimension getPreferredSize (int wHint, int hHint){
		Dimension size = super.getPreferredSize(wHint,hHint);
		size.height = Math.max(size.height,10);
		return size;
	}
	}
