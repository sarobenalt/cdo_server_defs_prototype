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

import org.eclipse.emf.common.util.EList;

import org.eclipse.net4j.defs.AcceptorDef;

import org.eclipse.net4j.util.defs.Def;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDO Server Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.CDOServerDef#getAcceptors <em>Acceptors</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.CDOServerDef#getRepositories <em>Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getCDOServerDef()
 * @model
 * @generated
 */
public interface CDOServerDef extends Def {
	/**
	 * Returns the value of the '<em><b>Acceptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.net4j.defs.AcceptorDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptors</em>' containment reference list.
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getCDOServerDef_Acceptors()
	 * @model containment="true"
	 * @generated
	 */
	EList<AcceptorDef> getAcceptors();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.cdo.server.defs.RepositoryDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getCDOServerDef_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepositoryDef> getRepositories();

} // CDOServerDef
