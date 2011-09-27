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
package org.eclipse.net4j.db.defs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.net4j.db.defs.DBAdapterDef;
import org.eclipse.net4j.db.defs.DBConnectionProviderDef;
import org.eclipse.net4j.db.defs.DataSourceDef;
import org.eclipse.net4j.db.defs.JNDIDataSourceDef;
import org.eclipse.net4j.db.defs.Net4jDbDefsFactory;
import org.eclipse.net4j.db.defs.Net4jDbDefsPackage;
import org.eclipse.net4j.db.defs.URLDataSourceDef;
import org.eclipse.net4j.util.defs.Net4jUtilDefsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Net4jDbDefsPackageImpl extends EPackageImpl implements Net4jDbDefsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbAdapterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbConnectionProviderDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jndiDataSourceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlDataSourceDefEClass = null;

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
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Net4jDbDefsPackageImpl() {
		super(eNS_URI, Net4jDbDefsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Net4jDbDefsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Net4jDbDefsPackage init() {
		if (isInited) return (Net4jDbDefsPackage)EPackage.Registry.INSTANCE.getEPackage(Net4jDbDefsPackage.eNS_URI);

		// Obtain or create and register package
		Net4jDbDefsPackageImpl theNet4jDbDefsPackage = (Net4jDbDefsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Net4jDbDefsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Net4jDbDefsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Net4jUtilDefsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNet4jDbDefsPackage.createPackageContents();

		// Initialize created meta-data
		theNet4jDbDefsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNet4jDbDefsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Net4jDbDefsPackage.eNS_URI, theNet4jDbDefsPackage);
		return theNet4jDbDefsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBAdapterDef() {
		return dbAdapterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBAdapterDef_Type() {
		return (EAttribute)dbAdapterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBConnectionProviderDef() {
		return dbConnectionProviderDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBConnectionProviderDef_DataSource() {
		return (EReference)dbConnectionProviderDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceDef() {
		return dataSourceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceDef_Class() {
		return (EAttribute)dataSourceDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceDef_DbUsername() {
		return (EAttribute)dataSourceDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSourceDef_DbPassword() {
		return (EAttribute)dataSourceDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJNDIDataSourceDef() {
		return jndiDataSourceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNDIDataSourceDef_JndiName() {
		return (EAttribute)jndiDataSourceDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNDIDataSourceDef_JndiURL() {
		return (EAttribute)jndiDataSourceDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNDIDataSourceDef_JndiContextFactory() {
		return (EAttribute)jndiDataSourceDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNDIDataSourceDef_JndiUsername() {
		return (EAttribute)jndiDataSourceDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJNDIDataSourceDef_JndiPassword() {
		return (EAttribute)jndiDataSourceDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLDataSourceDef() {
		return urlDataSourceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLDataSourceDef_DbUrl() {
		return (EAttribute)urlDataSourceDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net4jDbDefsFactory getNet4jDbDefsFactory() {
		return (Net4jDbDefsFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dbAdapterDefEClass = createEClass(DB_ADAPTER_DEF);
		createEAttribute(dbAdapterDefEClass, DB_ADAPTER_DEF__TYPE);

		dbConnectionProviderDefEClass = createEClass(DB_CONNECTION_PROVIDER_DEF);
		createEReference(dbConnectionProviderDefEClass, DB_CONNECTION_PROVIDER_DEF__DATA_SOURCE);

		dataSourceDefEClass = createEClass(DATA_SOURCE_DEF);
		createEAttribute(dataSourceDefEClass, DATA_SOURCE_DEF__CLASS);
		createEAttribute(dataSourceDefEClass, DATA_SOURCE_DEF__DB_USERNAME);
		createEAttribute(dataSourceDefEClass, DATA_SOURCE_DEF__DB_PASSWORD);

		jndiDataSourceDefEClass = createEClass(JNDI_DATA_SOURCE_DEF);
		createEAttribute(jndiDataSourceDefEClass, JNDI_DATA_SOURCE_DEF__JNDI_NAME);
		createEAttribute(jndiDataSourceDefEClass, JNDI_DATA_SOURCE_DEF__JNDI_URL);
		createEAttribute(jndiDataSourceDefEClass, JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY);
		createEAttribute(jndiDataSourceDefEClass, JNDI_DATA_SOURCE_DEF__JNDI_USERNAME);
		createEAttribute(jndiDataSourceDefEClass, JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD);

		urlDataSourceDefEClass = createEClass(URL_DATA_SOURCE_DEF);
		createEAttribute(urlDataSourceDefEClass, URL_DATA_SOURCE_DEF__DB_URL);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Net4jUtilDefsPackage theNet4jUtilDefsPackage = (Net4jUtilDefsPackage)EPackage.Registry.INSTANCE.getEPackage(Net4jUtilDefsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dbAdapterDefEClass.getESuperTypes().add(theNet4jUtilDefsPackage.getDef());
		dbConnectionProviderDefEClass.getESuperTypes().add(theNet4jUtilDefsPackage.getDef());
		dataSourceDefEClass.getESuperTypes().add(theNet4jUtilDefsPackage.getDef());
		jndiDataSourceDefEClass.getESuperTypes().add(this.getDataSourceDef());
		urlDataSourceDefEClass.getESuperTypes().add(this.getDataSourceDef());

		// Initialize classes and features; add operations and parameters
		initEClass(dbAdapterDefEClass, DBAdapterDef.class, "DBAdapterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBAdapterDef_Type(), ecorePackage.getEString(), "type", null, 1, 1, DBAdapterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbConnectionProviderDefEClass, DBConnectionProviderDef.class, "DBConnectionProviderDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBConnectionProviderDef_DataSource(), this.getDataSourceDef(), null, "dataSource", null, 1, 1, DBConnectionProviderDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceDefEClass, DataSourceDef.class, "DataSourceDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSourceDef_Class(), ecorePackage.getEString(), "class", null, 1, 1, DataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceDef_DbUsername(), ecorePackage.getEString(), "dbUsername", null, 0, 1, DataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSourceDef_DbPassword(), ecorePackage.getEString(), "dbPassword", null, 0, 1, DataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jndiDataSourceDefEClass, JNDIDataSourceDef.class, "JNDIDataSourceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJNDIDataSourceDef_JndiName(), ecorePackage.getEString(), "jndiName", null, 1, 1, JNDIDataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJNDIDataSourceDef_JndiURL(), ecorePackage.getEString(), "jndiURL", null, 0, 1, JNDIDataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJNDIDataSourceDef_JndiContextFactory(), ecorePackage.getEString(), "jndiContextFactory", null, 0, 1, JNDIDataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJNDIDataSourceDef_JndiUsername(), ecorePackage.getEString(), "jndiUsername", null, 0, 1, JNDIDataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJNDIDataSourceDef_JndiPassword(), ecorePackage.getEString(), "jndiPassword", null, 0, 1, JNDIDataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlDataSourceDefEClass, URLDataSourceDef.class, "URLDataSourceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLDataSourceDef_DbUrl(), ecorePackage.getEString(), "dbUrl", null, 1, 1, URLDataSourceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Net4jDbDefsPackageImpl
