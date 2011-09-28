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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage
 * @generated
 */
public interface CDOServerNet4jDefsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDOServerNet4jDefsFactory eINSTANCE = org.eclipse.emf.cdo.server.net4j.defs.impl.CDOServerNet4jDefsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Failover Agent Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover Agent Def</em>'.
	 * @generated
	 */
	FailoverAgentDef createFailoverAgentDef();

	/**
	 * Returns a new object of class '<em>Failover Monitor Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover Monitor Def</em>'.
	 * @generated
	 */
	FailoverMonitorDef createFailoverMonitorDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDOServerNet4jDefsPackage getCDOServerNet4jDefsPackage();

} //CDOServerNet4jDefsFactory
