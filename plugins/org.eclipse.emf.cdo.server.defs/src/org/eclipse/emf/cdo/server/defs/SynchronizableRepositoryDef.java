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
 * A representation of the model object '<em><b>Synchronizable Repository Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef#getSynchronizer <em>Synchronizer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getSynchronizableRepositoryDef()
 * @model
 * @generated
 */
public interface SynchronizableRepositoryDef extends RepositoryDef {
	/**
	 * Returns the value of the '<em><b>Synchronizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronizer</em>' reference.
	 * @see #setSynchronizer(RepositorySynchronizerDef)
	 * @see org.eclipse.emf.cdo.server.defs.CDOServerDefsPackage#getSynchronizableRepositoryDef_Synchronizer()
	 * @model
	 * @generated
	 */
	RepositorySynchronizerDef getSynchronizer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.defs.SynchronizableRepositoryDef#getSynchronizer <em>Synchronizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronizer</em>' reference.
	 * @see #getSynchronizer()
	 * @generated
	 */
	void setSynchronizer(RepositorySynchronizerDef value);

} // SynchronizableRepositoryDef
