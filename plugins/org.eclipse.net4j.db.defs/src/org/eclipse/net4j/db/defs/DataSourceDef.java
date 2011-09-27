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
 * A representation of the model object '<em><b>Data Source Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.db.defs.DataSourceDef#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.DataSourceDef#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.DataSourceDef#getDbPassword <em>Db Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getDataSourceDef()
 * @model abstract="true"
 * @generated
 */
public interface DataSourceDef extends Def {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getDataSourceDef_Class()
	 * @model required="true"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.DataSourceDef#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Username</em>' attribute.
	 * @see #setDbUsername(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getDataSourceDef_DbUsername()
	 * @model
	 * @generated
	 */
	String getDbUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.DataSourceDef#getDbUsername <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Username</em>' attribute.
	 * @see #getDbUsername()
	 * @generated
	 */
	void setDbUsername(String value);

	/**
	 * Returns the value of the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Password</em>' attribute.
	 * @see #setDbPassword(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getDataSourceDef_DbPassword()
	 * @model
	 * @generated
	 */
	String getDbPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.DataSourceDef#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	void setDbPassword(String value);

} // DataSourceDef
