package biz.bi.vtcd.views;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnLayoutData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.ViewPart;

import biz.bi.cmcore.model.CMCoreFactory;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyCombination;
import biz.bi.cmcore.model.CMProxyDependency;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyElement;
import biz.bi.cmcore.model.CMProxyEquivalenceClass;
import biz.bi.cmcore.model.CMProxyTestObject;
import biz.bi.cmcore.model.commands.CMProxyCommandFactory;
import biz.bi.vtcd.dialogs.VTCDCreateEditEffectDialog;
import biz.bi.vtcd.gef.editors.VTCDCombinationDiagramEditor;
import biz.bi.vtcd.gef.editors.VTCDMainDiagramEditor;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

public class VTCDCauseEffectView extends ViewPart implements IPartListener{
	public static final String view_id = "biz.bi.vtcd.views.VTCDCauseEffectView";
		
	private Table table;

	private TableViewer viewer;

	private IAction m_CreateEffect;
	private IAction m_EditEffect;
	private IAction m_DeleteEffect;
	private CommandStack m_MainCommandStack= null;
	

	private final String columnHeaders[] = {
			VTCDEditPlugin.INSTANCE.getString("_UI_CauseEffect_Name_label"),
			VTCDEditPlugin.INSTANCE
					.getString("_UI_CauseEffect_Description_label"),
			VTCDEditPlugin.INSTANCE.getString("_UI_CauseEffect_Used_label") };

	private ColumnLayoutData columnLayouts[] = { new ColumnWeightData(75),
			new ColumnWeightData(400), new ColumnWeightData(75) };

	private VTCDCauseEffectSorter effectSorter;

	private IAction undoAction;

	private IAction redoAction;

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider{
		Object input;
		public boolean isProxyTestObjectSet(){
			return input instanceof CMProxyTestObject;
		}
		protected Adapter modelListener = new AdapterImpl() {
			public void notifyChanged(Notification msg) {
				handlePropertyChanged(msg);
			}
		};
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput instanceof CMProxyTestObject) {
				CMProxyTestObject proxy = (CMProxyTestObject) newInput;
				input=proxy;
			}
			else{
				
					input= newInput;
			}
			if(oldInput != null) {
				if(m_CreateEffect != null)
					m_CreateEffect.setEnabled(false);
				CMProxyTestObject proxyTO=(CMProxyTestObject)oldInput;
				proxyTO.eAdapters().remove(modelListener);
				for (Iterator iter = proxyTO.getProxyDependency().iterator(); iter.hasNext();) {
					CMProxyDependency element = (CMProxyDependency) iter.next();
					for (Iterator iterator = element.getProxyCombination().iterator(); iterator
							.hasNext();) {
						CMProxyCombination proxyCombination = (CMProxyCombination) iterator.next();
						proxyCombination.eAdapters().remove(modelListener);
					}
				}
				for (Iterator iter = proxyTO.getProxyElement().iterator(); iter.hasNext();) {
					CMProxyElement element = (CMProxyElement) iter.next();
					for (Iterator iterator = element.getProxyEquivalenceClass().iterator(); iterator
							.hasNext();) {
						CMProxyEquivalenceClass proxyEquivalenceClass = (CMProxyEquivalenceClass) iterator.next();
						proxyEquivalenceClass.eAdapters().remove(modelListener);
					}
				}
				for (Iterator iter = proxyTO.getProxyEffect().iterator(); iter.hasNext();) {
					CMProxyEffect effect = (CMProxyEffect) iter.next();
					effect.eAdapters().remove(modelListener);
				}
			}
			if(newInput != null) {
				if(m_CreateEffect != null)
					m_CreateEffect.setEnabled(true);
				CMProxyTestObject proxyTO=(CMProxyTestObject)newInput;
				proxyTO.eAdapters().add(modelListener);
				for (Iterator iter = proxyTO.getProxyDependency().iterator(); iter.hasNext();) {
					CMProxyDependency element = (CMProxyDependency) iter.next();
					for (Iterator iterator = element.getProxyCombination().iterator(); iterator
							.hasNext();) {
						CMProxyCombination proxyCombination = (CMProxyCombination) iterator.next();
						proxyCombination.eAdapters().add(modelListener);
					}
				}
				for (Iterator iter = proxyTO.getProxyElement().iterator(); iter.hasNext();) {
					CMProxyElement element = (CMProxyElement) iter.next();
					for (Iterator iterator = element.getProxyEquivalenceClass().iterator(); iterator
							.hasNext();) {
						CMProxyEquivalenceClass proxyEquivalenceClass = (CMProxyEquivalenceClass) iterator.next();
						proxyEquivalenceClass.eAdapters().add(modelListener);
					}
				}
				for (Iterator iter = proxyTO.getProxyEffect().iterator(); iter.hasNext();) {
					CMProxyEffect effect = (CMProxyEffect) iter.next();
					effect.eAdapters().add(modelListener);
				}
			}
			
		}

		public void dispose() {

		}

		public Object[] getElements(Object parent) {

			if (input instanceof CMProxyTestObject) {
				CMProxyTestObject cmProxyTestObject = (CMProxyTestObject) parent;
				return cmProxyTestObject.getProxyEffect().toArray();
			}
			return new Object[0];
		}
		/**
		 * @param p_msg
		 */
		protected void handlePropertyChanged(Notification p_msg) {
			if (p_msg.getNotifier() instanceof CMProxyTestObject ||
					p_msg.getNotifier() instanceof CMProxyCombination ||
					p_msg.getNotifier() instanceof CMProxyEquivalenceClass || p_msg.getNotifier() instanceof CMProxyEffect)
			if (p_msg.getFeatureID(EClass.class) ==CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT ||
					p_msg.getFeatureID(EClass.class) ==CMCorePackage.CM_PROXY_COMBINATION__PROXY_EFFECT ||
					p_msg.getFeatureID(EClass.class) ==CMCorePackage.CM_PROXY_EQUIVALENCE_CLASS__PROXY_EFFECT ||
					p_msg.getFeatureID(EClass.class) ==CMCorePackage.CM_PROXY_EFFECT__MEFFECT)
			{
				viewer.refresh();
				return;
			}
		}

	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			if (obj instanceof CMProxyEffect) {
				CMProxyEffect cmProxyEffect = (CMProxyEffect) obj;
				if (index == 0) {
					return cmProxyEffect.getName();
				}
				if (index == 1) {
					return cmProxyEffect.getDescription();
				}
				if (index == 2) {
					return Boolean.toString(cmProxyEffect.isUsed()); 
				}
				return "";
			} else {
				return "";
			}

		}

		public Image getColumnImage(Object obj, int index) {
			return null;// getImage(obj);
		}
	}



	/**
	 * The constructor.
	 */
	public VTCDCauseEffectView() {
	}

	void createTable(Composite parent) {
		table = new Table(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE
				| SWT.FULL_SELECTION);
		table.setLinesVisible(true);
	/*	SelectionListener rowListener = new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 *
			public void widgetSelected(SelectionEvent p_e) {
				System.out.println(p_e.getSource());
				super.widgetSelected(p_e);
			}
		};
		table.addSelectionListener(rowListener);*/
	}

	void createColumns() {
		SelectionListener headerListener = new SelectionAdapter() {
			/**
			 * Handles the case of user selecting the header area.
			 * <p>
			 * If the column has not been selected previously, it will set the
			 * sorter of that column to be the current tasklist sorter. Repeated
			 * presses on the same column header will toggle sorting order
			 * (ascending/descending).
			 */
			public void widgetSelected(SelectionEvent e) {
				
//				 column selected - first column doesn't count
                int column = table.indexOf((TableColumn) e.widget) ;
                if (column == effectSorter.getTopPriority())
                    effectSorter.reverseTopPriority();
                else {
                    effectSorter.setTopPriority(column);
                }
                viewer.refresh();
            }
			
		};

		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		for (int i = 0; i < columnHeaders.length; i++) {
			layout.addColumnData(columnLayouts[i]);
			TableColumn tc = new TableColumn(table, SWT.NONE, i);
			tc.setResizable(columnLayouts[i].resizable);
			tc.setText(columnHeaders[i]);
			tc.addSelectionListener(headerListener);
		}
	}


	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		createTable(parent);
		viewer = new TableViewer(table);
		createColumns();
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		effectSorter=new VTCDCauseEffectSorter();
		viewer.setSorter(effectSorter);
	/*	if (getViewSite().getPage().getActiveEditor() instanceof VTCDMainDiagramEditor) {
			VTCDMainDiagramEditor mainEditor = (VTCDMainDiagramEditor) getViewSite().getPage().getActiveEditor();
			viewer.setInput(mainEditor.getM_VTCDDiagramMain().getM_TestObject());
		}
		else if (getViewSite().getPage().getActiveEditor() instanceof VTCDCombinationDiagramEditor)
		{
			VTCDCombinationDiagramEditor combinationEditor=(VTCDCombinationDiagramEditor)getViewSite().getPage().getActiveEditor();
			VTCDMainDiagramEditor mainEditor =combinationEditor.getMainDiagramEditor();
			CMProxyTestObject to=mainEditor.getM_VTCDDiagramMain().getM_TestObject();
			viewer.setInput(to);
			viewer.refresh();
		}
		else
			viewer.setInput(getViewSite());*/
		setGlobalActionsAndCommandStack();
		getViewSite().getPage().addPartListener(this);
		createActions();
		hookContextMenu();
		contributeToActionBars();
		hookGlobalActions();
		
	}

	private void setGlobalActionsAndCommandStack(){
		IWorkbenchPart p_part=getViewSite().getPage().getActiveEditor();
		if (p_part instanceof VTCDMainDiagramEditor) {
			VTCDMainDiagramEditor mainEditor = (VTCDMainDiagramEditor) p_part;
			CMProxyTestObject to=mainEditor.getM_VTCDDiagramMain().getM_TestObject();
			m_MainCommandStack= mainEditor.getMainCommandStack();
			redoAction=mainEditor.getActionRegistry().getAction(ActionFactory.REDO.getId());
			undoAction=mainEditor.getActionRegistry().getAction(ActionFactory.UNDO.getId());
			viewer.setInput(to);
			viewer.refresh();
		}
		else if (p_part instanceof VTCDCombinationDiagramEditor)
		{
			VTCDCombinationDiagramEditor combinationEditor=(VTCDCombinationDiagramEditor)p_part;
			VTCDMainDiagramEditor mainEditor =combinationEditor.getMainDiagramEditor();
			CMProxyTestObject to=mainEditor.getM_VTCDDiagramMain().getM_TestObject();
			m_MainCommandStack=mainEditor.getMainCommandStack();
			redoAction=mainEditor.getActionRegistry().getAction(ActionFactory.REDO.getId());
			undoAction=mainEditor.getActionRegistry().getAction(ActionFactory.UNDO.getId());
			viewer.setInput(to);
			viewer.refresh();
		}
		else{
			viewer.setInput(null);
			
		}
			
	}
	/**
	 * 
	 */
	private void createActions() {
		m_CreateEffect= new Action(){
			public void run() {
				Shell parentShell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				String createLabel=VTCDEditPlugin.INSTANCE.getString("_UI_New_CauseEffect_label");
				Image titleImage=VTCDImages.getImage(VTCDImages.NEW_CAUSE_EFFECT_ICON);	
				VTCDCreateEditEffectDialog cmd= new VTCDCreateEditEffectDialog(parentShell, createLabel, titleImage);
				cmd.create();
				cmd.open();
				boolean okSelected=cmd.isOkSelected();
				if (okSelected) {
					if(m_MainCommandStack != null){
						CMProxyTestObject proxyTestObject=(CMProxyTestObject) viewer.getInput();
						CMProxyEffect proxyEffect=CMCoreFactory.eINSTANCE.createCMProxyEffect();
						Command commandCreate= CMProxyCommandFactory.INSTANCE.createAddProxyEffectCommand(proxyTestObject, proxyEffect);
						String effectDescription= cmd.getDescription();
						Command commandChangeDescription=CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(proxyEffect, effectDescription);
						CompoundCommand cCommand=new CompoundCommand();
						cCommand.add(commandCreate);
						cCommand.add(commandChangeDescription);
						m_MainCommandStack.execute(cCommand);
						viewer.refresh();
					}
				}
			}
		};
		m_CreateEffect.setText(VTCDEditPlugin.INSTANCE
				.getString("_UI_New_CauseEffect_label"));
		m_CreateEffect.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_New_CauseEffect_label"));
		m_CreateEffect.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.NEW_CAUSE_EFFECT_ICON));
		if(((ViewContentProvider)viewer.getContentProvider()).isProxyTestObjectSet())
			m_CreateEffect.setEnabled(true);
		else
			m_CreateEffect.setEnabled(false);
		m_DeleteEffect= new Action(){
			public void run() {
				Shell parentShell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				String deleteLabel=VTCDEditPlugin.INSTANCE.getString("_UI_Delete_CauseEffect_label");
				String messageDelete=VTCDEditPlugin.INSTANCE.getString("_UI_Delete_Confirmation_Message");
				boolean okSelected=MessageDialog.openConfirm(parentShell, deleteLabel, messageDelete);
				if(okSelected){
					TableItem[] selected=table.getSelection();
					if(selected[0].getData() instanceof CMProxyEffect){
						CMProxyEffect proxyEffect= (CMProxyEffect) selected[0].getData();
						CompoundCommand cc= new CompoundCommand();
						for (Iterator iter = proxyEffect.getProxyCombination().iterator(); iter
								.hasNext();) {
							CMProxyCombination combination = (CMProxyCombination) iter.next();
							Command c=CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromCombinationCommand(combination,proxyEffect);
							cc.add(c);
						}
						for (Iterator iter = proxyEffect.getProxyEquivalenceClass().iterator(); iter
								.hasNext();) {
							CMProxyEquivalenceClass equivalenceClass = (CMProxyEquivalenceClass) iter.next();
							Command c= CMProxyCommandFactory.INSTANCE.createRemoveProxyEffectFromEquivalenceCommand(equivalenceClass,proxyEffect);
							cc.add(c);
						}
						Command commandDeleteEffect=CMProxyCommandFactory.INSTANCE.createDeleteProxyEffectCommand(proxyEffect);
						cc.add(commandDeleteEffect);
						m_MainCommandStack.execute(cc);
						viewer.refresh();
					}
				}
			}
		};
		m_DeleteEffect.setText(VTCDEditPlugin.INSTANCE
				.getString("_UI_Delete_CauseEffect_label"));
		m_DeleteEffect.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_Delete_CauseEffect_label"));
		m_DeleteEffect.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.DELETE_CAUSE_EFFECT_ICON));
		m_DeleteEffect.setEnabled(false);
		
		m_EditEffect= new Action(){
			public void run() {
				Shell parentShell=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				String editLabel=VTCDEditPlugin.INSTANCE.getString("_UI_Edit_CauseEffect_label");
				Image titleImage=VTCDImages.getImage(VTCDImages.EDIT_CAUSE_EFFECT_ICON);	
				VTCDCreateEditEffectDialog cmd= new VTCDCreateEditEffectDialog(parentShell, editLabel, titleImage);
				TableItem[] selected=table.getSelection();
				cmd.create();
				if(selected[0].getData() instanceof CMProxyEffect){
					CMProxyEffect proxyEffect= (CMProxyEffect) selected[0].getData();
					String description =proxyEffect.getDescription();
					cmd.setDescription(description);
					String name=proxyEffect.getName();
					cmd.setName(name);
				}
				cmd.open();
				boolean okSelected=cmd.isOkSelected();
				if (okSelected) {
					String effectDescription= cmd.getDescription();
					if(selected[0].getData() instanceof CMProxyEffect){
						CMProxyEffect proxyEffect= (CMProxyEffect) selected[0].getData();
						Command commandChangeDescription=CMProxyCommandFactory.INSTANCE.createChangeDescriptionCommand(proxyEffect, effectDescription);
						m_MainCommandStack.execute(commandChangeDescription);
						viewer.refresh();
					}
				}
			}
			
		};
		m_EditEffect.setText(VTCDEditPlugin.INSTANCE
				.getString("_UI_Edit_CauseEffect_label"));
		m_EditEffect.setToolTipText(VTCDEditPlugin.INSTANCE
				.getString("_UI_Edit_CauseEffect_label"));
		m_EditEffect.setImageDescriptor(VTCDImages.getImageDescriptor(VTCDImages.EDIT_CAUSE_EFFECT_ICON));
		m_EditEffect.setEnabled(false);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
                              
			public void selectionChanged(SelectionChangedEvent p_event) {
				 updateActionEnablement();
			}
		});
	
	}

	/**
	 * 
	 */
	protected void updateActionEnablement() {
		IStructuredSelection sel = (IStructuredSelection)viewer.getSelection();
		m_DeleteEffect.setEnabled(sel.size() > 0);
		m_EditEffect.setEnabled(sel.size() > 0);
	}

	/**
	 * 
	 */
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				VTCDCauseEffectView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void hookGlobalActions() {
        IActionBars bars = getViewSite().getActionBars();
        bars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
           bars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
   }

	/**
	 * 
	 */
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	/**
	 * @param p_toolBarManager
	 */
	private void fillLocalToolBar(IToolBarManager p_toolBarManager) {
		p_toolBarManager.add(m_CreateEffect);
		p_toolBarManager.add(m_EditEffect);
		p_toolBarManager.add(m_DeleteEffect);
	//	p_toolBarManager.add(undoAction);
		//p_toolBarManager.add(redoAction);

	}

	/**
	 * @param p_menuManager
	 */
	private void fillLocalPullDown(IMenuManager p_menuManager) {
		p_menuManager.add(m_CreateEffect);
		p_menuManager.add(m_EditEffect);
		p_menuManager.add(m_DeleteEffect);
	//	p_menuManager.add(undoAction);
		//p_menuManager.add(redoAction);
		
	}

	/**
	 * @param p_manager
	 */
	protected void fillContextMenu(IMenuManager p_manager) {
		p_manager.add(m_CreateEffect);
		p_manager.add(m_EditEffect);
		p_manager.add(m_DeleteEffect);
//		p_manager.add(undoAction);
	//	p_manager.add(redoAction);
		p_manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	public void dispose() {
		getViewSite().getPage().removePartListener(this);
		super.dispose();
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}



	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partActivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partActivated(IWorkbenchPart p_part) {
		if (p_part instanceof VTCDMainDiagramEditor) {
			VTCDMainDiagramEditor mainEditor = (VTCDMainDiagramEditor) p_part;
			CMProxyTestObject to=mainEditor.getM_VTCDDiagramMain().getM_TestObject();
			m_MainCommandStack= mainEditor.getMainCommandStack();
			redoAction=mainEditor.getActionRegistry().getAction(ActionFactory.REDO.getId());
			undoAction=mainEditor.getActionRegistry().getAction(ActionFactory.UNDO.getId());
			viewer.setInput(to);
			viewer.refresh();
			hookGlobalActions();

			
		}
		if (p_part instanceof VTCDCombinationDiagramEditor)
		{
			VTCDCombinationDiagramEditor combinationEditor=(VTCDCombinationDiagramEditor)p_part;
			VTCDMainDiagramEditor mainEditor =combinationEditor.getMainDiagramEditor();
			CMProxyTestObject to=mainEditor.getM_VTCDDiagramMain().getM_TestObject();
			m_MainCommandStack=mainEditor.getMainCommandStack();
			redoAction=mainEditor.getActionRegistry().getAction(ActionFactory.REDO.getId());
			undoAction=mainEditor.getActionRegistry().getAction(ActionFactory.UNDO.getId());
			viewer.setInput(to);
			viewer.refresh();
			hookGlobalActions();
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partBroughtToTop(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partBroughtToTop(IWorkbenchPart p_part) {

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partClosed(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partClosed(IWorkbenchPart p_part) {
		if (p_part instanceof VTCDMainDiagramEditor || p_part instanceof VTCDCombinationDiagramEditor) {
			IEditorPart activeEditor=getSite().getPage().getActiveEditor();
			if(!(activeEditor instanceof  VTCDMainDiagramEditor) && !(activeEditor instanceof VTCDCombinationDiagramEditor))
				viewer.setInput(null);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partDeactivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partDeactivated(IWorkbenchPart p_part) {
	   /* if (p_part instanceof VTCDMainDiagramEditor || p_part instanceof VTCDCombinationDiagramEditor) {
			viewer.setInput(null);
		}*/
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPartListener#partOpened(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partOpened(IWorkbenchPart p_part) {
			
	}
}