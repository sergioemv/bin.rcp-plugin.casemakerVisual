package biz.bi.vbr.vbrvm.provider;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import java.util.HashMap;
import java.util.Map;
import biz.bi.vbr.provider.VBRModelEditPlugin;

public class VBRVMImages {
	
	private static final Map stringToImage = new HashMap();
	private static final String ICON_FOLDER ="icons";//$NON-NLS-1$
	private static final String ICON_EXTENSION="gif";//$NON-NLS-1$
	public static final String PALETTE_ELEMENT = "element";//$NON-NLS-1$
	public static final String PALETTE_ELEMENTVAUE = "element value";//$NON-NLS-1$
	public static final String PALETTE_ACTION = "action";//$NON-NLS-1$
	
	private VBRVMImages() {}

	/**
	 * Clients should not dispose the Image returned.
	 * 
	 * @param key  the key (one of the constants defined in this class)
	 * @return the Image associated with the given key
	 */
	public static Image getImage(String key) {
		Image img = (Image)stringToImage.get(key);
		if (img == null) {
			img = ExtendedImageRegistry.getInstance().getImage(((ResourceLocator)VBRModelEditPlugin.INSTANCE).getImage(key));
				//getImageDescriptor(key).createImage();
			stringToImage.put(key, img);
		}
		return img;
	}

	public static ImageDescriptor getImageDescriptor(String key) {
		
		return ImageDescriptor.createFromURL(VBRModelEditPlugin.getPlugin().getBundle().getEntry(ICON_FOLDER+"/"+key+"."+ICON_EXTENSION));
	}

}
