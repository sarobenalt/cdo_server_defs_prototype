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

import org.eclipse.emf.cdo.server.defs.CDOServerDef;
import org.eclipse.emf.cdo.server.defs.CDOServerDefsFactory;
import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.net4j.defs.Net4jDefsFactory;
import org.eclipse.net4j.util.defs.provider.DefItemProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.cdo.server.defs.CDOServerDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOServerDefItemProvider extends DefItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDefItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(CDOServerDefsPackage.Literals.CDO_SERVER_DEF__ACCEPTORS);
			childrenFeatures
					.add(CDOServerDefsPackage.Literals.CDO_SERVER_DEF__REPOSITORIES);
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
	 * This returns CDOServerDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/CDOServerDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CDOServerDef_type");
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

		switch (notification.getFeatureID(CDOServerDef.class)) {
		case CDOServerDefsPackage.CDO_SERVER_DEF__ACCEPTORS:
		case CDOServerDefsPackage.CDO_SERVER_DEF__REPOSITORIES:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				CDOServerDefsPackage.Literals.CDO_SERVER_DEF__ACCEPTORS,
				Net4jDefsFactory.eINSTANCE.createTCPAcceptorDef()));

		newChildDescriptors.add(createChildParameter(
				CDOServerDefsPackage.Literals.CDO_SERVER_DEF__ACCEPTORS,
				Net4jDefsFactory.eINSTANCE.createJVMAcceptorDef()));

		newChildDescriptors.add(createChildParameter(
				CDOServerDefsPackage.Literals.CDO_SERVER_DEF__REPOSITORIES,
				CDOServerDefsFactory.eINSTANCE.createRepositoryDef()));

		newChildDescriptors.add(createChildParameter(
				CDOServerDefsPackage.Literals.CDO_SERVER_DEF__REPOSITORIES,
				CDOServerDefsFactory.eINSTANCE
						.createSynchronizableRepositoryDef()));

		newChildDescriptors.add(createChildParameter(
				CDOServerDefsPackage.Literals.CDO_SERVER_DEF__REPOSITORIES,
				CDOServerDefsFactory.eINSTANCE.createOfflineCloneDef()));

		newChildDescriptors.add(createChildParameter(
				CDOServerDefsPackage.Literals.CDO_SERVER_DEF__REPOSITORIES,
				CDOServerDefsFactory.eINSTANCE.createFailoverParticipantDef()));
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
