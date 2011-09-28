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
package org.eclipse.emf.cdo.server.net4j.defs;

import org.eclipse.emf.cdo.server.defs.FailoverParticipantDef;

import org.eclipse.net4j.util.defs.Def;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failover Agent Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage#getFailoverAgentDef()
 * @model
 * @generated
 */
public interface FailoverAgentDef extends Def {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(FailoverParticipantDef)
	 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage#getFailoverAgentDef_Repository()
	 * @model required="true"
	 * @generated
	 */
	FailoverParticipantDef getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(FailoverParticipantDef value);

} // FailoverAgentDef
