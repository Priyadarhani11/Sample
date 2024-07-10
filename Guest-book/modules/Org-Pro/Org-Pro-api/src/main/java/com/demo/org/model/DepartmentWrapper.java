/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
public class DepartmentWrapper
	extends BaseModelWrapper<Department>
	implements Department, ModelWrapper<Department> {

	public DepartmentWrapper(Department department) {
		super(department);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("departmentId", getDepartmentId());
		attributes.put("departmentNo", getDepartmentNo());
		attributes.put("departmentName", getDepartmentName());
		attributes.put("departmentAddress", getDepartmentAddress());
		attributes.put("departmentPin", getDepartmentPin());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("bankId", getBankId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
		}

		String departmentNo = (String)attributes.get("departmentNo");

		if (departmentNo != null) {
			setDepartmentNo(departmentNo);
		}

		String departmentName = (String)attributes.get("departmentName");

		if (departmentName != null) {
			setDepartmentName(departmentName);
		}

		String departmentAddress = (String)attributes.get("departmentAddress");

		if (departmentAddress != null) {
			setDepartmentAddress(departmentAddress);
		}

		Integer departmentPin = (Integer)attributes.get("departmentPin");

		if (departmentPin != null) {
			setDepartmentPin(departmentPin);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long bankId = (Long)attributes.get("bankId");

		if (bankId != null) {
			setBankId(bankId);
		}
	}

	@Override
	public Department cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bank ID of this department.
	 *
	 * @return the bank ID of this department
	 */
	@Override
	public long getBankId() {
		return model.getBankId();
	}

	/**
	 * Returns the department address of this department.
	 *
	 * @return the department address of this department
	 */
	@Override
	public String getDepartmentAddress() {
		return model.getDepartmentAddress();
	}

	/**
	 * Returns the department ID of this department.
	 *
	 * @return the department ID of this department
	 */
	@Override
	public long getDepartmentId() {
		return model.getDepartmentId();
	}

	/**
	 * Returns the department name of this department.
	 *
	 * @return the department name of this department
	 */
	@Override
	public String getDepartmentName() {
		return model.getDepartmentName();
	}

	/**
	 * Returns the department no of this department.
	 *
	 * @return the department no of this department
	 */
	@Override
	public String getDepartmentNo() {
		return model.getDepartmentNo();
	}

	/**
	 * Returns the department pin of this department.
	 *
	 * @return the department pin of this department
	 */
	@Override
	public int getDepartmentPin() {
		return model.getDepartmentPin();
	}

	/**
	 * Returns the employee ID of this department.
	 *
	 * @return the employee ID of this department
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the primary key of this department.
	 *
	 * @return the primary key of this department
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this department.
	 *
	 * @return the uuid of this department
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
	 * Sets the bank ID of this department.
	 *
	 * @param bankId the bank ID of this department
	 */
	@Override
	public void setBankId(long bankId) {
		model.setBankId(bankId);
	}

	/**
	 * Sets the department address of this department.
	 *
	 * @param departmentAddress the department address of this department
	 */
	@Override
	public void setDepartmentAddress(String departmentAddress) {
		model.setDepartmentAddress(departmentAddress);
	}

	/**
	 * Sets the department ID of this department.
	 *
	 * @param departmentId the department ID of this department
	 */
	@Override
	public void setDepartmentId(long departmentId) {
		model.setDepartmentId(departmentId);
	}

	/**
	 * Sets the department name of this department.
	 *
	 * @param departmentName the department name of this department
	 */
	@Override
	public void setDepartmentName(String departmentName) {
		model.setDepartmentName(departmentName);
	}

	/**
	 * Sets the department no of this department.
	 *
	 * @param departmentNo the department no of this department
	 */
	@Override
	public void setDepartmentNo(String departmentNo) {
		model.setDepartmentNo(departmentNo);
	}

	/**
	 * Sets the department pin of this department.
	 *
	 * @param departmentPin the department pin of this department
	 */
	@Override
	public void setDepartmentPin(int departmentPin) {
		model.setDepartmentPin(departmentPin);
	}

	/**
	 * Sets the employee ID of this department.
	 *
	 * @param employeeId the employee ID of this department
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the primary key of this department.
	 *
	 * @param primaryKey the primary key of this department
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this department.
	 *
	 * @param uuid the uuid of this department
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
	protected DepartmentWrapper wrap(Department department) {
		return new DepartmentWrapper(department);
	}

}