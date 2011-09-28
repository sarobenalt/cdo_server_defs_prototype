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
package org.eclipse.emf.cdo.server.net4j.defs;

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
 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsFactory
 * @model kind="package"
 * @generated
 */
public interface CDOServerNet4jDefsPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/emf/CDO/server/net4j/defs/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdo.server.net4j.defs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDOServerNet4jDefsPackage eINSTANCE = org.eclipse.emf.cdo.server.net4j.defs.impl.CDOServerNet4jDefsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverAgentDefImpl <em>Failover Agent Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverAgentDefImpl
	 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.CDOServerNet4jDefsPackageImpl#getFailoverAgentDef()
	 * @generated
	 */
	int FAILOVER_AGENT_DEF = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_AGENT_DEF__REPOSITORY = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failover Agent Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_AGENT_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverMonitorDefImpl <em>Failover Monitor Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverMonitorDefImpl
	 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.CDOServerNet4jDefsPackageImpl#getFailoverMonitorDef()
	 * @generated
	 */
	int FAILOVER_MONITOR_DEF = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_MONITOR_DEF__GROUP = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_MONITOR_DEF__AGENTS = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failover Monitor Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILOVER_MONITOR_DEF_FEATURE_COUNT = Net4jUtilDefsPackage.DEF_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef <em>Failover Agent Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover Agent Def</em>'.
	 * @see org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef
	 * @generated
	 */
	EClass getFailoverAgentDef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef#getRepository()
	 * @see #getFailoverAgentDef()
	 * @generated
	 */
	EReference getFailoverAgentDef_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef <em>Failover Monitor Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failover Monitor Def</em>'.
	 * @see org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef
	 * @generated
	 */
	EClass getFailoverMonitorDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef#getGroup()
	 * @see #getFailoverMonitorDef()
	 * @generated
	 */
	EAttribute getFailoverMonitorDef_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agents</em>'.
	 * @see org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef#getAgents()
	 * @see #getFailoverMonitorDef()
	 * @generated
	 */
	EReference getFailoverMonitorDef_Agents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDOServerNet4jDefsFactory getCDOServerNet4jDefsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverAgentDefImpl <em>Failover Agent Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverAgentDefImpl
		 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.CDOServerNet4jDefsPackageImpl#getFailoverAgentDef()
		 * @generated
		 */
		EClass FAILOVER_AGENT_DEF = eINSTANCE.getFailoverAgentDef();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILOVER_AGENT_DEF__REPOSITORY = eINSTANCE
				.getFailoverAgentDef_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverMonitorDefImpl <em>Failover Monitor Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverMonitorDefImpl
		 * @see org.eclipse.emf.cdo.server.net4j.defs.impl.CDOServerNet4jDefsPackageImpl#getFailoverMonitorDef()
		 * @generated
		 */
		EClass FAILOVER_MONITOR_DEF = eINSTANCE.getFailoverMonitorDef();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILOVER_MONITOR_DEF__GROUP = eINSTANCE
				.getFailoverMonitorDef_Group();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILOVER_MONITOR_DEF__AGENTS = eINSTANCE
				.getFailoverMonitorDef_Agents();

	}

} //CDOServerNet4jDefsPackage
