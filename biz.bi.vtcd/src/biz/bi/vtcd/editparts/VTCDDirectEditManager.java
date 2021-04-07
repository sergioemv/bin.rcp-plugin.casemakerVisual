package biz.bi.vtcd.editparts;


import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.swt.widgets.Text;

import biz.bi.vtcd.model.VTCDAbstractFigure;

public class VTCDDirectEditManager extends DirectEditManager {
	private VTCDAbstractFigure figureModel;

	public VTCDDirectEditManager(
		GraphicalEditPart source,
		Class editorType,
		CellEditorLocator locator) {
		super(source, editorType, locator);
		figureModel = (VTCDAbstractFigure) source.getModel();
	}

	/* (”ñ Javadoc)
	* @see org.eclipse.gef.tools.DirectEditManager#initCellEditor()
	*/
	protected void initCellEditor() {
	
		getCellEditor().setValue(new Integer(figureModel.getHeight()).toString());

	
		Text text = (Text) getCellEditor().getControl();
		text.selectAll();
	}
}
