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
import org.eclipse.emf.cdo.server.defs.OfflineCloneDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offline Clone Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OfflineCloneDefImpl extends SynchronizableRepositoryDefImpl
		implements OfflineCloneDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfflineCloneDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDefsPackage.Literals.OFFLINE_CLONE_DEF;
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

} //OfflineCloneDefImpl
