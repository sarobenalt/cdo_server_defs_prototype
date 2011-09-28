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

import org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage;
import org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.net4j.util.defs.impl.DefImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Strategy Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl#isForceNamesWithID <em>Force Names With ID</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl#getMaxTableNameLength <em>Max Table Name Length</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl#getMaxFieldNameLength <em>Max Field Name Length</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl#getObjectTypeCacheSize <em>Object Type Cache Size</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl#isQualifiedNames <em>Qualified Names</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.MappingStrategyDefImpl#getTableNamePrefix <em>Table Name Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingStrategyDefImpl extends DefImpl implements
		MappingStrategyDef {
	/**
	 * The default value of the '{@link #isForceNamesWithID() <em>Force Names With ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceNamesWithID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCE_NAMES_WITH_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForceNamesWithID() <em>Force Names With ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForceNamesWithID()
	 * @generated
	 * @ordered
	 */
	protected boolean forceNamesWithID = FORCE_NAMES_WITH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTableNameLength() <em>Max Table Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTableNameLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TABLE_NAME_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTableNameLength() <em>Max Table Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTableNameLength()
	 * @generated
	 * @ordered
	 */
	protected int maxTableNameLength = MAX_TABLE_NAME_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFieldNameLength() <em>Max Field Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFieldNameLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_FIELD_NAME_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxFieldNameLength() <em>Max Field Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFieldNameLength()
	 * @generated
	 * @ordered
	 */
	protected int maxFieldNameLength = MAX_FIELD_NAME_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectTypeCacheSize() <em>Object Type Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJECT_TYPE_CACHE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObjectTypeCacheSize() <em>Object Type Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeCacheSize()
	 * @generated
	 * @ordered
	 */
	protected int objectTypeCacheSize = OBJECT_TYPE_CACHE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isQualifiedNames() <em>Qualified Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQualifiedNames()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUALIFIED_NAMES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQualifiedNames() <em>Qualified Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQualifiedNames()
	 * @generated
	 * @ordered
	 */
	protected boolean qualifiedNames = QUALIFIED_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableNamePrefix() <em>Table Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableNamePrefix() <em>Table Name Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected String tableNamePrefix = TABLE_NAME_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingStrategyDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDbDefsPackage.Literals.MAPPING_STRATEGY_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForceNamesWithID() {
		return forceNamesWithID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceNamesWithID(boolean newForceNamesWithID) {
		boolean oldForceNamesWithID = forceNamesWithID;
		forceNamesWithID = newForceNamesWithID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID,
					oldForceNamesWithID, forceNamesWithID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTableNameLength() {
		return maxTableNameLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTableNameLength(int newMaxTableNameLength) {
		int oldMaxTableNameLength = maxTableNameLength;
		maxTableNameLength = newMaxTableNameLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH,
					oldMaxTableNameLength, maxTableNameLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxFieldNameLength() {
		return maxFieldNameLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFieldNameLength(int newMaxFieldNameLength) {
		int oldMaxFieldNameLength = maxFieldNameLength;
		maxFieldNameLength = newMaxFieldNameLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH,
					oldMaxFieldNameLength, maxFieldNameLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObjectTypeCacheSize() {
		return objectTypeCacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeCacheSize(int newObjectTypeCacheSize) {
		int oldObjectTypeCacheSize = objectTypeCacheSize;
		objectTypeCacheSize = newObjectTypeCacheSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE,
					oldObjectTypeCacheSize, objectTypeCacheSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQualifiedNames() {
		return qualifiedNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedNames(boolean newQualifiedNames) {
		boolean oldQualifiedNames = qualifiedNames;
		qualifiedNames = newQualifiedNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__QUALIFIED_NAMES,
					oldQualifiedNames, qualifiedNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableNamePrefix() {
		return tableNamePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableNamePrefix(String newTableNamePrefix) {
		String oldTableNamePrefix = tableNamePrefix;
		tableNamePrefix = newTableNamePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX,
					oldTableNamePrefix, tableNamePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID:
			return isForceNamesWithID();
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH:
			return getMaxTableNameLength();
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH:
			return getMaxFieldNameLength();
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE:
			return getObjectTypeCacheSize();
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__QUALIFIED_NAMES:
			return isQualifiedNames();
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX:
			return getTableNamePrefix();
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
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID:
			setForceNamesWithID((Boolean) newValue);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH:
			setMaxTableNameLength((Integer) newValue);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH:
			setMaxFieldNameLength((Integer) newValue);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE:
			setObjectTypeCacheSize((Integer) newValue);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__QUALIFIED_NAMES:
			setQualifiedNames((Boolean) newValue);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX:
			setTableNamePrefix((String) newValue);
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
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID:
			setForceNamesWithID(FORCE_NAMES_WITH_ID_EDEFAULT);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH:
			setMaxTableNameLength(MAX_TABLE_NAME_LENGTH_EDEFAULT);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH:
			setMaxFieldNameLength(MAX_FIELD_NAME_LENGTH_EDEFAULT);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE:
			setObjectTypeCacheSize(OBJECT_TYPE_CACHE_SIZE_EDEFAULT);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__QUALIFIED_NAMES:
			setQualifiedNames(QUALIFIED_NAMES_EDEFAULT);
			return;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX:
			setTableNamePrefix(TABLE_NAME_PREFIX_EDEFAULT);
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
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__FORCE_NAMES_WITH_ID:
			return forceNamesWithID != FORCE_NAMES_WITH_ID_EDEFAULT;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_TABLE_NAME_LENGTH:
			return maxTableNameLength != MAX_TABLE_NAME_LENGTH_EDEFAULT;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__MAX_FIELD_NAME_LENGTH:
			return maxFieldNameLength != MAX_FIELD_NAME_LENGTH_EDEFAULT;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__OBJECT_TYPE_CACHE_SIZE:
			return objectTypeCacheSize != OBJECT_TYPE_CACHE_SIZE_EDEFAULT;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__QUALIFIED_NAMES:
			return qualifiedNames != QUALIFIED_NAMES_EDEFAULT;
		case CDOServerDbDefsPackage.MAPPING_STRATEGY_DEF__TABLE_NAME_PREFIX:
			return TABLE_NAME_PREFIX_EDEFAULT == null ? tableNamePrefix != null
					: !TABLE_NAME_PREFIX_EDEFAULT.equals(tableNamePrefix);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (forceNamesWithID: ");
		result.append(forceNamesWithID);
		result.append(", maxTableNameLength: ");
		result.append(maxTableNameLength);
		result.append(", maxFieldNameLength: ");
		result.append(maxFieldNameLength);
		result.append(", objectTypeCacheSize: ");
		result.append(objectTypeCacheSize);
		result.append(", qualifiedNames: ");
		result.append(qualifiedNames);
		result.append(", tableNamePrefix: ");
		result.append(tableNamePrefix);
		result.append(')');
		return result.toString();
	}

	/**
	 * @ADDED
	 */
	@Override
	protected Object createInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @ADDED
	 */
	@Override
	protected void validateDefinition() {
		// TODO Auto-generated method stub
		super.validateDefinition();
	}

} //MappingStrategyDefImpl
