/**
 */
package Gtm.provider;


import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108;

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
 * This is the item provider adapter for a {@link Gtm.Legacy108} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Legacy108ItemProvider 
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
	public Legacy108ItemProvider(AdapterFactory adapterFactory) {
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

			addCharacterSetPropertyDescriptor(object);
			addTimeZonePropertyDescriptor(object);
			addCarrierPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
			addEndDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Character Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharacterSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Legacy108_characterSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Legacy108_characterSet_feature", "_UI_Legacy108_type"),
				 GtmPackage.Literals.LEGACY108__CHARACTER_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Carrier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCarrierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Legacy108_carrier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Legacy108_carrier_feature", "_UI_Legacy108_type"),
				 GtmPackage.Literals.LEGACY108__CARRIER,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Legacy108_startDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Legacy108_startDate_feature", "_UI_Legacy108_type"),
				 GtmPackage.Literals.LEGACY108__START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Legacy108_endDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Legacy108_endDate_feature", "_UI_Legacy108_type"),
				 GtmPackage.Literals.LEGACY108__END_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Zone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeZonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Legacy108_timeZone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Legacy108_timeZone_feature", "_UI_Legacy108_type"),
				 GtmPackage.Literals.LEGACY108__TIME_ZONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST);
			childrenFeatures.add(GtmPackage.Literals.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES);
			childrenFeatures.add(GtmPackage.Literals.LEGACY108__LEGACY_DISTANCE_FARES);
			childrenFeatures.add(GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES);
			childrenFeatures.add(GtmPackage.Literals.LEGACY108__LEGACY_STATIONS);
			childrenFeatures.add(GtmPackage.Literals.LEGACY108__LEGACY_FARE_DESCRIPTIONS);
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
	 * This returns Legacy108.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Legacy108"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String labelValue = null;
		if (((Legacy108)object).getCarrier() != null) {
			labelValue = ((Legacy108)object).getCarrier().getShortName();
		}
		String label = labelValue == null ? null : labelValue;
		return label == null || label.length() == 0 ?
			getString("_UI_Legacy108_type") :
			getString("_UI_Legacy108_type") + " " + label;
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

		switch (notification.getFeatureID(Legacy108.class)) {
			case GtmPackage.LEGACY108__CHARACTER_SET:
			case GtmPackage.LEGACY108__TIME_ZONE:
			case GtmPackage.LEGACY108__CARRIER:
			case GtmPackage.LEGACY108__START_DATE:
			case GtmPackage.LEGACY108__END_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GtmPackage.LEGACY108__LEGACY_SERIES_LIST:
			case GtmPackage.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES:
			case GtmPackage.LEGACY108__LEGACY_DISTANCE_FARES:
			case GtmPackage.LEGACY108__LEGACY_ROUTE_FARES:
			case GtmPackage.LEGACY108__LEGACY_STATIONS:
			case GtmPackage.LEGACY108__LEGACY_FARE_DESCRIPTIONS:
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
				(GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST,
				 GtmFactory.eINSTANCE.createLegacySeriesList()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES,
				 GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY108__LEGACY_DISTANCE_FARES,
				 GtmFactory.eINSTANCE.createLegacyDistanceFares()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES,
				 GtmFactory.eINSTANCE.createLegacyRouteFares()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY108__LEGACY_STATIONS,
				 GtmFactory.eINSTANCE.createLegacy108Stations()));

		newChildDescriptors.add
			(createChildParameter
				(GtmPackage.Literals.LEGACY108__LEGACY_FARE_DESCRIPTIONS,
				 GtmFactory.eINSTANCE.createLegacy108FaresDescriptions()));
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
