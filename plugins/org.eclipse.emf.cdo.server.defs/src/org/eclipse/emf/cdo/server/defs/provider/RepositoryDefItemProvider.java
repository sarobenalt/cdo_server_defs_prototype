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
package org.eclipse.emf.cdo.server.defs.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;
import org.eclipse.emf.cdo.server.defs.RepositoryDef;

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

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.cdo.server.defs.RepositoryDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryDefItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDefItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addStorePropertyDescriptor(object);
			addOverrideUUIDPropertyDescriptor(object);
			addSupportingAuditsPropertyDescriptor(object);
			addSupportingBranchesPropertyDescriptor(object);
			addSupportingEcorePropertyDescriptor(object);
			addEnsureReferentialIntegrityPropertyDescriptor(object);
			addAllowInterruptRunningQueriesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RepositoryDef_name_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RepositoryDef_name_feature",
						"_UI_RepositoryDef_type"),
				CDOServerDefsPackage.Literals.REPOSITORY_DEF__NAME, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Store feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RepositoryDef_store_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RepositoryDef_store_feature",
						"_UI_RepositoryDef_type"),
				CDOServerDefsPackage.Literals.REPOSITORY_DEF__STORE, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Override UUID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverrideUUIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RepositoryDef_overrideUUID_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RepositoryDef_overrideUUID_feature",
						"_UI_RepositoryDef_type"),
				CDOServerDefsPackage.Literals.REPOSITORY_DEF__OVERRIDE_UUID,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Supporting Audits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportingAuditsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_RepositoryDef_supportingAudits_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RepositoryDef_supportingAudits_feature",
								"_UI_RepositoryDef_type"),
						CDOServerDefsPackage.Literals.REPOSITORY_DEF__SUPPORTING_AUDITS,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Supporting Branches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportingBranchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_RepositoryDef_supportingBranches_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RepositoryDef_supportingBranches_feature",
								"_UI_RepositoryDef_type"),
						CDOServerDefsPackage.Literals.REPOSITORY_DEF__SUPPORTING_BRANCHES,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Supporting Ecore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportingEcorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RepositoryDef_supportingEcore_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RepositoryDef_supportingEcore_feature",
						"_UI_RepositoryDef_type"),
				CDOServerDefsPackage.Literals.REPOSITORY_DEF__SUPPORTING_ECORE,
				true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Ensure Referential Integrity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnsureReferentialIntegrityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_RepositoryDef_ensureReferentialIntegrity_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_RepositoryDef_ensureReferentialIntegrity_feature",
								"_UI_RepositoryDef_type"),
						CDOServerDefsPackage.Literals.REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Interrupt Running Queries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowInterruptRunningQueriesPropertyDescriptor(
			Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_RepositoryDef_allowInterruptRunningQueries_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_RepositoryDef_allowInterruptRunningQueries_feature",
								"_UI_RepositoryDef_type"),
						CDOServerDefsPackage.Literals.REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RepositoryDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/RepositoryDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RepositoryDef) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RepositoryDef_type")
				: getString("_UI_RepositoryDef_type") + " " + label;
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

		switch (notification.getFeatureID(RepositoryDef.class)) {
		case CDOServerDefsPackage.REPOSITORY_DEF__NAME:
		case CDOServerDefsPackage.REPOSITORY_DEF__OVERRIDE_UUID:
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_AUDITS:
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_BRANCHES:
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_ECORE:
		case CDOServerDefsPackage.REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY:
		case CDOServerDefsPackage.REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES:
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
		return CDOServerDefsEditPlugin.INSTANCE;
	}

}
