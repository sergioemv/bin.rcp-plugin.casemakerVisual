/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMModelWizard.java,v 1.13 2005/09/20 19:03:42 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.presentation;

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
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
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
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
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

import biz.bi.vbr.FormalPolicy;
import biz.bi.vbr.VBRFactory;
import biz.bi.vbr.VBRPackage;
import biz.bi.vbr.impl.BusinessObjectImpl;
import biz.bi.vbr.impl.BusinessValueImpl;
import biz.bi.vbr.impl.InferenceRuleImpl;
import biz.bi.vbr.presentation.VBRModelWizard.VBRModelWizardNewFileCreationPage;
import biz.bi.vbr.provider.VBRModelEditPlugin;
import biz.bi.vbr.vbrvm.MainDiagram;
import biz.bi.vbr.vbrvm.VBRVMFactory;
import biz.bi.vbr.vbrvm.VBRVMPackage;
import biz.bi.vbr.vbrvm.impl.VBRVMFactoryImpl;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VBRVMModelWizard extends Wizard implements INewWizard {
	/** 
	 * @generated NOT
	 */
	public String textDirectory;

	/** 
	 * @generated NOT
	 */
	protected Text importFileField;

	/**
	 * @generated NOT
	 */
	protected Text newFileField;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String ruta;

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
	protected VBRVMPackage vbrvmPackage = VBRVMPackage.eINSTANCE;

	/**
	 * This caches an instance of the  business model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected VBRPackage vbrPackage = VBRPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected VBRFactory vbrFactory = vbrPackage.getVBRFactory();

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRVMFactory vbrvmFactory = vbrvmPackage.getVBRVMFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRVMModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected VBRModelWizardNewFileCreationPage newFileVBRCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRVMModelWizardInitialObjectCreationPage initialObjectCreationPage;

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
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected List businessModelObjectNames;

	/**
	 * @author cmendezroca
	 * @genetated NOT
	 */
	protected FormalPolicy rootModObject;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(VBRModelEditPlugin.INSTANCE
				.getString("_UI_Wizard_label")); //$NON-NLS-1$
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(VBRModelEditPlugin.INSTANCE
						.getImage("full/wizban/NewVBRVM"))); //$NON-NLS-1$
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
			for (Iterator classifiers = vbrvmPackage.getEClassifiers()
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
	 * Returns the names of the types that can be created as the root object itn this case must be Formal Policy.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author cmendezroca
	 * @generated NOT
	 */
	protected Collection getbusinessModelObjectNames() {
		if (businessModelObjectNames == null) {
			businessModelObjectNames = new ArrayList();
			for (Iterator classifiers = vbrPackage.getEClassifiers().iterator(); classifiers
					.hasNext();) {
				EClassifier eClassifier = (EClassifier) classifiers.next();
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						businessModelObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(businessModelObjectNames, java.text.Collator
					.getInstance());
		}
		return businessModelObjectNames;
	}

	/**
	 * Create a new model. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author cmendezroca
	 * @generated NOT
	 */
	protected MainDiagram createInitialModel() {
		EClass eClass = (EClass) vbrvmPackage
				.getEClassifier(initialObjectCreationPage
						.getInitialObjectName());

		MainDiagram rootObject = (MainDiagram) vbrvmFactory.create(eClass);
		rootObject.setM_vbrObject(rootModObject);
		return rootObject;
	}

	/**
	 * Create a new Business model. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author cmendezroca
	 * @generated NOT
	 */
	protected FormalPolicy createBusinessModel() {
		EClass eClass = (EClass) vbrPackage
				.getEClassifier(initialObjectCreationPage
						.getBusinessObjectName());
		EObject rootModObject = vbrFactory.create(eClass);
		return (FormalPolicy) rootModObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author cmendezroca
	 * @generated NOT
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
						String vacio = "";
						if (newFileField.getText().equals(vacio)) {
							String importField = importFileField.getText();
							ruta = importField.trim();

						} else {
							if (importFileField.getText().equals(vacio)) {
								//desde aqui solo sirve para la creacion del Nuevo archivo .vbr
								URI rootPath = URI
										.createPlatformResourceURI(modelFile
												.getParent().toString());
								String strRootPath = rootPath.toString();
								int root = strRootPath.length();
								root = root - 1;
								ruta = fileURI.toString();
								String fileName = ruta.substring(root, ruta
										.length() - 5);
								fileName = fileName.trim();
								String dir = textDirectory + "\\" + fileName;
								ruta = dir
										.concat(VBRModelEditPlugin.INSTANCE
												.getString("_UI_VBREditorFilenameExtension"));
								ruta = ruta.trim();
							}
						}
						//  URI rutaURI = URI.createFileURI(ruta);
						//String fragId = ("#loc");
						String addschem = "file:/" + ruta;//+ fragId;
						addschem = addschem.replace('\\', '/');
						String schem = null;
						String dev = "";
						String auth = "";
						String[] seg = null;
						String qry = "";
						String frag = "";
						boolean Sw = true;
						if (Sw) {
							URI rutaURI = URI.createURI(addschem);
							schem = rutaURI.scheme();
							dev = rutaURI.device();
							auth = rutaURI.authority();
							seg = rutaURI.segments();
							qry = rutaURI.query();
							Sw = false;
						}

						URI rutaURIh = URI.createHierarchicalURI(schem, auth,
								dev, seg, qry, frag);

						Resource resourceRUTA = resourceSet
								.createResource(rutaURIh);

						if (!importFileField.getText().equals(vacio)) {
							rootModObject = (FormalPolicy) VBRVMFactoryImpl
							//.createbmFormalPolicyFromString2(
									.createBMFormalPolicyFromString2(
											VBRVMPackage.eINSTANCE
													.getBMFormalPolicy(), ruta);
							rootModObject.setUniqueId(addschem);

							EList obj = rootModObject.getM_BusinessObject();//.iterator().next();

							for (Iterator iter = obj.listIterator(); iter
									.hasNext();) {
								Object conteinment = iter.next();
								BusinessObjectImpl bo = (BusinessObjectImpl) conteinment;
								int valueSize = (int) bo.getM_BusinessValue()
										.size();
								//boolean a = value!=0;
								if (valueSize != 0) {
									EList bvalues = bo.getM_BusinessValue();
									int i = 0;
									for (Iterator iterbv = bvalues
											.listIterator(); (i != valueSize); i++) {
										Object cont = iterbv.next();
										BusinessValueImpl bv = (BusinessValueImpl) cont;
										EList infRu = bv.getM_InferenceRule();
										int infSize = (int) bv
												.getM_InferenceRule().size();
										int t = 0;
										if (infSize != 0) {
											for (Iterator iterInfR = infRu
													.listIterator(); (t != infSize); t++) {
												Object contir = iterInfR.next();
												InferenceRuleImpl ir = (InferenceRuleImpl) contir;
												if (ir.getTruePart() != null) {
												}
												if (ir.getFalsePart() != null) {

												}
											}
										}
									}
								}
							}

						} else {
							rootModObject = createBusinessModel();
							rootModObject.setUniqueId(addschem);
						}
						if (rootModObject != null) {
							resourceRUTA.getContents().add(rootModObject);
						}

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.

						//
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
							//resource.getContents().add(rootObject); ANTES SOLO ESTO
							MainDiagram mian = (MainDiagram) rootObject;
							mian.setM_vbrObject(rootModObject);
							resource.getContents().add(mian);
						}

						// Save the contents of the resource to the file system.
						//

						Map options = new HashMap();
						options.put(XMLResource.OPTION_ENCODING,
								initialObjectCreationPage.getEncoding());
						resource.save(options);

						Map optionBM = new HashMap();
						optionBM.put(XMLResource.OPTION_ENCODING,
								initialObjectCreationPage.getEncoding());
						resourceRUTA.save(optionBM);
						//resourceRUTA.load(optionBM);

					} catch (Exception exception) {
						VBRModelEditPlugin.INSTANCE.log(exception);
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
								VBRModelEditPlugin.INSTANCE
										.getString("_UI_OpenEditorError_label"), exception.getMessage()); //$NON-NLS-1$
				return false;
			}

			return true;
		} catch (Exception exception) {
			VBRModelEditPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class VBRVMModelWizardNewFileCreationPage extends
			WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public VBRVMModelWizardNewFileCreationPage(String pageId,
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
				// Make sure the file ends in ".vbrvm".
				//
				String requiredExt = VBRModelEditPlugin.INSTANCE
						.getString("_UI_VBRVMEditorFilenameExtension"); //$NON-NLS-1$
				String enteredExt = new Path(getFileName()).getFileExtension();
				if (enteredExt == null || !enteredExt.equals(requiredExt)) {
					setErrorMessage(VBRModelEditPlugin.INSTANCE
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
	 * @generated
	 */
	public class VBRVMModelWizardInitialObjectCreationPage extends WizardPage {

		/** 
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Button newRadioB;

		/** 
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Button FileURIBrowseFileSystemButton;

		/** 
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Button FileURINewBrowseFileSystemButton;

		/** 
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public Button existRadioB;

		/** 
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected Combo businessModelObjectField;

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

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public VBRVMModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/** 
		 * @author cmendezroca
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */

		public void createControl(Composite parent) {

			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 16;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			// desde este comentario hasta el siguiente es new	

			newRadioB = new Button(composite, SWT.RADIO);
			final GridData gridData2 = new GridData(
					GridData.HORIZONTAL_ALIGN_FILL);
			newRadioB.setLayoutData(gridData2);
			newRadioB.setText(VBRModelEditPlugin.INSTANCE
					.getString("_UI_NEWRadioButton_label"));
			newRadioB.addSelectionListener(validatorCheck);

			Composite VBRNewObjectComposite = new Composite(composite, SWT.NONE);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.END;
				VBRNewObjectComposite.setLayoutData(data);

				GridLayout layout = new GridLayout();
				data.horizontalAlignment = GridData.FILL;
				layout.marginHeight = 0;
				layout.marginWidth = 0;
				layout.numColumns = 2;
				VBRNewObjectComposite.setLayout(layout);
			}

			newFileField = new Text(VBRNewObjectComposite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.horizontalSpan = 1;
				newFileField.setLayoutData(data);
			}
			newFileField.addModifyListener(validator);

			FileURINewBrowseFileSystemButton = new Button(
					VBRNewObjectComposite, SWT.PUSH);
			FileURINewBrowseFileSystemButton
					.setText(VBRModelEditPlugin.INSTANCE
							.getString("_UI_Browse_label")); //$NON-NLS-1$

			FileURINewBrowseFileSystemButton
					.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent event) {
							DirectoryDialog dir = new DirectoryDialog(workbench
									.getDisplay().getActiveShell());
							dir
									.setText(VBRModelEditPlugin.INSTANCE
											.getString("_UI_VBROptionNewFileDialogTitle"));
							String DirectoryFilePath = dir.open();
							newFileField.setText(DirectoryFilePath);
							textDirectory = newFileField.getText();
						}
					});
			newFileField.setFocus();

			existRadioB = new Button(composite, SWT.RADIO);
			final GridData gridData3 = new GridData(
					GridData.HORIZONTAL_ALIGN_FILL);
			existRadioB.setLayoutData(gridData3);
			existRadioB.setText(VBRModelEditPlugin.INSTANCE
					.getString("_UI_EXISTENTRadioButton_label"));
			existRadioB.addSelectionListener(validatorCheck);

			final Label label1 = new Label(composite, SWT.NONE);
			final GridData gridData1 = new GridData(
					GridData.HORIZONTAL_ALIGN_FILL);
			label1.setLayoutData(gridData1);
			label1.setText(VBRModelEditPlugin.INSTANCE
					.getString("_UI_ImportVBRObject_label"));

			Composite VBRObjectComposite = new Composite(composite, SWT.NONE);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.END;
				VBRObjectComposite.setLayoutData(data);

				GridLayout layout = new GridLayout();
				data.horizontalAlignment = GridData.FILL;
				layout.marginHeight = 0;
				layout.marginWidth = 0;
				layout.numColumns = 2;
				VBRObjectComposite.setLayout(layout);
			}

			importFileField = new Text(VBRObjectComposite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.horizontalSpan = 1;
				importFileField.setLayoutData(data);
			}
			importFileField.addModifyListener(validator);

			FileURIBrowseFileSystemButton = new Button(VBRObjectComposite,
					SWT.PUSH);
			FileURIBrowseFileSystemButton.setText(VBRModelEditPlugin.INSTANCE
					.getString("_UI_Browse_label")); //$NON-NLS-1$

			FileURIBrowseFileSystemButton
					.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent event) {
							String fileExtension = VBRModelEditPlugin.INSTANCE
									.getString("_UI_VBRFileExtension"); //$NON-NLS-1$
							FileDialog fd = new FileDialog(workbench
									.getDisplay().getActiveShell(), SWT.OPEN);
							fd.setText(VBRModelEditPlugin.INSTANCE
									.getString("_UI_VBRFileOpenDialogTitle"));
							String[] filterExt = { "*." + fileExtension };
							fd.setFilterExtensions(filterExt);
							String filePath = fd.open();

							if (filePath != null) {
								if (!filePath.endsWith("." + fileExtension)) //$NON-NLS-1$
								{
									filePath = filePath + "." + fileExtension; //$NON-NLS-1$
								}
								importFileField.setText(filePath);
							}
						}
					});
			importFileField.setFocus();

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(VBRModelEditPlugin.INSTANCE
						.getString("_UI_XMLEncoding")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingLabel.setVisible(false);

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

			//encodingField.select(0);
			//5 = ISO 
			encodingField.select(5);
			encodingField.addModifyListener(validator);
			encodingField.setVisible(false);
			// El siguiente crea el label Model Object 

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(VBRModelEditPlugin.INSTANCE
						.getString("_UI_ModelObject")); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			//La siguiente linea ni hace visible la etiquete que dice Model Object
			containerLabel.setVisible(false);

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			/* 
			 // Carga todos los model objects; pero ahora ya no es necesario 
			 * por que solo interesa el el Main diagram 
			 for (Iterator i = getInitialObjectNames().iterator(); i.hasNext();) {
			 initialObjectField.add(getLabel((String) i.next()));
			 }
			 */

			initialObjectField.add(VBRModelEditPlugin.INSTANCE
					.getString("_UI_MainDiagram_type"));

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			//initialObjectField.addModifyListener(validator);
			//Se aumento la sigte linea para que no sea visible el combo que tiene los datos VBR Action View, etc.
			initialObjectField.setVisible(false);

			// businessModelObjectField correspondiente al VBR Business Model formal policy
			businessModelObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				businessModelObjectField.setLayoutData(data);
			}

			/*
			 for (Iterator i = getbusinessModelObjectNames().iterator(); i.hasNext();) {
			 businessModelObjectField.add(getLabel((String) i.next()));
			 } */
			businessModelObjectField.add(VBRModelEditPlugin.INSTANCE
					.getString("_UI_FormalPolicy_type"));

			if (businessModelObjectField.getItemCount() == 1) {
				businessModelObjectField.select(0);
			}
			businessModelObjectField.setVisible(false);

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
		 * @author cmendezroca
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected SelectionListener validatorCheck = new SelectionListener() {

			public void widgetSelected(SelectionEvent p_e) {
				//TODO Auto-generated method stub 
				setPageComplete(validatePage());

				importFileField.setEnabled(!newRadioB.getSelection());
				FileURIBrowseFileSystemButton.setEnabled(!newRadioB
						.getSelection());
				if (importFileField.getEnabled() == false) {
					importFileField.setText("");
				}

				newFileField.setEnabled(!existRadioB.getSelection());
				FileURINewBrowseFileSystemButton.setEnabled(!existRadioB
						.getSelection());
				if (newFileField.getEnabled() == false) {
					newFileField.setText("");
				}
			}

			public void widgetDefaultSelected(SelectionEvent p_e) {
				//TODO Auto-generated method stub

			}
		};

		/**
		 * @author cmendezroca
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean validatePage() {

			return getVBRObjectFilename().endsWith(
					VBRModelEditPlugin.INSTANCE
							.getString("_UI_VBRFileExtension"))
					|| newRadioB.getSelection();
		}

		/**
		 * @author cmendezroca
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public String getVBRObjectFilename() {
			return importFileField.getText();
		}

		/**
		 * 
		 *@author cmendezroca
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.select(2);
					initialObjectField.clearSelection();
					encodingField.setFocus();
				} else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
			if (visible) {
				if (businessModelObjectField.getItemCount() == 1) {
					businessModelObjectField.select(2);
					businessModelObjectField.clearSelection();
					encodingField.setFocus();
				} else {
					encodingField.clearSelection();
					businessModelObjectField.setFocus();
				}
			}

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
		 * @author cmendezroca
		 * @generated NOT
		 */
		public String getBusinessObjectName() {
			String label = businessModelObjectField.getText();

			for (Iterator i = getbusinessModelObjectNames().iterator(); i
					.hasNext();) {
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
				return VBRModelEditPlugin.INSTANCE
						.getString("_UI_" + typeName + "_type"); //$NON-NLS-1$
			} catch (MissingResourceException mre) {
				VBRModelEditPlugin.INSTANCE.log(mre);
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
						VBRModelEditPlugin.INSTANCE
								.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens();) //$NON-NLS-1$
				{
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
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
		newFileCreationPage = new VBRVMModelWizardNewFileCreationPage(
				"Whatever", selection); //$NON-NLS-1$
		newFileCreationPage.setTitle(VBRModelEditPlugin.INSTANCE
				.getString("_UI_VBRVMModelWizard_label")); //$NON-NLS-1$
		newFileCreationPage.setDescription(VBRModelEditPlugin.INSTANCE
				.getString("_UI_VBRVMModelWizard_description")); //$NON-NLS-1$
		newFileCreationPage
				.setFileName(VBRModelEditPlugin.INSTANCE
						.getString("_UI_VBRVMEditorFilenameDefaultBase") + "." + VBRModelEditPlugin.INSTANCE.getString("_UI_VBRVMEditorFilenameExtension")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
					String defaultModelBaseFilename = VBRModelEditPlugin.INSTANCE
							.getString("_UI_VBRVMEditorFilenameDefaultBase"); //$NON-NLS-1$
					String defaultModelFilenameExtension = VBRModelEditPlugin.INSTANCE
							.getString("_UI_VBRVMEditorFilenameExtension"); //$NON-NLS-1$
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
		initialObjectCreationPage = new VBRVMModelWizardInitialObjectCreationPage(
				"Whatever2"); //$NON-NLS-1$
		initialObjectCreationPage.setTitle(VBRModelEditPlugin.INSTANCE
				.getString("_UI_VBRVMModelWizard_label")); //$NON-NLS-1$
		initialObjectCreationPage.setDescription(VBRModelEditPlugin.INSTANCE
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

}
