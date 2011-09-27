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
package org.eclipse.net4j.db.defs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.net4j.db.defs.DataSourceDef;
import org.eclipse.net4j.db.defs.Net4jDbDefsPackage;

import org.eclipse.net4j.util.defs.impl.DefImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.DataSourceDefImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.DataSourceDefImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.DataSourceDefImpl#getDbPassword <em>Db Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataSourceDefImpl extends DefImpl implements DataSourceDef {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsername()
	 * @generated
	 * @ordered
	 */
	protected String dbUsername = DB_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected String dbPassword = DB_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Net4jDbDefsPackage.Literals.DATA_SOURCE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.DATA_SOURCE_DEF__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbUsername() {
		return dbUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbUsername(String newDbUsername) {
		String oldDbUsername = dbUsername;
		dbUsername = newDbUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_USERNAME, oldDbUsername, dbUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbPassword(String newDbPassword) {
		String oldDbPassword = dbPassword;
		dbPassword = newDbPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_PASSWORD, oldDbPassword, dbPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__CLASS:
				return getClass_();
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_USERNAME:
				return getDbUsername();
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_PASSWORD:
				return getDbPassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__CLASS:
				setClass((String)newValue);
				return;
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_USERNAME:
				setDbUsername((String)newValue);
				return;
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_PASSWORD:
				setDbPassword((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_USERNAME:
				setDbUsername(DB_USERNAME_EDEFAULT);
				return;
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_PASSWORD:
				setDbPassword(DB_PASSWORD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_USERNAME:
				return DB_USERNAME_EDEFAULT == null ? dbUsername != null : !DB_USERNAME_EDEFAULT.equals(dbUsername);
			case Net4jDbDefsPackage.DATA_SOURCE_DEF__DB_PASSWORD:
				return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (class: ");
		result.append(class_);
		result.append(", dbUsername: ");
		result.append(dbUsername);
		result.append(", dbPassword: ");
		result.append(dbPassword);
		result.append(')');
		return result.toString();
	}

	/**
	 * @ADDED
	 */
	@Override
	protected abstract Object createInstance();

	/**
	 * @ADDED
	 */
	@Override
	protected void validateDefinition() {
		// TODO Auto-generated method stub
		super.validateDefinition();
	}
	
} //DataSourceDefImpl
