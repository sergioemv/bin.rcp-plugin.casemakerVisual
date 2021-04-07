/**
 * <copyright>
 * </copyright>
 *
 * $Id: CMProxyTestObjectItemProvider.java,v 1.3 2005/08/25 14:56:57 smoreno Exp $
 */
package biz.bi.cmcore.provider;

import java.util.Collection;
import java.util.List;

import model.TestObject;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import biz.bi.cmcore.CMCorePlugin;
import biz.bi.cmcore.model.CMCoreFactory;
import biz.bi.cmcore.model.CMCorePackage;
import biz.bi.cmcore.model.CMProxyTestObject;

/**
 * This is the item provider adapter for a {@link biz.bi.cmcore.model.CMProxyTestObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CMProxyTestObjectItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
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
	public CMProxyTestObjectItemProvider(AdapterFactory adapterFactory) {
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

			addM_TestObjectPropertyDescriptor(object);
			addM_pathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MTest Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_TestObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_CMProxyTestObject_m_TestObject_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_CMProxyTestObject_m_TestObject_feature", "_UI_CMProxyTestObject_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						CMCorePackage.eINSTANCE
								.getCMProxyTestObject_M_TestObject(), true,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mpath feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_pathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_CMProxyTestObject_m_path_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_CMProxyTestObject_m_path_feature", "_UI_CMProxyTestObject_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						CMCorePackage.eINSTANCE.getCMProxyTestObject_M_path(),
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
			childrenFeatures.add(CMCorePackage.eINSTANCE
					.getCMProxyTestObject_ProxyElement());
			childrenFeatures.add(CMCorePackage.eINSTANCE
					.getCMProxyTestObject_ProxyDependency());
			childrenFeatures.add(CMCorePackage.eINSTANCE
					.getCMProxyTestObject_ProxyEffect());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CMProxyTestObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/CMProxyTestObject"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		TestObject labelValue = ((CMProxyTestObject) object).getM_TestObject();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_CMProxyTestObject_type") : //$NON-NLS-1$
				getString("_UI_CMProxyTestObject_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(CMProxyTestObject.class)) {
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MTEST_OBJECT:
		case CMCorePackage.CM_PROXY_TEST_OBJECT__MPATH:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_ELEMENT:
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_DEPENDENCY:
		case CMCorePackage.CM_PROXY_TEST_OBJECT__PROXY_EFFECT:
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

		newChildDescriptors.add(createChildParameter(CMCorePackage.eINSTANCE
				.getCMProxyTestObject_ProxyElement(), CMCoreFactory.eINSTANCE
				.createCMProxyElement()));

		newChildDescriptors.add(createChildParameter(CMCorePackage.eINSTANCE
				.getCMProxyTestObject_ProxyDependency(),
				CMCoreFactory.eINSTANCE.createCMProxyDependency()));

		newChildDescriptors.add(createChildParameter(CMCorePackage.eINSTANCE
				.getCMProxyTestObject_ProxyEffect(), CMCoreFactory.eINSTANCE
				.createCMProxyEffect()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return CMCorePlugin.INSTANCE;
	}

}
