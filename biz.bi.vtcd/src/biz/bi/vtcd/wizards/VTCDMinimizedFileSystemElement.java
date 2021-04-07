/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.wizards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.ui.dialogs.FileSystemElement;
import org.eclipse.ui.model.AdaptableList;
import org.eclipse.ui.wizards.datatransfer.IImportStructureProvider;

import biz.bi.vtcd.provider.VTCDEditPlugin;

/**
 * @author hcanedo
 * @22-08-2005
 * @hcanedo
 */
public class VTCDMinimizedFileSystemElement extends FileSystemElement {
	private boolean populated = false;

    /**
     * Create a <code>MinimizedFileSystemElement</code> with the supplied name and parent.
     * @param name the name of the file element this represents
     * @param parent the containing parent
     * @param isDirectory indicated if this could have children or not
     */
    public VTCDMinimizedFileSystemElement(String name, FileSystemElement parent,
            boolean isDirectory) {
        super(name, parent, isDirectory);
    }

    /**
     * Returns a list of the files that are immediate children. Use the supplied provider
     * if it needs to be populated.
     * of this folder.
     */
    public AdaptableList getFiles(IImportStructureProvider provider) {
        if (!populated) {
            populate(provider);
        }
        AdaptableList result= new AdaptableList();
        AdaptableList list=super.getFiles();
       Object[] o= list.getChildren();
       for (int i = 0; i < o.length; i++) {
    	   FileSystemElement child =(FileSystemElement) o[i];
    	   String fileExtension=child.getFileNameExtension();
   		if(fileExtension != null && fileExtension.equalsIgnoreCase(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEditorFilenameExtension"))){
    		   result.add(child);
    	   }
       }
       return result;
    }

    /**
     * Returns a list of the folders that are immediate children. Use the supplied provider
     * if it needs to be populated.
     * of this folder.
     */
    public AdaptableList getFolders(IImportStructureProvider provider) {
        if (!populated) {
            populate(provider);
        }
        return super.getFolders();
    }

    /**
     * Return whether or not population has happened for the receiver.
     */
    boolean isPopulated() {
        return this.populated;
    }

    /**
     * Return whether or not population has not happened for the receiver.
     */
    boolean notPopulated() {
        return !this.populated;
    }

    /**
     * Populate the files and folders of the receiver using the suppliec structure provider.
     * @param provider org.eclipse.ui.wizards.datatransfer.IImportStructureProvider
     */
    private void populate(IImportStructureProvider provider) {

        Object fileSystemObject = getFileSystemObject();

        List children = provider.getChildren(fileSystemObject);
        if (children == null) {
            children = new ArrayList(1);
        }
        Iterator childrenEnum = children.iterator();
        while (childrenEnum.hasNext()) {
            Object child = childrenEnum.next();

            String elementLabel = provider.getLabel(child);
            //Create one level below
            VTCDMinimizedFileSystemElement result = new VTCDMinimizedFileSystemElement(
                    elementLabel, this, provider.isFolder(child));
            result.setFileSystemObject(child);
        }
        setPopulated();
    }

    /**
     * Set whether or not population has happened for the receiver to true.
     */
   public void setPopulated() {
        this.populated = true;
    }

   
}
