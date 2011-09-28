/*
 * Copyright (c) 2004 - 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Andre Dietisheim - initial API and implementation
 *    Eike Stepper - maintenance
 */
package org.eclipse.net4j.util.defs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Def</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.net4j.util.defs.Net4jUtilDefsPackage#getDef()
 * @model abstract="true"
 * @generated
 */
public interface Def extends EObject
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  Object getInstance();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @model
   * @generated
   */
  void unsetInstance();

  public boolean isTouched();
} // Def
