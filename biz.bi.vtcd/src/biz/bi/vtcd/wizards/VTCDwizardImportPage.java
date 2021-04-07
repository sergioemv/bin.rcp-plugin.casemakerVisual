/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FileSystemElement;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.IImportStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

import biz.bi.vtcd.provider.VTCDEditPlugin;

/**
 * @author hcanedo
 * @22-08-2005
 * @hcanedo
 */
public class VTCDwizardImportPage extends WizardResourceImportPage implements Listener {

	 	protected Combo sourceNameField;

	    protected Button overwriteExistingResourcesCheckbox;

	    protected Button createContainerStructureButton;

	    protected Button createOnlySelectedButton;

	    protected Button sourceBrowseButton;

	    protected Button selectAllButton;

	    protected Button deselectAllButton;

	    private boolean entryChanged = false;
	/**
	 * @param p_name
	 * @param p_selection
	 */
	public VTCDwizardImportPage(String p_name, IStructuredSelection p_selection) {
		super(p_name, p_selection);
		setTitle(VTCDEditPlugin.INSTANCE.getString("_UI_Import_VTCD_File_Title"));
        setDescription(VTCDEditPlugin.INSTANCE.getString("_UI_Import_VTCD_File_Description"));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#createSourceGroup(org.eclipse.swt.widgets.Composite)
	 */
	protected void createSourceGroup(Composite p_parent) {
		createRootDirectoryGroup(p_parent);
        createFileSelectionGroup(p_parent);
        createButtonsGroup(p_parent);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#getFileProvider()
	 */
	protected ITreeContentProvider getFileProvider() {
		return new WorkbenchContentProvider() {
            public Object[] getChildren(Object o) {
                if (o instanceof VTCDMinimizedFileSystemElement) {
                    VTCDMinimizedFileSystemElement element = (VTCDMinimizedFileSystemElement) o;
                    return element.getFiles(
                            FileSystemStructureProvider.INSTANCE).getChildren(
                            element);
                }
                return new Object[0];
            }
        };
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardResourceImportPage#getFolderProvider()
	 */
	protected ITreeContentProvider getFolderProvider() {
		return new WorkbenchContentProvider() {
            public Object[] getChildren(Object o) {
                if (o instanceof VTCDMinimizedFileSystemElement) {
                	VTCDMinimizedFileSystemElement element = (VTCDMinimizedFileSystemElement) o;
                    return element.getFolders(
                            FileSystemStructureProvider.INSTANCE).getChildren(
                            element);
                }
                return new Object[0];
            }

            public boolean hasChildren(Object o) {
                if (o instanceof VTCDMinimizedFileSystemElement) {
                	VTCDMinimizedFileSystemElement element = (VTCDMinimizedFileSystemElement) o;
                    if (element.isPopulated())
                        return getChildren(element).length > 0;

                    //If we have not populated then wait until asked
                    return true;
                }
                return false;
            }
        };
	}
	   /**
     *	Create the group for creating the root directory
     */
    protected void createRootDirectoryGroup(Composite parent) {
        Composite sourceContainerGroup = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        sourceContainerGroup.setLayout(layout);
        sourceContainerGroup.setFont(parent.getFont());
        sourceContainerGroup.setLayoutData(new GridData(
                GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

        Label groupLabel = new Label(sourceContainerGroup, SWT.NONE);
        groupLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_Select_Root_Directory_To_Import_Label"));
        groupLabel.setFont(parent.getFont());

        // source name entry field
        sourceNameField = new Combo(sourceContainerGroup, SWT.BORDER);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL
                | GridData.GRAB_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        sourceNameField.setLayoutData(data);
        sourceNameField.setFont(parent.getFont());

        sourceNameField.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                updateFromSourceField();
            }
        });

        sourceNameField.addKeyListener(new KeyListener() {
            /*
             * @see KeyListener.keyPressed
             */
            public void keyPressed(KeyEvent e) {
                //If there has been a key pressed then mark as dirty
                entryChanged = true;
            }

            /*
             * @see KeyListener.keyReleased
             */
            public void keyReleased(KeyEvent e) {
            }
        });

        sourceNameField.addFocusListener(new FocusListener() {
            /*
             * @see FocusListener.focusGained(FocusEvent)
             */
            public void focusGained(FocusEvent e) {
                //Do nothing when getting focus
            }

            /*
             * @see FocusListener.focusLost(FocusEvent)
             */
            public void focusLost(FocusEvent e) {
                //Clear the flag to prevent constant update
                if (entryChanged) {
                    entryChanged = false;
                    updateFromSourceField();
                }

            }
        });

        // source browse button
        sourceBrowseButton = new Button(sourceContainerGroup, SWT.PUSH);
        sourceBrowseButton.setText(VTCDEditPlugin.INSTANCE.getString("_UI_BrowseURIButton"));
        sourceBrowseButton.addListener(SWT.Selection, this);
        sourceBrowseButton.setLayoutData(new GridData(
                GridData.HORIZONTAL_ALIGN_FILL));
        sourceBrowseButton.setFont(parent.getFont());
        setButtonLayoutData(sourceBrowseButton);
    }
    /**
     * Creates the buttons for selecting  selecting all or none of the
     * elements.
     *
     * @param parent the parent control
     */
    protected final void createButtonsGroup(Composite parent) {
        // top level group
        Composite buttonComposite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        layout.makeColumnsEqualWidth = true;
        buttonComposite.setLayout(layout);
        buttonComposite.setFont(parent.getFont());
        GridData buttonData = new GridData(GridData.VERTICAL_ALIGN_FILL
                | GridData.HORIZONTAL_ALIGN_FILL);
        buttonData.horizontalSpan = 2;
        buttonComposite.setLayoutData(buttonData);

        selectAllButton = createButton(buttonComposite,
                IDialogConstants.SELECT_ALL_ID, VTCDEditPlugin.INSTANCE.getString("_UI_Select_All_Label"), false);

        SelectionListener listener = new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                setAllSelections(true);
            }
        };
        selectAllButton.addSelectionListener(listener);
        setButtonLayoutData(selectAllButton);

        deselectAllButton = createButton(buttonComposite,
                IDialogConstants.DESELECT_ALL_ID, VTCDEditPlugin.INSTANCE.getString("_UI_Deselect_All_Label"), false);

        listener = new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                setAllSelections(false);
            }
        };
        deselectAllButton.addSelectionListener(listener);
        setButtonLayoutData(deselectAllButton);

    }
    /**
     * Update the receiver from the source name field.
     */

    private void updateFromSourceField() {

        setSourceName(sourceNameField.getText());
        //Update enablements when this is selected
        updateWidgetEnablements();
    }
    /**
     * Sets the source name of the import to be the supplied path.
     * Adds the name of the path to the list of items in the
     * source combo and selects it.
     *
     * @param path the path to be added
     */
    protected void setSourceName(String path) {

        if (path.length() > 0) {

            String[] currentItems = this.sourceNameField.getItems();
            int selectionIndex = -1;
            for (int i = 0; i < currentItems.length; i++) {
                if (currentItems[i].equals(path))
                    selectionIndex = i;
            }
            if (selectionIndex < 0) {
                int oldLength = currentItems.length;
                String[] newItems = new String[oldLength + 1];
                System.arraycopy(currentItems, 0, newItems, 0, oldLength);
                newItems[oldLength] = path;
                this.sourceNameField.setItems(newItems);
                selectionIndex = oldLength;
            }
            this.sourceNameField.select(selectionIndex);

            resetSelection();
        }
    }
    /**
     *	Repopulate the view based on the currently entered directory.
     */
    protected void resetSelection() {

        VTCDMinimizedFileSystemElement currentRoot = getFileSystemTree();
        this.selectionGroup.setRoot(currentRoot);

    }
    /**
     *	Answer the root FileSystemElement that represents the contents of
     *	the currently-specified source.  If this FileSystemElement is not
     *	currently defined then create and return it.
     */
    protected VTCDMinimizedFileSystemElement getFileSystemTree() {

        File sourceDirectory = getSourceDirectory();
        if (sourceDirectory == null)
            return null;

        return selectFiles(sourceDirectory,
                FileSystemStructureProvider.INSTANCE);
    }
    /**
     * Returns a File object representing the currently-named source directory iff
     * it exists as a valid directory, or <code>null</code> otherwise.
     */
    protected File getSourceDirectory() {
        return getSourceDirectory(this.sourceNameField.getText());
    }

    /**
     * Returns a File object representing the currently-named source directory iff
     * it exists as a valid directory, or <code>null</code> otherwise.
     *
     * @param path a String not yet formatted for java.io.File compatability
     */
    private File getSourceDirectory(String path) {
        File sourceDirectory = new File(getSourceDirectoryName(path));
        if (!sourceDirectory.exists() || !sourceDirectory.isDirectory()) {
            return null;
        }

        return sourceDirectory;
    }

    /**
     *	Answer the directory name specified as being the import source.
     *	Note that if it ends with a separator then the separator is first
     *	removed so that java treats it as a proper directory
     */
    private String getSourceDirectoryName(String sourceName) {
        IPath result = new Path(sourceName.trim());

        if (result.getDevice() != null && result.segmentCount() == 0) // something like "c:"
            result = result.addTrailingSeparator();
        else
            result = result.removeTrailingSeparator();

        return result.toOSString();
    }
    /**
     * Invokes a file selection operation using the specified file system and
     * structure provider.  If the user specifies files to be imported then
     * this selection is cached for later retrieval and is returned.
     */
    protected VTCDMinimizedFileSystemElement selectFiles(
            final Object rootFileSystemObject,
            final IImportStructureProvider structureProvider) {

        final VTCDMinimizedFileSystemElement[] results = new VTCDMinimizedFileSystemElement[1];

        BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
            public void run() {
                //Create the root element from the supplied file system object
                results[0] = createRootElement(rootFileSystemObject,
                        structureProvider);
            }
        });

        return results[0];
    }
    /**
     * Creates and returns a <code>FileSystemElement</code> if the specified
     * file system object merits one.  The criteria for this are:
     * Also create the children.
     */
    protected VTCDMinimizedFileSystemElement createRootElement(
            Object fileSystemObject, IImportStructureProvider provider) {
        boolean isContainer = provider.isFolder(fileSystemObject);
        String elementLabel = provider.getLabel(fileSystemObject);

        // Use an empty label so that display of the element's full name
        // doesn't include a confusing label
        VTCDMinimizedFileSystemElement dummyParent = new VTCDMinimizedFileSystemElement(
                "", null, true);//$NON-NLS-1$
        dummyParent.setPopulated();
        VTCDMinimizedFileSystemElement result = new VTCDMinimizedFileSystemElement(
                elementLabel, dummyParent, isContainer);
        result.setFileSystemObject(fileSystemObject);

        //Get the files for the element so as to build the first level
        result.getFiles(provider);

        return dummyParent;
    }
    protected Button createButton(Composite parent, int id, String label,
            boolean defaultButton) {
        // increment the number of columns in the button bar
        ((GridLayout) parent.getLayout()).numColumns++;

        Button button = new Button(parent, SWT.PUSH);
        button.setFont(parent.getFont());

        GridData buttonData = new GridData(GridData.FILL_HORIZONTAL);
        button.setLayoutData(buttonData);

        button.setData(new Integer(id));
        button.setText(label);

        if (defaultButton) {
            Shell shell = parent.getShell();
            if (shell != null) {
                shell.setDefaultButton(button);
            }
            button.setFocus();
        }
        return button;
    }
    /**
     *	Handle all events and enablements for widgets in this dialog
     *
     * @param event Event
     */
    public void handleEvent(Event event) {
        if (event.widget == sourceBrowseButton)
            handleSourceBrowseButtonPressed();

        super.handleEvent(event);
    }
    /**
     *	Open an appropriate source browser so that the user can specify a source
     *	to import from
     */
    protected void handleSourceBrowseButtonPressed() {

        String currentSource = this.sourceNameField.getText();
        DirectoryDialog dialog = new DirectoryDialog(
                sourceNameField.getShell(), SWT.SAVE);
        dialog.setText(VTCDEditPlugin.INSTANCE.getString("_UI_Import_Title_Label"));
        dialog.setMessage(VTCDEditPlugin.INSTANCE.getString("_UI_Select_Source_Dialog_Message"));
        dialog.setFilterPath(getSourceDirectoryName(currentSource));

        String selectedDirectory = dialog.open();
        if (selectedDirectory != null) {
            //Just quit if the directory is not valid
            if ((getSourceDirectory(selectedDirectory) == null)
                    || selectedDirectory.equals(currentSource))
                return;
            //If it is valid then proceed to populate
            setErrorMessage(null);
            setSourceName(selectedDirectory);
            selectionGroup.setFocus();
        }
    }
    /**
     *	Create the import options specification widgets.
     */
    protected void createOptionsGroupButtons(Group optionsGroup) {

    	overwriteExistingResourcesCheckbox = new Button(optionsGroup, SWT.CHECK);
        overwriteExistingResourcesCheckbox.setFont(optionsGroup.getFont());
        overwriteExistingResourcesCheckbox.setText(VTCDEditPlugin.INSTANCE.getString("_UI_Overwrite_Existing_Resources_Label"));

    }

	/**
	 * @return
	 */
	public boolean perfromFinish() {
        if (!ensureSourceIsValid())
            return false;

        saveWidgetValues();

        Iterator resourcesEnum = getSelectedResources().iterator();
        List fileSystemObjects = new ArrayList();
        while (resourcesEnum.hasNext()) {
            fileSystemObjects.add(((FileSystemElement) resourcesEnum.next())
                    .getFileSystemObject());
        }

        if (fileSystemObjects.size() > 0)
            return importResources(fileSystemObjects);

        MessageDialog.openInformation(getContainer().getShell(),
        		VTCDEditPlugin.INSTANCE.getString("_UI_Import_Title_Label"),
        		VTCDEditPlugin.INSTANCE.getString("_UI_Import_Not_Selected_File_Message"));

        return false;
	}
	/**
     *	Answer a boolean indicating whether the specified source currently exists
     *	and is valid
     */
    protected boolean ensureSourceIsValid() {
        if (new File(getSourceDirectoryName(this.sourceNameField.getText())).isDirectory())
            return true;

        displayErrorDialog(VTCDEditPlugin.INSTANCE.getString("_UI_Import_Error_File_Message"));
        sourceNameField.setFocus();
        return false;
    }
    /**
     *  Import the resources with extensions as specified by the user
     */
    protected boolean importResources(List fileSystemObjects) {
        ImportOperation operation = new ImportOperation(getContainerFullPath(),
                getSourceDirectory(), FileSystemStructureProvider.INSTANCE,
                this, fileSystemObjects);

        operation.setContext(getShell());
        return executeImportOperation(operation);
    }

    /**
     *	Execute the passed import operation.  Answer a boolean indicating success.
     */
    protected boolean executeImportOperation(ImportOperation op) {
        initializeOperation(op);

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
            ErrorDialog
                    .openError(getContainer().getShell(), "import error problems",
                            null, // no special message
                            status);
            return false;
        }

        return true;
    }
    /**
     * Initializes the specified operation appropriately.
     */
    protected void initializeOperation(ImportOperation op) {
        op.setCreateContainerStructure(false);
        op.setOverwriteResources(overwriteExistingResourcesCheckbox
                .getSelection());
    }
}
