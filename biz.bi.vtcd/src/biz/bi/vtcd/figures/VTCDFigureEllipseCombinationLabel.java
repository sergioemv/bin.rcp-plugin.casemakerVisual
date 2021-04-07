/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.figures;

/**
 * @author ccastedo
 * @09-sep-2005
 * @ccastedo
 */



import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import biz.bi.vtcd.provider.VTCDGraphicConstants;


public class VTCDFigureEllipseCombinationLabel extends Label {
	
	
	private Color m_Color;	
	private String m_Name;
	public VTCDFigureEllipseCombinationLabel(Color p_color){
		m_Color = p_color;	
	}
		
	
	
	
	
	public IFigure getHeader(){
		return this;//.m_CombinationFig;
	}

	public void setName(String p_Name){
		m_Name = p_Name;
		this.setText(p_Name);
	}
	
	public String getName(){
		return m_Name;
	}
	
	
	protected void paintFigure(Graphics g) {
		super.paintFigure(g);
		
		
		Rectangle r = getBounds().getCopy();
		r.height=r.width;
		this.setBounds(r);
        g.setBackgroundColor(m_Color);//ColorConstants.red);
        Point p = getIconLocation();
        
	   g.setAlpha(200);
	  
       g.fillOval(r);
       r.height--;
       r.width--;
       
       g.setForegroundColor(VTCDGraphicConstants.COMBINATION_COLOR_DRAW_OVAL);
       
       g.drawOval(r);
      /*  r.height++;
        r.width++;
        g.drawOval(r);*/
        g.translate(r.getLocation());
      
        g.setForegroundColor(VTCDGraphicConstants.COMBINATION_FONT_COLOR); 
        g.setFont(VTCDGraphicConstants.COMBINATION_FONT);
      //  this.setBorder(new CompoundBorder(new LineBorder(m_Color,1), new MarginBorder(2)));
       
        g.drawText(m_Name,p);   
        
        //////////////////////////////
        
	}

	
/*	protected void fillShape(Graphics graphics) {
	    Path path = new Path(null); //
	    
	    path.addArc(this.getBounds().x,this.getBounds().y  + this.getBounds().height , this.getBounds().width ,
	    		this.getBounds().height / 5 , 270, 180);
	    try {
	         // setClip with Path as an argument wont
	    }catch (Exception ex) {
	    }
	    graphics.fillGradient(this.getBounds().x, this.getBounds().y, this.getBounds().width, this.getBounds().height, true);
	
	}*/


	/**
	 * @param p_riskLevel
	 */
	public void setRisklevel(int p_riskLevel) {
		this.m_Color = (Color)VTCDGraphicConstants.VTCD_RISK_LEVEL_COLORS.get(p_riskLevel);
		repaint();
		revalidate();
	}
	

}
