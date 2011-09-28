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
package org.eclipse.emf.cdo.server.db.defs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontal Mapping Strategy Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isBranching <em>Branching</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isWithRanges <em>With Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getHorizontalMappingStrategyDef()
 * @model
 * @generated
 */
public interface HorizontalMappingStrategyDef extends MappingStrategyDef {
	/**
	 * Returns the value of the '<em><b>Auditing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditing</em>' attribute.
	 * @see #setAuditing(boolean)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getHorizontalMappingStrategyDef_Auditing()
	 * @model
	 * @generated
	 */
	boolean isAuditing();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isAuditing <em>Auditing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditing</em>' attribute.
	 * @see #isAuditing()
	 * @generated
	 */
	void setAuditing(boolean value);

	/**
	 * Returns the value of the '<em><b>Branching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branching</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branching</em>' attribute.
	 * @see #setBranching(boolean)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getHorizontalMappingStrategyDef_Branching()
	 * @model
	 * @generated
	 */
	boolean isBranching();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isBranching <em>Branching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branching</em>' attribute.
	 * @see #isBranching()
	 * @generated
	 */
	void setBranching(boolean value);

	/**
	 * Returns the value of the '<em><b>With Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Ranges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Ranges</em>' attribute.
	 * @see #setWithRanges(boolean)
	 * @see org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage#getHorizontalMappingStrategyDef_WithRanges()
	 * @model
	 * @generated
	 */
	boolean isWithRanges();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef#isWithRanges <em>With Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Ranges</em>' attribute.
	 * @see #isWithRanges()
	 * @generated
	 */
	void setWithRanges(boolean value);

} // HorizontalMappingStrategyDef
