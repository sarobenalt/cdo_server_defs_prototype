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

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.net4j.db.defs.JNDIDataSourceDef;
import org.eclipse.net4j.db.defs.Net4jDbDefsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JNDI Data Source Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl#getJndiURL <em>Jndi URL</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl#getJndiContextFactory <em>Jndi Context Factory</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl#getJndiUsername <em>Jndi Username</em>}</li>
 *   <li>{@link org.eclipse.net4j.db.defs.impl.JNDIDataSourceDefImpl#getJndiPassword <em>Jndi Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JNDIDataSourceDefImpl extends DataSourceDefImpl implements JNDIDataSourceDef {
	/**
	 * The default value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiName()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiName()
	 * @generated
	 * @ordered
	 */
	protected String jndiName = JNDI_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiURL() <em>Jndi URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiURL()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiURL() <em>Jndi URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiURL()
	 * @generated
	 * @ordered
	 */
	protected String jndiURL = JNDI_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiContextFactory() <em>Jndi Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiContextFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_CONTEXT_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiContextFactory() <em>Jndi Context Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiContextFactory()
	 * @generated
	 * @ordered
	 */
	protected String jndiContextFactory = JNDI_CONTEXT_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiUsername() <em>Jndi Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiUsername() <em>Jndi Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiUsername()
	 * @generated
	 * @ordered
	 */
	protected String jndiUsername = JNDI_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJndiPassword() <em>Jndi Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String JNDI_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJndiPassword() <em>Jndi Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJndiPassword()
	 * @generated
	 * @ordered
	 */
	protected String jndiPassword = JNDI_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JNDIDataSourceDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Net4jDbDefsPackage.Literals.JNDI_DATA_SOURCE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiName() {
		return jndiName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiName(String newJndiName) {
		String oldJndiName = jndiName;
		jndiName = newJndiName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_NAME, oldJndiName, jndiName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiURL() {
		return jndiURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiURL(String newJndiURL) {
		String oldJndiURL = jndiURL;
		jndiURL = newJndiURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_URL, oldJndiURL, jndiURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiContextFactory() {
		return jndiContextFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiContextFactory(String newJndiContextFactory) {
		String oldJndiContextFactory = jndiContextFactory;
		jndiContextFactory = newJndiContextFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY, oldJndiContextFactory, jndiContextFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiUsername() {
		return jndiUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiUsername(String newJndiUsername) {
		String oldJndiUsername = jndiUsername;
		jndiUsername = newJndiUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_USERNAME, oldJndiUsername, jndiUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJndiPassword() {
		return jndiPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiPassword(String newJndiPassword) {
		String oldJndiPassword = jndiPassword;
		jndiPassword = newJndiPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD, oldJndiPassword, jndiPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_NAME:
				return getJndiName();
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_URL:
				return getJndiURL();
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY:
				return getJndiContextFactory();
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_USERNAME:
				return getJndiUsername();
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD:
				return getJndiPassword();
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
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_NAME:
				setJndiName((String)newValue);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_URL:
				setJndiURL((String)newValue);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY:
				setJndiContextFactory((String)newValue);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_USERNAME:
				setJndiUsername((String)newValue);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD:
				setJndiPassword((String)newValue);
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
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_NAME:
				setJndiName(JNDI_NAME_EDEFAULT);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_URL:
				setJndiURL(JNDI_URL_EDEFAULT);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY:
				setJndiContextFactory(JNDI_CONTEXT_FACTORY_EDEFAULT);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_USERNAME:
				setJndiUsername(JNDI_USERNAME_EDEFAULT);
				return;
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD:
				setJndiPassword(JNDI_PASSWORD_EDEFAULT);
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
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_NAME:
				return JNDI_NAME_EDEFAULT == null ? jndiName != null : !JNDI_NAME_EDEFAULT.equals(jndiName);
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_URL:
				return JNDI_URL_EDEFAULT == null ? jndiURL != null : !JNDI_URL_EDEFAULT.equals(jndiURL);
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_CONTEXT_FACTORY:
				return JNDI_CONTEXT_FACTORY_EDEFAULT == null ? jndiContextFactory != null : !JNDI_CONTEXT_FACTORY_EDEFAULT.equals(jndiContextFactory);
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_USERNAME:
				return JNDI_USERNAME_EDEFAULT == null ? jndiUsername != null : !JNDI_USERNAME_EDEFAULT.equals(jndiUsername);
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF__JNDI_PASSWORD:
				return JNDI_PASSWORD_EDEFAULT == null ? jndiPassword != null : !JNDI_PASSWORD_EDEFAULT.equals(jndiPassword);
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
		result.append(" (jndiName: ");
		result.append(jndiName);
		result.append(", jndiURL: ");
		result.append(jndiURL);
		result.append(", jndiContextFactory: ");
		result.append(jndiContextFactory);
		result.append(", jndiUsername: ");
		result.append(jndiUsername);
		result.append(", jndiPassword: ");
		result.append(jndiPassword);
		result.append(')');
		return result.toString();
	}

	/**
	 * @ADDED
	 */
	@Override
	protected Object createInstance() 
	{
		InitialContext ctx = null;
		Context envctx = null;
		DataSource dataSource = null;
		
		try
		{
			if (   jndiContextFactory == null
				&& jndiURL == null	
				&& jndiUsername == null
				&& jndiPassword == null)
			{
				ctx = new InitialContext();
			} else {
				Hashtable env = new Hashtable();
				
				if (jndiContextFactory != null)
					env.put(Context.INITIAL_CONTEXT_FACTORY, jndiContextFactory);
				if (jndiURL != null)
					env.put(Context.PROVIDER_URL, jndiURL);
				if (jndiUsername != null)
					env.put(Context.SECURITY_PRINCIPAL, jndiUsername);
				if (jndiPassword != null)
					env.put(Context.SECURITY_CREDENTIALS, jndiPassword);
				
				ctx = new InitialContext(env);
			}
			
			if (ctx != null)
			{
				envctx = (Context)ctx.lookup("java:/comp/env");
				
				dataSource = (DataSource)envctx.lookup(jndiName);
			}
		} catch (NamingException ne) {
			// FIXME - How should we handle exception here?
		}

		return dataSource;
	}

	/**
	 * @ADDED
	 */
	@Override
	protected void validateDefinition() {
		// TODO Auto-generated method stub
		super.validateDefinition();
	}
	
} //JNDIDataSourceDefImpl
