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

import java.util.Collection;

import org.eclipse.emf.cdo.server.defs.CDOServerDef;
import org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage;
import org.eclipse.emf.cdo.server.defs.RepositoryDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.net4j.defs.AcceptorDef;

import org.eclipse.net4j.util.defs.impl.DefImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDO Server Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.CDOServerDefImpl#getAcceptors <em>Acceptors</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.CDOServerDefImpl#getRepositories <em>Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDOServerDefImpl extends DefImpl implements CDOServerDef {
	/**
	 * The cached value of the '{@link #getAcceptors() <em>Acceptors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptors()
	 * @generated
	 * @ordered
	 */
	protected EList<AcceptorDef> acceptors;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryDef> repositories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDOServerDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDefsPackage.Literals.CDO_SERVER_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcceptorDef> getAcceptors() {
		if (acceptors == null) {
			acceptors = new EObjectResolvingEList<AcceptorDef>(
					AcceptorDef.class, this,
					CDOServerDefsPackage.CDO_SERVER_DEF__ACCEPTORS);
		}
		return acceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryDef> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectResolvingEList<RepositoryDef>(
					RepositoryDef.class, this,
					CDOServerDefsPackage.CDO_SERVER_DEF__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerDefsPackage.CDO_SERVER_DEF__ACCEPTORS:
			return getAcceptors();
		case CDOServerDefsPackage.CDO_SERVER_DEF__REPOSITORIES:
			return getRepositories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CDOServerDefsPackage.CDO_SERVER_DEF__ACCEPTORS:
			getAcceptors().clear();
			getAcceptors().addAll((Collection<? extends AcceptorDef>) newValue);
			return;
		case CDOServerDefsPackage.CDO_SERVER_DEF__REPOSITORIES:
			getRepositories().clear();
			getRepositories().addAll(
					(Collection<? extends RepositoryDef>) newValue);
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
		case CDOServerDefsPackage.CDO_SERVER_DEF__ACCEPTORS:
			getAcceptors().clear();
			return;
		case CDOServerDefsPackage.CDO_SERVER_DEF__REPOSITORIES:
			getRepositories().clear();
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
		case CDOServerDefsPackage.CDO_SERVER_DEF__ACCEPTORS:
			return acceptors != null && !acceptors.isEmpty();
		case CDOServerDefsPackage.CDO_SERVER_DEF__REPOSITORIES:
			return repositories != null && !repositories.isEmpty();
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

} //CDOServerDefImpl
