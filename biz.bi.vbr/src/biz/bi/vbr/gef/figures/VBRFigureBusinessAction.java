/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.figures;

import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import biz.bi.vbr.vbrvm.provider.VBRGraphicalConstant;

/**
 * @author svonborries
 * @since 16-09-2005
 */
public class VBRFigureBusinessAction extends Figure{

	private Label m_Header = null;
	
	public VBRFigureBusinessAction(Label p_Header){
		this.m_Header = p_Header;
	
		ToolbarLayout l_layout = new ToolbarLayout();
		this.setLayoutManager(l_layout);
		this.setBorder(new CompoundBorder(new LineBorder(VBRGraphicalConstant.BUSINESSACTION_BORDERCOLOR,2),new MarginBorder(1)));
		
	}
	
	protected void paintFigure(Graphics graphic){

		Rectangle l_rec = getClientArea().getCopy();
		Point l_topLeft = l_rec.getTopLeft();
		Point l_bottonLeft = l_rec.getBottomLeft();
		Point l_topRight = l_rec.getTopRight();
		Point l_bottonRight = l_rec.getBottomRight();
		Point l_Left = l_rec.getLeft();
		Point l_Right = l_rec.getRight();
		int l_Indent = (int)((float)l_rec.width * 0.2F);

		graphic.drawLine(l_topLeft.x, l_topLeft.y, l_topRight.x - l_Indent, l_topLeft.y);
		graphic.drawLine(l_topLeft.x, l_topLeft.y, l_Left.x + l_Indent, l_Left.y);
		graphic.drawLine(l_topRight.x - l_Indent, l_topLeft.y, l_Right.x, l_Right.y);
		graphic.drawLine(l_bottonLeft.x, l_bottonLeft.y, l_bottonRight.x - l_Indent, l_bottonLeft.y);
	
		
	}
	
}
