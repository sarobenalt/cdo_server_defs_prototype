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

import org.eclipse.emf.cdo.server.net4j.defs.*;

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
public class CDOServerNet4jDefsFactoryImpl extends EFactoryImpl implements
		CDOServerNet4jDefsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDOServerNet4jDefsFactory init() {
		try {
			CDOServerNet4jDefsFactory theCDOServerNet4jDefsFactory = (CDOServerNet4jDefsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/CDO/server/net4j/defs/1.0.0");
			if (theCDOServerNet4jDefsFactory != null) {
				return theCDOServerNet4jDefsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDOServerNet4jDefsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerNet4jDefsFactoryImpl() {
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
		case CDOServerNet4jDefsPackage.FAILOVER_AGENT_DEF:
			return createFailoverAgentDef();
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF:
			return createFailoverMonitorDef();
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
	public FailoverAgentDef createFailoverAgentDef() {
		FailoverAgentDefImpl failoverAgentDef = new FailoverAgentDefImpl();
		return failoverAgentDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverMonitorDef createFailoverMonitorDef() {
		FailoverMonitorDefImpl failoverMonitorDef = new FailoverMonitorDefImpl();
		return failoverMonitorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerNet4jDefsPackage getCDOServerNet4jDefsPackage() {
		return (CDOServerNet4jDefsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDOServerNet4jDefsPackage getPackage() {
		return CDOServerNet4jDefsPackage.eINSTANCE;
	}

} //CDOServerNet4jDefsFactoryImpl
