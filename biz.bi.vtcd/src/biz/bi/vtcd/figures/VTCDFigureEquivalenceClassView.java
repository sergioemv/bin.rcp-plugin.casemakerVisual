/* This Software has been developed by Business Software Innovations  .
Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. */
package biz.bi.vtcd.figures;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;

import biz.bi.vtcd.provider.VTCDGraphicConstants;



/**
 * @author svonborries
 *
 */
public class VTCDFigureEquivalenceClassView extends VTCDNodeFigure {

	private int m_parentWidth; 
	private VTCDFixedWidthLabel m_State = new VTCDFixedWidthLabel();
	private int m_RiskLevel;
	private VTCDFixedWidthLabel m_Value = new VTCDFixedWidthLabel();
	private VTCDFixedWidthLabel m_CauseEffect = new VTCDFixedWidthLabel();
	private boolean hasFocus;
	private boolean selected;

    private static final int DEFAULT_STATE_WIDTH = 20;
    public static String
	TERMINAL_1_IN = "A",  //$NON-NLS-1$
	TERMINAL_2_IN = "B";  //$NON-NLS-1$
	
	public VTCDFigureEquivalenceClassView(String p_Value, String p_State, int p_RiskLevel,String p_CauseEffect) {
		this.m_State.setText(p_State);
		this.m_Value.setText(p_Value);
		setRiskLevel(p_RiskLevel);
		this.m_CauseEffect.setText(p_CauseEffect);
		this.setBackgroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_STATE_COLOR);
		setOpaque(false);

		//Toolbar
		ToolbarLayout tlayout = new ToolbarLayout();
		tlayout.setStretchMinorAxis(true);
		tlayout.setVertical(false);
		tlayout.setMinorAlignment(2);
		tlayout.setSpacing(1);
		
		
		this.setLayoutManager(tlayout);
	
		add(createValueFigure());
		add(createStateFigure());
		add(createCauseEffectFigure());
		//add the connection anchors
		VTCDFixedConnectionAnchor c;
		c = new VTCDFixedConnectionAnchor(this);
		c.offsetV= 10;
		connectionAnchors.put(TERMINAL_1_IN, c);
		outputConnectionAnchors.addElement(c);
		c = new VTCDFixedConnectionAnchor(this);
		c.offsetV = 10;
		connectionAnchors.put(TERMINAL_2_IN, c);
		outputConnectionAnchors.addElement(c);
		
	}
	
	/**
	 * @return
	 */
	private IFigure createCauseEffectFigure() {
		
		this.m_CauseEffect.setBorder(new CompoundBorder(new LineBorder(org.eclipse.draw2d.ColorConstants.black,1),new MarginBorder(2)));
		this.m_CauseEffect.setBackgroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_STATE_COLOR);
		this.m_CauseEffect.setOpaque(true);
		m_CauseEffect.setLabelAlignment(PositionConstants.CENTER);
		//m_CauseEffect.setFixedWidth(-1);
		this.m_CauseEffect.setBackgroundColor((Color)VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(11));
		return m_CauseEffect;
	}

	/**
	 * @return
	 */
	private IFigure createStateFigure() {
		
		this.m_State.setBorder(new CompoundBorder(new LineBorder(ColorConstants.black,1), new MarginBorder(2)));
		this.m_State.setBackgroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_STATE_COLOR);
		this.m_State.setOpaque(true);
		this.m_State.setBackgroundColor((Color)VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(11));

		//this.m_State.setFixedWidth(-1);
		return m_State;
	}

	/**
	 * @return
	 */
	private IFigure createValueFigure() {
	
		this.m_Value.setBorder(new CompoundBorder(new LineBorder(ColorConstants.black,1), new MarginBorder(2)));
		this.m_Value.setBackgroundColor(VTCDGraphicConstants.EQUIVALENCECLASS_STATE_COLOR);
		this.m_Value.setOpaque(true);
		//this.m_Value.setFixedWidth(50);
		return m_Value;
	}

	public IFigure getValue() {
		return this.m_Value;
	}
	public void setValue(String p_value) {
		this.m_Value.setText(p_value);
	}
	public IFigure getState() {
		return this.m_State;
	}
	public void setState(String p_state) {
		this.m_State.setText(p_state);
	}
	public void setRiskLevelColor (int p_RiskLevel){
	if (p_RiskLevel>=0 && p_RiskLevel<=10)
		this.m_Value.setBackgroundColor((Color)VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(p_RiskLevel));

	else
		
	
	this.m_Value.setBackgroundColor((Color)VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(11));
	}
	
	public int getRiskLevel(){
		return this.m_RiskLevel;
	}
	public IFigure getCauseEffect() {
		return this.m_CauseEffect;
	}
	public void setCauseEffect(String p_causeEffect) {
		this.m_CauseEffect.setText(p_causeEffect);
	}
	/**
	 * @param p_riskLevel The riskLevel to set.
	 */
	public void setRiskLevel(int p_riskLevel) {
		this.m_RiskLevel = p_riskLevel;
		setRiskLevelColor (p_riskLevel);
	}


	/**
	 * @return Returns the parentSize.
	 */
	public int getParentWidth() {
		return this.m_parentWidth;
	}

	/**
	 * @param p_parentSize The parentSize to set.
	 */
	public void setParentWidth(int p_parentSize) {
		this.m_parentWidth = p_parentSize;
		//put the fixed size of the children
		if (p_parentSize!=-1)
		{
			this.m_Value.setFixedWidth((p_parentSize-DEFAULT_STATE_WIDTH)/2);
			this.m_CauseEffect.setFixedWidth((p_parentSize-DEFAULT_STATE_WIDTH)/2-9);
			this.m_State.setFixedWidth(DEFAULT_STATE_WIDTH);
			VTCDFixedConnectionAnchor c = (VTCDFixedConnectionAnchor)this.connectionAnchors.get(TERMINAL_1_IN);
			c.setOffsetH(p_parentSize);
		}	
		this.repaint();
		this.revalidate();
	}

	/**
	 * Sets the focus state of this SimpleActivityLabel
	 * @param b true will cause a focus rectangle to be drawn around the text of the Label
	 */
	public void setFocus(boolean b) {
		if (hasFocus != b) {
			m_CauseEffect.setFocus(b);
			m_CauseEffect.repaint();
			m_State.setFocus(b);
			m_State.repaint();
			m_Value.setFocus(b);
			hasFocus = b;
			
//			repaint();
			
			
		}
	}

	/**
	 * Sets the selection state of this SimpleActivityLabel
	 * @param b true will cause the label to appear selected
	 */
	public void setSelected(boolean b) {
		if (selected != b) {
			selected = b;
			m_CauseEffect.setSelected(b);
			m_State.setSelected(b);
	//		m_Value.setSelected(b);
			repaint();
		}
	}
}
