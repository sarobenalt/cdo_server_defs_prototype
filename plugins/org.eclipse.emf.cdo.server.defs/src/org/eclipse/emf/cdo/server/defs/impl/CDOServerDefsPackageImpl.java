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

import org.eclipse.emf.cdo.server.defs.CDOServerDef;
import org.eclipse.emf.cdo.server.defs.CDOServerDefsFactory;
import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;
import org.eclipse.emf.cdo.server.defs.FailoverParticipantDef;
import org.eclipse.emf.cdo.server.defs.MemStoreDef;
import org.eclipse.emf.cdo.server.defs.OfflineCloneDef;
import org.eclipse.emf.cdo.server.defs.RepositoryDef;
import org.eclipse.emf.cdo.server.defs.RepositorySynchronizerDef;
import org.eclipse.emf.cdo.server.defs.StoreDef;
import org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.net4j.defs.Net4jDefsPackage;

import org.eclipse.net4j.util.defs.Net4jUtilDefsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOServerDefsPackageImpl extends EPackageImpl implements
		CDOServerDefsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoServerDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memStoreDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizableRepositoryDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositorySynchronizerDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offlineCloneDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failoverParticipantDefEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDOServerDefsPackageImpl() {
		super(eNS_URI, CDOServerDefsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CDOServerDefsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDOServerDefsPackage init() {
		if (isInited)
			return (CDOServerDefsPackage) EPackage.Registry.INSTANCE
					.getEPackage(CDOServerDefsPackage.eNS_URI);

		// Obtain or create and register package
		CDOServerDefsPackageImpl theCDOServerDefsPackage = (CDOServerDefsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CDOServerDefsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CDOServerDefsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Net4jDefsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDOServerDefsPackage.createPackageContents();

		// Initialize created meta-data
		theCDOServerDefsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDOServerDefsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDOServerDefsPackage.eNS_URI,
				theCDOServerDefsPackage);
		return theCDOServerDefsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDOServerDef() {
		return cdoServerDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDOServerDef_Acceptors() {
		return (EReference) cdoServerDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDOServerDef_Repositories() {
		return (EReference) cdoServerDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoreDef() {
		return storeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemStoreDef() {
		return memStoreDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryDef() {
		return repositoryDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDef_Name() {
		return (EAttribute) repositoryDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryDef_Store() {
		return (EReference) repositoryDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDef_OverrideUUID() {
		return (EAttribute) repositoryDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDef_SupportingAudits() {
		return (EAttribute) repositoryDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDef_SupportingBranches() {
		return (EAttribute) repositoryDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDef_SupportingEcore() {
		return (EAttribute) repositoryDefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDef_EnsureReferentialIntegrity() {
		return (EAttribute) repositoryDefEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryDef_AllowInterruptRunningQueries() {
		return (EAttribute) repositoryDefEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizableRepositoryDef() {
		return synchronizableRepositoryDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizableRepositoryDef_Synchronizer() {
		return (EReference) synchronizableRepositoryDefEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositorySynchronizerDef() {
		return repositorySynchronizerDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfflineCloneDef() {
		return offlineCloneDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailoverParticipantDef() {
		return failoverParticipantDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailoverParticipantDef_Master() {
		return (EAttribute) failoverParticipantDefEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailoverParticipantDef_AllowBackupCommits() {
		return (EAttribute) failoverParticipantDefEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDefsFactory getCDOServerDefsFactory() {
		return (CDOServerDefsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cdoServerDefEClass = createEClass(CDO_SERVER_DEF);
		createEReference(cdoServerDefEClass, CDO_SERVER_DEF__ACCEPTORS);
		createEReference(cdoServerDefEClass, CDO_SERVER_DEF__REPOSITORIES);

		storeDefEClass = createEClass(STORE_DEF);

		memStoreDefEClass = createEClass(MEM_STORE_DEF);

		repositoryDefEClass = createEClass(REPOSITORY_DEF);
		createEAttribute(repositoryDefEClass, REPOSITORY_DEF__NAME);
		createEReference(repositoryDefEClass, REPOSITORY_DEF__STORE);
		createEAttribute(repositoryDefEClass, REPOSITORY_DEF__OVERRIDE_UUID);
		createEAttribute(repositoryDefEClass, REPOSITORY_DEF__SUPPORTING_AUDITS);
		createEAttribute(repositoryDefEClass,
				REPOSITORY_DEF__SUPPORTING_BRANCHES);
		createEAttribute(repositoryDefEClass, REPOSITORY_DEF__SUPPORTING_ECORE);
		createEAttribute(repositoryDefEClass,
				REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY);
		createEAttribute(repositoryDefEClass,
				REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES);

		synchronizableRepositoryDefEClass = createEClass(SYNCHRONIZABLE_REPOSITORY_DEF);
		createEReference(synchronizableRepositoryDefEClass,
				SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER);

		repositorySynchronizerDefEClass = createEClass(REPOSITORY_SYNCHRONIZER_DEF);

		offlineCloneDefEClass = createEClass(OFFLINE_CLONE_DEF);

		failoverParticipantDefEClass = createEClass(FAILOVER_PARTICIPANT_DEF);
		createEAttribute(failoverParticipantDefEClass,
				FAILOVER_PARTICIPANT_DEF__MASTER);
		createEAttribute(failoverParticipantDefEClass,
				FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Net4jUtilDefsPackage theNet4jUtilDefsPackage = (Net4jUtilDefsPackage) EPackage.Registry.INSTANCE
				.getEPackage(Net4jUtilDefsPackage.eNS_URI);
		Net4jDefsPackage theNet4jDefsPackage = (Net4jDefsPackage) EPackage.Registry.INSTANCE
				.getEPackage(Net4jDefsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cdoServerDefEClass.getESuperTypes().add(
				theNet4jUtilDefsPackage.getDef());
		storeDefEClass.getESuperTypes().add(theNet4jUtilDefsPackage.getDef());
		memStoreDefEClass.getESuperTypes().add(this.getStoreDef());
		repositoryDefEClass.getESuperTypes().add(
				theNet4jUtilDefsPackage.getDef());
		synchronizableRepositoryDefEClass.getESuperTypes().add(
				this.getRepositoryDef());
		repositorySynchronizerDefEClass.getESuperTypes().add(
				theNet4jUtilDefsPackage.getDef());
		offlineCloneDefEClass.getESuperTypes().add(
				this.getSynchronizableRepositoryDef());
		failoverParticipantDefEClass.getESuperTypes().add(
				this.getSynchronizableRepositoryDef());

		// Initialize classes and features; add operations and parameters
		initEClass(cdoServerDefEClass, CDOServerDef.class, "CDOServerDef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDOServerDef_Acceptors(),
				theNet4jDefsPackage.getAcceptorDef(), null, "acceptors", null,
				0, -1, CDOServerDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDOServerDef_Repositories(), this.getRepositoryDef(),
				null, "repositories", null, 0, -1, CDOServerDef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(storeDefEClass, StoreDef.class, "StoreDef", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memStoreDefEClass, MemStoreDef.class, "MemStoreDef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryDefEClass, RepositoryDef.class, "RepositoryDef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryDef_Name(), ecorePackage.getEString(),
				"name", null, 1, 1, RepositoryDef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRepositoryDef_Store(), this.getStoreDef(), null,
				"store", null, 1, 1, RepositoryDef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryDef_OverrideUUID(),
				ecorePackage.getEString(), "overrideUUID", null, 0, 1,
				RepositoryDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepositoryDef_SupportingAudits(),
				ecorePackage.getEBoolean(), "supportingAudits", null, 0, 1,
				RepositoryDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepositoryDef_SupportingBranches(),
				ecorePackage.getEBoolean(), "supportingBranches", null, 0, 1,
				RepositoryDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepositoryDef_SupportingEcore(),
				ecorePackage.getEBoolean(), "supportingEcore", null, 0, 1,
				RepositoryDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepositoryDef_EnsureReferentialIntegrity(),
				ecorePackage.getEBoolean(), "ensureReferentialIntegrity", null,
				0, 1, RepositoryDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepositoryDef_AllowInterruptRunningQueries(),
				ecorePackage.getEBoolean(), "allowInterruptRunningQueries",
				null, 0, 1, RepositoryDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(synchronizableRepositoryDefEClass,
				SynchronizableRepositoryDef.class,
				"SynchronizableRepositoryDef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizableRepositoryDef_Synchronizer(),
				this.getRepositorySynchronizerDef(), null, "synchronizer",
				null, 0, 1, SynchronizableRepositoryDef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositorySynchronizerDefEClass,
				RepositorySynchronizerDef.class, "RepositorySynchronizerDef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(offlineCloneDefEClass, OfflineCloneDef.class,
				"OfflineCloneDef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(failoverParticipantDefEClass, FailoverParticipantDef.class,
				"FailoverParticipantDef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailoverParticipantDef_Master(),
				ecorePackage.getEBoolean(), "master", null, 1, 1,
				FailoverParticipantDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFailoverParticipantDef_AllowBackupCommits(),
				ecorePackage.getEBoolean(), "allowBackupCommits", null, 1, 1,
				FailoverParticipantDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CDOServerDefsPackageImpl
