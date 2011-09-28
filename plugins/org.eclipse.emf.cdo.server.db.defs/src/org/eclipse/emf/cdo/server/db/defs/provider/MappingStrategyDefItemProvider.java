/**
 *  * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  * 
 *  * Contributors:
 *  *    Andre Dietisheim - initial API and implementation
 *  *    Steve Robenalt - extended initial implementation for server side configuration.
 */
package org.eclipse.emf.cdo.server.db.defs.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage;
import org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.net4j.util.defs.provider.DefItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingStrategyDefItemProvider extends DefItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingStrategyDefItemProvider(AdapterFactory adapterFactory) {
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

			addForceNamesWithIDPropertyDescriptor(object);
			addMaxTableNameLengthPropertyDescriptor(object);
			addMaxFieldNameLengthPropertyDescriptor(object);
			addObjectTypeCacheSizePropertyDescriptor(object);
			addQualifiedNamesPropertyDescriptor(object);
			addTableNamePrefixPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Force Names With ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceNamesWithIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MappingStrategyDef_forceNamesWithID_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MappingStrategyDef_forceNamesWithID_feature",
								"_UI_MappingStrategyDef_type"),
						CDOServerDbDefsPackage.Literals.MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Table Name Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxTableNameLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MappingStrategyDef_maxTableNameLength_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MappingStrategyDef_maxTableNameLength_feature",
								"_UI_MappingStrategyDef_type"),
						CDOServerDbDefsPackage.Literals.MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH,
						true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Field Name Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxFieldNameLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MappingStrategyDef_maxFieldNameLength_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MappingStrategyDef_maxFieldNameLength_feature",
								"_UI_MappingStrategyDef_type"),
						CDOServerDbDefsPackage.Literals.MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH,
						true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Object Type Cache Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectTypeCacheSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MappingStrategyDef_objectTypeCacheSize_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MappingStrategyDef_objectTypeCacheSize_feature",
								"_UI_MappingStrategyDef_type"),
						CDOServerDbDefsPackage.Literals.MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE,
						true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Qualified Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifiedNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MappingStrategyDef_qualifiedNames_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MappingStrategyDef_qualifiedNames_feature",
								"_UI_MappingStrategyDef_type"),
						CDOServerDbDefsPackage.Literals.MAPPING_STRATEGY_DEF__QUALIFIED_NAMES,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Table Name Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_MappingStrategyDef_tableNamePrefix_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_MappingStrategyDef_tableNamePrefix_feature",
								"_UI_MappingStrategyDef_type"),
						CDOServerDbDefsPackage.Literals.MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns MappingStrategyDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/MappingStrategyDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		MappingStrategyDef mappingStrategyDef = (MappingStrategyDef) object;
		return getString("_UI_MappingStrategyDef_type") + " "
				+ mappingStrategyDef.isForceNamesWithID();
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

		switch (notification.getFeatureID(MappingStrategyDef.class)) {
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID:
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH:
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH:
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE:
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__QUALIFIED_NAMES:
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
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
		return CDOServerDbEditDefsPlugin.INSTANCE;
	}

}
