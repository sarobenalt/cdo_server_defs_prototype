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

import org.eclipse.emf.common.util.EList;

import org.eclipse.net4j.util.defs.Def;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failover Monitor Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef#getAgents <em>Agents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage#getFailoverMonitorDef()
 * @model
 * @generated
 */
public interface FailoverMonitorDef extends Def {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage#getFailoverMonitorDef_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' reference list.
	 * @see org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage#getFailoverMonitorDef_Agents()
	 * @model required="true"
	 * @generated
	 */
	EList<FailoverAgentDef> getAgents();

} // FailoverMonitorDef
