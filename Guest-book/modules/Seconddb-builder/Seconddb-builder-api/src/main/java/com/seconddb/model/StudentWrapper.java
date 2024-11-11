/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.seconddb.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentWrapper
	extends BaseModelWrapper<Student>
	implements ModelWrapper<Student>, Student {

	public StudentWrapper(Student student) {
		super(student);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("studentId", getStudentId());
		attributes.put("studentName", getStudentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Integer studentId = (Integer)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String studentName = (String)attributes.get("studentName");

		if (studentName != null) {
			setStudentName(studentName);
		}
	}

	@Override
	public Student cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student ID of this student.
	 *
	 * @return the student ID of this student
	 */
	@Override
	public int getStudentId() {
		return model.getStudentId();
	}

	/**
	 * Returns the student name of this student.
	 *
	 * @return the student name of this student
	 */
	@Override
	public String getStudentName() {
		return model.getStudentName();
	}

	/**
	 * Returns the uuid of this student.
	 *
	 * @return the uuid of this student
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
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student ID of this student.
	 *
	 * @param studentId the student ID of this student
	 */
	@Override
	public void setStudentId(int studentId) {
		model.setStudentId(studentId);
	}

	/**
	 * Sets the student name of this student.
	 *
	 * @param studentName the student name of this student
	 */
	@Override
	public void setStudentName(String studentName) {
		model.setStudentName(studentName);
	}

	/**
	 * Sets the uuid of this student.
	 *
	 * @param uuid the uuid of this student
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
	protected StudentWrapper wrap(Student student) {
		return new StudentWrapper(student);
	}

}