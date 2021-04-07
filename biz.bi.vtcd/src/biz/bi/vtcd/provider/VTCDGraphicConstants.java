/**
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved. 
 */
package biz.bi.vtcd.provider;

import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import sun.rmi.server.Dispatcher;

/**
 * 
 * @author smoreno
 *
 */
public abstract class VTCDGraphicConstants {
	
	public final static Color ELEMENT_FOREGROUND = ColorConstants.darkGreen;
	public final static Color EQUIVALENCECLASS_FOREGROUND = ColorConstants.darkGreen;
	public static final Color EQUIVALENCECLASS_STATE_COLOR = new Color(null,255,255,255);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * 
 	 */
	
	public static final List VTCD_RISK_LEVEL_COLORS = new Vector();
	public static final List VTCD_RISK_LEVEL_ICONS = new Vector();
	public static Color ClassBorderColor = ColorConstants.darkGreen; 
	static
	{
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 0,170,0));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 0,204,0));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 0,255,51));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 128,255,128));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 179,255,179));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 225,254,24));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 255,255,0));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 255,206,206));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 255,128,128));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 255,51,51));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null, 232,0,0));
	VTCD_RISK_LEVEL_COLORS.add(new Color(null,255,255,206));
	}
	static{
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_0));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_1));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_2));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_3));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_4));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_5));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_6));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_7));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_8));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_9));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_10));
		VTCD_RISK_LEVEL_ICONS.add(VTCDImages.getImage(VTCDImages.COMBINATION_LEVEL_11));
	}
	public static final Color ClassColor = new Color(null,255,255,206);
	public static final Color EQUIVALENCECLASS_SELECTED_FONT_COLOR = ColorConstants.blue;
	public static final Font CLASS_FONT = new Font(Display.getCurrent(),"Tahoma",9,SWT.BOLD);
	public static final Font COMBINATION_FIGURE = new Font(Display.getCurrent(),"Arial",8,SWT.BOLD);
	public static final Font COMBINATION_EFFECT = new Font(Display.getCurrent(),"Arial",7,SWT.ITALIC);
	public static final Font EQUIVALENCECLASS_SELECTED_FONT = new Font(Display.getCurrent(),"Tahoma",10,SWT.BOLD);
	public static final Font COMBINATION_FONT = new Font(Display.getCurrent(),"Tahoma",8,SWT.NONE);
	public static final Color COMBINATION_COLOR_DRAW_OVAL = ColorConstants.black;
	public static final Color COMBINATION_FONT_COLOR = ColorConstants.black;
	public static final Color EQUIVALENCECLASS_SELECTED_COLOR = ColorConstants.yellow;
	
}
