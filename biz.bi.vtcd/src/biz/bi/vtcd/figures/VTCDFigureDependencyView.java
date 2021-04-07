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



import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import biz.bi.vtcd.provider.VTCDGraphicConstants;
import biz.bi.vtcd.provider.VTCDImages;

public class VTCDFigureDependencyView extends Figure {
	
	private Figure m_DependencyFig;	
	
	public VTCDFigureDependencyView(Figure p_Name){
	
		m_DependencyFig = p_Name;	
    	((Label)m_DependencyFig).setIcon(VTCDImages.getImage(VTCDImages.DEPENDENCY));	 
    	BorderLayout elementLayout = new BorderLayout();
		this.setLayoutManager(elementLayout);
		this.add(m_DependencyFig,BorderLayout.TOP);		
		this.setBackgroundColor(ColorConstants.white);
		this.setOpaque(true);
		this.setFont(VTCDGraphicConstants.CLASS_FONT);
		
	}
	
  
	
  
	public void returnFirstSize (Dimension d){
		int w=d.width;
		int h=d.height;
		this.setPreferredSize(w,h);
		this.repaint();
		this.revalidate();
		
	}
	
	
	public IFigure getHeader(){
		return this.m_DependencyFig;
	}

	

}
