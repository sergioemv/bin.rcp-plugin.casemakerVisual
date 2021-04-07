/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureElementItemProvider.java,v 1.6 2005/07/15 20:42:59 smoreno Exp $
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

import biz.bi.vtcd.model.VTCDFactory;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * This is the item provider adapter for a {@link biz.bi.vtcd.model.VTCDFigureElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDFigureElementItemProvider extends
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
	public VTCDFigureElementItemProvider(AdapterFactory adapterFactory) {
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

			addM_VTCDLinkDependencyElementPropertyDescriptor(object);
			addM_ElementPropertyDescriptor(object);
			addIconPropertyDescriptor(object);
			addFoldedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MVTCD Link Dependency Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_VTCDLinkDependencyElementPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDFigureElement_m_VTCDLinkDependencyElement_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDFigureElement_m_VTCDLinkDependencyElement_feature", "_UI_VTCDFigureElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE
								.getVTCDFigureElement_M_VTCDLinkDependencyElement(),
						true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the MElement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_ElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDFigureElement_m_Element_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDFigureElement_m_Element_feature", "_UI_VTCDFigureElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE.getVTCDFigureElement_M_Element(),
						true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDFigureElement_icon_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDFigureElement_icon_feature", "_UI_VTCDFigureElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE.getVTCDFigureElement_Icon(),
						true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Folded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFoldedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDFigureElement_folded_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDFigureElement_folded_feature", "_UI_VTCDFigureElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE.getVTCDFigureElement_Folded(),
						true, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VTCDPackage.eINSTANCE
					.getVTCDFigureElement_M_VTCDFigureEquivalenceClass());
		}
		return childrenFeatures;
	}

	/**
	 * This returns VTCDFigureElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/VTCDFigureElement"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author smoreno
	 */
	public String getText(Object object) {
		String labelValue = ((VTCDFigureElement) object).getM_Element()
				.getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_VTCDFigureElement_type") : //$NON-NLS-1$
				getString("_UI_VTCDFigureElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
		/*VTCDFigureElement vtcdFigureElement = (VTCDFigureElement) object;
		 return getString("_UI_VTCDFigureElement_type") + " " + vtcdFigureElement.getHeight(); //$NON-NLS-1$ //$NON-NLS-2$*/
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

		switch (notification.getFeatureID(VTCDFigureElement.class)) {
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MELEMENT:
		case VTCDPackage.VTCD_FIGURE_ELEMENT__ICON:
		case VTCDPackage.VTCD_FIGURE_ELEMENT__FOLDED:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case VTCDPackage.VTCD_FIGURE_ELEMENT__MVTCD_FIGURE_EQUIVALENCE_CLASS:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(VTCDPackage.eINSTANCE
				.getVTCDFigureElement_M_VTCDFigureEquivalenceClass(),
				VTCDFactory.eINSTANCE.createVTCDFigureEquivalenceClass()));
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
