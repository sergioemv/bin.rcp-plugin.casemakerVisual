/**
 * 
 */
package biz.bi.vtcd.gef.editors.actions;

import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.EditorPartAction;
import org.eclipse.ui.IEditorPart;

import biz.bi.cmcore.policies.CMProxyPolicyFactory;
import biz.bi.vtcd.gef.editors.VTCDCombinationDiagramEditor;
import biz.bi.vtcd.gef.editors.VTCDMainDiagramEditor;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.commands.VTCDCommandFactory;
import biz.bi.vtcd.policies.VTCDPolicyFactory;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author smoreno
 *
 */
public class VTCDReloadTestObjectAction extends EditorPartAction {
	public static final String id = "RELOADTESTOBJECTACTION";
	private VTCDDiagram m_Diagram;
	/**
	 * @param p_editor
	 */
	public VTCDReloadTestObjectAction(IEditorPart p_editor) {
		super(p_editor);
		this.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_RELOADTESTOBJECT));
		this.setId(id);
		this.setText(VTCDEditPlugin.INSTANCE
				.getString("_UI_ReloadTestObject_menu_item_text"));
		this.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_ReloadTestObject_menu_item_tooltip"));
		
	}

	public void run()
	{ 
		CompoundCommand cc = new CompoundCommand();
		cc.add(CMProxyPolicyFactory.INSTANCE.createRereadProxyTestObjectPolicy(((VTCDDiagramMain)m_Diagram).getM_TestObject()));
		cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy((VTCDDiagramMain)m_Diagram));
		cc.add(VTCDCommandFactory.INSTANCE.createAutomaticLayoutCommand(m_Diagram));
		execute(cc);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	protected boolean calculateEnabled() {
		  if (this.getEditorPart() instanceof VTCDMainDiagramEditor)
		   {
			 m_Diagram = ((VTCDMainDiagramEditor)getEditorPart()).getM_VTCDDiagramMain();  
		   }
		return m_Diagram!=null;
	}

}
