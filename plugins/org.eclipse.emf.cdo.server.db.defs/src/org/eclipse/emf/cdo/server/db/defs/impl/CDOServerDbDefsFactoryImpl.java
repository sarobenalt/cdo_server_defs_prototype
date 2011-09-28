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
package org.eclipse.emf.cdo.server.db.defs.impl;

import org.eclipse.emf.cdo.server.db.defs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDOServerDbDefsFactoryImpl extends EFactoryImpl implements
		CDOServerDbDefsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDOServerDbDefsFactory init() {
		try {
			CDOServerDbDefsFactory theCDOServerDbDefsFactory = (CDOServerDbDefsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/CDO/server/db/defs/1.0.0");
			if (theCDOServerDbDefsFactory != null) {
				return theCDOServerDbDefsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDOServerDbDefsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDbDefsFactoryImpl() {
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
		case CDOServerDbDefsPackage.DB_STORE_DEF:
			return createDBStoreDef();
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF:
			return createMappingStrategyDef();
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF:
			return createHorizontalMappingStrategyDef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBStoreDef createDBStoreDef() {
		DBStoreDefImpl dbStoreDef = new DBStoreDefImpl();
		return dbStoreDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingStrategyDef createMappingStrategyDef() {
		MappingStrategyDefImpl mappingStrategyDef = new MappingStrategyDefImpl();
		return mappingStrategyDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalMappingStrategyDef createHorizontalMappingStrategyDef() {
		HorizontalMappingStrategyDefImpl horizontalMappingStrategyDef = new HorizontalMappingStrategyDefImpl();
		return horizontalMappingStrategyDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDbDefsPackage getCDOServerDbDefsPackage() {
		return (CDOServerDbDefsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDOServerDbDefsPackage getPackage() {
		return CDOServerDbDefsPackage.eINSTANCE;
	}

} //CDOServerDbDefsFactoryImpl
