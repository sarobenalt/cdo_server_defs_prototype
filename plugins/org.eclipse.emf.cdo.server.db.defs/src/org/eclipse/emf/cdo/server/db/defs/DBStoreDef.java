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

import org.eclipse.emf.cdo.server.defs.StoreDef;

import org.eclipse.net4j.db.defs.DBAdapterDef;
import org.eclipse.net4j.db.defs.DBConnectionProviderDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Store Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getMappingStrategy <em>Mapping Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbAdapter <em>Db Adapter</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbConnectionProvider <em>Db Connection Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getDBStoreDef()
 * @model
 * @generated
 */
public interface DBStoreDef extends StoreDef {
	/**
	 * Returns the value of the '<em><b>Mapping Strategy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Strategy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Strategy</em>' reference.
	 * @see #setMappingStrategy(MappingStrategyDef)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getDBStoreDef_MappingStrategy()
	 * @model required="true"
	 * @generated
	 */
	MappingStrategyDef getMappingStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getMappingStrategy <em>Mapping Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Strategy</em>' reference.
	 * @see #getMappingStrategy()
	 * @generated
	 */
	void setMappingStrategy(MappingStrategyDef value);

	/**
	 * Returns the value of the '<em><b>Db Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Adapter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Adapter</em>' reference.
	 * @see #setDbAdapter(DBAdapterDef)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getDBStoreDef_DbAdapter()
	 * @model required="true"
	 * @generated
	 */
	DBAdapterDef getDbAdapter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbAdapter <em>Db Adapter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Adapter</em>' reference.
	 * @see #getDbAdapter()
	 * @generated
	 */
	void setDbAdapter(DBAdapterDef value);

	/**
	 * Returns the value of the '<em><b>Db Connection Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Connection Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Connection Provider</em>' reference.
	 * @see #setDbConnectionProvider(DBConnectionProviderDef)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getDBStoreDef_DbConnectionProvider()
	 * @model required="true"
	 * @generated
	 */
	DBConnectionProviderDef getDbConnectionProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.DBStoreDef#getDbConnectionProvider <em>Db Connection Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Connection Provider</em>' reference.
	 * @see #getDbConnectionProvider()
	 * @generated
	 */
	void setDbConnectionProvider(DBConnectionProviderDef value);

} // DBStoreDef
