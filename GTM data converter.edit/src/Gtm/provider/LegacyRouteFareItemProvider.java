/**
 */
package Gtm.provider;


import Gtm.GtmPackage;
import Gtm.LegacyRouteFare;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link Gtm.LegacyRouteFare} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyRouteFareItemProvider 
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
	public LegacyRouteFareItemProvider(AdapterFactory adapterFactory) {
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

			addFareTableNumberPropertyDescriptor(object);
			addSeriesNumberPropertyDescriptor(object);
			addFare2ndPropertyDescriptor(object);
			addFare1stPropertyDescriptor(object);
			addReturnFare1stPropertyDescriptor(object);
			addReturnFare2ndPropertyDescriptor(object);
			addValidFromPropertyDescriptor(object);
			addValidUntilPropertyDescriptor(object);
			addSeriesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Series Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeriesNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_seriesNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_seriesNumber_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__SERIES_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fare2nd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFare2ndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_fare2nd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_fare2nd_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__FARE2ND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fare1st feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFare1stPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_fare1st_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_fare1st_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__FARE1ST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fare Table Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFareTableNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_fareTableNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_fareTableNumber_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Fare1st feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnFare1stPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_returnFare1st_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_returnFare1st_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__RETURN_FARE1ST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Fare2nd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnFare2ndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_returnFare2nd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_returnFare2nd_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__RETURN_FARE2ND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_validFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_validFrom_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__VALID_FROM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Until feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidUntilPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_validUntil_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_validUntil_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__VALID_UNTIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LegacyRouteFare_series_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LegacyRouteFare_series_feature", "_UI_LegacyRouteFare_type"),
				 GtmPackage.Literals.LEGACY_ROUTE_FARE__SERIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns LegacyRouteFare.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LegacyRouteFare"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		LegacyRouteFare legacyRouteFare = (LegacyRouteFare)object;
		StringBuilder sb = new StringBuilder();
		
		sb.append(getString("_UI_LegacyRouteFare_type")).append(": ");
		
		sb.append("- table: ").append(legacyRouteFare.getFareTableNumber());
		sb.append("- series: ").append(legacyRouteFare.getSeriesNumber());
		
		return sb.toString();
				
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

		switch (notification.getFeatureID(LegacyRouteFare.class)) {
			case GtmPackage.LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER:
			case GtmPackage.LEGACY_ROUTE_FARE__SERIES_NUMBER:
			case GtmPackage.LEGACY_ROUTE_FARE__FARE2ND:
			case GtmPackage.LEGACY_ROUTE_FARE__FARE1ST:
			case GtmPackage.LEGACY_ROUTE_FARE__RETURN_FARE1ST:
			case GtmPackage.LEGACY_ROUTE_FARE__RETURN_FARE2ND:
			case GtmPackage.LEGACY_ROUTE_FARE__VALID_FROM:
			case GtmPackage.LEGACY_ROUTE_FARE__VALID_UNTIL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
