/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.figures;

import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Image;
import biz.bi.vbr.vbrvm.provider.VBRGraphicalConstant;


/**
 * @author svonborries
 * @since 12-09-2005
 */
public class VBRFigureElement extends Figure{

	private Label m_Header;
	
	public VBRFigureElement(Label p_Header){
		this.m_Header = p_Header;
		
		
		ToolbarLayout l_layout = new ToolbarLayout();
		this.setLayoutManager(l_layout);
		this.setBorder(new CompoundBorder(new LineBorder(VBRGraphicalConstant.ELEMENT_BORDER,2),new MarginBorder(1)));
		this.setBackgroundColor(VBRGraphicalConstant.ELEMENT_COLOR);
		this.setOpaque(true);
		this.setFont(VBRGraphicalConstant.ELEMENT_FONT);
		this.add(this.m_Header);
		
	}
	
	protected void paintFigure(Graphics g){
		g.fillGradient(this.getBounds().x,this.getBounds().y,this.getBounds().width,this.getBounds().height,true);
		super.paintFigure(g);
	}

	public IFigure getHeader() {
		return m_Header;
	}

	public void setHeader(String p_header) {
		this.m_Header.setText(p_header);
	}
	
	public void setIcon(Image p_Path){
		((Label)this.m_Header).setIcon(p_Path);
	}
}
