/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureEquivalenceClassItemProvider.java,v 1.5 2005/06/29 20:45:06 smoreno Exp $
 */
package biz.bi.vtcd.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import biz.bi.vtcd.model.VTCDFigureEquivalenceClass;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * This is the item provider adapter for a {@link biz.bi.vtcd.model.VTCDFigureEquivalenceClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDFigureEquivalenceClassItemProvider extends
		VTCDAbstractFigureItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Business Innovations"; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCDFigureEquivalenceClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addM_VTCDLinkCombinationEClassPropertyDescriptor(object);
			addM_EquivalenceClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MVTCD Link Combination EClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_VTCDLinkCombinationEClassPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDFigureEquivalenceClass_m_VTCDLinkCombinationEClass_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDFigureEquivalenceClass_m_VTCDLinkCombinationEClass_feature", "_UI_VTCDFigureEquivalenceClass_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE
								.getVTCDFigureEquivalenceClass_M_VTCDLinkCombinationEClass(),
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the MEquivalence Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_EquivalenceClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDFigureEquivalenceClass_m_EquivalenceClass_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDFigureEquivalenceClass_m_EquivalenceClass_feature", "_UI_VTCDFigureEquivalenceClass_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE
								.getVTCDFigureEquivalenceClass_M_EquivalenceClass(),
						true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This returns VTCDFigureEquivalenceClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage(
				"full/obj16/VTCDFigureEquivalenceClass"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		VTCDFigureEquivalenceClass vtcdFigureEquivalenceClass = (VTCDFigureEquivalenceClass) object;
		return getString("_UI_VTCDFigureEquivalenceClass_type") + " " + vtcdFigureEquivalenceClass.getHeight(); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VTCDFigureEquivalenceClass.class)) {
		case VTCDPackage.VTCD_FIGURE_EQUIVALENCE_CLASS__MEQUIVALENCE_CLASS:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return VTCDEditPlugin.INSTANCE;
	}

}
