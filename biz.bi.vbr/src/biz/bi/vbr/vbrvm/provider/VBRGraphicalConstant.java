/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.vbrvm.provider;

import java.util.List;
import java.util.Vector;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;



/**
 * @author svonborries
 * @since 12-09-2005
 */
public abstract class VBRGraphicalConstant {

	public static Color ELEMENT_BORDER = ColorConstants.darkBlue;
	public static final Color ELEMENT_COLOR = new Color(null,255,255,206);
	public static final Font ELEMENT_FONT = new Font(Display.getCurrent(),"Tahoma",9,SWT.BOLD);
	public static final Font ELEMENTVALUE_FONT = new Font(Display.getCurrent(),"Tahoma",8,SWT.ITALIC);
	public static final List VBR_RISK_LEVEL_COLORS = new Vector();
	public static final Color BUSINESSACTION_BORDERCOLOR = ColorConstants.black;
	
	static {
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 0,170,0));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 0,204,0));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 0,255,51));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 128,255,128));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 179,255,179));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 225,254,24));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 255,255,0));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 255,206,206));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 255,128,128));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 255,51,51));
	VBR_RISK_LEVEL_COLORS.add(new Color(null, 232,0,0));
	VBR_RISK_LEVEL_COLORS.add(new Color(null,255,255,206));
	}
}
