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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage
 * @generated
 */
public interface Net4jDbDefsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Net4jDbDefsFactory eINSTANCE = org.eclipse.net4j.db.defs.impl.Net4jDbDefsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DB Adapter Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Adapter Def</em>'.
	 * @generated
	 */
	DBAdapterDef createDBAdapterDef();

	/**
	 * Returns a new object of class '<em>DB Connection Provider Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Connection Provider Def</em>'.
	 * @generated
	 */
	DBConnectionProviderDef createDBConnectionProviderDef();

	/**
	 * Returns a new object of class '<em>JNDI Data Source Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JNDI Data Source Def</em>'.
	 * @generated
	 */
	JNDIDataSourceDef createJNDIDataSourceDef();

	/**
	 * Returns a new object of class '<em>URL Data Source Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Data Source Def</em>'.
	 * @generated
	 */
	URLDataSourceDef createURLDataSourceDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Net4jDbDefsPackage getNet4jDbDefsPackage();

} //Net4jDbDefsFactory
