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
package org.eclipse.emf.cdo.server.db.defs.impl;

import org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsFactory;
import org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage;
import org.eclipse.emf.cdo.server.db.defs.DBStoreDef;
import org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef;
import org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef;

import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.net4j.db.defs.Net4jDbDefsPackage;

import org.eclipse.net4j.util.defs.Net4jUtilDefsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOServerDbDefsPackageImpl extends EPackageImpl implements
		CDOServerDbDefsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbStoreDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingStrategyDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalMappingStrategyDefEClass = null;

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
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDOServerDbDefsPackageImpl() {
		super(eNS_URI, CDOServerDbDefsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CDOServerDbDefsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDOServerDbDefsPackage init() {
		if (isInited)
			return (CDOServerDbDefsPackage) EPackage.Registry.INSTANCE
					.getEPackage(CDOServerDbDefsPackage.eNS_URI);

		// Obtain or create and register package
		CDOServerDbDefsPackageImpl theCDOServerDbDefsPackage = (CDOServerDbDefsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CDOServerDbDefsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CDOServerDbDefsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDOServerDefsPackage.eINSTANCE.eClass();
		Net4jDbDefsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDOServerDbDefsPackage.createPackageContents();

		// Initialize created meta-data
		theCDOServerDbDefsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDOServerDbDefsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDOServerDbDefsPackage.eNS_URI,
				theCDOServerDbDefsPackage);
		return theCDOServerDbDefsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBStoreDef() {
		return dbStoreDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBStoreDef_MappingStrategy() {
		return (EReference) dbStoreDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBStoreDef_DbAdapter() {
		return (EReference) dbStoreDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBStoreDef_DbConnectionProvider() {
		return (EReference) dbStoreDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingStrategyDef() {
		return mappingStrategyDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingStrategyDef_ForceNamesWithID() {
		return (EAttribute) mappingStrategyDefEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingStrategyDef_MaxTableNameLength() {
		return (EAttribute) mappingStrategyDefEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingStrategyDef_MaxFieldNameLength() {
		return (EAttribute) mappingStrategyDefEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingStrategyDef_ObjectTypeCacheSize() {
		return (EAttribute) mappingStrategyDefEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingStrategyDef_QualifiedNames() {
		return (EAttribute) mappingStrategyDefEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingStrategyDef_TableNamePrefix() {
		return (EAttribute) mappingStrategyDefEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalMappingStrategyDef() {
		return horizontalMappingStrategyDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalMappingStrategyDef_Auditing() {
		return (EAttribute) horizontalMappingStrategyDefEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalMappingStrategyDef_Branching() {
		return (EAttribute) horizontalMappingStrategyDefEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalMappingStrategyDef_WithRanges() {
		return (EAttribute) horizontalMappingStrategyDefEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDbDefsFactory getCDOServerDbDefsFactory() {
		return (CDOServerDbDefsFactory) getEFactoryInstance();
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
		dbStoreDefEClass = createEClass(DB_STORE_DEF);
		createEReference(dbStoreDefEClass, DB_STORE_DEF__MAPPING_STRATEGY);
		createEReference(dbStoreDefEClass, DB_STORE_DEF__DB_ADAPTER);
		createEReference(dbStoreDefEClass, DB_STORE_DEF__DB_CONNECTION_PROVIDER);

		mappingStrategyDefEClass = createEClass(MAPPING_STRATEGY_DEF);
		createEAttribute(mappingStrategyDefEClass,
				MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID);
		createEAttribute(mappingStrategyDefEClass,
				MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH);
		createEAttribute(mappingStrategyDefEClass,
				MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH);
		createEAttribute(mappingStrategyDefEClass,
				MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE);
		createEAttribute(mappingStrategyDefEClass,
				MAPPING_STRATEGY_DEF__QUALIFIED_NAMES);
		createEAttribute(mappingStrategyDefEClass,
				MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX);

		horizontalMappingStrategyDefEClass = createEClass(HORIZONTAL_MAPPING_STRATEGY_DEF);
		createEAttribute(horizontalMappingStrategyDefEClass,
				HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING);
		createEAttribute(horizontalMappingStrategyDefEClass,
				HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING);
		createEAttribute(horizontalMappingStrategyDefEClass,
				HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES);
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
		CDOServerDefsPackage theCDOServerDefsPackage = (CDOServerDefsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CDOServerDefsPackage.eNS_URI);
		Net4jDbDefsPackage theNet4jDbDefsPackage = (Net4jDbDefsPackage) EPackage.Registry.INSTANCE
				.getEPackage(Net4jDbDefsPackage.eNS_URI);
		Net4jUtilDefsPackage theNet4jUtilDefsPackage = (Net4jUtilDefsPackage) EPackage.Registry.INSTANCE
				.getEPackage(Net4jUtilDefsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dbStoreDefEClass.getESuperTypes().add(
				theCDOServerDefsPackage.getStoreDef());
		mappingStrategyDefEClass.getESuperTypes().add(
				theNet4jUtilDefsPackage.getDef());
		horizontalMappingStrategyDefEClass.getESuperTypes().add(
				this.getMappingStrategyDef());

		// Initialize classes and features; add operations and parameters
		initEClass(dbStoreDefEClass, DBStoreDef.class, "DBStoreDef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBStoreDef_MappingStrategy(),
				this.getMappingStrategyDef(), null, "mappingStrategy", null, 1,
				1, DBStoreDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBStoreDef_DbAdapter(),
				theNet4jDbDefsPackage.getDBAdapterDef(), null, "dbAdapter",
				null, 1, 1, DBStoreDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBStoreDef_DbConnectionProvider(),
				theNet4jDbDefsPackage.getDBConnectionProviderDef(), null,
				"dbConnectionProvider", null, 1, 1, DBStoreDef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mappingStrategyDefEClass, MappingStrategyDef.class,
				"MappingStrategyDef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingStrategyDef_ForceNamesWithID(),
				ecorePackage.getEBoolean(), "forceNamesWithID", null, 0, 1,
				MappingStrategyDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMappingStrategyDef_MaxTableNameLength(),
				ecorePackage.getEInt(), "maxTableNameLength", null, 0, 1,
				MappingStrategyDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMappingStrategyDef_MaxFieldNameLength(),
				ecorePackage.getEInt(), "maxFieldNameLength", null, 0, 1,
				MappingStrategyDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMappingStrategyDef_ObjectTypeCacheSize(),
				ecorePackage.getEInt(), "objectTypeCacheSize", null, 0, 1,
				MappingStrategyDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMappingStrategyDef_QualifiedNames(),
				ecorePackage.getEBoolean(), "qualifiedNames", null, 0, 1,
				MappingStrategyDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMappingStrategyDef_TableNamePrefix(),
				ecorePackage.getEString(), "tableNamePrefix", null, 0, 1,
				MappingStrategyDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(horizontalMappingStrategyDefEClass,
				HorizontalMappingStrategyDef.class,
				"HorizontalMappingStrategyDef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalMappingStrategyDef_Auditing(),
				ecorePackage.getEBoolean(), "auditing", null, 0, 1,
				HorizontalMappingStrategyDef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalMappingStrategyDef_Branching(),
				ecorePackage.getEBoolean(), "branching", null, 0, 1,
				HorizontalMappingStrategyDef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalMappingStrategyDef_WithRanges(),
				ecorePackage.getEBoolean(), "withRanges", null, 0, 1,
				HorizontalMappingStrategyDef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CDOServerDbDefsPackageImpl
