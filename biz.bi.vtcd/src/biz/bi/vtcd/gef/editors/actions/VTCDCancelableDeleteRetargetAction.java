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
public class VTCDCancelableDeleteRetargetAction extends RetargetAction {

	/**
	 * @param p_actionID
	 * @param p_text
	 */
	public VTCDCancelableDeleteRetargetAction() {
		
		super(VTCDCancelableDeleteAction.ID,
				VTCDEditPlugin.INSTANCE
				.getString("_ACTION_CancelableDelete_label"));
		this.setText(VTCDEditPlugin.INSTANCE.getString("_ACTION_CancelableDelete_label"));

		this.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_ACTION_CancelableDelete_tooltip"));
		this.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_CANCELABLEDELETE));
		// TODO Auto-generated constructor stub
	}

}
