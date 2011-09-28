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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage
 * @generated
 */
public interface CDOServerDefsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDOServerDefsFactory eINSTANCE = org.eclipse.emf.cdo.server.defs.impl.CDOServerDefsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>CDO Server Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDO Server Def</em>'.
	 * @generated
	 */
	CDOServerDef createCDOServerDef();

	/**
	 * Returns a new object of class '<em>Store Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Def</em>'.
	 * @generated
	 */
	StoreDef createStoreDef();

	/**
	 * Returns a new object of class '<em>Mem Store Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mem Store Def</em>'.
	 * @generated
	 */
	MemStoreDef createMemStoreDef();

	/**
	 * Returns a new object of class '<em>Repository Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository Def</em>'.
	 * @generated
	 */
	RepositoryDef createRepositoryDef();

	/**
	 * Returns a new object of class '<em>Synchronizable Repository Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronizable Repository Def</em>'.
	 * @generated
	 */
	SynchronizableRepositoryDef createSynchronizableRepositoryDef();

	/**
	 * Returns a new object of class '<em>Repository Synchronizer Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository Synchronizer Def</em>'.
	 * @generated
	 */
	RepositorySynchronizerDef createRepositorySynchronizerDef();

	/**
	 * Returns a new object of class '<em>Offline Clone Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offline Clone Def</em>'.
	 * @generated
	 */
	OfflineCloneDef createOfflineCloneDef();

	/**
	 * Returns a new object of class '<em>Failover Participant Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failover Participant Def</em>'.
	 * @generated
	 */
	FailoverParticipantDef createFailoverParticipantDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDOServerDefsPackage getCDOServerDefsPackage();

} //CDOServerDefsFactory
