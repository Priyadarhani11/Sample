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
 * This class is a wrapper for {@link Bank}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
public class BankWrapper
	extends BaseModelWrapper<Bank> implements Bank, ModelWrapper<Bank> {

	public BankWrapper(Bank bank) {
		super(bank);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bankId", getBankId());
		attributes.put("bankName", getBankName());
		attributes.put("bankAddress", getBankAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bankId = (Long)attributes.get("bankId");

		if (bankId != null) {
			setBankId(bankId);
		}

		String bankName = (String)attributes.get("bankName");

		if (bankName != null) {
			setBankName(bankName);
		}

		String bankAddress = (String)attributes.get("bankAddress");

		if (bankAddress != null) {
			setBankAddress(bankAddress);
		}
	}

	@Override
	public Bank cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bank address of this bank.
	 *
	 * @return the bank address of this bank
	 */
	@Override
	public String getBankAddress() {
		return model.getBankAddress();
	}

	/**
	 * Returns the bank ID of this bank.
	 *
	 * @return the bank ID of this bank
	 */
	@Override
	public long getBankId() {
		return model.getBankId();
	}

	/**
	 * Returns the bank name of this bank.
	 *
	 * @return the bank name of this bank
	 */
	@Override
	public String getBankName() {
		return model.getBankName();
	}

	/**
	 * Returns the primary key of this bank.
	 *
	 * @return the primary key of this bank
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this bank.
	 *
	 * @return the uuid of this bank
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
	 * Sets the bank address of this bank.
	 *
	 * @param bankAddress the bank address of this bank
	 */
	@Override
	public void setBankAddress(String bankAddress) {
		model.setBankAddress(bankAddress);
	}

	/**
	 * Sets the bank ID of this bank.
	 *
	 * @param bankId the bank ID of this bank
	 */
	@Override
	public void setBankId(long bankId) {
		model.setBankId(bankId);
	}

	/**
	 * Sets the bank name of this bank.
	 *
	 * @param bankName the bank name of this bank
	 */
	@Override
	public void setBankName(String bankName) {
		model.setBankName(bankName);
	}

	/**
	 * Sets the primary key of this bank.
	 *
	 * @param primaryKey the primary key of this bank
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this bank.
	 *
	 * @param uuid the uuid of this bank
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
	protected BankWrapper wrap(Bank bank) {
		return new BankWrapper(bank);
	}

}