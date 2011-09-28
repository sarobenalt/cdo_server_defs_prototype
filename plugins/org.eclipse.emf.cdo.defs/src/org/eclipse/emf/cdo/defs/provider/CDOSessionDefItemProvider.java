/**
 *  * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  * 
 *  * Contributors:
 *  *    Andre Dietisheim - initial API and implementation
 */
package org.eclipse.emf.cdo.defs.provider;

import org.eclipse.emf.cdo.defs.CDODefsPackage;
import org.eclipse.emf.cdo.defs.CDOSessionDef;

import org.eclipse.net4j.util.defs.provider.DefItemProvider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.cdo.defs.CDOSessionDef} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 * @since 4.1
 */
public class CDOSessionDefItemProvider extends DefItemProvider implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CDOSessionDefItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addConnectorDefPropertyDescriptor(object);
      addRepositoryNamePropertyDescriptor(object);
      addCdoPackageRegistryDefPropertyDescriptor(object);
      addLegacySupportEnabledPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Connector Def feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addConnectorDefPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CDOSessionDef_connectorDef_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CDOSessionDef_connectorDef_feature",
            "_UI_CDOSessionDef_type"), CDODefsPackage.Literals.CDO_SESSION_DEF__CONNECTOR_DEF, true, false, true, null,
        null, null));
  }

  /**
   * This adds a property descriptor for the Repository Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addRepositoryNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CDOSessionDef_repositoryName_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CDOSessionDef_repositoryName_feature",
            "_UI_CDOSessionDef_type"), CDODefsPackage.Literals.CDO_SESSION_DEF__REPOSITORY_NAME, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Cdo Package Registry Def feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addCdoPackageRegistryDefPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CDOSessionDef_cdoPackageRegistryDef_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CDOSessionDef_cdoPackageRegistryDef_feature",
            "_UI_CDOSessionDef_type"), CDODefsPackage.Literals.CDO_SESSION_DEF__CDO_PACKAGE_REGISTRY_DEF, true, false,
        true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Legacy Support Enabled feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addLegacySupportEnabledPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CDOSessionDef_legacySupportEnabled_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CDOSessionDef_legacySupportEnabled_feature",
            "_UI_CDOSessionDef_type"), CDODefsPackage.Literals.CDO_SESSION_DEF__LEGACY_SUPPORT_ENABLED, true, false,
        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This returns CDOSessionDef.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CDOSessionDef"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((CDOSessionDef)object).getRepositoryName();
    return label == null || label.length() == 0 ? getString("_UI_CDOSessionDef_type")
        : getString("_UI_CDOSessionDef_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
   * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(CDOSessionDef.class))
    {
    case CDODefsPackage.CDO_SESSION_DEF__REPOSITORY_NAME:
    case CDODefsPackage.CDO_SESSION_DEF__LEGACY_SUPPORT_ENABLED:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
   * this object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

  /**
   * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return CDODefsEditPlugin.INSTANCE;
  }

}
