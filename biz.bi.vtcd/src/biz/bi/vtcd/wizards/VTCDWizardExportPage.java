/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;

import biz.bi.vtcd.provider.VTCDEditPlugin;



/**
 * @author hcanedo
 * @23-08-2005
 * @hcanedo
 */
public class VTCDWizardExportPage extends VTCDAbstractWizardExportPage implements
		Listener {
	private Combo destinationNameField;

    private Button destinationBrowseButton;

    protected Button overwriteExistingFilesCheckbox;

    protected Button createDirectoryStructureButton;

    protected Button createSelectionOnlyButton;

	/**
	 * @param p_pageName
	 * @param p_selection
	 */
	public VTCDWizardExportPage(String p_pageName,
			IStructuredSelection p_selection) {
		super(p_pageName, p_selection);
		setTitle(VTCDEditPlugin.INSTANCE.getString("_UI_Export_Title_Label"));
		setDescription(VTCDEditPlugin.INSTANCE.getString("_UI_Export_VTCD_File_Description"));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardExportResourcesPage#createDestinationGroup(org.eclipse.swt.widgets.Composite)
	 */
    protected void createDestinationGroup(Composite parent) {
        Font font = parent.getFont();
        // destination specification group
        Composite destinationSelectionGroup = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        destinationSelectionGroup.setLayout(layout);
        destinationSelectionGroup.setLayoutData(new GridData(
                GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL));
        destinationSelectionGroup.setFont(font);

        Label destinationLabel = new Label(destinationSelectionGroup, SWT.NONE);

        destinationLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_Destination_Export_Label"));
        destinationLabel.setFont(font);

        // destination name entry field
        destinationNameField = new Combo(destinationSelectionGroup, SWT.SINGLE
                | SWT.BORDER);
        destinationNameField.addListener(SWT.Modify, this);
        destinationNameField.addListener(SWT.Selection, this);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
                | GridData.GRAB_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        destinationNameField.setLayoutData(data);
        destinationNameField.setFont(font);

        // destination browse button
        destinationBrowseButton = new Button(destinationSelectionGroup,
                SWT.PUSH);

        destinationBrowseButton.setText(VTCDEditPlugin.INSTANCE.getString("_UI_BrowseURIButton"));
        destinationBrowseButton.addListener(SWT.Selection, this);
        destinationBrowseButton.setFont(font);
        setButtonLayoutData(destinationBrowseButton);

        new Label(parent, SWT.NONE); // vertical spacer
    }


	/* (non-Javadoc)
	 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
	 */
	public void handleEvent(Event p_event) {
		Widget source = p_event.widget;

        if (source == destinationBrowseButton)
            handleDestinationBrowseButtonPressed();

        updatePageCompletion();

	}
	/**
     *	Open an appropriate destination browser so that the user can specify a source
     *	to import from
     */
    protected void handleDestinationBrowseButtonPressed() {
        DirectoryDialog dialog = new DirectoryDialog(getContainer().getShell(),
                SWT.SAVE);

        dialog.setMessage(VTCDEditPlugin.INSTANCE.getString("_UI_Select_Destination_Dialog_Message"));
        dialog.setText(VTCDEditPlugin.INSTANCE.getString("_UI_Export_Title_Label"));
        dialog.setFilterPath(destinationNameField.getText().trim());
        String selectedDirectoryName = dialog.open();

        if (selectedDirectoryName != null) {
            setErrorMessage(null);
            destinationNameField.setText(selectedDirectoryName);
        }
    }

    public void deselectOtherFiles(List toDeselect, List toExport){
        for (Iterator iter = toDeselect.iterator(); iter.hasNext();) {
			IResource element = (IResource) iter.next();
			if(IResource.FILE == element.getType()){
				String extencion=element.getFileExtension();
				if(extencion != null && extencion.equalsIgnoreCase(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEditorFilenameExtension"))){
					if(!toExport.contains(element))
						toExport.add(element);
				}
			}
			else{
				if(IResource.FOLDER == element.getType() || IResource.PROJECT == element.getType()){
					try {
						IResource[] children = ((IContainer) element).members();
						deselectOtherFiles(Arrays.asList(children),toExport);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
    }
	/**
	 * 
	 */
	public boolean performFinish() {
		 if (!ensureTargetIsValid(new File(destinationNameField.getText().trim())))
	            return false;

	        List resourcesToExport = getWhiteCheckedResources();
	        List toExport = new ArrayList();
	        deselectOtherFiles(resourcesToExport,toExport);
	        resourcesToExport=toExport;
	        //Save dirty editors if possible but do not stop if not all are saved
	        saveDirtyEditors();
	        // about to invoke the operation so save our state
	        saveWidgetValues();

	        if (resourcesToExport.size() > 0)
	            return executeExportOperation(new VTCDFileSystemExportOperation(null,
	                    resourcesToExport, destinationNameField.getText().trim(), this));

	        MessageDialog.openInformation(getContainer().getShell(),
	        		VTCDEditPlugin.INSTANCE.getString("_UI_Export_Title_Label"),
	        		VTCDEditPlugin.INSTANCE.getString("_UI_Export_Not_Selected_File_Message"));

	        return false;
		
	}
	 /**
     *	If the target for export does not exist then attempt to create it.
     *	Answer a boolean indicating whether the target exists (ie.- if it
     *	either pre-existed or this method was able to create it)
     *
     *	@return boolean
     */
    protected boolean ensureTargetIsValid(File targetDirectory) {
        if (targetDirectory.exists() && !targetDirectory.isDirectory()) {
  
            displayErrorDialog(VTCDEditPlugin.INSTANCE.getString("_UI_Directory_is_a_File_Message"));
            destinationNameField.setFocus();
            return false;
        }

        return ensureDirectoryExists(targetDirectory);
    }
    /**
     *  Set up and execute the passed Operation.  Answer a boolean indicating success.
     *
     *  @return boolean
     */
    protected boolean executeExportOperation(VTCDFileSystemExportOperation op) {
        op.setOverwriteFiles(overwriteExistingFilesCheckbox.getSelection());

        try {
            getContainer().run(true, true, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            displayErrorDialog(e.getTargetException());
            return false;
        }

        IStatus status = op.getStatus();
        if (!status.isOK()) {
        	//TODO set message exportProblems
            ErrorDialog.openError(getContainer().getShell(),
                    "",
                    null, // no special message
                    status);
            return false;
        }

        return true;
    }

    /**
     * Attempts to ensure that the specified directory exists on the local file system.
     * Answers a boolean indicating success.
     *
     * @return boolean
     * @param directory java.io.File
     */
    protected boolean ensureDirectoryExists(File directory) {
        if (!directory.exists()) {
       
            if (!queryYesNoQuestion(VTCDEditPlugin.INSTANCE.getString("_UI_Directory_Dont_Exist_Message")))
                return false;

            if (!directory.mkdirs()) {
 
                displayErrorDialog(VTCDEditPlugin.INSTANCE.getString("_UI_Error_Create_Directory_Message"));
                destinationNameField.setFocus();
                return false;
            }
        }

        return true;
    }
    /**
     * Create the buttons in the options group.
     */

    protected void createOptionsGroupButtons(Group optionsGroup) {
        Font font = optionsGroup.getFont();
        createOverwriteExisting(optionsGroup, font);
    }
    
    
    /**
     * Create the button for checking if we should ask if we are going to
     * overwrite existing files.
     * @param optionsGroup
     * @param font
     */
    protected void createOverwriteExisting(Group optionsGroup, Font font) {
        // overwrite... checkbox
        overwriteExistingFilesCheckbox = new Button(optionsGroup, SWT.CHECK
                | SWT.LEFT);

        overwriteExistingFilesCheckbox.setText(VTCDEditPlugin.INSTANCE.getString("_UI_Overwrite_Existing_Resources_Label"));
        overwriteExistingFilesCheckbox.setFont(font);
    }
    /**
     *	Answer a boolean indicating whether the receivers destination specification
     *	widgets currently all contain valid values.
     */
    protected boolean validateDestinationGroup() {
        String destinationValue = destinationNameField.getText().trim();
        if (destinationValue.length() == 0) {

            setMessage(VTCDEditPlugin.INSTANCE.getString("_UI_Destination_Directory_Empty_Message"));
            return false;
        }

        String conflictingContainer = getConflictingContainerNameFor(destinationValue);
        if (conflictingContainer == null)
            setErrorMessage(null);
        else {
        
            setErrorMessage(VTCDEditPlugin.INSTANCE.getString("_UI_Destination_Directory_Conflicts_Message"));            destinationNameField.setFocus();
            return false;
        }

        return true;
    }
    /**
     * Returns the name of a container with a location that encompasses targetDirectory.
     * Returns null if there is no conflict.
     * 
     * @param targetDirectory the path of the directory to check.
     * @return the conflicting container name or <code>null</code>
     */
    protected String getConflictingContainerNameFor(String targetDirectory) {

        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IPath testPath = new Path(targetDirectory);

        if (root.getLocation().isPrefixOf(testPath))
            return VTCDEditPlugin.INSTANCE.getString("_UI_Destination_Directory_Conflicts_Message");

        IProject[] projects = root.getProjects();

        for (int i = 0; i < projects.length; i++) {
            if (projects[i].getLocation().isPrefixOf(testPath))
                return projects[i].getName();
        }

        return null;

    }
 
    
}
