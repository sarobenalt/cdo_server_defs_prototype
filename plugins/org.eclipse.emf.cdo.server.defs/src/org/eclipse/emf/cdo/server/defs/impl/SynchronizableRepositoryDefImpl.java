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
package org.eclipse.emf.cdo.server.defs.impl;

import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;
import org.eclipse.emf.cdo.server.defs.RepositorySynchronizerDef;
import org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronizable Repository Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.SynchronizableRepositoryDefImpl#getSynchronizer <em>Synchronizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizableRepositoryDefImpl extends RepositoryDefImpl
		implements SynchronizableRepositoryDef {
	/**
	 * The cached value of the '{@link #getSynchronizer() <em>Synchronizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizer()
	 * @generated
	 * @ordered
	 */
	protected RepositorySynchronizerDef synchronizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizableRepositoryDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDefsPackage.Literals.SYNCHRONIZABLE_REPOSITORY_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositorySynchronizerDef getSynchronizer() {
		if (synchronizer != null && synchronizer.eIsProxy()) {
			InternalEObject oldSynchronizer = (InternalEObject) synchronizer;
			synchronizer = (RepositorySynchronizerDef) eResolveProxy(oldSynchronizer);
			if (synchronizer != oldSynchronizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER,
							oldSynchronizer, synchronizer));
			}
		}
		return synchronizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositorySynchronizerDef basicGetSynchronizer() {
		return synchronizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizer(RepositorySynchronizerDef newSynchronizer) {
		RepositorySynchronizerDef oldSynchronizer = synchronizer;
		synchronizer = newSynchronizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER,
					oldSynchronizer, synchronizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER:
			if (resolve)
				return getSynchronizer();
			return basicGetSynchronizer();
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
		case CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER:
			setSynchronizer((RepositorySynchronizerDef) newValue);
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
		case CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER:
			setSynchronizer((RepositorySynchronizerDef) null);
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
		case CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF__SYNCHRONIZER:
			return synchronizer != null;
		}
		return super.eIsSet(featureID);
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

} //SynchronizableRepositoryDefImpl
