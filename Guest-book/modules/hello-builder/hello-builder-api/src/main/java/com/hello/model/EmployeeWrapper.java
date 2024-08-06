/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hello.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper
	extends BaseModelWrapper<Employee>
	implements Employee, ModelWrapper<Employee> {

	public EmployeeWrapper(Employee employee) {
		super(employee);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("employeeName", getEmployeeName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer employeeId = (Integer)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}
	}

	@Override
	public Employee cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	@Override
	public int getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the employee name of this employee.
	 *
	 * @return the employee name of this employee
	 */
	@Override
	public String getEmployeeName() {
		return model.getEmployeeName();
	}

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	@Override
	public void setEmployeeId(int employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the employee name of this employee.
	 *
	 * @param employeeName the employee name of this employee
	 */
	@Override
	public void setEmployeeName(String employeeName) {
		model.setEmployeeName(employeeName);
	}

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected EmployeeWrapper wrap(Employee employee) {
		return new EmployeeWrapper(employee);
	}

}