/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.views;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import biz.bi.vtcd.model.VTCDDiagramCombination;
import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;


/**
 * @author smoreno
 * @23-08-2005
 * @smoreno
 */
public class VTCDDiagramExplorerLabelProvider extends LabelProvider {

	
	
	private Map imageCache = new HashMap(11);
	
	public Image getImage(Object element) {
		ImageDescriptor descriptor = null;
		if (element instanceof VTCDDiagramMain) {
			descriptor = VTCDImages.getImageDescriptor(VTCDImages.TAB_MAIN_DIAGRAM);
		} else if (element instanceof VTCDDiagramCombination) {
			descriptor = VTCDImages.getImageDescriptor(VTCDImages.TAB_MAIN_COMBINATION);
		} else {
			throw unknownModel(element);
		}

		//obtain the cached image corresponding to the descriptor
		Image image = (Image)imageCache.get(descriptor);
		if (image == null) {
			image = descriptor.createImage();
			imageCache.put(descriptor, image);
		}
		return image;
	}

	/*
	 * @see ILabelProvider#getText(Object)
	 */
	public String getText(Object element) {
		if (element instanceof VTCDDiagramMain) 
				return ((VTCDDiagramMain)element).getM_TestObject().getName();	
		else if (element instanceof VTCDDiagramCombination) 
			return ((VTCDDiagramCombination)element).getM_FigureDependency().getM_Dependency().getName()+" "+
			((VTCDDiagramCombination)element).getM_FigureDependency().getM_Dependency().getDescription();
		else {
			throw unknownModel(element);
		}
	}

	public void dispose() {
		for (Iterator i = imageCache.values().iterator(); i.hasNext();) {
			((Image) i.next()).dispose();
		}
		imageCache.clear();
	}

	protected RuntimeException unknownModel(Object element) {
		return new RuntimeException(VTCDEditPlugin.INSTANCE.getString("_EXCEPTION_Unknow_Model") + element.getClass().getName());
	}
}
