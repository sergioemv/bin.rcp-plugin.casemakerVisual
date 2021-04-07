package biz.bi.vtcd.provider;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @author Sergio M
 * 
 */
public class VTCDImages
{

public static final String DEPENDENCY = "full/figures/dependency_figure"; //$NON-NLS-1$
public static final String COMBINATION = "full/figures/combination_figure"; //$NON-NLS-1$
public static final String PALETTE_LINK_DEPENDENCY_ELEMENTS = "LinkDependencyElement";//$NON-NLS-1$
public static final String PALETTE_LINK_COMBINATION_ECLASS = "LinkDependencyElement";//$NON-NLS-1$
public static final String PALETTE_ELEMENT = "element";//$NON-NLS-1$
public static final String PALETTE_COMBINATION = "bola";//$NON-NLS-1$
public static final String PALETTE_DEPENDENCY = "dependency";//$NON-NLS-1$
public static final String PALETTE_EQUIVALENCECLASS = "equivalenceclass";//$NON-NLS-1$
public static final String TAB_MAIN_DIAGRAM = "EditorMain";//$NON-NLS-1$
public static final String TAB_MAIN_COMBINATION = "EditorCombination";//$NON-NLS-1$
private static final String ICON_FOLDER ="icons";//$NON-NLS-1$
private static final String ICON_EXTENSION="gif";//$NON-NLS-1$
public static final String ELEMENT_FOLDING_UP = "elementfolding_up";//$NON-NLS-1$
public static final String ELEMTN_FOLDING_DOWN = "elementfolding_down";//$NON-NLS-1$
public static final String TOOLBAR_CANCELABLEDELETE = "delete";
private static final Map stringToImage = new HashMap();
public static final String NEW_CAUSE_EFFECT_ICON="create_cause_efect";
public static final String EDIT_CAUSE_EFFECT_ICON="edit_cause_efect";
public static final String DELETE_CAUSE_EFFECT_ICON="delete_cause_efect";
public static final String CAUSE_EFFECT_ICON = "cause_efect";
public static final String TOOLBAR_RELOADTESTOBJECT = "refresh";
public static final String TOOLBAR_AUTOMATICLAYOUT = "automaticlayout";
public static final String TOOLBAR_GOTOCOMBINATIONDIAGRAM = "gotocombinationdiagram";
public static final String WIZARD_EXPORT_ICON="wizard_export";
public static final String WIZARD_IMPORT_ICON = "wizard_import";
public static final String COMBINATION_LEVEL_0 = "full/figures/combinations/comb0";
public static final String COMBINATION_LEVEL_1 = "full/figures/combinations/comb1";
public static final String COMBINATION_LEVEL_2 = "full/figures/combinations/comb2";
public static final String COMBINATION_LEVEL_3 = "full/figures/combinations/comb3";
public static final String COMBINATION_LEVEL_4 = "full/figures/combinations/comb4";
public static final String COMBINATION_LEVEL_5 = "full/figures/combinations/comb5";
public static final String COMBINATION_LEVEL_6 = "full/figures/combinations/comb6";
public static final String COMBINATION_LEVEL_7 = "full/figures/combinations/comb7";
public static final String COMBINATION_LEVEL_8 = "full/figures/combinations/comb8";
public static final String COMBINATION_LEVEL_9 = "full/figures/combinations/comb9";
public static final String COMBINATION_LEVEL_10 = "full/figures/combinations/comb10";
public static final String COMBINATION_LEVEL_11 = "full/figures/combinations/comb11";
public static final String WIZARD_EXPORT_ICON_LARGE="full/wizban/export_VTCD";
public static final String WIZARD_IMPORT_ICON_LARGE="full/wizban/import_VTCD";
private VTCDImages() {}

/**
 * Clients should not dispose the Image returned.
 * 
 * @param key  the key (one of the constants defined in this class)
 * @return the Image associated with the given key
 */
public static Image getImage(String key) {
	Image img = (Image)stringToImage.get(key);
	if (img == null) {
		img = ExtendedImageRegistry.getInstance().getImage(((ResourceLocator)VTCDEditPlugin.INSTANCE).getImage(key));
			//getImageDescriptor(key).createImage();
		stringToImage.put(key, img);
	}
	return img;
}

public static ImageDescriptor getImageDescriptor(String key) {
	
	return ImageDescriptor.createFromURL(VTCDEditPlugin.getPlugin().getBundle().getEntry(ICON_FOLDER+"/"+key+"."+ICON_EXTENSION));
	
}

public static Image getImageFromDir(String path){
    
	try {
		Image img = (Image)stringToImage.get(path);
		if (img==null)
		if (path!="")
		{
			
			File file = new File(path);
			img = ImageDescriptor.createFromURL(file.toURL()).createImage();
			stringToImage.put(path, img);
			
		}
		return img;
			
	} catch (MalformedURLException e) {
				e.printStackTrace();
	}
	return null;
	
}

}
