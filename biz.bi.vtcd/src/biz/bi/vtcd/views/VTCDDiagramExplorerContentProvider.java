/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.views;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.vtcd.editparts.VTCDDiagramMainEditPart;
import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFigureDependency;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * @author smoreno
 * @24-ago-2005
 * @smoreno
 */
public class VTCDDiagramExplorerContentProvider implements ITreeContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	protected TreeViewer viewer;
	protected VTCDDiagramMainEditPart model;
	protected Adapter modelListener = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			handlePropertyChanged(msg);
		}
	};
	public Object[] getChildren(Object p_parentElement) {
		Vector children = new Vector();
		if (p_parentElement instanceof VTCDDiagramMainEditPart)
			children.add(((VTCDDiagramMainEditPart)p_parentElement).getModel());
		if (p_parentElement instanceof VTCDDiagramMain)
			for (Iterator i = ((VTCDDiagramMain)p_parentElement).getM_VTCDFigureDependency().iterator();i.hasNext();)
				children.add(((VTCDFigureDependency)i.next()).getM_VTCDDiagramCombination());
			
		return children.toArray();
	}

	/**
	 * @param p_msg
	 */
	protected void handlePropertyChanged(Notification p_msg) {
		//System.out.println(p_msg.toString());
		if (p_msg.getNotifier() instanceof CMProxyTestObject )
		if (p_msg.getFeatureID(EClass.class) ==CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY)
		{
			this.viewer.refresh();
			return;
		}
		if (p_msg.getNotifier() instanceof VTCDDiagramMain )
		if (p_msg.getFeatureID(EClass.class)  == VTCDPackage.VTCD_DIAGRAM_MAIN__MVTCD_FIGURE_DEPENDENCY)
		{
			this.viewer.setInput(model);
			this.viewer.refresh();
			return;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object p_element) {
		
		if (p_element instanceof VTCDDiagramCombination)
		{
			return ((VTCDDiagramCombination)p_element).getM_FigureDependency().getM_VTCDDiagramMain();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object p_element) {
		return getChildren(p_element).length>0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object p_inputElement) {
		return getChildren(p_inputElement);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer p_viewer, Object p_oldInput,
			Object p_newInput) {
		this.viewer = (TreeViewer)p_viewer;
		p_newInput = (VTCDDiagramMainEditPart)p_newInput;
		if(p_oldInput != null) {
			(((VTCDDiagramMainEditPart)p_oldInput)).getVTCDDiagramMain().eAdapters().remove(modelListener);
			(((VTCDDiagramMainEditPart)p_oldInput).getVTCDDiagramMain().getM_TestObject()).eAdapters().remove(modelListener);
		}
		if(p_newInput != null) {
			(((VTCDDiagramMainEditPart)p_newInput)).getVTCDDiagramMain().eAdapters().add(modelListener);
			(((VTCDDiagramMainEditPart)p_newInput).getVTCDDiagramMain().getM_TestObject()).eAdapters().add(modelListener);
		}
	
	}

}
