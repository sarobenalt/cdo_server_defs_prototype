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
package org.eclipse.emf.cdo.server.net4j.defs.impl;

import java.util.Collection;

import org.eclipse.emf.cdo.server.net4j.defs.CDOServerNet4jDefsPackage;
import org.eclipse.emf.cdo.server.net4j.defs.FailoverAgentDef;
import org.eclipse.emf.cdo.server.net4j.defs.FailoverMonitorDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.net4j.util.defs.impl.DefImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failover Monitor Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverMonitorDefImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.cdo.server.net4j.defs.impl.FailoverMonitorDefImpl#getAgents <em>Agents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailoverMonitorDefImpl extends DefImpl implements
		FailoverMonitorDef {
	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<FailoverAgentDef> agents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailoverMonitorDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDOServerNet4jDefsPackage.Literals.FAILOVER_MONITOR_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__GROUP,
					oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailoverAgentDef> getAgents() {
		if (agents == null) {
			agents = new EObjectResolvingEList<FailoverAgentDef>(
					FailoverAgentDef.class, this,
					CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__GROUP:
			return getGroup();
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__AGENTS:
			return getAgents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__GROUP:
			setGroup((String) newValue);
			return;
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__AGENTS:
			getAgents().clear();
			getAgents().addAll(
					(Collection<? extends FailoverAgentDef>) newValue);
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
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__GROUP:
			setGroup(GROUP_EDEFAULT);
			return;
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__AGENTS:
			getAgents().clear();
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
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__GROUP:
			return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT
					.equals(group);
		case CDOServerNet4jDefsPackage.FAILOVER_MONITOR_DEF__AGENTS:
			return agents != null && !agents.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
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

} //FailoverMonitorDefImpl
