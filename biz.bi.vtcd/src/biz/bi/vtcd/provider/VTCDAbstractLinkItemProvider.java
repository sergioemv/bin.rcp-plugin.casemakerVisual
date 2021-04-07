/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDAbstractLinkItemProvider.java,v 1.9 2005/08/04 13:37:12 smoreno Exp $
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Color;

import biz.bi.vtcd.model.VTCDAbstractLink;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * This is the item provider adapter for a {@link biz.bi.vtcd.model.VTCDAbstractLink} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDAbstractLinkItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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
	public VTCDAbstractLinkItemProvider(AdapterFactory adapterFactory) {
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

			addColorPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addBendPointsPropertyDescriptor(object);
			addSourceTerminalPropertyDescriptor(object);
			addTargetTerminalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDAbstractLink_color_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDAbstractLink_color_feature", "_UI_VTCDAbstractLink_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE.getVTCDAbstractLink_Color(),
						true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDAbstractLink_width_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDAbstractLink_width_feature", "_UI_VTCDAbstractLink_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE.getVTCDAbstractLink_Width(),
						true, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Bend Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBendPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDAbstractLink_bendPoints_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDAbstractLink_bendPoints_feature", "_UI_VTCDAbstractLink_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE.getVTCDAbstractLink_BendPoints(),
						true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Source Terminal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceTerminalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDAbstractLink_sourceTerminal_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDAbstractLink_sourceTerminal_feature", "_UI_VTCDAbstractLink_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE
								.getVTCDAbstractLink_SourceTerminal(), true,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Terminal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetTerminalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDAbstractLink_targetTerminal_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDAbstractLink_targetTerminal_feature", "_UI_VTCDAbstractLink_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE
								.getVTCDAbstractLink_TargetTerminal(), true,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Color labelValue = ((VTCDAbstractLink) object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_VTCDAbstractLink_type") : //$NON-NLS-1$
				getString("_UI_VTCDAbstractLink_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(VTCDAbstractLink.class)) {
		case VTCDPackage.VTCD_ABSTRACT_LINK__COLOR:
		case VTCDPackage.VTCD_ABSTRACT_LINK__WIDTH:
		case VTCDPackage.VTCD_ABSTRACT_LINK__BEND_POINTS:
		case VTCDPackage.VTCD_ABSTRACT_LINK__SOURCE_TERMINAL:
		case VTCDPackage.VTCD_ABSTRACT_LINK__TARGET_TERMINAL:
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
