/**
 * 
 */
package biz.bi.vtcd.gef.editors.actions;

import org.eclipse.ui.actions.RetargetAction;

import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author smoreno
 *
 */
public class VTCDGoToDiagramCombinationRetargetAction extends RetargetAction {

	/**
	 * @param p_actionID
	 * @param p_text
	 */
	public VTCDGoToDiagramCombinationRetargetAction() {
		
		super(VTCDGoToDiagramCombinationAction.ID,
				VTCDEditPlugin.INSTANCE.getString("_UI_VTCDGoToCombinationDiagramAction_text"));
		this.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDGoToCombinationDiagramAction_text"));

		this.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_VTCDGoToCombinationDiagramAction_tooltip"));
		this.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_GOTOCOMBINATIONDIAGRAM));
		// TODO Auto-generated constructor stub
	}

}
