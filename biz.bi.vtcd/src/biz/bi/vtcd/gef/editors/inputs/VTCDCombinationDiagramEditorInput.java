/**
 * 
 */
package biz.bi.vtcd.gef.editors.inputs;

import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IWorkbenchPart;

import biz.bi.vtcd.model.VTCDDiagramCombination;

/**
 * @author smoreno
 *
 */
public class VTCDCombinationDiagramEditorInput implements IEditorInput {

	private VTCDDiagramCombination m_DiagramCombination;
	private IWorkbenchPart m_Parent;
	public static final HashMap openedInputs = new HashMap();
	/**
	 * @param p_file
	 */
	public VTCDCombinationDiagramEditorInput(VTCDDiagramCombination p_CombinationD, IWorkbenchPart p_Part) {

		this.m_DiagramCombination = p_CombinationD;
		this.m_Parent = p_Part;
		openedInputs.put(p_CombinationD,this);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	public boolean exists() {
		
		return this.m_DiagramCombination.getM_FigureDependency().getM_Dependency().isProxyModelSet();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return this.m_DiagramCombination.getM_FigureDependency().getM_Dependency().getName();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return this.m_DiagramCombination.getM_FigureDependency().getM_Dependency().getDescription();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class p_adapter) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return Returns the diagramCombination.
	 */
	public VTCDDiagramCombination getDiagramCombination() {
		return this.m_DiagramCombination;
	}
	/**
	 * @return Returns the parent.
	 */
	public IWorkbenchPart getParent() {
		return this.m_Parent;
	}

}
