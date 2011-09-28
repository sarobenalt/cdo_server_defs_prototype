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
import org.eclipse.emf.cdo.server.defs.RepositoryDef;
import org.eclipse.emf.cdo.server.defs.StoreDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.net4j.util.defs.impl.DefImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#getStore <em>Store</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#getOverrideUUID <em>Override UUID</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#isSupportingAudits <em>Supporting Audits</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#isSupportingBranches <em>Supporting Branches</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#isSupportingEcore <em>Supporting Ecore</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#isEnsureReferentialIntegrity <em>Ensure Referential Integrity</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.RepositoryDefImpl#isAllowInterruptRunningQueries <em>Allow Interrupt Running Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryDefImpl extends DefImpl implements RepositoryDef {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected StoreDef store;

	/**
	 * The default value of the '{@link #getOverrideUUID() <em>Override UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideUUID() <em>Override UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideUUID()
	 * @generated
	 * @ordered
	 */
	protected String overrideUUID = OVERRIDE_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportingAudits() <em>Supporting Audits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportingAudits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTING_AUDITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportingAudits() <em>Supporting Audits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportingAudits()
	 * @generated
	 * @ordered
	 */
	protected boolean supportingAudits = SUPPORTING_AUDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportingBranches() <em>Supporting Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportingBranches()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTING_BRANCHES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportingBranches() <em>Supporting Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportingBranches()
	 * @generated
	 * @ordered
	 */
	protected boolean supportingBranches = SUPPORTING_BRANCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportingEcore() <em>Supporting Ecore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportingEcore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTING_ECORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportingEcore() <em>Supporting Ecore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportingEcore()
	 * @generated
	 * @ordered
	 */
	protected boolean supportingEcore = SUPPORTING_ECORE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnsureReferentialIntegrity() <em>Ensure Referential Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnsureReferentialIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENSURE_REFERENTIAL_INTEGRITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnsureReferentialIntegrity() <em>Ensure Referential Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnsureReferentialIntegrity()
	 * @generated
	 * @ordered
	 */
	protected boolean ensureReferentialIntegrity = ENSURE_REFERENTIAL_INTEGRITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowInterruptRunningQueries() <em>Allow Interrupt Running Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowInterruptRunningQueries()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_INTERRUPT_RUNNING_QUERIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowInterruptRunningQueries() <em>Allow Interrupt Running Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowInterruptRunningQueries()
	 * @generated
	 * @ordered
	 */
	protected boolean allowInterruptRunningQueries = ALLOW_INTERRUPT_RUNNING_QUERIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDefsPackage.Literals.REPOSITORY_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDef getStore() {
		if (store != null && store.eIsProxy()) {
			InternalEObject oldStore = (InternalEObject) store;
			store = (StoreDef) eResolveProxy(oldStore);
			if (store != oldStore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDOServerDefsPackage.REPOSITORY_DEF__STORE,
							oldStore, store));
			}
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreDef basicGetStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(StoreDef newStore) {
		StoreDef oldStore = store;
		store = newStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__STORE, oldStore, store));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverrideUUID() {
		return overrideUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideUUID(String newOverrideUUID) {
		String oldOverrideUUID = overrideUUID;
		overrideUUID = newOverrideUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__OVERRIDE_UUID,
					oldOverrideUUID, overrideUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportingAudits() {
		return supportingAudits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingAudits(boolean newSupportingAudits) {
		boolean oldSupportingAudits = supportingAudits;
		supportingAudits = newSupportingAudits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_AUDITS,
					oldSupportingAudits, supportingAudits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportingBranches() {
		return supportingBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingBranches(boolean newSupportingBranches) {
		boolean oldSupportingBranches = supportingBranches;
		supportingBranches = newSupportingBranches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_BRANCHES,
					oldSupportingBranches, supportingBranches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportingEcore() {
		return supportingEcore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportingEcore(boolean newSupportingEcore) {
		boolean oldSupportingEcore = supportingEcore;
		supportingEcore = newSupportingEcore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_ECORE,
					oldSupportingEcore, supportingEcore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnsureReferentialIntegrity() {
		return ensureReferentialIntegrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnsureReferentialIntegrity(
			boolean newEnsureReferentialIntegrity) {
		boolean oldEnsureReferentialIntegrity = ensureReferentialIntegrity;
		ensureReferentialIntegrity = newEnsureReferentialIntegrity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY,
					oldEnsureReferentialIntegrity, ensureReferentialIntegrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowInterruptRunningQueries() {
		return allowInterruptRunningQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowInterruptRunningQueries(
			boolean newAllowInterruptRunningQueries) {
		boolean oldAllowInterruptRunningQueries = allowInterruptRunningQueries;
		allowInterruptRunningQueries = newAllowInterruptRunningQueries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDefsPackage.REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES,
					oldAllowInterruptRunningQueries,
					allowInterruptRunningQueries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerDefsPackage.REPOSITORY_DEF__NAME:
			return getName();
		case CDOServerDefsPackage.REPOSITORY_DEF__STORE:
			if (resolve)
				return getStore();
			return basicGetStore();
		case CDOServerDefsPackage.REPOSITORY_DEF__OVERRIDE_UUID:
			return getOverrideUUID();
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_AUDITS:
			return isSupportingAudits();
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_BRANCHES:
			return isSupportingBranches();
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_ECORE:
			return isSupportingEcore();
		case CDOServerDefsPackage.REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY:
			return isEnsureReferentialIntegrity();
		case CDOServerDefsPackage.REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES:
			return isAllowInterruptRunningQueries();
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
		case CDOServerDefsPackage.REPOSITORY_DEF__NAME:
			setName((String) newValue);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__STORE:
			setStore((StoreDef) newValue);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__OVERRIDE_UUID:
			setOverrideUUID((String) newValue);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_AUDITS:
			setSupportingAudits((Boolean) newValue);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_BRANCHES:
			setSupportingBranches((Boolean) newValue);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_ECORE:
			setSupportingEcore((Boolean) newValue);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY:
			setEnsureReferentialIntegrity((Boolean) newValue);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES:
			setAllowInterruptRunningQueries((Boolean) newValue);
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
		case CDOServerDefsPackage.REPOSITORY_DEF__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__STORE:
			setStore((StoreDef) null);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__OVERRIDE_UUID:
			setOverrideUUID(OVERRIDE_UUID_EDEFAULT);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_AUDITS:
			setSupportingAudits(SUPPORTING_AUDITS_EDEFAULT);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_BRANCHES:
			setSupportingBranches(SUPPORTING_BRANCHES_EDEFAULT);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_ECORE:
			setSupportingEcore(SUPPORTING_ECORE_EDEFAULT);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY:
			setEnsureReferentialIntegrity(ENSURE_REFERENTIAL_INTEGRITY_EDEFAULT);
			return;
		case CDOServerDefsPackage.REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES:
			setAllowInterruptRunningQueries(ALLOW_INTERRUPT_RUNNING_QUERIES_EDEFAULT);
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
		case CDOServerDefsPackage.REPOSITORY_DEF__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case CDOServerDefsPackage.REPOSITORY_DEF__STORE:
			return store != null;
		case CDOServerDefsPackage.REPOSITORY_DEF__OVERRIDE_UUID:
			return OVERRIDE_UUID_EDEFAULT == null ? overrideUUID != null
					: !OVERRIDE_UUID_EDEFAULT.equals(overrideUUID);
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_AUDITS:
			return supportingAudits != SUPPORTING_AUDITS_EDEFAULT;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_BRANCHES:
			return supportingBranches != SUPPORTING_BRANCHES_EDEFAULT;
		case CDOServerDefsPackage.REPOSITORY_DEF__SUPPORTING_ECORE:
			return supportingEcore != SUPPORTING_ECORE_EDEFAULT;
		case CDOServerDefsPackage.REPOSITORY_DEF__ENSURE_REFERENTIAL_INTEGRITY:
			return ensureReferentialIntegrity != ENSURE_REFERENTIAL_INTEGRITY_EDEFAULT;
		case CDOServerDefsPackage.REPOSITORY_DEF__ALLOW_INTERRUPT_RUNNING_QUERIES:
			return allowInterruptRunningQueries != ALLOW_INTERRUPT_RUNNING_QUERIES_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", overrideUUID: ");
		result.append(overrideUUID);
		result.append(", supportingAudits: ");
		result.append(supportingAudits);
		result.append(", supportingBranches: ");
		result.append(supportingBranches);
		result.append(", supportingEcore: ");
		result.append(supportingEcore);
		result.append(", ensureReferentialIntegrity: ");
		result.append(ensureReferentialIntegrity);
		result.append(", allowInterruptRunningQueries: ");
		result.append(allowInterruptRunningQueries);
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

} //RepositoryDefImpl
