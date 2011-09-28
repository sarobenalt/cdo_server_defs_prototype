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
package org.eclipse.emf.cdo.server.db.defs.impl;

import org.eclipse.emf.cdo.server.db.defs.CDOServerDbDefsPackage;
import org.eclipse.emf.cdo.server.db.defs.HorizontalMappingStrategyDef;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalAuditMappingStrategy;
import org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalAuditMappingStrategyWithRanges;
import org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalBranchingMappingStrategy;
import org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalBranchingMappingStrategyWithRanges;
import org.eclipse.emf.cdo.server.internal.db.mapping.horizontal.HorizontalNonAuditMappingStrategy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.net4j.util.CheckUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontal Mapping Strategy Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.HorizontalMappingStrategyDefImpl#isAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.HorizontalMappingStrategyDefImpl#isBranching <em>Branching</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.db.defs.impl.HorizontalMappingStrategyDefImpl#isWithRanges <em>With Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HorizontalMappingStrategyDefImpl extends MappingStrategyDefImpl
		implements HorizontalMappingStrategyDef {
	/**
	 * The default value of the '{@link #isAuditing() <em>Auditing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuditing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUDITING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuditing() <em>Auditing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuditing()
	 * @generated
	 * @ordered
	 */
	protected boolean auditing = AUDITING_EDEFAULT;

	/**
	 * The default value of the '{@link #isBranching() <em>Branching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBranching()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRANCHING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBranching() <em>Branching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBranching()
	 * @generated
	 * @ordered
	 */
	protected boolean branching = BRANCHING_EDEFAULT;

	/**
	 * The default value of the '{@link #isWithRanges() <em>With Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithRanges()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_RANGES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWithRanges() <em>With Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithRanges()
	 * @generated
	 * @ordered
	 */
	protected boolean withRanges = WITH_RANGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalMappingStrategyDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerDbDefsPackage.Literals.HORIZONTAL_MAPPING_STRATEGY_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuditing() {
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditing(boolean newAuditing) {
		boolean oldAuditing = auditing;
		auditing = newAuditing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING,
					oldAuditing, auditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBranching() {
		return branching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranching(boolean newBranching) {
		boolean oldBranching = branching;
		branching = newBranching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING,
					oldBranching, branching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWithRanges() {
		return withRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithRanges(boolean newWithRanges) {
		boolean oldWithRanges = withRanges;
		withRanges = newWithRanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES,
					oldWithRanges, withRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING:
			return isAuditing();
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING:
			return isBranching();
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES:
			return isWithRanges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING:
			setAuditing((Boolean) newValue);
			return;
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING:
			setBranching((Boolean) newValue);
			return;
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES:
			setWithRanges((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING:
			setAuditing(AUDITING_EDEFAULT);
			return;
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING:
			setBranching(BRANCHING_EDEFAULT);
			return;
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES:
			setWithRanges(WITH_RANGES_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__AUDITING:
			return auditing != AUDITING_EDEFAULT;
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__BRANCHING:
			return branching != BRANCHING_EDEFAULT;
		case CDOServerDbDefsPackage.HORIZONTAL_MAPPING_STRATEGY_DEF__WITH_RANGES:
			return withRanges != WITH_RANGES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (auditing: ");
		result.append(auditing);
		result.append(", branching: ");
		result.append(branching);
		result.append(", withRanges: ");
		result.append(withRanges);
		result.append(')');
		return result.toString();
	}

	/**
	 * @ADDED
	 */
	@Override
	protected Object createInstance() 
	{
		IMappingStrategy strategy = null;
		
	    if (branching)
	    {
	      if (auditing)
	      {
	        if (withRanges)
	        {
	          strategy = new HorizontalBranchingMappingStrategyWithRanges();
	        }

	        strategy = new HorizontalBranchingMappingStrategy();
	      }

	      throw new IllegalArgumentException("Misconfiguration: Branching requires Auditing!");
	    }

	    // If null, we're not branching
	    if (strategy == null && auditing)
	    {
	      if (withRanges)
	      {
	        strategy = new HorizontalAuditMappingStrategyWithRanges();
	      }

	      strategy = new HorizontalAuditMappingStrategy();
	    }

	    // If still null, we're not auditing either
	    if (strategy == null)
	    	strategy = new HorizontalNonAuditMappingStrategy();
	    
		return strategy;
	}

	/**
	 * @ADDED
	 */
	@Override
	protected void validateDefinition() {
		super.validateDefinition();
	    CheckUtil.checkState(!isBranching() || isBranching() && isAuditing(), "branching requires auditing!");
	}

} //HorizontalMappingStrategyDefImpl
