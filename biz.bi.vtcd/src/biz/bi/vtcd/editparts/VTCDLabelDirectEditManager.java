/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;



/**
 * @author svonborries
 * @09-08-2005
 * @svonborries
 */
public class VTCDLabelDirectEditManager extends DirectEditManager {
	Text text;
	String oldText;

	/**
	 * @param p_source
	 * @param p_editorType
	 * @param p_locator
	 */
	public VTCDLabelDirectEditManager(GraphicalEditPart p_source, Class p_editorType, CellEditorLocator p_locator) {
		super(p_source, p_editorType, p_locator);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.tools.DirectEditManager#initCellEditor()
	 */
	protected void initCellEditor() {
		this.text= (Text)getCellEditor().getControl();
		this.text.setText(getInitialText());
		this.text.setFont(getDirectEditFigure().getFont());
		this.text.selectAll();
		this.oldText = text.getText();
	}
	protected String getInitialText() {
		return ((VTCDBaseEditPart)getEditPart()).getDirectEditText();
	}
	
	protected IFigure getDirectEditFigure() {
		return ((VTCDBaseEditPart)getEditPart()).getDirectEditFigure();
	}
	
	protected CellEditor createCellEditorOn(Composite composite) {
		return new TextCellEditor(composite, SWT.MULTI | SWT.WRAP) {
			public boolean isPasteEnabled() {
				boolean result = false;
				if (text != null && !text.isDisposed()) {
					Clipboard cb = new Clipboard(Display.getDefault());
					TransferData[] transferTypes = cb.getAvailableTypes();
					for (int i = 0; i < transferTypes.length; i++) {
						if (TextTransfer.getInstance().isSupportedType(transferTypes[i])) {
							result = true;
							break;
						}
					}
					cb.dispose();
				}
				return result; 
			}
		};
	}
	protected void bringDown(){		
		super.bringDown();
	}

}
