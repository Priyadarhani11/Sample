/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.seconddb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.seconddb.model.Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StudentCacheModel)) {
			return false;
		}

		StudentCacheModel studentCacheModel = (StudentCacheModel)object;

		if (studentId == studentCacheModel.studentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, studentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", studentId=");
		sb.append(studentId);
		sb.append(", studentName=");
		sb.append(studentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		if (uuid == null) {
			studentImpl.setUuid("");
		}
		else {
			studentImpl.setUuid(uuid);
		}

		studentImpl.setStudentId(studentId);

		if (studentName == null) {
			studentImpl.setStudentName("");
		}
		else {
			studentImpl.setStudentName(studentName);
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		studentId = objectInput.readInt();
		studentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeInt(studentId);

		if (studentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentName);
		}
	}

	public String uuid;
	public int studentId;
	public String studentName;

}