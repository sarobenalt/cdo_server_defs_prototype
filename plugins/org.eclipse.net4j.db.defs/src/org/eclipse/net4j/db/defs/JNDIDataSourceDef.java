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
 * A representation of the model object '<em><b>JNDI Data Source Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiURL <em>Jndi URL</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiContextFactory <em>Jndi Context Factory</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiUsername <em>Jndi Username</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiPassword <em>Jndi Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getJNDIDataSourceDef()
 * @model
 * @generated
 */
public interface JNDIDataSourceDef extends DataSourceDef {
	/**
	 * Returns the value of the '<em><b>Jndi Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Name</em>' attribute.
	 * @see #setJndiName(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getJNDIDataSourceDef_JndiName()
	 * @model required="true"
	 * @generated
	 */
	String getJndiName();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiName <em>Jndi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Name</em>' attribute.
	 * @see #getJndiName()
	 * @generated
	 */
	void setJndiName(String value);

	/**
	 * Returns the value of the '<em><b>Jndi URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi URL</em>' attribute.
	 * @see #setJndiURL(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getJNDIDataSourceDef_JndiURL()
	 * @model
	 * @generated
	 */
	String getJndiURL();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiURL <em>Jndi URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi URL</em>' attribute.
	 * @see #getJndiURL()
	 * @generated
	 */
	void setJndiURL(String value);

	/**
	 * Returns the value of the '<em><b>Jndi Context Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Context Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Context Factory</em>' attribute.
	 * @see #setJndiContextFactory(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getJNDIDataSourceDef_JndiContextFactory()
	 * @model
	 * @generated
	 */
	String getJndiContextFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiContextFactory <em>Jndi Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Context Factory</em>' attribute.
	 * @see #getJndiContextFactory()
	 * @generated
	 */
	void setJndiContextFactory(String value);

	/**
	 * Returns the value of the '<em><b>Jndi Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Username</em>' attribute.
	 * @see #setJndiUsername(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getJNDIDataSourceDef_JndiUsername()
	 * @model
	 * @generated
	 */
	String getJndiUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiUsername <em>Jndi Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Username</em>' attribute.
	 * @see #getJndiUsername()
	 * @generated
	 */
	void setJndiUsername(String value);

	/**
	 * Returns the value of the '<em><b>Jndi Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Password</em>' attribute.
	 * @see #setJndiPassword(String)
	 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage#getJNDIDataSourceDef_JndiPassword()
	 * @model
	 * @generated
	 */
	String getJndiPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.net4j.db.defs.JNDIDataSourceDef#getJndiPassword <em>Jndi Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Password</em>' attribute.
	 * @see #getJndiPassword()
	 * @generated
	 */
	void setJndiPassword(String value);

} // JNDIDataSourceDef
