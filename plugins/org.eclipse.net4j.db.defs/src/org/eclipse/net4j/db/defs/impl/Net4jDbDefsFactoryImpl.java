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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.net4j.db.defs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Net4jDbDefsFactoryImpl extends EFactoryImpl implements Net4jDbDefsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Net4jDbDefsFactory init() {
		try {
			Net4jDbDefsFactory theNet4jDbDefsFactory = (Net4jDbDefsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/NET4J/db/defs/1.0.0"); 
			if (theNet4jDbDefsFactory != null) {
				return theNet4jDbDefsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Net4jDbDefsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net4jDbDefsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Net4jDbDefsPackage.DB_ADAPTER_DEF: return createDBAdapterDef();
			case Net4jDbDefsPackage.DB_CONNECTION_PROVIDER_DEF: return createDBConnectionProviderDef();
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF: return createJNDIDataSourceDef();
			case Net4jDbDefsPackage.URL_DATA_SOURCE_DEF: return createURLDataSourceDef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBAdapterDef createDBAdapterDef() {
		DBAdapterDefImpl dbAdapterDef = new DBAdapterDefImpl();
		return dbAdapterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionProviderDef createDBConnectionProviderDef() {
		DBConnectionProviderDefImpl dbConnectionProviderDef = new DBConnectionProviderDefImpl();
		return dbConnectionProviderDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JNDIDataSourceDef createJNDIDataSourceDef() {
		JNDIDataSourceDefImpl jndiDataSourceDef = new JNDIDataSourceDefImpl();
		return jndiDataSourceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLDataSourceDef createURLDataSourceDef() {
		URLDataSourceDefImpl urlDataSourceDef = new URLDataSourceDefImpl();
		return urlDataSourceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net4jDbDefsPackage getNet4jDbDefsPackage() {
		return (Net4jDbDefsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Net4jDbDefsPackage getPackage() {
		return Net4jDbDefsPackage.eINSTANCE;
	}

} //Net4jDbDefsFactoryImpl
