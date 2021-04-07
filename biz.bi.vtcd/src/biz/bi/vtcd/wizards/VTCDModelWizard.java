/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDModelWizard.java,v 1.3 2005/08/25 15:47:18 smoreno Exp $
 */
package biz.bi.vtcd.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import biz.bi.vtcd.model.VTCDDiagramMain;
import biz.bi.vtcd.model.VTCDFactory;
import biz.bi.vtcd.model.VTCDPackage;
import biz.bi.vtcd.policies.VTCDModelLoader;
import biz.bi.vtcd.provider.VTCDEditPlugin;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDModelWizard extends Wizard implements INewWizard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDPackage vtcdPackage = VTCDPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFactory vtcdFactory = vtcdPackage.getVTCDFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List initialObjectNames;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(VTCDEditPlugin.INSTANCE.getString("_UI_Wizard_label")); //$NON-NLS-1$
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(VTCDEditPlugin.INSTANCE
						.getImage("full/wizban/NewVTCD"))); //$NON-NLS-1$
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList();
			for (Iterator classifiers = vtcdPackage.getEClassifiers()
					.iterator(); classifiers.hasNext();) {
				EClassifier eClassifier = (EClassifier) classifiers.next();
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, java.text.Collator
					.getInstance());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	protected EObject createInitialModel() {
		VTCDDiagramMain mainDiagram = null;
		try {
			VTCDModelLoader modelLoader = new VTCDModelLoader();
			mainDiagram = modelLoader
					.loadModelForTestObject(initialObjectCreationPage
							.getTestObjectFilename(),initialObjectCreationPage.isNewTestObjectSelected());

		} catch (Exception e) {
			Status status = new Status(IStatus.ERROR, "biz.bi.vtcd", 0, e
					.toString(), null);
			ErrorDialog
					.openError(
							workbench.getDisplay().getActiveShell(),
							VTCDEditPlugin.INSTANCE
									.getString("_UI_ErrorDialog_title"),
							VTCDEditPlugin.INSTANCE
									.getString("_UI_ErrorDialogCreateInitialModelFailed_msg"),
							status);
			VTCDEditPlugin.INSTANCE.log(e);

		}
		return mainDiagram;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile
								.getFullPath().toString());
						//Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						EObject rootObject = createInitialModel();

						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}

						// Save the contents of the resource to the file system.
						//
						Map options = new HashMap();
						options.put(XMLResource.OPTION_ENCODING,
								initialObjectCreationPage.getEncoding());
						resource.save(options);

					} catch (Exception exception) {
						VTCDEditPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(
						modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart)
								.selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(new FileEditorInput(modelFile), workbench
						.getEditorRegistry().getDefaultEditor(
								modelFile.getFullPath().toString()).getId());
			} catch (PartInitException exception) {
				MessageDialog
						.openError(
								workbenchWindow.getShell(),
								VTCDEditPlugin.INSTANCE
										.getString("_UI_OpenEditorError_label"), exception.getMessage()); //$NON-NLS-1$
				return false;
			}

			return true;
		} catch (Exception exception) {
			VTCDEditPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class VTCDModelWizardNewFileCreationPage extends
			WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public VTCDModelWizardNewFileCreationPage(String pageId,
				IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			if (super.validatePage()) {
				// Make sure the file ends in ".vtcd".
				//
				String requiredExt = VTCDEditPlugin.INSTANCE
						.getString("_UI_VTCDEditorFilenameExtension"); //$NON-NLS-1$
				String enteredExt = new Path(getFileName()).getFileExtension();
				if (enteredExt == null || !enteredExt.equals(requiredExt)) {
					setErrorMessage(VTCDEditPlugin.INSTANCE
							.getString(
									"_WARN_FilenameExtension", new Object[] { requiredExt })); //$NON-NLS-1$
					return false;
				} else {
					return true;
				}
			} else {
				return false;
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(
					getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public class VTCDModelWizardInitialObjectCreationPage extends WizardPage {

		protected Text testObjectField;
		protected Text newTestObjectField;
		private Label testObjectURILabel;
		/**
		 * @author smoreno
		 * Is the composite for callin the open test object dialog
		 */

		/**
		 * @author smoreno
		 * Is the reference to a valid test Object 
		 */
		protected URI testObjectURI;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;
		private Button testObjectURIBrowseFileSystemButton;
		private Label testObjectNewURILabel;
		private Button testObjectNewURISaveAsFileSystemButton;
		private boolean newTestObjectSelected=false;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public VTCDModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 * @author smoreno, hcanedo
		 */
		public void createControl(Composite parent) {

			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}
			//Hcanedo Begins
			final Button newTestObjectRadioButton= new Button( composite, SWT.RADIO);
			{
				GridData data=new GridData(SWT.FILL, SWT.DEFAULT, false, false );
				newTestObjectRadioButton.setLayoutData( data);
				newTestObjectRadioButton.setSelection(false);
				newTestObjectRadioButton.setText(VTCDEditPlugin.INSTANCE
						.getString("_UI_NewTestObjectRadioButtonLabel"));
				newTestObjectRadioButton.addSelectionListener(new SelectionAdapter(){
					public void widgetSelected(SelectionEvent event) {
						if(newTestObjectRadioButton.getSelection()){
							newTestObjectField.setEnabled(true);
							testObjectNewURISaveAsFileSystemButton.setEnabled(true);
							testObjectNewURILabel.setEnabled(true);
							testObjectField.setEnabled(false);
							testObjectField.setText("");
							testObjectURILabel.setEnabled(false);
							testObjectURIBrowseFileSystemButton.setEnabled(false);
							setNewTestObjectSelected(true);
							newTestObjectField.setBackground(ColorConstants.white);
							testObjectField.setBackground(ColorConstants.menuBackground);
						}
					}
				});

			}
			
			testObjectNewURILabel = new Label(composite, SWT.LEFT);
			{
				testObjectNewURILabel.setText(VTCDEditPlugin.INSTANCE
						.getString("_UI_TestObjectNewURILabel")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				testObjectNewURILabel.setLayoutData(data);
			}
			Composite newTestObjectComposite = new Composite(composite, SWT.NONE);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.END;
				newTestObjectComposite.setLayoutData(data);

				GridLayout layout = new GridLayout();
				data.horizontalAlignment = GridData.FILL;
				layout.marginHeight = 0;
				layout.marginWidth = 0;
				layout.numColumns = 2;
				newTestObjectComposite.setLayout(layout);
			}

			newTestObjectField = new Text(newTestObjectComposite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.horizontalSpan = 1;
				newTestObjectField.setLayoutData(data);
				newTestObjectField.setEditable(false);
				
			}
			newTestObjectField.addModifyListener(validator);

			testObjectNewURISaveAsFileSystemButton = new Button(
					newTestObjectComposite, SWT.PUSH);
			testObjectNewURISaveAsFileSystemButton.setText(VTCDEditPlugin.INSTANCE
					.getString("_UI_Save_As_label")); //$NON-NLS-1$

			testObjectNewURISaveAsFileSystemButton
					.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent event) {
							String fileExtension = VTCDEditPlugin.INSTANCE
									.getString("_UI_VTCDTestObjectFilenameExtension"); //$NON-NLS-1$
							FileDialog fd = new FileDialog(workbench.getDisplay().getActiveShell(), SWT.SAVE);
							fd.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDTestObjectFileSaveAsDialogTitle"));
							//fd.setFilterPath(fileExtension);
							String[] filterExt = { "*." + fileExtension };
							fd.setFilterExtensions(filterExt);
							String filePath = fd.open();

							if (filePath != null) {
								if (!filePath.endsWith("." + fileExtension)) //$NON-NLS-1$
								{
									filePath = filePath + "." + fileExtension; //$NON-NLS-1$
								}
								newTestObjectField.setText(filePath);
							}
						}
					});
			newTestObjectField.setFocus();
		
			final Button importTestObjectRadioButton= new Button( composite, SWT.RADIO);
			{
				GridData data=new GridData(SWT.FILL, SWT.DEFAULT, false, false );
				importTestObjectRadioButton.setLayoutData( data);
				importTestObjectRadioButton.setSelection(true);
				importTestObjectRadioButton.setText(VTCDEditPlugin.INSTANCE
						.getString("_UI_ImportTestObjectRadioButtonLabel"));
				importTestObjectRadioButton.addSelectionListener(new SelectionAdapter(){
					public void widgetSelected(SelectionEvent event) {
						if(importTestObjectRadioButton.getSelection()){
							newTestObjectField.setEnabled(false);
							newTestObjectField.setText("");
							testObjectNewURISaveAsFileSystemButton.setEnabled(false);
							testObjectNewURILabel.setEnabled(false);
							testObjectField.setEnabled(true);
							testObjectURILabel.setEnabled(true);
							testObjectURIBrowseFileSystemButton.setEnabled(true);
							setNewTestObjectSelected(false);
							newTestObjectField.setBackground(ColorConstants.menuBackground);
							testObjectField.setBackground(ColorConstants.white);
						}
					}
				});

			}
			newTestObjectField.setEnabled(false);
			testObjectNewURISaveAsFileSystemButton.setEnabled(false);
			testObjectNewURILabel.setEnabled(false);	
			//Hcanedo Ends

			testObjectURILabel = new Label(composite, SWT.LEFT);
			{
				testObjectURILabel.setText(VTCDEditPlugin.INSTANCE
						.getString("_UI_TestObjectURILabel")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				testObjectURILabel.setLayoutData(data);
			}
			Composite testObjectComposite = new Composite(composite, SWT.NONE);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.END;
				testObjectComposite.setLayoutData(data);

				GridLayout layout = new GridLayout();
				data.horizontalAlignment = GridData.FILL;
				layout.marginHeight = 0;
				layout.marginWidth = 0;
				layout.numColumns = 2;
				testObjectComposite.setLayout(layout);
			}

			testObjectField = new Text(testObjectComposite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.horizontalSpan = 1;
				testObjectField.setLayoutData(data);
				testObjectField.setEditable(false);
				testObjectField.setBackground(ColorConstants.white);
			}
			testObjectField.addModifyListener(validator);

		    testObjectURIBrowseFileSystemButton = new Button(
					testObjectComposite, SWT.PUSH);
			testObjectURIBrowseFileSystemButton.setText(VTCDEditPlugin.INSTANCE
					.getString("_UI_Browse_label")); //$NON-NLS-1$

			testObjectURIBrowseFileSystemButton
					.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent event) {
							String fileExtension = VTCDEditPlugin.INSTANCE
									.getString("_UI_VTCDTestObjectFilenameExtension"); //$NON-NLS-1$
							FileDialog fd = new FileDialog(workbench
									.getDisplay().getActiveShell(), SWT.OPEN);
							fd
									.setText(VTCDEditPlugin.INSTANCE
											.getString("_UI_VTCDTestObjectFileOpenDialogTitle"));
							//fd.setFilterPath(fileExtension);
							String[] filterExt = { "*." + fileExtension };
							fd.setFilterExtensions(filterExt);
							String filePath = fd.open();

							if (filePath != null) {
								if (!filePath.endsWith("." + fileExtension)) //$NON-NLS-1$
								{
									filePath = filePath + "." + fileExtension; //$NON-NLS-1$
								}
								testObjectField.setText(filePath);
							}
						}
					});
			testObjectField.setFocus();
			//smoreno_end

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(VTCDEditPlugin.INSTANCE
						.getString("_UI_XMLEncoding")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
				encodingLabel.setVisible(false);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (Iterator i = getEncodings().iterator(); i.hasNext();) {
				encodingField.add((String) i.next());
			}

			encodingField.select(encodingField.getItemCount()-1);
			encodingField.addModifyListener(validator);
			encodingField.setVisible(false);

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(VTCDEditPlugin.INSTANCE
						.getString("_UI_ModelObject")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}
			initialObjectField.add(VTCDEditPlugin.INSTANCE
					.getString("_UI_VTCDDiagramMain_type"));

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			//initialObjectField.addModifyListener(validator);
			initialObjectField.setVisible(false);
			containerLabel.setVisible(false);

			testObjectField.setFocus();
			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT 
		 * @author smoreno
		 */
		protected boolean validatePage() {
			return getTestObjectFilename().endsWith(
					VTCDEditPlugin.INSTANCE
							.getString("_UI_VTCDTestObjectFilenameExtension"));
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				} else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * @author smoreno
		 * @return The URI of the Test Object path selected
		 */
		public URI getTestObjectURI() {

			try {
				URIConverter conv = new URIConverterImpl();
				return conv.normalize(URI.createFileURI(testObjectField
						.getText()));
			} catch (Exception exception) {
			}
			return null;
		}

		public String getTestObjectFilename() {
			String testObjectFileName="";
			if(isNewTestObjectSelected())
				testObjectFileName=newTestObjectField.getText();
			else 
				testObjectFileName=testObjectField.getText();
			return testObjectFileName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (Iterator i = getInitialObjectNames().iterator(); i.hasNext();) {
				String name = (String) i.next();
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return VTCDEditPlugin.INSTANCE
						.getString("_UI_" + typeName + "_type"); //$NON-NLS-1$
			} catch (MissingResourceException mre) {
				VTCDEditPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList();
				for (StringTokenizer stringTokenizer = new StringTokenizer(
						VTCDEditPlugin.INSTANCE
								.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens();) //$NON-NLS-1$
				{
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}

		/**
		 * @return Returns the newTestObjectSelected.
		 */
		public boolean isNewTestObjectSelected() {
			return this.newTestObjectSelected;
		}

		/**
		 * @param p_newTestObjectSelected The newTestObjectSelected to set.
		 */
		public void setNewTestObjectSelected(boolean p_newTestObjectSelected) {
			this.newTestObjectSelected = p_newTestObjectSelected;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new VTCDModelWizardNewFileCreationPage(
				"Whatever", selection); //$NON-NLS-1$
		newFileCreationPage.setTitle(VTCDEditPlugin.INSTANCE
				.getString("_UI_VTCDModelWizard_label")); //$NON-NLS-1$
		newFileCreationPage.setDescription(VTCDEditPlugin.INSTANCE
				.getString("_UI_VTCDModelWizard_description")); //$NON-NLS-1$
		newFileCreationPage
				.setFileName(VTCDEditPlugin.INSTANCE
						.getString("_UI_VTCDEditorFilenameDefaultBase") + "." + VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEditorFilenameExtension")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder
						|| selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource
							.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = VTCDEditPlugin.INSTANCE
							.getString("_UI_VTCDEditorFilenameDefaultBase"); //$NON-NLS-1$
					String defaultModelFilenameExtension = VTCDEditPlugin.INSTANCE
							.getString("_UI_VTCDEditorFilenameExtension"); //$NON-NLS-1$
					String modelFilename = defaultModelBaseFilename
							+ "." + defaultModelFilenameExtension; //$NON-NLS-1$
					for (int i = 1; ((IContainer) selectedResource)
							.findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i
								+ "." + defaultModelFilenameExtension; //$NON-NLS-1$
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new VTCDModelWizardInitialObjectCreationPage(
				"Whatever2"); //$NON-NLS-1$
		initialObjectCreationPage.setTitle(VTCDEditPlugin.INSTANCE
				.getString("_UI_VTCDModelWizard_label")); //$NON-NLS-1$
		initialObjectCreationPage.setDescription(VTCDEditPlugin.INSTANCE
				.getString("_UI_Wizard_initial_object_description")); //$NON-NLS-1$
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

	/**
	 * Proxy method
	 * @author smoreno
	 * @return The URI of the selected Test Object
	 */
	public URI getTestObjectURI() {
		return initialObjectCreationPage.getTestObjectURI();
	}

}
