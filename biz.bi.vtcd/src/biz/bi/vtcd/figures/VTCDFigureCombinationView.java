/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.figures;


import java.awt.Shape;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;


import biz.bi.vtcd.provider.VTCDGraphicConstants;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author svonborries
 * @18-08-2005
 * @svonborries
 */
public class VTCDFigureCombinationView extends VTCDNodeFigure {

	private Label m_Effect = new Label();
	private VTCDFigureEllipseCombinationLabel m_Icon;
	
	private int m_RiskLevel = 0;
	private String m_Name = " ";
	
	
	public VTCDFigureCombinationView (String p_Effect,int p_RiskLevel,String p_Name){
		
		this.m_RiskLevel = p_RiskLevel;
		this.m_Name = p_Name;
		org.eclipse.draw2d.BorderLayout layout = new org.eclipse.draw2d.BorderLayout();
		layout.setHorizontalSpacing(2);
		
		this.setLayoutManager(layout);
		this.m_Effect.setFont(VTCDGraphicConstants.COMBINATION_EFFECT);
		this.setEffectBorder(p_RiskLevel);
		//this.m_Effect.setBorder(new CompoundBorder(new LineBorder(ColorConstants.black,1), new MarginBorder(2)));
		this.m_Effect.setBackgroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_STATE_COLOR);
		this.m_Effect.setOpaque(true);
		
		this.m_Icon =new VTCDFigureEllipseCombinationLabel(ColorConstants.darkGreen);
		this.m_Icon.setFont(VTCDGraphicConstants.COMBINATION_FONT);
		this.m_Icon.setForegroundColor(VTCDGraphicConstants.COMBINATION_FONT_COLOR);
		 
		this.m_Icon.setText(m_Name);
		this.m_Icon.setTextPlacement(Label.CENTER);
		this.m_Icon.setOpaque(true);
		this.m_Icon.setTextAlignment(m_Icon.getIconAlignment());
		//this.m_Icon.setBorder(new CompoundBorder(new LineBorder(ColorConstants.black,1), new MarginBorder(2)));
		
		
		
		this.add(m_Icon, org.eclipse.draw2d.BorderLayout.LEFT);
		this.add(m_Effect, org.eclipse.draw2d.BorderLayout.CENTER);
		
		
		
		
	}
	public int getRiskLevel() {
		return this.m_RiskLevel;
	}
	
	
	public void setRiskLevel(int p_riskLevel) {
		this.m_RiskLevel = p_riskLevel;
		if( p_riskLevel>=0 && p_riskLevel <=10){
			
			this.m_Icon.setRisklevel(p_riskLevel);//.setIcon((Image) VTCDGraphicConstants.VTCD_RISK_LEVEL_ICONS.get(p_riskLevel)); //= combinationIcon(ColorConstants.darkGreen);
			this.setEffectBorder(p_riskLevel);
		}
		else{
			this.m_Icon.setRisklevel(0);//this.m_Icon.setIcon((Image) VTCDGraphicConstants.VTCD_RISK_LEVEL_ICONS.get(0));
			this.setEffectBorder(0);
		}
		
	 
	}
	
	
	
	
	public void setEffectBorder(int p_riskLevel){
		this.m_RiskLevel = p_riskLevel;
		if( p_riskLevel>=0 && p_riskLevel <=10){
			this.m_Effect.setBorder(new CompoundBorder(new LineBorder((Color) VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(p_riskLevel),1),new MarginBorder(2)));
		}
		else
			
			this.m_Effect.setBorder(new CompoundBorder(new LineBorder((Color) VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(0),1),new MarginBorder(2)));
	}
	
	public Label getEffect() {
		return this.m_Effect;
	}
	
	public void setEffect(Label p_effect) {
		//this.m_Effect.setText( p_effect.getText());
		if(p_effect.getText() !=""){
			this.m_Effect.setText(p_effect.getText());
			if (!this.getChildren().contains(m_Effect))
			this.add(m_Effect, org.eclipse.draw2d.BorderLayout.CENTER);
			}
		else{
			if (this.getChildren().contains(m_Effect))
			this.remove(m_Effect);
		}
		repaint();
		revalidate();
		
	}
	/**
	 * @param p_name
	 */
	public void setName(String p_name) {
		this.m_Icon.setName(p_name);
	}
	
	
	
	
		
	
}
