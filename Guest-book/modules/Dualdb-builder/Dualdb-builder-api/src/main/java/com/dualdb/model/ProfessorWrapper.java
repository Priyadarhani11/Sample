/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Professor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Professor
 * @generated
 */
public class ProfessorWrapper
	extends BaseModelWrapper<Professor>
	implements ModelWrapper<Professor>, Professor {

	public ProfessorWrapper(Professor professor) {
		super(professor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("pId", getPId());
		attributes.put("pName", getPName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer pId = (Integer)attributes.get("pId");

		if (pId != null) {
			setPId(pId);
		}

		String pName = (String)attributes.get("pName");

		if (pName != null) {
			setPName(pName);
		}
	}

	@Override
	public Professor cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the p ID of this professor.
	 *
	 * @return the p ID of this professor
	 */
	@Override
	public int getPId() {
		return model.getPId();
	}

	/**
	 * Returns the p name of this professor.
	 *
	 * @return the p name of this professor
	 */
	@Override
	public String getPName() {
		return model.getPName();
	}

	/**
	 * Returns the primary key of this professor.
	 *
	 * @return the primary key of this professor
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this professor.
	 *
	 * @return the uuid of this professor
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
	 * Sets the p ID of this professor.
	 *
	 * @param pId the p ID of this professor
	 */
	@Override
	public void setPId(int pId) {
		model.setPId(pId);
	}

	/**
	 * Sets the p name of this professor.
	 *
	 * @param pName the p name of this professor
	 */
	@Override
	public void setPName(String pName) {
		model.setPName(pName);
	}

	/**
	 * Sets the primary key of this professor.
	 *
	 * @param primaryKey the primary key of this professor
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this professor.
	 *
	 * @param uuid the uuid of this professor
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
	protected ProfessorWrapper wrap(Professor professor) {
		return new ProfessorWrapper(professor);
	}

}