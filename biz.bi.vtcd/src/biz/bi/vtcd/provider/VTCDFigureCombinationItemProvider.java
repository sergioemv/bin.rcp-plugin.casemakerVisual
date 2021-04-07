/**
 * <copyright>
 * </copyright>
 *
 * $Id: VTCDFigureCombinationItemProvider.java,v 1.5 2005/06/29 20:45:06 smoreno Exp $
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
import biz.bi.vtcd.model.VTCDFigureCombination;
import biz.bi.vtcd.model.VTCDPackage;

/**
 * This is the item provider adapter for a {@link biz.bi.vtcd.model.VTCDFigureCombination} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VTCDFigureCombinationItemProvider extends
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
	public VTCDFigureCombinationItemProvider(AdapterFactory adapterFactory) {
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

			addM_CombinationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MCombination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_CombinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_VTCDFigureCombination_m_Combination_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_VTCDFigureCombination_m_Combination_feature", "_UI_VTCDFigureCombination_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VTCDPackage.eINSTANCE
								.getVTCDFigureCombination_M_Combination(),
						true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
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
					.getVTCDFigureCombination_M_VTCDLinkCombinationEClass());
		}
		return childrenFeatures;
	}

	/**
	 * This returns VTCDFigureCombination.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator()
				.getImage("full/obj16/VTCDFigureCombination"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Sergio M
	 */
	public String getText(Object object) {
		String labelValue = ((VTCDFigureCombination) object).getM_Combination()
				.getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_VTCDFigureCombination_type") : //$NON-NLS-1$
				getString("_UI_VTCDFigureCombination_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$

		/*VTCDFigureCombination vtcdFigureCombination = (VTCDFigureCombination) object;
		 return getString("_UI_VTCDFigureCombination_type") + " " + vtcdFigureCombination.getHeight(); //$NON-NLS-1$ //$NON-NLS-2$*/
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

		switch (notification.getFeatureID(VTCDFigureCombination.class)) {
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MCOMBINATION:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case VTCDPackage.VTCD_FIGURE_COMBINATION__MVTCD_LINK_COMBINATION_ECLASS:
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
				.getVTCDFigureCombination_M_VTCDLinkCombinationEClass(),
				VTCDFactory.eINSTANCE.createVTCDLinkCombinationEClass()));
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
