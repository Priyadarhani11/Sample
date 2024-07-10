/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Salary}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Salary
 * @generated
 */
public class SalaryWrapper
	extends BaseModelWrapper<Salary> implements ModelWrapper<Salary>, Salary {

	public SalaryWrapper(Salary salary) {
		super(salary);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("salaryId", getSalaryId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("amount", getAmount());
		attributes.put("currency", getCurrency());
		attributes.put("paymentDate", getPaymentDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long salaryId = (Long)attributes.get("salaryId");

		if (salaryId != null) {
			setSalaryId(salaryId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Date paymentDate = (Date)attributes.get("paymentDate");

		if (paymentDate != null) {
			setPaymentDate(paymentDate);
		}
	}

	@Override
	public Salary cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount of this salary.
	 *
	 * @return the amount of this salary
	 */
	@Override
	public double getAmount() {
		return model.getAmount();
	}

	/**
	 * Returns the currency of this salary.
	 *
	 * @return the currency of this salary
	 */
	@Override
	public String getCurrency() {
		return model.getCurrency();
	}

	/**
	 * Returns the employee ID of this salary.
	 *
	 * @return the employee ID of this salary
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the payment date of this salary.
	 *
	 * @return the payment date of this salary
	 */
	@Override
	public Date getPaymentDate() {
		return model.getPaymentDate();
	}

	/**
	 * Returns the primary key of this salary.
	 *
	 * @return the primary key of this salary
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the salary ID of this salary.
	 *
	 * @return the salary ID of this salary
	 */
	@Override
	public long getSalaryId() {
		return model.getSalaryId();
	}

	/**
	 * Returns the uuid of this salary.
	 *
	 * @return the uuid of this salary
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
	 * Sets the amount of this salary.
	 *
	 * @param amount the amount of this salary
	 */
	@Override
	public void setAmount(double amount) {
		model.setAmount(amount);
	}

	/**
	 * Sets the currency of this salary.
	 *
	 * @param currency the currency of this salary
	 */
	@Override
	public void setCurrency(String currency) {
		model.setCurrency(currency);
	}

	/**
	 * Sets the employee ID of this salary.
	 *
	 * @param employeeId the employee ID of this salary
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the payment date of this salary.
	 *
	 * @param paymentDate the payment date of this salary
	 */
	@Override
	public void setPaymentDate(Date paymentDate) {
		model.setPaymentDate(paymentDate);
	}

	/**
	 * Sets the primary key of this salary.
	 *
	 * @param primaryKey the primary key of this salary
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the salary ID of this salary.
	 *
	 * @param salaryId the salary ID of this salary
	 */
	@Override
	public void setSalaryId(long salaryId) {
		model.setSalaryId(salaryId);
	}

	/**
	 * Sets the uuid of this salary.
	 *
	 * @param uuid the uuid of this salary
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
	protected SalaryWrapper wrap(Salary salary) {
		return new SalaryWrapper(salary);
	}

}