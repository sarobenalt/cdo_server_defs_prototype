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
package org.eclipse.emf.cdo.server.defs.impl;

import org.eclipse.emf.cdo.server.defs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOServerDefsFactoryImpl extends EFactoryImpl implements
		CDOServerDefsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDOServerDefsFactory init() {
		try {
			CDOServerDefsFactory theCDOServerDefsFactory = (CDOServerDefsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/CDO/server/defs/1.0.0");
			if (theCDOServerDefsFactory != null) {
				return theCDOServerDefsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDOServerDefsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDefsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CDOServerDefsPackage.CDO_SERVER_DEF:
			return createCDOServerDef();
		case CDOServerDefsPackage.STORE_DEF:
			return createStoreDef();
		case CDOServerDefsPackage.MEM_STORE_DEF:
			return createMemStoreDef();
		case CDOServerDefsPackage.REPOSITORY_DEF:
			return createRepositoryDef();
		case CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF:
			return createSynchronizableRepositoryDef();
		case CDOServerDefsPackage.REPOSITORY_SYNCHRONIZER_DEF:
			return createRepositorySynchronizerDef();
		case CDOServerDefsPackage.OFFLINE_CLONE_DEF:
			return createOfflineCloneDef();
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF:
			return createFailoverParticipantDef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDef createCDOServerDef() {
		CDOServerDefImpl cdoServerDef = new CDOServerDefImpl();
		return cdoServerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDef createStoreDef() {
		StoreDefImpl storeDef = new StoreDefImpl();
		return storeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemStoreDef createMemStoreDef() {
		MemStoreDefImpl memStoreDef = new MemStoreDefImpl();
		return memStoreDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDef createRepositoryDef() {
		RepositoryDefImpl repositoryDef = new RepositoryDefImpl();
		return repositoryDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizableRepositoryDef createSynchronizableRepositoryDef() {
		SynchronizableRepositoryDefImpl synchronizableRepositoryDef = new SynchronizableRepositoryDefImpl();
		return synchronizableRepositoryDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositorySynchronizerDef createRepositorySynchronizerDef() {
		RepositorySynchronizerDefImpl repositorySynchronizerDef = new RepositorySynchronizerDefImpl();
		return repositorySynchronizerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfflineCloneDef createOfflineCloneDef() {
		OfflineCloneDefImpl offlineCloneDef = new OfflineCloneDefImpl();
		return offlineCloneDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverParticipantDef createFailoverParticipantDef() {
		FailoverParticipantDefImpl failoverParticipantDef = new FailoverParticipantDefImpl();
		return failoverParticipantDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDefsPackage getCDOServerDefsPackage() {
		return (CDOServerDefsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDOServerDefsPackage getPackage() {
		return CDOServerDefsPackage.eINSTANCE;
	}

} //CDOServerDefsFactoryImpl
