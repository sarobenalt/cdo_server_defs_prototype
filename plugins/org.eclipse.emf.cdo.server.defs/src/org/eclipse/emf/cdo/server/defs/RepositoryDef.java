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

import org.eclipse.net4j.util.defs.Def;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getStore <em>Store</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getOverrideUUID <em>Override UUID</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingAudits <em>Supporting Audits</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingBranches <em>Supporting Branches</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingEcore <em>Supporting Ecore</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isEnsureReferentialIntegrity <em>Ensure Referential Integrity</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isAllowInterruptRunningQueries <em>Allow Interrupt Running Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef()
 * @model
 * @generated
 */
public interface RepositoryDef extends Def {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(StoreDef)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_Store()
	 * @model required="true"
	 * @generated
	 */
	StoreDef getStore();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(StoreDef value);

	/**
	 * Returns the value of the '<em><b>Override UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override UUID</em>' attribute.
	 * @see #setOverrideUUID(String)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_OverrideUUID()
	 * @model
	 * @generated
	 */
	String getOverrideUUID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#getOverrideUUID <em>Override UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override UUID</em>' attribute.
	 * @see #getOverrideUUID()
	 * @generated
	 */
	void setOverrideUUID(String value);

	/**
	 * Returns the value of the '<em><b>Supporting Audits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Audits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Audits</em>' attribute.
	 * @see #setSupportingAudits(boolean)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_SupportingAudits()
	 * @model
	 * @generated
	 */
	boolean isSupportingAudits();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingAudits <em>Supporting Audits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Audits</em>' attribute.
	 * @see #isSupportingAudits()
	 * @generated
	 */
	void setSupportingAudits(boolean value);

	/**
	 * Returns the value of the '<em><b>Supporting Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Branches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Branches</em>' attribute.
	 * @see #setSupportingBranches(boolean)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_SupportingBranches()
	 * @model
	 * @generated
	 */
	boolean isSupportingBranches();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingBranches <em>Supporting Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Branches</em>' attribute.
	 * @see #isSupportingBranches()
	 * @generated
	 */
	void setSupportingBranches(boolean value);

	/**
	 * Returns the value of the '<em><b>Supporting Ecore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Ecore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Ecore</em>' attribute.
	 * @see #setSupportingEcore(boolean)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_SupportingEcore()
	 * @model
	 * @generated
	 */
	boolean isSupportingEcore();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isSupportingEcore <em>Supporting Ecore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Ecore</em>' attribute.
	 * @see #isSupportingEcore()
	 * @generated
	 */
	void setSupportingEcore(boolean value);

	/**
	 * Returns the value of the '<em><b>Ensure Referential Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ensure Referential Integrity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensure Referential Integrity</em>' attribute.
	 * @see #setEnsureReferentialIntegrity(boolean)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_EnsureReferentialIntegrity()
	 * @model
	 * @generated
	 */
	boolean isEnsureReferentialIntegrity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isEnsureReferentialIntegrity <em>Ensure Referential Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ensure Referential Integrity</em>' attribute.
	 * @see #isEnsureReferentialIntegrity()
	 * @generated
	 */
	void setEnsureReferentialIntegrity(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Interrupt Running Queries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Interrupt Running Queries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Interrupt Running Queries</em>' attribute.
	 * @see #setAllowInterruptRunningQueries(boolean)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getRepositoryDef_AllowInterruptRunningQueries()
	 * @model
	 * @generated
	 */
	boolean isAllowInterruptRunningQueries();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.RepositoryDef#isAllowInterruptRunningQueries <em>Allow Interrupt Running Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Interrupt Running Queries</em>' attribute.
	 * @see #isAllowInterruptRunningQueries()
	 * @generated
	 */
	void setAllowInterruptRunningQueries(boolean value);

} // RepositoryDef
