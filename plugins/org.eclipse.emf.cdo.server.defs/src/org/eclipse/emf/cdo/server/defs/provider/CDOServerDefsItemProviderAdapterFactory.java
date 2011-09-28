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

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.cdo.server.defs.CDOServerDefsFactory;
import org.eclipse.emf.cdo.server.defs.util.CDOServerDefsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.net4j.util.defs.DefContainer;
import org.eclipse.net4j.util.defs.Net4jUtilDefsPackage;
import org.eclipse.net4j.util.defs.util.Net4jUtilDefsSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOServerDefsItemProviderAdapterFactory extends
		CDOServerDefsAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDefsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.CDOServerDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDOServerDefItemProvider cdoServerDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.CDOServerDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCDOServerDefAdapter() {
		if (cdoServerDefItemProvider == null) {
			cdoServerDefItemProvider = new CDOServerDefItemProvider(this);
		}

		return cdoServerDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.StoreDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreDefItemProvider storeDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.StoreDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreDefAdapter() {
		if (storeDefItemProvider == null) {
			storeDefItemProvider = new StoreDefItemProvider(this);
		}

		return storeDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.MemStoreDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemStoreDefItemProvider memStoreDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.MemStoreDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemStoreDefAdapter() {
		if (memStoreDefItemProvider == null) {
			memStoreDefItemProvider = new MemStoreDefItemProvider(this);
		}

		return memStoreDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.RepositoryDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDefItemProvider repositoryDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.RepositoryDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryDefAdapter() {
		if (repositoryDefItemProvider == null) {
			repositoryDefItemProvider = new RepositoryDefItemProvider(this);
		}

		return repositoryDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizableRepositoryDefItemProvider synchronizableRepositoryDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchronizableRepositoryDefAdapter() {
		if (synchronizableRepositoryDefItemProvider == null) {
			synchronizableRepositoryDefItemProvider = new SynchronizableRepositoryDefItemProvider(
					this);
		}

		return synchronizableRepositoryDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.RepositorySynchronizerDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositorySynchronizerDefItemProvider repositorySynchronizerDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.RepositorySynchronizerDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositorySynchronizerDefAdapter() {
		if (repositorySynchronizerDefItemProvider == null) {
			repositorySynchronizerDefItemProvider = new RepositorySynchronizerDefItemProvider(
					this);
		}

		return repositorySynchronizerDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.OfflineCloneDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfflineCloneDefItemProvider offlineCloneDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.OfflineCloneDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOfflineCloneDefAdapter() {
		if (offlineCloneDefItemProvider == null) {
			offlineCloneDefItemProvider = new OfflineCloneDefItemProvider(this);
		}

		return offlineCloneDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailoverParticipantDefItemProvider failoverParticipantDefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailoverParticipantDefAdapter() {
		if (failoverParticipantDefItemProvider == null) {
			failoverParticipantDefItemProvider = new FailoverParticipantDefItemProvider(
					this);
		}

		return failoverParticipantDefItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cdoServerDefItemProvider != null)
			cdoServerDefItemProvider.dispose();
		if (storeDefItemProvider != null)
			storeDefItemProvider.dispose();
		if (memStoreDefItemProvider != null)
			memStoreDefItemProvider.dispose();
		if (repositoryDefItemProvider != null)
			repositoryDefItemProvider.dispose();
		if (synchronizableRepositoryDefItemProvider != null)
			synchronizableRepositoryDefItemProvider.dispose();
		if (repositorySynchronizerDefItemProvider != null)
			repositorySynchronizerDefItemProvider.dispose();
		if (offlineCloneDefItemProvider != null)
			offlineCloneDefItemProvider.dispose();
		if (failoverParticipantDefItemProvider != null)
			failoverParticipantDefItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link Net4jUtilDefsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Net4jUtilDefsChildCreationExtender implements
			IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends
				Net4jUtilDefsSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors,
					EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseDefContainer(DefContainer object) {
				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE
										.createCDOServerDef()));

				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE.createStoreDef()));

				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE
										.createMemStoreDef()));

				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE
										.createRepositoryDef()));

				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE
										.createSynchronizableRepositoryDef()));

				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE
										.createRepositorySynchronizerDef()));

				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE
										.createOfflineCloneDef()));

				newChildDescriptors
						.add(createChildParameter(
								Net4jUtilDefsPackage.Literals.DEF_CONTAINER__DEFINITIONS,
								CDOServerDefsFactory.eINSTANCE
										.createFailoverParticipantDef()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature,
					Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object,
				EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain)
					.doSwitch((EObject) object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return CDOServerDefsEditPlugin.INSTANCE;
		}
	}

}
