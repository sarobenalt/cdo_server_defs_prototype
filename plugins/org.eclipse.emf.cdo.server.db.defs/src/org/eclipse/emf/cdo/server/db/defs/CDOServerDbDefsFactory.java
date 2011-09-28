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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage
 * @generated
 */
public interface CDOServerDbDefsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDOServerDbDefsFactory eINSTANCE = org.eclipse.emf.cdo.server.db.defs.impl.CDOServerDbDefsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>DB Store Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Store Def</em>'.
	 * @generated
	 */
	DBStoreDef createDBStoreDef();

	/**
	 * Returns a new object of class '<em>Mapping Strategy Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Strategy Def</em>'.
	 * @generated
	 */
	MappingStrategyDef createMappingStrategyDef();

	/**
	 * Returns a new object of class '<em>Horizontal Mapping Strategy Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Mapping Strategy Def</em>'.
	 * @generated
	 */
	HorizontalMappingStrategyDef createHorizontalMappingStrategyDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDOServerDbDefsPackage getCDOServerDbDefsPackage();

} //CDOServerDbDefsFactory
