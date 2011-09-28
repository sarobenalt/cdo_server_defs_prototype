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
package org.eclipse.emf.cdo.server.net4j.defs.impl;

import org.eclipse.emf.cdo.server.defs.FailoverParticipantDef;

import org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage;
import org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.net4j.util.defs.impl.DefImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failover Agent Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverAgentDefImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailoverAgentDefImpl extends DefImpl implements FailoverAgentDef {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected FailoverParticipantDef repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailoverAgentDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerNet4jDefsPackage.Literals.FAILOVER_AGENT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverParticipantDef getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject) repository;
			repository = (FailoverParticipantDef) eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							CDOServerNet4jDefsPackage.FAILOVER_AGENT_DEF__REPOSITORY,
							oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailoverParticipantDef basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(FailoverParticipantDef newRepository) {
		FailoverParticipantDef oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerNet4jDefsPackage.FAILOVER_AGENT_DEF__REPOSITORY,
					oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerNet4jDefsPackage.FAILOVER_AGENT_DEF__REPOSITORY:
			if (resolve)
				return getRepository();
			return basicGetRepository();
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
		case CDOServerNet4jDefsPackage.FAILOVER_AGENT_DEF__REPOSITORY:
			setRepository((FailoverParticipantDef) newValue);
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
		case CDOServerNet4jDefsPackage.FAILOVER_AGENT_DEF__REPOSITORY:
			setRepository((FailoverParticipantDef) null);
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
		case CDOServerNet4jDefsPackage.FAILOVER_AGENT_DEF__REPOSITORY:
			return repository != null;
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

} //FailoverAgentDefImpl
