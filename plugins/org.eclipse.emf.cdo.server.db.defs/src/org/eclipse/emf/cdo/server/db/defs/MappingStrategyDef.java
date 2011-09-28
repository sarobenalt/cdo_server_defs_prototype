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

import org.eclipse.net4j.util.defs.Def;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Strategy Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isForceNamesWithID <em>Force Names With ID</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxTableNameLength <em>Max Table Name Length</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxFieldNameLength <em>Max Field Name Length</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getObjectTypeCacheSize <em>Object Type Cache Size</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isQualifiedNames <em>Qualified Names</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getTableNamePrefix <em>Table Name Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getMappingStrategyDef()
 * @model
 * @generated
 */
public interface MappingStrategyDef extends Def {
	/**
	 * Returns the value of the '<em><b>Force Names With ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Names With ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Names With ID</em>' attribute.
	 * @see #setForceNamesWithID(boolean)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getMappingStrategyDef_ForceNamesWithID()
	 * @model
	 * @generated
	 */
	boolean isForceNamesWithID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isForceNamesWithID <em>Force Names With ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Names With ID</em>' attribute.
	 * @see #isForceNamesWithID()
	 * @generated
	 */
	void setForceNamesWithID(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Table Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Table Name Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Table Name Length</em>' attribute.
	 * @see #setMaxTableNameLength(int)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getMappingStrategyDef_MaxTableNameLength()
	 * @model
	 * @generated
	 */
	int getMaxTableNameLength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxTableNameLength <em>Max Table Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Table Name Length</em>' attribute.
	 * @see #getMaxTableNameLength()
	 * @generated
	 */
	void setMaxTableNameLength(int value);

	/**
	 * Returns the value of the '<em><b>Max Field Name Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Field Name Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Field Name Length</em>' attribute.
	 * @see #setMaxFieldNameLength(int)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getMappingStrategyDef_MaxFieldNameLength()
	 * @model
	 * @generated
	 */
	int getMaxFieldNameLength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getMaxFieldNameLength <em>Max Field Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Field Name Length</em>' attribute.
	 * @see #getMaxFieldNameLength()
	 * @generated
	 */
	void setMaxFieldNameLength(int value);

	/**
	 * Returns the value of the '<em><b>Object Type Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type Cache Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Cache Size</em>' attribute.
	 * @see #setObjectTypeCacheSize(int)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getMappingStrategyDef_ObjectTypeCacheSize()
	 * @model
	 * @generated
	 */
	int getObjectTypeCacheSize();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getObjectTypeCacheSize <em>Object Type Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type Cache Size</em>' attribute.
	 * @see #getObjectTypeCacheSize()
	 * @generated
	 */
	void setObjectTypeCacheSize(int value);

	/**
	 * Returns the value of the '<em><b>Qualified Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Names</em>' attribute.
	 * @see #setQualifiedNames(boolean)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getMappingStrategyDef_QualifiedNames()
	 * @model
	 * @generated
	 */
	boolean isQualifiedNames();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#isQualifiedNames <em>Qualified Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Names</em>' attribute.
	 * @see #isQualifiedNames()
	 * @generated
	 */
	void setQualifiedNames(boolean value);

	/**
	 * Returns the value of the '<em><b>Table Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name Prefix</em>' attribute.
	 * @see #setTableNamePrefix(String)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getMappingStrategyDef_TableNamePrefix()
	 * @model
	 * @generated
	 */
	String getTableNamePrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef#getTableNamePrefix <em>Table Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name Prefix</em>' attribute.
	 * @see #getTableNamePrefix()
	 * @generated
	 */
	void setTableNamePrefix(String value);

} // MappingStrategyDef
