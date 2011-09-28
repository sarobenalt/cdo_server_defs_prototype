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
import org.eclipse.emf.cdo.server.defs.FailoverParticipantDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failover Participant Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.FailoverParticipantDefImpl#isMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.impl.FailoverParticipantDefImpl#isAllowBackupCommits <em>Allow Backup Commits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailoverParticipantDefImpl extends SynchronizableRepositoryDefImpl
		implements FailoverParticipantDef {
	/**
	 * The default value of the '{@link #isMaster() <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaster() <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean master = MASTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowBackupCommits() <em>Allow Backup Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBackupCommits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_BACKUP_COMMITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowBackupCommits() <em>Allow Backup Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowBackupCommits()
	 * @generated
	 * @ordered
	 */
	protected boolean allowBackupCommits = ALLOW_BACKUP_COMMITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailoverParticipantDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDefsPackage.Literals.FAILOVER_PARTICIPANT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(boolean newMaster) {
		boolean oldMaster = master;
		master = newMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__MASTER,
					oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowBackupCommits() {
		return allowBackupCommits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowBackupCommits(boolean newAllowBackupCommits) {
		boolean oldAllowBackupCommits = allowBackupCommits;
		allowBackupCommits = newAllowBackupCommits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS,
					oldAllowBackupCommits, allowBackupCommits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__MASTER:
			return isMaster();
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS:
			return isAllowBackupCommits();
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
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__MASTER:
			setMaster((Boolean) newValue);
			return;
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS:
			setAllowBackupCommits((Boolean) newValue);
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
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__MASTER:
			setMaster(MASTER_EDEFAULT);
			return;
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS:
			setAllowBackupCommits(ALLOW_BACKUP_COMMITS_EDEFAULT);
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
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__MASTER:
			return master != MASTER_EDEFAULT;
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF__ALLOW_BACKUP_COMMITS:
			return allowBackupCommits != ALLOW_BACKUP_COMMITS_EDEFAULT;
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
		result.append(" (master: ");
		result.append(master);
		result.append(", allowBackupCommits: ");
		result.append(allowBackupCommits);
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

} //FailoverParticipantDefImpl
