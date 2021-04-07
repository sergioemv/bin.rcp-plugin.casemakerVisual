/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDItemProviderAdapterFactory.java,v 1.3 2005/06/29 20:45:06 smoreno Exp $
 */
package biz.bi.vtcd.provider;

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

import biz.bi.vtcd.model.util.VTCDAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDItemProviderAdapterFactory extends VTCDAdapterFactory
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
	public VTCDItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDDiagramCombination} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDDiagramCombinationItemProvider vtcdDiagramCombinationItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDDiagramCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDDiagramCombinationAdapter() {
		if (vtcdDiagramCombinationItemProvider == null) {
			vtcdDiagramCombinationItemProvider = new VTCDDiagramCombinationItemProvider(
					this);
		}

		return vtcdDiagramCombinationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDDiagramMain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDDiagramMainItemProvider vtcdDiagramMainItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDDiagramMain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDDiagramMainAdapter() {
		if (vtcdDiagramMainItemProvider == null) {
			vtcdDiagramMainItemProvider = new VTCDDiagramMainItemProvider(this);
		}

		return vtcdDiagramMainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDFigureCombination} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureCombinationItemProvider vtcdFigureCombinationItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDFigureCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDFigureCombinationAdapter() {
		if (vtcdFigureCombinationItemProvider == null) {
			vtcdFigureCombinationItemProvider = new VTCDFigureCombinationItemProvider(
					this);
		}

		return vtcdFigureCombinationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDFigureElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureElementItemProvider vtcdFigureElementItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDFigureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDFigureElementAdapter() {
		if (vtcdFigureElementItemProvider == null) {
			vtcdFigureElementItemProvider = new VTCDFigureElementItemProvider(
					this);
		}

		return vtcdFigureElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDFigureDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureDependencyItemProvider vtcdFigureDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDFigureDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDFigureDependencyAdapter() {
		if (vtcdFigureDependencyItemProvider == null) {
			vtcdFigureDependencyItemProvider = new VTCDFigureDependencyItemProvider(
					this);
		}

		return vtcdFigureDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDFigureEquivalenceClassItemProvider vtcdFigureEquivalenceClassItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDFigureEquivalenceClassAdapter() {
		if (vtcdFigureEquivalenceClassItemProvider == null) {
			vtcdFigureEquivalenceClassItemProvider = new VTCDFigureEquivalenceClassItemProvider(
					this);
		}

		return vtcdFigureEquivalenceClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDLinkDependencyElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDLinkDependencyElementItemProvider vtcdLinkDependencyElementItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDLinkDependencyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDLinkDependencyElementAdapter() {
		if (vtcdLinkDependencyElementItemProvider == null) {
			vtcdLinkDependencyElementItemProvider = new VTCDLinkDependencyElementItemProvider(
					this);
		}

		return vtcdLinkDependencyElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDLinkCombinationEClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDLinkCombinationEClassItemProvider vtcdLinkCombinationEClassItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDLinkCombinationEClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDLinkCombinationEClassAdapter() {
		if (vtcdLinkCombinationEClassItemProvider == null) {
			vtcdLinkCombinationEClassItemProvider = new VTCDLinkCombinationEClassItemProvider(
					this);
		}

		return vtcdLinkCombinationEClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link biz.bi.vtcd.model.VTCDNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCDNoteItemProvider vtcdNoteItemProvider;

	/**
	 * This creates an adapter for a {@link biz.bi.vtcd.model.VTCDNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVTCDNoteAdapter() {
		if (vtcdNoteItemProvider == null) {
			vtcdNoteItemProvider = new VTCDNoteItemProvider(this);
		}

		return vtcdNoteItemProvider;
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
		if (vtcdDiagramCombinationItemProvider != null)
			vtcdDiagramCombinationItemProvider.dispose();
		if (vtcdDiagramMainItemProvider != null)
			vtcdDiagramMainItemProvider.dispose();
		if (vtcdFigureCombinationItemProvider != null)
			vtcdFigureCombinationItemProvider.dispose();
		if (vtcdFigureElementItemProvider != null)
			vtcdFigureElementItemProvider.dispose();
		if (vtcdFigureDependencyItemProvider != null)
			vtcdFigureDependencyItemProvider.dispose();
		if (vtcdFigureEquivalenceClassItemProvider != null)
			vtcdFigureEquivalenceClassItemProvider.dispose();
		if (vtcdLinkDependencyElementItemProvider != null)
			vtcdLinkDependencyElementItemProvider.dispose();
		if (vtcdLinkCombinationEClassItemProvider != null)
			vtcdLinkCombinationEClassItemProvider.dispose();
		if (vtcdNoteItemProvider != null)
			vtcdNoteItemProvider.dispose();
	}

}