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
package org.eclipse.emf.cdo.server.net4j.defs.impl;

import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;

import org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsFactory;
import org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage;
import org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef;
import org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.net4j.util.defs.Net4jUtilDefsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOServerNet4jDefsPackageImpl extends EPackageImpl implements
		CDOServerNet4jDefsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failoverAgentDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failoverMonitorDefEClass = null;

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
	 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDOServerNet4jDefsPackageImpl() {
		super(eNS_URI, CDOServerNet4jDefsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CDOServerNet4jDefsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDOServerNet4jDefsPackage init() {
		if (isInited)
			return (CDOServerNet4jDefsPackage) EPackage.Registry.INSTANCE
					.getEPackage(CDOServerNet4jDefsPackage.eNS_URI);

		// Obtain or create and register package
		CDOServerNet4jDefsPackageImpl theCDOServerNet4jDefsPackage = (CDOServerNet4jDefsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CDOServerNet4jDefsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CDOServerNet4jDefsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDOServerDefsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCDOServerNet4jDefsPackage.createPackageContents();

		// Initialize created meta-data
		theCDOServerNet4jDefsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDOServerNet4jDefsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDOServerNet4jDefsPackage.eNS_URI,
				theCDOServerNet4jDefsPackage);
		return theCDOServerNet4jDefsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailoverAgentDef() {
		return failoverAgentDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailoverAgentDef_Repository() {
		return (EReference) failoverAgentDefEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailoverMonitorDef() {
		return failoverMonitorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailoverMonitorDef_Group() {
		return (EAttribute) failoverMonitorDefEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailoverMonitorDef_Agents() {
		return (EReference) failoverMonitorDefEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerNet4jDefsFactory getCDOServerNet4jDefsFactory() {
		return (CDOServerNet4jDefsFactory) getEFactoryInstance();
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
		failoverAgentDefEClass = createEClass(FAILOVER_AGENT_DEF);
		createEReference(failoverAgentDefEClass, FAILOVER_AGENT_DEF__REPOSITORY);

		failoverMonitorDefEClass = createEClass(FAILOVER_MONITOR_DEF);
		createEAttribute(failoverMonitorDefEClass, FAILOVER_MONITOR_DEF__GROUP);
		createEReference(failoverMonitorDefEClass, FAILOVER_MONITOR_DEF__AGENTS);
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
		CDOServerDefsPackage theCDOServerDefsPackage = (CDOServerDefsPackage) EPackage.Registry.INSTANCE
				.getEPackage(CDOServerDefsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		failoverAgentDefEClass.getESuperTypes().add(
				theNet4jUtilDefsPackage.getDef());
		failoverMonitorDefEClass.getESuperTypes().add(
				theNet4jUtilDefsPackage.getDef());

		// Initialize classes and features; add operations and parameters
		initEClass(failoverAgentDefEClass, FailoverAgentDef.class,
				"FailoverAgentDef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailoverAgentDef_Repository(),
				theCDOServerDefsPackage.getFailoverParticipantDef(), null,
				"repository", null, 1, 1, FailoverAgentDef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(failoverMonitorDefEClass, FailoverMonitorDef.class,
				"FailoverMonitorDef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailoverMonitorDef_Group(),
				ecorePackage.getEString(), "group", null, 1, 1,
				FailoverMonitorDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFailoverMonitorDef_Agents(),
				this.getFailoverAgentDef(), null, "agents", null, 1, -1,
				FailoverMonitorDef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CDOServerNet4jDefsPackageImpl
