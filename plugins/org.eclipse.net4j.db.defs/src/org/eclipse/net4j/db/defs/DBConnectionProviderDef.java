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

import org.eclipse.net4j.util.defs.Def;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Connection Provider Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.db.defs.DBConnectionProviderDef#getDataSource <em>Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getDBConnectionProviderDef()
 * @model
 * @generated
 */
public interface DBConnectionProviderDef extends Def {

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see #setDataSource(DataSourceDef)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getDBConnectionProviderDef_DataSource()
	 * @model required="true"
	 * @generated
	 */
	DataSourceDef getDataSource();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.DBConnectionProviderDef#getDataSource <em>Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSourceDef value);
} // DBConnectionProviderDef
