/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Excel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Excel
 * @generated
 */
public class ExcelWrapper
	extends BaseModelWrapper<Excel> implements Excel, ModelWrapper<Excel> {

	public ExcelWrapper(Excel excel) {
		super(excel);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("excelId", getExcelId());
		attributes.put("name", getName());
		attributes.put("address", getAddress());
		attributes.put("phoneNumber", getPhoneNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long excelId = (Long)attributes.get("excelId");

		if (excelId != null) {
			setExcelId(excelId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long phoneNumber = (Long)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}
	}

	@Override
	public Excel cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this excel.
	 *
	 * @return the address of this excel
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the excel ID of this excel.
	 *
	 * @return the excel ID of this excel
	 */
	@Override
	public long getExcelId() {
		return model.getExcelId();
	}

	/**
	 * Returns the name of this excel.
	 *
	 * @return the name of this excel
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the phone number of this excel.
	 *
	 * @return the phone number of this excel
	 */
	@Override
	public long getPhoneNumber() {
		return model.getPhoneNumber();
	}

	/**
	 * Returns the primary key of this excel.
	 *
	 * @return the primary key of this excel
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this excel.
	 *
	 * @return the uuid of this excel
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
	 * Sets the address of this excel.
	 *
	 * @param address the address of this excel
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the excel ID of this excel.
	 *
	 * @param excelId the excel ID of this excel
	 */
	@Override
	public void setExcelId(long excelId) {
		model.setExcelId(excelId);
	}

	/**
	 * Sets the name of this excel.
	 *
	 * @param name the name of this excel
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the phone number of this excel.
	 *
	 * @param phoneNumber the phone number of this excel
	 */
	@Override
	public void setPhoneNumber(long phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}

	/**
	 * Sets the primary key of this excel.
	 *
	 * @param primaryKey the primary key of this excel
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this excel.
	 *
	 * @param uuid the uuid of this excel
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
	protected ExcelWrapper wrap(Excel excel) {
		return new ExcelWrapper(excel);
	}

}