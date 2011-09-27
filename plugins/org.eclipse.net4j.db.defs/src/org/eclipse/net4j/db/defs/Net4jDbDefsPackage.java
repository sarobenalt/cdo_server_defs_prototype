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
package org.eclipse.net4j.db.defs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.net4j.util.defs.Net4jUtilDefsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.net4j.db.defs.Net4jDbDefsFactory
 * @model kind="package"
 * @generated
 */
public interface Net4jDbDefsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "defs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/NET4J/db/defs/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net4j.db.defs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Net4jDbDefsPackage eINSTANCE = org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.net4j.db.defs.impl.DBAdapterDefImpl <em>DB Adapter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.net4j.db.defs.impl.DBAdapterDefImpl
	 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getDBAdapterDef()
	 * @generated
	 */
	int DB_ADAPTER_DEF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ADAPTER_DEF__TYPE = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DB Adapter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ADAPTER_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.net4j.db.defs.impl.DBConnectionProviderDefImpl <em>DB Connection Provider Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.net4j.db.defs.impl.DBConnectionProviderDefImpl
	 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getDBConnectionProviderDef()
	 * @generated
	 */
	int DB_CONNECTION_PROVIDER_DEF = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_CONNECTION_PROVIDER_DEF__DATA_SOURCE = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DB Connection Provider Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_CONNECTION_PROVIDER_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.net4j.db.defs.impl.DataSourceDefImpl <em>Data Source Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.net4j.db.defs.impl.DataSourceDefImpl
	 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getDataSourceDef()
	 * @generated
	 */
	int DATA_SOURCE_DEF = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEF__CLASS = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEF__DB_USERNAME = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEF__DB_PASSWORD = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl <em>JNDI Data Source Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl
	 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getJNDIDataSourceDef()
	 * @generated
	 */
	int JNDI_DATA_SOURCE_DEF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__CLASS = DATA_SOURCE_DEF__CLASS;

	/**
	 * The feature id for the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__DB_USERNAME = DATA_SOURCE_DEF__DB_USERNAME;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__DB_PASSWORD = DATA_SOURCE_DEF__DB_PASSWORD;

	/**
	 * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__JNDI_NAME = DATA_SOURCE_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jndi URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__JNDI_URL = DATA_SOURCE_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jndi Context Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY = DATA_SOURCE_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jndi Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__JNDI_USERNAME = DATA_SOURCE_DEF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jndi Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD = DATA_SOURCE_DEF_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>JNDI Data Source Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JNDI_DATA_SOURCE_DEF_FEATURE_COUNT = DATA_SOURCE_DEF_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.net4j.db.defs.impl.URLDataSourceDefImpl <em>URL Data Source Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.net4j.db.defs.impl.URLDataSourceDefImpl
	 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getURLDataSourceDef()
	 * @generated
	 */
	int URL_DATA_SOURCE_DEF = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DATA_SOURCE_DEF__CLASS = DATA_SOURCE_DEF__CLASS;

	/**
	 * The feature id for the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DATA_SOURCE_DEF__DB_USERNAME = DATA_SOURCE_DEF__DB_USERNAME;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DATA_SOURCE_DEF__DB_PASSWORD = DATA_SOURCE_DEF__DB_PASSWORD;

	/**
	 * The feature id for the '<em><b>Db Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DATA_SOURCE_DEF__DB_URL = DATA_SOURCE_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL Data Source Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_DATA_SOURCE_DEF_FEATURE_COUNT = DATA_SOURCE_DEF_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.net4j.db.defs.DBAdapterDef <em>DB Adapter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Adapter Def</em>'.
	 * @see org.eclipse.net4j.db.defs.DBAdapterDef
	 * @generated
	 */
	EClass getDBAdapterDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.DBAdapterDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.net4j.db.defs.DBAdapterDef#getType()
	 * @see #getDBAdapterDef()
	 * @generated
	 */
	EAttribute getDBAdapterDef_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.net4j.db.defs.DBConnectionProviderDef <em>DB Connection Provider Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Connection Provider Def</em>'.
	 * @see org.eclipse.net4j.db.defs.DBConnectionProviderDef
	 * @generated
	 */
	EClass getDBConnectionProviderDef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.net4j.db.defs.DBConnectionProviderDef#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source</em>'.
	 * @see org.eclipse.net4j.db.defs.DBConnectionProviderDef#getDataSource()
	 * @see #getDBConnectionProviderDef()
	 * @generated
	 */
	EReference getDBConnectionProviderDef_DataSource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.net4j.db.defs.DataSourceDef <em>Data Source Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Def</em>'.
	 * @see org.eclipse.net4j.db.defs.DataSourceDef
	 * @generated
	 */
	EClass getDataSourceDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.DataSourceDef#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.net4j.db.defs.DataSourceDef#getClass_()
	 * @see #getDataSourceDef()
	 * @generated
	 */
	EAttribute getDataSourceDef_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.DataSourceDef#getDbUsername <em>Db Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Username</em>'.
	 * @see org.eclipse.net4j.db.defs.DataSourceDef#getDbUsername()
	 * @see #getDataSourceDef()
	 * @generated
	 */
	EAttribute getDataSourceDef_DbUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.DataSourceDef#getDbPassword <em>Db Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Password</em>'.
	 * @see org.eclipse.net4j.db.defs.DataSourceDef#getDbPassword()
	 * @see #getDataSourceDef()
	 * @generated
	 */
	EAttribute getDataSourceDef_DbPassword();

	/**
	 * Returns the meta object for class '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef <em>JNDI Data Source Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JNDI Data Source Def</em>'.
	 * @see org.eclipse.net4j.db.defs.JNDIDataSourceDef
	 * @generated
	 */
	EClass getJNDIDataSourceDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiName <em>Jndi Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Name</em>'.
	 * @see org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiName()
	 * @see #getJNDIDataSourceDef()
	 * @generated
	 */
	EAttribute getJNDIDataSourceDef_JndiName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiURL <em>Jndi URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi URL</em>'.
	 * @see org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiURL()
	 * @see #getJNDIDataSourceDef()
	 * @generated
	 */
	EAttribute getJNDIDataSourceDef_JndiURL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiContextFactory <em>Jndi Context Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Context Factory</em>'.
	 * @see org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiContextFactory()
	 * @see #getJNDIDataSourceDef()
	 * @generated
	 */
	EAttribute getJNDIDataSourceDef_JndiContextFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiUsername <em>Jndi Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Username</em>'.
	 * @see org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiUsername()
	 * @see #getJNDIDataSourceDef()
	 * @generated
	 */
	EAttribute getJNDIDataSourceDef_JndiUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiPassword <em>Jndi Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jndi Password</em>'.
	 * @see org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiPassword()
	 * @see #getJNDIDataSourceDef()
	 * @generated
	 */
	EAttribute getJNDIDataSourceDef_JndiPassword();

	/**
	 * Returns the meta object for class '{@link org.eclipse.net4j.db.defs.URLDataSourceDef <em>URL Data Source Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Data Source Def</em>'.
	 * @see org.eclipse.net4j.db.defs.URLDataSourceDef
	 * @generated
	 */
	EClass getURLDataSourceDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.net4j.db.defs.URLDataSourceDef#getDbUrl <em>Db Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Url</em>'.
	 * @see org.eclipse.net4j.db.defs.URLDataSourceDef#getDbUrl()
	 * @see #getURLDataSourceDef()
	 * @generated
	 */
	EAttribute getURLDataSourceDef_DbUrl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Net4jDbDefsFactory getNet4jDbDefsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.net4j.db.defs.impl.DBAdapterDefImpl <em>DB Adapter Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.net4j.db.defs.impl.DBAdapterDefImpl
		 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getDBAdapterDef()
		 * @generated
		 */
		EClass DB_ADAPTER_DEF = eINSTANCE.getDBAdapterDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_ADAPTER_DEF__TYPE = eINSTANCE.getDBAdapterDef_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.net4j.db.defs.impl.DBConnectionProviderDefImpl <em>DB Connection Provider Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.net4j.db.defs.impl.DBConnectionProviderDefImpl
		 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getDBConnectionProviderDef()
		 * @generated
		 */
		EClass DB_CONNECTION_PROVIDER_DEF = eINSTANCE.getDBConnectionProviderDef();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_CONNECTION_PROVIDER_DEF__DATA_SOURCE = eINSTANCE.getDBConnectionProviderDef_DataSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.net4j.db.defs.impl.DataSourceDefImpl <em>Data Source Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.net4j.db.defs.impl.DataSourceDefImpl
		 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getDataSourceDef()
		 * @generated
		 */
		EClass DATA_SOURCE_DEF = eINSTANCE.getDataSourceDef();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_DEF__CLASS = eINSTANCE.getDataSourceDef_Class();

		/**
		 * The meta object literal for the '<em><b>Db Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_DEF__DB_USERNAME = eINSTANCE.getDataSourceDef_DbUsername();

		/**
		 * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_DEF__DB_PASSWORD = eINSTANCE.getDataSourceDef_DbPassword();

		/**
		 * The meta object literal for the '{@link org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl <em>JNDI Data Source Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl
		 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getJNDIDataSourceDef()
		 * @generated
		 */
		EClass JNDI_DATA_SOURCE_DEF = eINSTANCE.getJNDIDataSourceDef();

		/**
		 * The meta object literal for the '<em><b>Jndi Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNDI_DATA_SOURCE_DEF__JNDI_NAME = eINSTANCE.getJNDIDataSourceDef_JndiName();

		/**
		 * The meta object literal for the '<em><b>Jndi URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNDI_DATA_SOURCE_DEF__JNDI_URL = eINSTANCE.getJNDIDataSourceDef_JndiURL();

		/**
		 * The meta object literal for the '<em><b>Jndi Context Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY = eINSTANCE.getJNDIDataSourceDef_JndiContextFactory();

		/**
		 * The meta object literal for the '<em><b>Jndi Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNDI_DATA_SOURCE_DEF__JNDI_USERNAME = eINSTANCE.getJNDIDataSourceDef_JndiUsername();

		/**
		 * The meta object literal for the '<em><b>Jndi Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD = eINSTANCE.getJNDIDataSourceDef_JndiPassword();

		/**
		 * The meta object literal for the '{@link org.eclipse.net4j.db.defs.impl.URLDataSourceDefImpl <em>URL Data Source Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.net4j.db.defs.impl.URLDataSourceDefImpl
		 * @see org.eclipse.net4j.db.defs.impl.Net4jDbDefsPackageImpl#getURLDataSourceDef()
		 * @generated
		 */
		EClass URL_DATA_SOURCE_DEF = eINSTANCE.getURLDataSourceDef();

		/**
		 * The meta object literal for the '<em><b>Db Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_DATA_SOURCE_DEF__DB_URL = eINSTANCE.getURLDataSourceDef_DbUrl();

	}

} //Net4jDbDefsPackage
