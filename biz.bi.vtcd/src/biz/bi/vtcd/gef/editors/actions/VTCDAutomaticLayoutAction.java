/**
 * 
 */
package biz.bi.vtcd.gef.editors.actions;

import org.eclipse.gef.ui.actions.EditorPartAction;
import org.eclipse.ui.IEditorPart;

import biz.bi.vtcd.gef.editors.VTCDCombinationDiagramEditor;
import biz.bi.vtcd.gef.editors.VTCDMainDiagramEditor;
import biz.bi.vtcd.model.VTCDDiagram;
import biz.bi.vtcd.policies.VTCDAutomaticLayoutPolicy;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
 * @author smoreno
 *
 */
public class VTCDAutomaticLayoutAction extends EditorPartAction {
	public static final String id = "VTCDAUTOMATICLAYOUT";
	private VTCDDiagram m_Diagram;
	public VTCDAutomaticLayoutAction(IEditorPart part)
	{
		super(part);
		this.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.TOOLBAR_AUTOMATICLAYOUT));
		this.setId(id);
		this.setText(VTCDEditPlugin.INSTANCE
				.getString("_UI_AutomaticLayout_menu_item_text"));
		this.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_AutomaticLayout_menu_item_tooltip"));
		
	
	};
	public void run()
	{
		execute(new VTCDAutomaticLayoutPolicy(m_Diagram).getCCommand());
//		CompoundCommand cc = new CompoundCommand();
//		cc.add(CMProxyPolicyFactory.INSTANCE.createRereadProxyTestObjectPolicy(((VTCDDiagramMain)m_Diagram).getM_TestObject()));
//		cc.add(VTCDPolicyFactory.INSTANCE.createReloadDiagramMainPolicy((VTCDDiagramMain)m_Diagram));
//		cc.add(VTCDCommandFactory.INSTANCE.createAutomaticLayoutCommand(m_Diagram));
//		execute(cc);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	protected boolean calculateEnabled() {
		  if (this.getEditorPart() instanceof VTCDMainDiagramEditor)
		   {
			 m_Diagram = ((VTCDMainDiagramEditor)getEditorPart()).getM_VTCDDiagramMain();  
		   }
		   if (this.getEditorPart() instanceof VTCDCombinationDiagramEditor)
		   {
			   m_Diagram = ((VTCDCombinationDiagramEditor)getEditorPart()).getVTCDDiagramCombination();  
		   }
		return m_Diagram!=null;
	}

}
