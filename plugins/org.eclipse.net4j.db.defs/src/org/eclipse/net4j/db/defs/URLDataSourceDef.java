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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Data Source Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.db.defs.URLDataSourceDef#getDbUrl <em>Db Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getURLDataSourceDef()
 * @model
 * @generated
 */
public interface URLDataSourceDef extends DataSourceDef {
	/**
	 * Returns the value of the '<em><b>Db Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Url</em>' attribute.
	 * @see #setDbUrl(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getURLDataSourceDef_DbUrl()
	 * @model required="true"
	 * @generated
	 */
	String getDbUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.URLDataSourceDef#getDbUrl <em>Db Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Url</em>' attribute.
	 * @see #getDbUrl()
	 * @generated
	 */
	void setDbUrl(String value);

} // URLDataSourceDef
