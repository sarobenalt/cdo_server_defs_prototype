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
package org.eclipse.emf.cdo.server.db.defs;

import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;

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
 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsFactory
 * @model kind="package"
 * @generated
 */
public interface CDOServerDbDefsPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/emf/CDO/server/db/defs/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdo.server.db.defs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDOServerDbDefsPackage eINSTANCE = org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.db.defs.impl.DBStoreDefImpl <em>DB Store Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.db.defs.impl.DBStoreDefImpl
	 * @see org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsPackageImpl#getDBStoreDef()
	 * @generated
	 */
	int DB_STORE_DEF = 0;

	/**
	 * The feature id for the '<em><b>Mapping Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_STORE_DEF__MAPPING_STRATEGY = CDOServerDefsPackage.STORE_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Db Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_STORE_DEF__DB_ADAPTER = CDOServerDefsPackage.STORE_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Db Connection Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_STORE_DEF__DB_CONNECTION_PROVIDER = CDOServerDefsPackage.STORE_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DB Store Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_STORE_DEF_FEATURE_COUNT = CDOServerDefsPackage.STORE_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl <em>Mapping Strategy Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl
	 * @see org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsPackageImpl#getMappingStrategyDef()
	 * @generated
	 */
	int MAPPING_STRATEGY_DEF = 1;

	/**
	 * The feature id for the '<em><b>Force Names With ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Table Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Field Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Type Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Qualified Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_STRATEGY_DEF__QUALIFIED_NAMES = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Table Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mapping Strategy Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_STRATEGY_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.db.defs.impl.HorizontalMappingStrategyDefImpl <em>Horizontal Mapping Strategy Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.db.defs.impl.HorizontalMappingStrategyDefImpl
	 * @see org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsPackageImpl#getHorizontalMappingStrategyDef()
	 * @generated
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF = 2;

	/**
	 * The feature id for the '<em><b>Force Names With ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID = MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID;

	/**
	 * The feature id for the '<em><b>Max Table Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH = MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH;

	/**
	 * The feature id for the '<em><b>Max Field Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH = MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH;

	/**
	 * The feature id for the '<em><b>Object Type Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE = MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE;

	/**
	 * The feature id for the '<em><b>Qualified Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__QUALIFIED_NAMES = MAPPING_STRATEGY_DEF__QUALIFIED_NAMES;

	/**
	 * The feature id for the '<em><b>Table Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX = MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING = MAPPING_STRATEGY_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING = MAPPING_STRATEGY_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>With Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES = MAPPING_STRATEGY_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Horizontal Mapping Strategy Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_MAPPING_STRATEGY_DEF_FEATURE_COUNT = MAPPING_STRATEGY_DEF_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef <em>DB Store Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Store Def</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.DBStoreDef
	 * @generated
	 */
	EClass getDBStoreDef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getMappingStrategy <em>Mapping Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping Strategy</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getMappingStrategy()
	 * @see #getDBStoreDef()
	 * @generated
	 */
	EReference getDBStoreDef_MappingStrategy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbAdapter <em>Db Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Db Adapter</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbAdapter()
	 * @see #getDBStoreDef()
	 * @generated
	 */
	EReference getDBStoreDef_DbAdapter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbConnectionProvider <em>Db Connection Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Db Connection Provider</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbConnectionProvider()
	 * @see #getDBStoreDef()
	 * @generated
	 */
	EReference getDBStoreDef_DbConnectionProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef <em>Mapping Strategy Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Strategy Def</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef
	 * @generated
	 */
	EClass getMappingStrategyDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isForceNamesWithID <em>Force Names With ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Names With ID</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isForceNamesWithID()
	 * @see #getMappingStrategyDef()
	 * @generated
	 */
	EAttribute getMappingStrategyDef_ForceNamesWithID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxTableNameLength <em>Max Table Name Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Table Name Length</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxTableNameLength()
	 * @see #getMappingStrategyDef()
	 * @generated
	 */
	EAttribute getMappingStrategyDef_MaxTableNameLength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxFieldNameLength <em>Max Field Name Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Field Name Length</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxFieldNameLength()
	 * @see #getMappingStrategyDef()
	 * @generated
	 */
	EAttribute getMappingStrategyDef_MaxFieldNameLength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getObjectTypeCacheSize <em>Object Type Cache Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type Cache Size</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getObjectTypeCacheSize()
	 * @see #getMappingStrategyDef()
	 * @generated
	 */
	EAttribute getMappingStrategyDef_ObjectTypeCacheSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isQualifiedNames <em>Qualified Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Names</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isQualifiedNames()
	 * @see #getMappingStrategyDef()
	 * @generated
	 */
	EAttribute getMappingStrategyDef_QualifiedNames();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getTableNamePrefix <em>Table Name Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name Prefix</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getTableNamePrefix()
	 * @see #getMappingStrategyDef()
	 * @generated
	 */
	EAttribute getMappingStrategyDef_TableNamePrefix();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef <em>Horizontal Mapping Strategy Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Mapping Strategy Def</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef
	 * @generated
	 */
	EClass getHorizontalMappingStrategyDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auditing</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isAuditing()
	 * @see #getHorizontalMappingStrategyDef()
	 * @generated
	 */
	EAttribute getHorizontalMappingStrategyDef_Auditing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isBranching <em>Branching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branching</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isBranching()
	 * @see #getHorizontalMappingStrategyDef()
	 * @generated
	 */
	EAttribute getHorizontalMappingStrategyDef_Branching();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isWithRanges <em>With Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Ranges</em>'.
	 * @see org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isWithRanges()
	 * @see #getHorizontalMappingStrategyDef()
	 * @generated
	 */
	EAttribute getHorizontalMappingStrategyDef_WithRanges();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDOServerDbDefsFactory getCDOServerDbDefsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.db.defs.impl.DBStoreDefImpl <em>DB Store Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.db.defs.impl.DBStoreDefImpl
		 * @see org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsPackageImpl#getDBStoreDef()
		 * @generated
		 */
		EClass DB_STORE_DEF = eINSTANCE.getDBStoreDef();

		/**
		 * The meta object literal for the '<em><b>Mapping Strategy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_STORE_DEF__MAPPING_STRATEGY = eINSTANCE
				.getDBStoreDef_MappingStrategy();

		/**
		 * The meta object literal for the '<em><b>Db Adapter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_STORE_DEF__DB_ADAPTER = eINSTANCE
				.getDBStoreDef_DbAdapter();

		/**
		 * The meta object literal for the '<em><b>Db Connection Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_STORE_DEF__DB_CONNECTION_PROVIDER = eINSTANCE
				.getDBStoreDef_DbConnectionProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl <em>Mapping Strategy Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl
		 * @see org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsPackageImpl#getMappingStrategyDef()
		 * @generated
		 */
		EClass MAPPING_STRATEGY_DEF = eINSTANCE.getMappingStrategyDef();

		/**
		 * The meta object literal for the '<em><b>Force Names With ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID = eINSTANCE
				.getMappingStrategyDef_ForceNamesWithID();

		/**
		 * The meta object literal for the '<em><b>Max Table Name Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH = eINSTANCE
				.getMappingStrategyDef_MaxTableNameLength();

		/**
		 * The meta object literal for the '<em><b>Max Field Name Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH = eINSTANCE
				.getMappingStrategyDef_MaxFieldNameLength();

		/**
		 * The meta object literal for the '<em><b>Object Type Cache Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE = eINSTANCE
				.getMappingStrategyDef_ObjectTypeCacheSize();

		/**
		 * The meta object literal for the '<em><b>Qualified Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_STRATEGY_DEF__QUALIFIED_NAMES = eINSTANCE
				.getMappingStrategyDef_QualifiedNames();

		/**
		 * The meta object literal for the '<em><b>Table Name Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX = eINSTANCE
				.getMappingStrategyDef_TableNamePrefix();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.db.defs.impl.HorizontalMappingStrategyDefImpl <em>Horizontal Mapping Strategy Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.db.defs.impl.HorizontalMappingStrategyDefImpl
		 * @see org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsPackageImpl#getHorizontalMappingStrategyDef()
		 * @generated
		 */
		EClass HORIZONTAL_MAPPING_STRATEGY_DEF = eINSTANCE
				.getHorizontalMappingStrategyDef();

		/**
		 * The meta object literal for the '<em><b>Auditing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING = eINSTANCE
				.getHorizontalMappingStrategyDef_Auditing();

		/**
		 * The meta object literal for the '<em><b>Branching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING = eINSTANCE
				.getHorizontalMappingStrategyDef_Branching();

		/**
		 * The meta object literal for the '<em><b>With Ranges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES = eINSTANCE
				.getHorizontalMappingStrategyDef_WithRanges();

	}

} //CDOServerDbDefsPackage
