/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.vbrvm.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import biz.bi.vbr.provider.VBRModelEditPlugin;
import biz.bi.vbr.vbrvm.AbstractView;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRActionView;
import biz.bi.vbr.vbrvm.VBRElementValueView;
import biz.bi.vbr.vbrvm.VBRElementView;
import biz.bi.vbr.vbrvm.VBRTreeView;
import biz.bi.vbr.vbrvm.VBRVMPackage;

/**
 * @author hcanedo
 * @since 12-09-2005
 */
public class VBRVMCommandFactoryImpl implements VBRVMCommandFactory {

	/**
	 * 
	 * @author hcanedo
	 * @since 12-09-2005
	 */
	VBRVMCommandFactoryImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see biz.bi.vbr.gef.commands.VBRCommandFactory#createAddVBRFigureCommand(biz.bi.vbr.vbrvm.MainDiagram, biz.bi.vbr.vbrvm.AbstractView)
	 */
	public Command createAddVBRVMFigureCommand(MainDiagram p_Parent,
			AbstractView p_Child, Point p_Loc) {
		switch (p_Child.eClass().getClassifierID()) {
		case VBRVMPackage.VBR_TREE_VIEW:
				return createFigureVBRVMBusinessTree(p_Parent,(VBRTreeView)p_Child,p_Loc);
		case VBRVMPackage.VBR_ELEMENT_VIEW:
				return createFigureVBRVMElement(p_Parent,(VBRElementView)p_Child, p_Loc);
		case VBRVMPackage.VBR_ELEMENT_VALUE_VIEW:
				return createFigureVBRVMElementValueView(p_Parent,(VBRElementValueView)p_Child, p_Loc);
		case VBRVMPackage.VBR_ACTION_VIEW:
				return createFigureVBRVMBusinessActionView(p_Parent,(VBRActionView)p_Child, p_Loc);
		default:
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see biz.bi.vbr.gef.commands.VBRCommandFactory#createFigureVBRBusinessTree(biz.bi.vbr.vbrvm.MainDiagram, biz.bi.vbr.vbrvm.VBRTreeView)
	 */
	public Command createFigureVBRVMBusinessTree(MainDiagram p_Parent, VBRTreeView p_Child, Point p_Loc) {
		VBRVMCreateBusinessTreeCommand command= new VBRVMCreateBusinessTreeCommand(p_Parent,p_Child);
		command.setLabel(VBRModelEditPlugin.getPlugin().getString("_COMMAND_Create_Business_Tree_Label"));
		command.setConstrains(new Rectangle(p_Loc.x,p_Loc.y,-1,-1));

		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vbr.gef.commands.VBRCommandFactory#createFigureVBRElement(biz.bi.vbr.vbrvm.MainDiagram, biz.bi.vbr.vbrvm.VBRElementView)
	 */
	public Command createFigureVBRVMElement(MainDiagram p_Parent, VBRElementView p_Child, Point p_Loc) {
		VBRVMCreateElementCommand command= new VBRVMCreateElementCommand(p_Parent,p_Child);
		command.setLabel(VBRModelEditPlugin.getPlugin().getString("_COMMAND_Create_Element_Label"));
		command.setConstrains(new Rectangle(p_Loc.x,p_Loc.y,-1,-1));

		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vbr.gef.commands.VBRCommandFactory#createFigureVBRElementValueView(biz.bi.vbr.vbrvm.MainDiagram, biz.bi.vbr.vbrvm.VBRElementValueView)
	 */
	public Command createFigureVBRVMElementValueView(MainDiagram p_Parent, VBRElementValueView p_Child, Point p_Loc) {
		VBRVMCreateElementValueCommand command= new VBRVMCreateElementValueCommand(p_Parent,p_Child);
		command.setLabel(VBRModelEditPlugin.getPlugin().getString("_COMMAND_Create_Element_Value_Label"));
		command.setConstrains(new Rectangle(p_Loc.x,p_Loc.y,-1,-1));

		return command;
	}

	/* (non-Javadoc)
	 * @see biz.bi.vbr.gef.commands.VBRCommandFactory#createFigureVBRBusinessActionView(biz.bi.vbr.vbrvm.MainDiagram, biz.bi.vbr.vbrvm.VBRActionView)
	 */
	public Command createFigureVBRVMBusinessActionView(MainDiagram p_Parent, VBRActionView p_Child, Point p_Loc) {
		VBRVMCreateBusinessActionCommand command= new VBRVMCreateBusinessActionCommand(p_Parent,p_Child);
		command.setLabel(VBRModelEditPlugin.getPlugin().getString("_COMMAND_Create_Business_Action_Label"));
		command.setConstrains(new Rectangle(p_Loc.x,p_Loc.y,-1,-1));
		return command;
	}

}
