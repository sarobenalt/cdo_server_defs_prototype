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
package org.eclipse.emf.cdo.server.defs;

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
 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsFactory
 * @model kind="package"
 * @generated
 */
public interface CDOServerDefsPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/emf/CDO/server/defs/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdo.server.defs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDOServerDefsPackage eINSTANCE = org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.CDOServerDefImpl <em>CDO Server Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getCDOServerDef()
	 * @generated
	 */
	int CDO_SERVER_DEF = 0;

	/**
	 * The feature id for the '<em><b>Acceptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SERVER_DEF__ACCEPTORS = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SERVER_DEF__REPOSITORIES = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CDO Server Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SERVER_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.StoreDefImpl <em>Store Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.StoreDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getStoreDef()
	 * @generated
	 */
	int STORE_DEF = 1;

	/**
	 * The number of structural features of the '<em>Store Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.MemStoreDefImpl <em>Mem Store Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.MemStoreDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getMemStoreDef()
	 * @generated
	 */
	int MEM_STORE_DEF = 2;

	/**
	 * The number of structural features of the '<em>Mem Store Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_STORE_DEF_FEATURE_COUNT = STORE_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl <em>Repository Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getRepositoryDef()
	 * @generated
	 */
	int REPOSITORY_DEF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__NAME = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__STORE = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Override UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__OVERRIDE_UUID = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supporting Audits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__SUPPORTING_AUDITS = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supporting Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__SUPPORTING_BRANCHES = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supporting Ecore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__SUPPORTING_ECORE = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ensure Referential Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allow Interrupt Running Queries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Repository Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.SynchronizableRepositoryDefImpl <em>Synchronizable Repository Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.SynchronizableRepositoryDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getSynchronizableRepositoryDef()
	 * @generated
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__NAME = REPOSITORY_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__STORE = REPOSITORY_DEF__STORE;

	/**
	 * The feature id for the '<em><b>Override UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__OVERRIDE_UUID = REPOSITORY_DEF__OVERRIDE_UUID;

	/**
	 * The feature id for the '<em><b>Supporting Audits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_AUDITS = REPOSITORY_DEF__SUPPORTING_AUDITS;

	/**
	 * The feature id for the '<em><b>Supporting Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_BRANCHES = REPOSITORY_DEF__SUPPORTING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Supporting Ecore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_ECORE = REPOSITORY_DEF__SUPPORTING_ECORE;

	/**
	 * The feature id for the '<em><b>Ensure Referential Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY = REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY;

	/**
	 * The feature id for the '<em><b>Allow Interrupt Running Queries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES = REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES;

	/**
	 * The feature id for the '<em><b>Synchronizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER = REPOSITORY_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Synchronizable Repository Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZABLE_REPOSITORY_DEF_FEATURE_COUNT = REPOSITORY_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.RepositorySynchronizerDefImpl <em>Repository Synchronizer Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.RepositorySynchronizerDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getRepositorySynchronizerDef()
	 * @generated
	 */
	int REPOSITORY_SYNCHRONIZER_DEF = 5;

	/**
	 * The number of structural features of the '<em>Repository Synchronizer Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_SYNCHRONIZER_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.OfflineCloneDefImpl <em>Offline Clone Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.OfflineCloneDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getOfflineCloneDef()
	 * @generated
	 */
	int OFFLINE_CLONE_DEF = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__NAME = SYNCHRONIZABLE_REPOSITORY_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__STORE = SYNCHRONIZABLE_REPOSITORY_DEF__STORE;

	/**
	 * The feature id for the '<em><b>Override UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__OVERRIDE_UUID = SYNCHRONIZABLE_REPOSITORY_DEF__OVERRIDE_UUID;

	/**
	 * The feature id for the '<em><b>Supporting Audits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__SUPPORTING_AUDITS = SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_AUDITS;

	/**
	 * The feature id for the '<em><b>Supporting Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__SUPPORTING_BRANCHES = SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Supporting Ecore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__SUPPORTING_ECORE = SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_ECORE;

	/**
	 * The feature id for the '<em><b>Ensure Referential Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__ENSURE_REFERENTIAL_INTEGRITY = SYNCHRONIZABLE_REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY;

	/**
	 * The feature id for the '<em><b>Allow Interrupt Running Queries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES = SYNCHRONIZABLE_REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES;

	/**
	 * The feature id for the '<em><b>Synchronizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF__SYNCHRONIZER = SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER;

	/**
	 * The number of structural features of the '<em>Offline Clone Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_CLONE_DEF_FEATURE_COUNT = SYNCHRONIZABLE_REPOSITORY_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.defs.impl.FailoverParticipantDefImpl <em>Failover Participant Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.defs.impl.FailoverParticipantDefImpl
	 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getFailoverParticipantDef()
	 * @generated
	 */
	int FAILOVER_PARTICIPANT_DEF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__NAME = SYNCHRONIZABLE_REPOSITORY_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__STORE = SYNCHRONIZABLE_REPOSITORY_DEF__STORE;

	/**
	 * The feature id for the '<em><b>Override UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__OVERRIDE_UUID = SYNCHRONIZABLE_REPOSITORY_DEF__OVERRIDE_UUID;

	/**
	 * The feature id for the '<em><b>Supporting Audits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__SUPPORTING_AUDITS = SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_AUDITS;

	/**
	 * The feature id for the '<em><b>Supporting Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__SUPPORTING_BRANCHES = SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_BRANCHES;

	/**
	 * The feature id for the '<em><b>Supporting Ecore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__SUPPORTING_ECORE = SYNCHRONIZABLE_REPOSITORY_DEF__SUPPORTING_ECORE;

	/**
	 * The feature id for the '<em><b>Ensure Referential Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__ENSURE_REFERENTIAL_INTEGRITY = SYNCHRONIZABLE_REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY;

	/**
	 * The feature id for the '<em><b>Allow Interrupt Running Queries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES = SYNCHRONIZABLE_REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES;

	/**
	 * The feature id for the '<em><b>Synchronizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__SYNCHRONIZER = SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER;

	/**
	 * The feature id for the '<em><b>Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__MASTER = SYNCHRONIZABLE_REPOSITORY_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Backup Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS = SYNCHRONIZABLE_REPOSITORY_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failover Participant Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_PARTICIPANT_DEF_FEATURE_COUNT = SYNCHRONIZABLE_REPOSITORY_DEF_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.CDOServerDef <em>CDO Server Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO Server Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDef
	 * @generated
	 */
	EClass getCDOServerDef();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.cdo.server.defs.CDOServerDef#getAcceptors <em>Acceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acceptors</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDef#getAcceptors()
	 * @see #getCDOServerDef()
	 * @generated
	 */
	EReference getCDOServerDef_Acceptors();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.cdo.server.defs.CDOServerDef#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repositories</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDef#getRepositories()
	 * @see #getCDOServerDef()
	 * @generated
	 */
	EReference getCDOServerDef_Repositories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.StoreDef <em>Store Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.StoreDef
	 * @generated
	 */
	EClass getStoreDef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.MemStoreDef <em>Mem Store Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem Store Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.MemStoreDef
	 * @generated
	 */
	EClass getMemStoreDef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef <em>Repository Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef
	 * @generated
	 */
	EClass getRepositoryDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#getName()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EAttribute getRepositoryDef_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#getStore()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EReference getRepositoryDef_Store();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getOverrideUUID <em>Override UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override UUID</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#getOverrideUUID()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EAttribute getRepositoryDef_OverrideUUID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingAudits <em>Supporting Audits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supporting Audits</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingAudits()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EAttribute getRepositoryDef_SupportingAudits();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingBranches <em>Supporting Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supporting Branches</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingBranches()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EAttribute getRepositoryDef_SupportingBranches();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingEcore <em>Supporting Ecore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supporting Ecore</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingEcore()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EAttribute getRepositoryDef_SupportingEcore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isEnsureReferentialIntegrity <em>Ensure Referential Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ensure Referential Integrity</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#isEnsureReferentialIntegrity()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EAttribute getRepositoryDef_EnsureReferentialIntegrity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isAllowInterruptRunningQueries <em>Allow Interrupt Running Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Interrupt Running Queries</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositoryDef#isAllowInterruptRunningQueries()
	 * @see #getRepositoryDef()
	 * @generated
	 */
	EAttribute getRepositoryDef_AllowInterruptRunningQueries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef <em>Synchronizable Repository Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronizable Repository Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef
	 * @generated
	 */
	EClass getSynchronizableRepositoryDef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef#getSynchronizer <em>Synchronizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronizer</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef#getSynchronizer()
	 * @see #getSynchronizableRepositoryDef()
	 * @generated
	 */
	EReference getSynchronizableRepositoryDef_Synchronizer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.RepositorySynchronizerDef <em>Repository Synchronizer Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Synchronizer Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.RepositorySynchronizerDef
	 * @generated
	 */
	EClass getRepositorySynchronizerDef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.OfflineCloneDef <em>Offline Clone Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offline Clone Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.OfflineCloneDef
	 * @generated
	 */
	EClass getOfflineCloneDef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef <em>Failover Participant Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover Participant Def</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.FailoverParticipantDef
	 * @generated
	 */
	EClass getFailoverParticipantDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isMaster()
	 * @see #getFailoverParticipantDef()
	 * @generated
	 */
	EAttribute getFailoverParticipantDef_Master();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isAllowBackupCommits <em>Allow Backup Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Backup Commits</em>'.
	 * @see org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isAllowBackupCommits()
	 * @see #getFailoverParticipantDef()
	 * @generated
	 */
	EAttribute getFailoverParticipantDef_AllowBackupCommits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDOServerDefsFactory getCDOServerDefsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.CDOServerDefImpl <em>CDO Server Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getCDOServerDef()
		 * @generated
		 */
		EClass CDO_SERVER_DEF = eINSTANCE.getCDOServerDef();

		/**
		 * The meta object literal for the '<em><b>Acceptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDO_SERVER_DEF__ACCEPTORS = eINSTANCE
				.getCDOServerDef_Acceptors();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDO_SERVER_DEF__REPOSITORIES = eINSTANCE
				.getCDOServerDef_Repositories();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.StoreDefImpl <em>Store Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.StoreDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getStoreDef()
		 * @generated
		 */
		EClass STORE_DEF = eINSTANCE.getStoreDef();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.MemStoreDefImpl <em>Mem Store Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.MemStoreDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getMemStoreDef()
		 * @generated
		 */
		EClass MEM_STORE_DEF = eINSTANCE.getMemStoreDef();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl <em>Repository Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getRepositoryDef()
		 * @generated
		 */
		EClass REPOSITORY_DEF = eINSTANCE.getRepositoryDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEF__NAME = eINSTANCE.getRepositoryDef_Name();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_DEF__STORE = eINSTANCE.getRepositoryDef_Store();

		/**
		 * The meta object literal for the '<em><b>Override UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEF__OVERRIDE_UUID = eINSTANCE
				.getRepositoryDef_OverrideUUID();

		/**
		 * The meta object literal for the '<em><b>Supporting Audits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEF__SUPPORTING_AUDITS = eINSTANCE
				.getRepositoryDef_SupportingAudits();

		/**
		 * The meta object literal for the '<em><b>Supporting Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEF__SUPPORTING_BRANCHES = eINSTANCE
				.getRepositoryDef_SupportingBranches();

		/**
		 * The meta object literal for the '<em><b>Supporting Ecore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEF__SUPPORTING_ECORE = eINSTANCE
				.getRepositoryDef_SupportingEcore();

		/**
		 * The meta object literal for the '<em><b>Ensure Referential Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY = eINSTANCE
				.getRepositoryDef_EnsureReferentialIntegrity();

		/**
		 * The meta object literal for the '<em><b>Allow Interrupt Running Queries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES = eINSTANCE
				.getRepositoryDef_AllowInterruptRunningQueries();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.SynchronizableRepositoryDefImpl <em>Synchronizable Repository Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.SynchronizableRepositoryDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getSynchronizableRepositoryDef()
		 * @generated
		 */
		EClass SYNCHRONIZABLE_REPOSITORY_DEF = eINSTANCE
				.getSynchronizableRepositoryDef();

		/**
		 * The meta object literal for the '<em><b>Synchronizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER = eINSTANCE
				.getSynchronizableRepositoryDef_Synchronizer();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.RepositorySynchronizerDefImpl <em>Repository Synchronizer Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.RepositorySynchronizerDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getRepositorySynchronizerDef()
		 * @generated
		 */
		EClass REPOSITORY_SYNCHRONIZER_DEF = eINSTANCE
				.getRepositorySynchronizerDef();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.OfflineCloneDefImpl <em>Offline Clone Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.OfflineCloneDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getOfflineCloneDef()
		 * @generated
		 */
		EClass OFFLINE_CLONE_DEF = eINSTANCE.getOfflineCloneDef();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.defs.impl.FailoverParticipantDefImpl <em>Failover Participant Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.defs.impl.FailoverParticipantDefImpl
		 * @see org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsPackageImpl#getFailoverParticipantDef()
		 * @generated
		 */
		EClass FAILOVER_PARTICIPANT_DEF = eINSTANCE.getFailoverParticipantDef();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILOVER_PARTICIPANT_DEF__MASTER = eINSTANCE
				.getFailoverParticipantDef_Master();

		/**
		 * The meta object literal for the '<em><b>Allow Backup Commits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS = eINSTANCE
				.getFailoverParticipantDef_AllowBackupCommits();

	}

} //CDOServerDefsPackage
