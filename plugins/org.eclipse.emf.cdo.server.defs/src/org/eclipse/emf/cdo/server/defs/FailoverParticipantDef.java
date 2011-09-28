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
package org.eclipse.emf.cdo.server.defs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failover Participant Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isAllowBackupCommits <em>Allow Backup Commits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getFailoverParticipantDef()
 * @model
 * @generated
 */
public interface FailoverParticipantDef extends SynchronizableRepositoryDef {
	/**
	 * Returns the value of the '<em><b>Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' attribute.
	 * @see #setMaster(boolean)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getFailoverParticipantDef_Master()
	 * @model required="true"
	 * @generated
	 */
	boolean isMaster();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isMaster <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' attribute.
	 * @see #isMaster()
	 * @generated
	 */
	void setMaster(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Backup Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Backup Commits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Backup Commits</em>' attribute.
	 * @see #setAllowBackupCommits(boolean)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getFailoverParticipantDef_AllowBackupCommits()
	 * @model required="true"
	 * @generated
	 */
	boolean isAllowBackupCommits();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.FailoverParticipantDef#isAllowBackupCommits <em>Allow Backup Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Backup Commits</em>' attribute.
	 * @see #isAllowBackupCommits()
	 * @generated
	 */
	void setAllowBackupCommits(boolean value);

} // FailoverParticipantDef
