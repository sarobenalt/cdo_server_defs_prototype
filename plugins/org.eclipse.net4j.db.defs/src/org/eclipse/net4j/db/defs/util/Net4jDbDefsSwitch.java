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
package org.eclipse.net4j.db.defs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.net4j.db.defs.*;

import org.eclipse.net4j.util.defs.Def;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.net4j.db.defs.Net4jDbDefsPackage
 * @generated
 */
public class Net4jDbDefsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Net4jDbDefsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net4jDbDefsSwitch() {
		if (modelPackage == null) {
			modelPackage = Net4jDbDefsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Net4jDbDefsPackage.DB_ADAPTER_DEF: {
				DBAdapterDef dbAdapterDef = (DBAdapterDef)theEObject;
				T result = caseDBAdapterDef(dbAdapterDef);
				if (result == null) result = caseDef(dbAdapterDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Net4jDbDefsPackage.DB_CONNECTION_PROVIDER_DEF: {
				DBConnectionProviderDef dbConnectionProviderDef = (DBConnectionProviderDef)theEObject;
				T result = caseDBConnectionProviderDef(dbConnectionProviderDef);
				if (result == null) result = caseDef(dbConnectionProviderDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Net4jDbDefsPackage.DATA_SOURCE_DEF: {
				DataSourceDef dataSourceDef = (DataSourceDef)theEObject;
				T result = caseDataSourceDef(dataSourceDef);
				if (result == null) result = caseDef(dataSourceDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Net4jDbDefsPackage.JNDI_DATA_SOURCE_DEF: {
				JNDIDataSourceDef jndiDataSourceDef = (JNDIDataSourceDef)theEObject;
				T result = caseJNDIDataSourceDef(jndiDataSourceDef);
				if (result == null) result = caseDataSourceDef(jndiDataSourceDef);
				if (result == null) result = caseDef(jndiDataSourceDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Net4jDbDefsPackage.URL_DATA_SOURCE_DEF: {
				URLDataSourceDef urlDataSourceDef = (URLDataSourceDef)theEObject;
				T result = caseURLDataSourceDef(urlDataSourceDef);
				if (result == null) result = caseDataSourceDef(urlDataSourceDef);
				if (result == null) result = caseDef(urlDataSourceDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Adapter Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Adapter Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBAdapterDef(DBAdapterDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Connection Provider Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Connection Provider Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBConnectionProviderDef(DBConnectionProviderDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSourceDef(DataSourceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JNDI Data Source Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JNDI Data Source Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJNDIDataSourceDef(JNDIDataSourceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Data Source Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Data Source Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLDataSourceDef(URLDataSourceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDef(Def object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Net4jDbDefsSwitch
