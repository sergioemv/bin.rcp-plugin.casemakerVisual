/**
 * <copyright>
 * </copyright>
 *
 * $Id: VBRVMItemProviderAdapterFactory.java,v 1.2 2005/09/01 22:17:38 hcanedo Exp $
 */
package biz.bi.vbr.vbrvm.provider;

import biz.bi.vbr.vbrvm.util.VBRVMAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VBRVMItemProviderAdapterFactory extends VBRVMAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBRVMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.MainDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainDiagramItemProvider mainDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.MainDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createMainDiagramAdapter() {
		if (mainDiagramItemProvider == null) {
			mainDiagramItemProvider = new MainDiagramItemProvider(this);
		}

		return mainDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRTreeView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRTreeViewItemProvider vbrTreeViewItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRTreeView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRTreeViewAdapter() {
		if (vbrTreeViewItemProvider == null) {
			vbrTreeViewItemProvider = new VBRTreeViewItemProvider(this);
		}

		return vbrTreeViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRElementView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementViewItemProvider vbrElementViewItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRElementView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRElementViewAdapter() {
		if (vbrElementViewItemProvider == null) {
			vbrElementViewItemProvider = new VBRElementViewItemProvider(this);
		}

		return vbrElementViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRElementValueView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementValueViewItemProvider vbrElementValueViewItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRElementValueView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRElementValueViewAdapter() {
		if (vbrElementValueViewItemProvider == null) {
			vbrElementValueViewItemProvider = new VBRElementValueViewItemProvider(
					this);
		}

		return vbrElementValueViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRActionView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRActionViewItemProvider vbrActionViewItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRActionView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRActionViewAdapter() {
		if (vbrActionViewItemProvider == null) {
			vbrActionViewItemProvider = new VBRActionViewItemProvider(this);
		}

		return vbrActionViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementConnectElementValueItemProvider vbrElementConnectElementValueItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRElementConnectElementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRElementConnectElementValueAdapter() {
		if (vbrElementConnectElementValueItemProvider == null) {
			vbrElementConnectElementValueItemProvider = new VBRElementConnectElementValueItemProvider(
					this);
		}

		return vbrElementConnectElementValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementValueConnectElementValueItemProvider vbrElementValueConnectElementValueItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRElementValueConnectElementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRElementValueConnectElementValueAdapter() {
		if (vbrElementValueConnectElementValueItemProvider == null) {
			vbrElementValueConnectElementValueItemProvider = new VBRElementValueConnectElementValueItemProvider(
					this);
		}

		return vbrElementValueConnectElementValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRElementValueConnectActionItemProvider vbrElementValueConnectActionItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRElementValueConnectAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRElementValueConnectActionAdapter() {
		if (vbrElementValueConnectActionItemProvider == null) {
			vbrElementValueConnectActionItemProvider = new VBRElementValueConnectActionItemProvider(
					this);
		}

		return vbrElementValueConnectActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRActionConnectElementValueItemProvider vbrActionConnectElementValueItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRActionConnectElementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRActionConnectElementValueAdapter() {
		if (vbrActionConnectElementValueItemProvider == null) {
			vbrActionConnectElementValueItemProvider = new VBRActionConnectElementValueItemProvider(
					this);
		}

		return vbrActionConnectElementValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBRTreeConnectElementValueItemProvider vbrTreeConnectElementValueItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vbr.vbrvm.VBRTreeConnectElementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVBRTreeConnectElementValueAdapter() {
		if (vbrTreeConnectElementValueItemProvider == null) {
			vbrTreeConnectElementValueItemProvider = new VBRTreeConnectElementValueItemProvider(
					this);
		}

		return vbrTreeConnectElementValueItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class)
					|| (((Class) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (mainDiagramItemProvider != null)
			mainDiagramItemProvider.dispose();
		if (vbrTreeViewItemProvider != null)
			vbrTreeViewItemProvider.dispose();
		if (vbrElementViewItemProvider != null)
			vbrElementViewItemProvider.dispose();
		if (vbrElementValueViewItemProvider != null)
			vbrElementValueViewItemProvider.dispose();
		if (vbrActionViewItemProvider != null)
			vbrActionViewItemProvider.dispose();
		if (vbrElementConnectElementValueItemProvider != null)
			vbrElementConnectElementValueItemProvider.dispose();
		if (vbrElementValueConnectElementValueItemProvider != null)
			vbrElementValueConnectElementValueItemProvider.dispose();
		if (vbrElementValueConnectActionItemProvider != null)
			vbrElementValueConnectActionItemProvider.dispose();
		if (vbrActionConnectElementValueItemProvider != null)
			vbrActionConnectElementValueItemProvider.dispose();
		if (vbrTreeConnectElementValueItemProvider != null)
			vbrTreeConnectElementValueItemProvider.dispose();
	}

}