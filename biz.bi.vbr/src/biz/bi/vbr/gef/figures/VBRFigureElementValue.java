/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.gef.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

import biz.bi.vbr.vbrvm.provider.VBRGraphicalConstant;

/**
 * @author svonborries
 * @since 13-09-2005
 */
public class VBRFigureElementValue extends Figure{

	private Label m_Header = new Label();
	private int m_RiskLevel = 0;
	
	public VBRFigureElementValue(Label p_Header,int p_RiskLevel){
		
		this.m_Header = p_Header;
		this.m_RiskLevel = p_RiskLevel;
		
		ToolbarLayout l_layout = new ToolbarLayout();
		this.setLayoutManager(l_layout);
		this.m_Header.setFont(VBRGraphicalConstant.ELEMENTVALUE_FONT);
		this.setRiskLevel(p_RiskLevel);
		this.add(m_Header);
	}
	
	/**
	 * @param p_riskLevel
	 * @return
	 */
	public int getRiskLevel() {
		return this.m_RiskLevel;
	}
	
	public void setRiskLevel(int p_riskLevel){
		this.m_RiskLevel = p_riskLevel;
		setRiskLevelColor(p_riskLevel);
	}

	/**
	 * @param p_riskLevel
	 */
	public void setRiskLevelColor(int p_riskLevel) {
		if (p_riskLevel>=0 && p_riskLevel<=10){
			this.m_Header.setBackgroundColor((Color)VBRGraphicalConstant.VBR_RISK_LEVEL_COLORS.get(p_riskLevel));
		}
		else{
			this.m_Header.setBackgroundColor((Color)VBRGraphicalConstant.VBR_RISK_LEVEL_COLORS.get(11));
		}
	}

	protected void paintFigure(Graphics graphic){
		Rectangle l_Rec = new Rectangle();
		PointList l_PointList = new PointList();
		l_Rec.x = bounds.x;
		l_Rec.y = bounds.y;
		l_Rec.width = bounds.width-1;
		l_Rec.height = bounds.height-1;
		l_PointList.removeAllPoints();
		l_PointList.addPoint(l_Rec.x + l_Rec.width /2, l_Rec.y);
		l_PointList.addPoint(l_Rec.x + l_Rec.width, l_Rec.height /2);
		l_PointList.addPoint(l_Rec.x + l_Rec.width /2, l_Rec.y + l_Rec.height);
		l_PointList.addPoint(l_Rec.x,l_Rec.y + l_Rec.height /2);
		graphic.fillPolygon(l_PointList);
		graphic.drawPolygon(l_PointList);
			
		super.paintFigure(graphic);
	}

	public Label getHeader() {
		return m_Header;
	}

	public void setHeader(Label p_header) {
		m_Header = p_header;
	}
	
	public String getHeaderText(){
		return this.m_Header.getText();
	}
	
	public void setHeaderText(String p_Text){
		this.m_Header.setText(p_Text);
	}
}
