package biz.bi.vtcd.figures;


import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import biz.bi.vtcd.provider.VTCDGraphicConstants;
import biz.bi.vtcd.provider.VTCDImages;

public class VTCDFigureElementView extends Figure {

	//Figure contentFigure;
	Label foldingIcon;
	private IFigure m_HeaderElement;
	private IFigure m_BodyEquivalenceClass;
	private VTCDFigureCompartment m_ElementComparment = new VTCDFigureCompartment();
	
	public VTCDFigureElementView(IFigure p_Header){
		
		this.m_HeaderElement = p_Header;
			
		((Label)m_HeaderElement).setIcon(VTCDImages.getImage(VTCDImages.PALETTE_ELEMENT));
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new CompoundBorder(new LineBorder(VTCDGraphicConstants.ClassBorderColor,2),new MarginBorder(1)));
		setBackgroundColor(VTCDGraphicConstants.ClassColor);
		setOpaque(true);
		setFont(VTCDGraphicConstants.CLASS_FONT);
		
		this.foldingIcon = new Label();
		Image images = VTCDImages.getImage(VTCDImages.ELEMENT_FOLDING_UP);
		this.foldingIcon.setIcon(images);
		
		this.foldingIcon.setCursor(new Cursor(Display.getCurrent(),21));
		
		
		BorderLayout elementLayout = new BorderLayout();
		m_ElementComparment.setLayoutManager(elementLayout);
		m_ElementComparment.add(m_HeaderElement,BorderLayout.TOP);
		m_ElementComparment.add(foldingIcon,BorderLayout.LEFT);
		add(m_ElementComparment);
		//smoreno -- the body must be setted
		this.m_BodyEquivalenceClass = new VTCDFigureCompartment();
		//smoreno -- the body must be setted
		this.m_BodyEquivalenceClass.setLayoutManager(new ToolbarLayout());
		add(this.m_BodyEquivalenceClass);
		
		
		
		
		 
		 
	}
	
	
	
	public void returnFirstSize (Dimension d){
		int w=d.width;
		int h=d.height;
		this.setPreferredSize(w,h);
		this.repaint();
		this.revalidate();
		
	}

	public void setFolding(boolean folding) {
	
	     if (folding)
	     {
	    	 foldingIcon.setIcon(VTCDImages.getImage(VTCDImages.ELEMTN_FOLDING_DOWN));
				if (m_BodyEquivalenceClass.getParent()!=null)
					remove(m_BodyEquivalenceClass);
				repaint();
				revalidate();
	     }
	     else
	     {
	    	 foldingIcon.setIcon(VTCDImages.getImage(VTCDImages.ELEMENT_FOLDING_UP));
	    	 	if (m_BodyEquivalenceClass.getParent()==null)
	    	 		add(m_BodyEquivalenceClass);
				repaint();
				revalidate();
	     }
		
	}
	
	public void removeFoldingIcon(){
		this.m_ElementComparment.remove(foldingIcon);
	}
	
	public void addFoldingIcon(){
		this.m_ElementComparment.add(foldingIcon,BorderLayout.LEFT);
	}
	
	public IFigure getContentPane(){
		return this.m_BodyEquivalenceClass;
	}
	public IFigure getHeader(){
		return this.m_HeaderElement;
	}
	//svonborries11072005 begin
	public void setIcon(Image p_Path){
		((Label)m_HeaderElement).setIcon(p_Path);
	}
	
	public VTCDFigureCompartment getElementCompartment(){
		return this.m_ElementComparment;
	}



	public Label getFoldingIcon() {
		return this.foldingIcon;
	}
	
//	svonborries11072005 end	
}
