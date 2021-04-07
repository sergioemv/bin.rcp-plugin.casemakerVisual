/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.vbrvm.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import biz.bi.vbr.vbrvm.AbstractView;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRTreeView;

/**
 * @author hcanedo
 * @since 12-09-2005
 */
public interface VBRVMCommandFactory {
	VBRVMCommandFactory INSTANCE = new VBRVMCommandFactoryImpl();

	Command createAddVBRVMFigureCommand(MainDiagram p_Parent, AbstractView p_Child, Point p_Loc);
	Command createFigureVBRVMBusinessTree(MainDiagram p_Parent, VBRTreeView p_Child, Point p_Loc);
	Command createFigureVBRVMElement(MainDiagram p_Parent, VBRElementView p_Child, Point p_Loc);
	Command createFigureVBRVMElementValueView(MainDiagram p_Parent, VBRElementValueView p_Child, Point p_Loc);
	Command createFigureVBRVMBusinessActionView(MainDiagram p_Parent, VBRActionView p_Child, Point p_Loc);

}
