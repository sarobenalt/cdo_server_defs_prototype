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
import org.eclipse.emf.cdo.server.db.defs.DBStoreDef;
import org.eclipse.emf.cdo.server.db.defs.MappingStrategyDef;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;

import org.eclipse.emf.cdo.server.defs.impl.StoreDefImpl;
import org.eclipse.emf.cdo.server.internal.db.DBStore;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.db.defs.DBAdapterDef;
import org.eclipse.net4j.db.defs.DBConnectionProviderDef;
import org.eclipse.net4j.util.CheckUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Store Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.DBStoreDefImpl#getMappingStrategy <em>Mapping Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.DBStoreDefImpl#getDbAdapter <em>Db Adapter</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.DBStoreDefImpl#getDbConnectionProvider <em>Db Connection Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBStoreDefImpl extends StoreDefImpl implements DBStoreDef {
	/**
	 * The cached value of the '{@link #getMappingStrategy() <em>Mapping Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingStrategy()
	 * @generated
	 * @ordered
	 */
	protected MappingStrategyDef mappingStrategy;

	/**
	 * The cached value of the '{@link #getDbAdapter() <em>Db Adapter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbAdapter()
	 * @generated
	 * @ordered
	 */
	protected DBAdapterDef dbAdapter;

	/**
	 * The cached value of the '{@link #getDbConnectionProvider() <em>Db Connection Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbConnectionProvider()
	 * @generated
	 * @ordered
	 */
	protected DBConnectionProviderDef dbConnectionProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBStoreDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDbDefsPackage.Literals.DB_STORE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingStrategyDef getMappingStrategy() {
		if (mappingStrategy != null && mappingStrategy.eIsProxy()) {
			InternalEObject oldMappingStrategy = (InternalEObject) mappingStrategy;
			mappingStrategy = (MappingStrategyDef) eResolveProxy(oldMappingStrategy);
			if (mappingStrategy != oldMappingStrategy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							CDOServerDbDefsPackage.DB_STORE_DEF__MAPPING_STRATEGY,
							oldMappingStrategy, mappingStrategy));
			}
		}
		return mappingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingStrategyDef basicGetMappingStrategy() {
		return mappingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingStrategy(MappingStrategyDef newMappingStrategy) {
		MappingStrategyDef oldMappingStrategy = mappingStrategy;
		mappingStrategy = newMappingStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDbDefsPackage.DB_STORE_DEF__MAPPING_STRATEGY,
					oldMappingStrategy, mappingStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBAdapterDef getDbAdapter() {
		if (dbAdapter != null && dbAdapter.eIsProxy()) {
			InternalEObject oldDbAdapter = (InternalEObject) dbAdapter;
			dbAdapter = (DBAdapterDef) eResolveProxy(oldDbAdapter);
			if (dbAdapter != oldDbAdapter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDOServerDbDefsPackage.DB_STORE_DEF__DB_ADAPTER,
							oldDbAdapter, dbAdapter));
			}
		}
		return dbAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBAdapterDef basicGetDbAdapter() {
		return dbAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbAdapter(DBAdapterDef newDbAdapter) {
		DBAdapterDef oldDbAdapter = dbAdapter;
		dbAdapter = newDbAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDbDefsPackage.DB_STORE_DEF__DB_ADAPTER,
					oldDbAdapter, dbAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionProviderDef getDbConnectionProvider() {
		if (dbConnectionProvider != null && dbConnectionProvider.eIsProxy()) {
			InternalEObject oldDbConnectionProvider = (InternalEObject) dbConnectionProvider;
			dbConnectionProvider = (DBConnectionProviderDef) eResolveProxy(oldDbConnectionProvider);
			if (dbConnectionProvider != oldDbConnectionProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							CDOServerDbDefsPackage.DB_STORE_DEF__DB_CONNECTION_PROVIDER,
							oldDbConnectionProvider, dbConnectionProvider));
			}
		}
		return dbConnectionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBConnectionProviderDef basicGetDbConnectionProvider() {
		return dbConnectionProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbConnectionProvider(
			DBConnectionProviderDef newDbConnectionProvider) {
		DBConnectionProviderDef oldDbConnectionProvider = dbConnectionProvider;
		dbConnectionProvider = newDbConnectionProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.DB_STORE_DEF__DB_CONNECTION_PROVIDER,
					oldDbConnectionProvider, dbConnectionProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerDbDefsPackage.DB_STORE_DEF__MAPPING_STRATEGY:
			if (resolve)
				return getMappingStrategy();
			return basicGetMappingStrategy();
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_ADAPTER:
			if (resolve)
				return getDbAdapter();
			return basicGetDbAdapter();
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_CONNECTION_PROVIDER:
			if (resolve)
				return getDbConnectionProvider();
			return basicGetDbConnectionProvider();
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
		case CDOServerDbDefsPackage.DB_STORE_DEF__MAPPING_STRATEGY:
			setMappingStrategy((MappingStrategyDef) newValue);
			return;
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_ADAPTER:
			setDbAdapter((DBAdapterDef) newValue);
			return;
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_CONNECTION_PROVIDER:
			setDbConnectionProvider((DBConnectionProviderDef) newValue);
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
		case CDOServerDbDefsPackage.DB_STORE_DEF__MAPPING_STRATEGY:
			setMappingStrategy((MappingStrategyDef) null);
			return;
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_ADAPTER:
			setDbAdapter((DBAdapterDef) null);
			return;
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_CONNECTION_PROVIDER:
			setDbConnectionProvider((DBConnectionProviderDef) null);
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
		case CDOServerDbDefsPackage.DB_STORE_DEF__MAPPING_STRATEGY:
			return mappingStrategy != null;
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_ADAPTER:
			return dbAdapter != null;
		case CDOServerDbDefsPackage.DB_STORE_DEF__DB_CONNECTION_PROVIDER:
			return dbConnectionProvider != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @ADDED
	 */
	@Override
	protected Object createInstance() {
		DBStore store = new DBStore();
		
		store.setMappingStrategy((IMappingStrategy)mappingStrategy.getInstance());
		store.setDBAdapter((IDBAdapter)dbAdapter.getInstance());
		store.setDbConnectionProvider((IDBConnectionProvider)dbConnectionProvider.getInstance());
		
		return store;
	}

	/**
	 * @ADDED
	 */
	@Override
	protected void validateDefinition() {
		super.validateDefinition();
	    CheckUtil.checkState(getMappingStrategy() != null, "mapping strategy not set!");
	    CheckUtil.checkState(getDbAdapter() != null, "db adapter not set!");
	    CheckUtil.checkState(getDbConnectionProvider() != null, "db connection provider not set!");
	}

} //DBStoreDefImpl
