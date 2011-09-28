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
package org.eclipse.emf.cdo.server.defs.util;

import org.eclipse.emf.cdo.server.defs.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage
 * @generated
 */
public class CDOServerDefsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDOServerDefsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServerDefsSwitch() {
		if (modelPackage == null) {
			modelPackage = CDOServerDefsPackage.eINSTANCE;
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
		case CDOServerDefsPackage.CDO_SERVER_DEF: {
			CDOServerDef cdoServerDef = (CDOServerDef) theEObject;
			T result = caseCDOServerDef(cdoServerDef);
			if (result == null)
				result = caseDef(cdoServerDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CDOServerDefsPackage.STORE_DEF: {
			StoreDef storeDef = (StoreDef) theEObject;
			T result = caseStoreDef(storeDef);
			if (result == null)
				result = caseDef(storeDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CDOServerDefsPackage.MEM_STORE_DEF: {
			MemStoreDef memStoreDef = (MemStoreDef) theEObject;
			T result = caseMemStoreDef(memStoreDef);
			if (result == null)
				result = caseStoreDef(memStoreDef);
			if (result == null)
				result = caseDef(memStoreDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CDOServerDefsPackage.REPOSITORY_DEF: {
			RepositoryDef repositoryDef = (RepositoryDef) theEObject;
			T result = caseRepositoryDef(repositoryDef);
			if (result == null)
				result = caseDef(repositoryDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CDOServerDefsPackage.SYNCHRONIZABLE_REPOSITORY_DEF: {
			SynchronizableRepositoryDef synchronizableRepositoryDef = (SynchronizableRepositoryDef) theEObject;
			T result = caseSynchronizableRepositoryDef(synchronizableRepositoryDef);
			if (result == null)
				result = caseRepositoryDef(synchronizableRepositoryDef);
			if (result == null)
				result = caseDef(synchronizableRepositoryDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CDOServerDefsPackage.REPOSITORY_SYNCHRONIZER_DEF: {
			RepositorySynchronizerDef repositorySynchronizerDef = (RepositorySynchronizerDef) theEObject;
			T result = caseRepositorySynchronizerDef(repositorySynchronizerDef);
			if (result == null)
				result = caseDef(repositorySynchronizerDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CDOServerDefsPackage.OFFLINE_CLONE_DEF: {
			OfflineCloneDef offlineCloneDef = (OfflineCloneDef) theEObject;
			T result = caseOfflineCloneDef(offlineCloneDef);
			if (result == null)
				result = caseSynchronizableRepositoryDef(offlineCloneDef);
			if (result == null)
				result = caseRepositoryDef(offlineCloneDef);
			if (result == null)
				result = caseDef(offlineCloneDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CDOServerDefsPackage.FAILOVER_PARTICIPANT_DEF: {
			FailoverParticipantDef failoverParticipantDef = (FailoverParticipantDef) theEObject;
			T result = caseFailoverParticipantDef(failoverParticipantDef);
			if (result == null)
				result = caseSynchronizableRepositoryDef(failoverParticipantDef);
			if (result == null)
				result = caseRepositoryDef(failoverParticipantDef);
			if (result == null)
				result = caseDef(failoverParticipantDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDO Server Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDO Server Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDOServerDef(CDOServerDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreDef(StoreDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mem Store Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mem Store Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemStoreDef(MemStoreDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryDef(RepositoryDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronizable Repository Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronizable Repository Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizableRepositoryDef(SynchronizableRepositoryDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Synchronizer Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Synchronizer Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositorySynchronizerDef(RepositorySynchronizerDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offline Clone Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offline Clone Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfflineCloneDef(OfflineCloneDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failover Participant Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failover Participant Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailoverParticipantDef(FailoverParticipantDef object) {
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

} //CDOServerDefsSwitch
