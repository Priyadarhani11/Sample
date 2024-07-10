/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.model;

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
		attributes.put("employeeAddress", getEmployeeAddress());
		attributes.put("employeePhoneNo", getEmployeePhoneNo());
		attributes.put("employeePinNo", getEmployeePinNo());
		attributes.put("bankId", getBankId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String employeeAddress = (String)attributes.get("employeeAddress");

		if (employeeAddress != null) {
			setEmployeeAddress(employeeAddress);
		}

		Long employeePhoneNo = (Long)attributes.get("employeePhoneNo");

		if (employeePhoneNo != null) {
			setEmployeePhoneNo(employeePhoneNo);
		}

		Integer employeePinNo = (Integer)attributes.get("employeePinNo");

		if (employeePinNo != null) {
			setEmployeePinNo(employeePinNo);
		}

		Long bankId = (Long)attributes.get("bankId");

		if (bankId != null) {
			setBankId(bankId);
		}
	}

	@Override
	public Employee cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bank ID of this employee.
	 *
	 * @return the bank ID of this employee
	 */
	@Override
	public long getBankId() {
		return model.getBankId();
	}

	/**
	 * Returns the employee address of this employee.
	 *
	 * @return the employee address of this employee
	 */
	@Override
	public String getEmployeeAddress() {
		return model.getEmployeeAddress();
	}

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	@Override
	public long getEmployeeId() {
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
	 * Returns the employee phone no of this employee.
	 *
	 * @return the employee phone no of this employee
	 */
	@Override
	public long getEmployeePhoneNo() {
		return model.getEmployeePhoneNo();
	}

	/**
	 * Returns the employee pin no of this employee.
	 *
	 * @return the employee pin no of this employee
	 */
	@Override
	public int getEmployeePinNo() {
		return model.getEmployeePinNo();
	}

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	@Override
	public long getPrimaryKey() {
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
	 * Sets the bank ID of this employee.
	 *
	 * @param bankId the bank ID of this employee
	 */
	@Override
	public void setBankId(long bankId) {
		model.setBankId(bankId);
	}

	/**
	 * Sets the employee address of this employee.
	 *
	 * @param employeeAddress the employee address of this employee
	 */
	@Override
	public void setEmployeeAddress(String employeeAddress) {
		model.setEmployeeAddress(employeeAddress);
	}

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	@Override
	public void setEmployeeId(long employeeId) {
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
	 * Sets the employee phone no of this employee.
	 *
	 * @param employeePhoneNo the employee phone no of this employee
	 */
	@Override
	public void setEmployeePhoneNo(long employeePhoneNo) {
		model.setEmployeePhoneNo(employeePhoneNo);
	}

	/**
	 * Sets the employee pin no of this employee.
	 *
	 * @param employeePinNo the employee pin no of this employee
	 */
	@Override
	public void setEmployeePinNo(int employeePinNo) {
		model.setEmployeePinNo(employeePinNo);
	}

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
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