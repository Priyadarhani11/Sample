/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package student.headless.builder.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see student
 * @generated
 */
public class studentWrapper
	extends BaseModelWrapper<student>
	implements ModelWrapper<student>, student {

	public studentWrapper(student student) {
		super(student);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("standard", getStandard());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String standard = (String)attributes.get("standard");

		if (standard != null) {
			setStandard(standard);
		}
	}

	@Override
	public student cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the ID of this student.
	 *
	 * @return the ID of this student
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this student.
	 *
	 * @return the name of this student
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the standard of this student.
	 *
	 * @return the standard of this student
	 */
	@Override
	public String getStandard() {
		return model.getStandard();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this student.
	 *
	 * @param id the ID of this student
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this student.
	 *
	 * @param name the name of this student
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the standard of this student.
	 *
	 * @param standard the standard of this student
	 */
	@Override
	public void setStandard(String standard) {
		model.setStandard(standard);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected studentWrapper wrap(student student) {
		return new studentWrapper(student);
	}

}