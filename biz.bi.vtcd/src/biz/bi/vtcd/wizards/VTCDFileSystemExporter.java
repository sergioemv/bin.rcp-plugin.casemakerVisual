/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.wizards;

/**
 * @author hcanedo
 * @23-08-2005
 * @hcanedo
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

/**
 * Helper class for exporting resources to the file system.
 */
public class VTCDFileSystemExporter {
    /**
     *  Creates the specified file system directory at <code>destinationPath</code>.
     *  This creates a new file system directory.
     */
    public void createFolder(IPath destinationPath) {
        new File(destinationPath.toOSString()).mkdir();
    }

    /**
     *  Writes the passed resource to the specified location recursively
     */
    public void write(IResource resource, IPath destinationPath)
            throws CoreException, IOException {
        if (resource.getType() == IResource.FILE)
            writeFile((IFile) resource, destinationPath);
        else
            writeChildren((IContainer) resource, destinationPath);
    }

    /**
     *  Exports the passed container's children
     */
    protected void writeChildren(IContainer folder, IPath destinationPath)
            throws CoreException, IOException {
        if (folder.isAccessible()) {
            IResource[] children = folder.members();
            for (int i = 0; i < children.length; i++) {
                IResource child = children[i];
                writeResource(child, destinationPath.append(child.getName()));
            }
        }
    }

    /**
     *  Writes the passed file resource to the specified destination on the local
     *  file system
     */
    protected void writeFile(IFile file, IPath destinationPath)
            throws IOException, CoreException {
        FileOutputStream output = null;
        InputStream contentStream = null;

        try {
            contentStream = file.getContents(false);
            output = new FileOutputStream(destinationPath.toOSString());
            int chunkSize = contentStream.available();
            byte[] readBuffer = new byte[chunkSize];
            int n = contentStream.read(readBuffer);

            while (n > 0) {
                output.write(readBuffer);
                n = contentStream.read(readBuffer);
            }
        } finally {
            if (output != null)
                output.close();
            if (contentStream != null)
                contentStream.close();
        }
    }

    /**
     *  Writes the passed resource to the specified location recursively
     */
    protected void writeResource(IResource resource, IPath destinationPath)
            throws CoreException, IOException {
        if (resource.getType() == IResource.FILE)
            writeFile((IFile) resource, destinationPath);
        else {
            createFolder(destinationPath);
            writeChildren((IContainer) resource, destinationPath);
        }
    }
}

