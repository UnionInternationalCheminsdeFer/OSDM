/**
 */
package Gtm.provider;


import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.LegacyBorderPoint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Gtm.LegacyBorderPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyBorderPointItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyBorderPointItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBorderPointCodePropertyDescriptor(object);
			addCarrier1PropertyDescriptor(object);
			addLegacyStationCode1PropertyDescriptor(object);
			addCarrier2PropertyDescriptor(object);
			addLegacyStationCode2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Border Point Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderPointCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyBorderPoint_borderPointCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyBorderPoint_borderPointCode_feature", "_UI_LegacyBorderPoint_type"),
				 GtmPackage.Literals.LEGACY_BORDER_POINT__BORDER_POINT_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrier1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyBorderPoint_carrier1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyBorderPoint_carrier1_feature", "_UI_LegacyBorderPoint_type"),
				 GtmPackage.Literals.LEGACY_BORDER_POINT__CARRIER1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Legacy Station Code1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegacyStationCode1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyBorderPoint_legacyStationCode1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyBorderPoint_legacyStationCode1_feature", "_UI_LegacyBorderPoint_type"),
				 GtmPackage.Literals.LEGACY_BORDER_POINT__LEGACY_STATION_CODE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrier2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyBorderPoint_carrier2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyBorderPoint_carrier2_feature", "_UI_LegacyBorderPoint_type"),
				 GtmPackage.Literals.LEGACY_BORDER_POINT__CARRIER2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Legacy Station Code2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegacyStationCode2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyBorderPoint_legacyStationCode2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyBorderPoint_legacyStationCode2_feature", "_UI_LegacyBorderPoint_type"),
				 GtmPackage.Literals.LEGACY_BORDER_POINT__LEGACY_STATION_CODE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GtmPackage.Literals.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS);
			childrenFeatures.add(GtmPackage.Literals.LEGACY_BORDER_POINT__ON_BORDER_STATIONS);
			childrenFeatures.add(GtmPackage.Literals.LEGACY_BORDER_POINT__BORDER_SIDES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LegacyBorderPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LegacyBorderPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LegacyBorderPoint legacyBorderPoint = (LegacyBorderPoint)object;
		return getString("_UI_LegacyBorderPoint_type") + " " + legacyBorderPoint.getBorderPointCode();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LegacyBorderPoint.class)) {
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_POINT_CODE:
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE1:
			case GtmPackage.LEGACY_BORDER_POINT__LEGACY_STATION_CODE2:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS:
			case GtmPackage.LEGACY_BORDER_POINT__ON_BORDER_STATIONS:
			case GtmPackage.LEGACY_BORDER_POINT__BORDER_SIDES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS,
				 GtmFactory.eINSTANCE.createLegacyFakeBorderStations()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY_BORDER_POINT__ON_BORDER_STATIONS,
				 GtmFactory.eINSTANCE.createOnBorderStations()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY_BORDER_POINT__BORDER_SIDES,
				 GtmFactory.eINSTANCE.createLegacyBorderSide()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
