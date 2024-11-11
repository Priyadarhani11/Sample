/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.student.permission.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.student.permission.model.Student;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

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
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", studentId=");
		sb.append(studentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", studentName=");
		sb.append(studentName);
		sb.append(", studentMobileNumber=");
		sb.append(studentMobileNumber);
		sb.append(", studentDesignation=");
		sb.append(studentDesignation);
		sb.append(", studentphoto=");
		sb.append(studentphoto);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
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
		studentImpl.setGroupId(groupId);
		studentImpl.setCompanyId(companyId);

		if (studentName == null) {
			studentImpl.setStudentName("");
		}
		else {
			studentImpl.setStudentName(studentName);
		}

		if (studentMobileNumber == null) {
			studentImpl.setStudentMobileNumber("");
		}
		else {
			studentImpl.setStudentMobileNumber(studentMobileNumber);
		}

		if (studentDesignation == null) {
			studentImpl.setStudentDesignation("");
		}
		else {
			studentImpl.setStudentDesignation(studentDesignation);
		}

		if (studentphoto == null) {
			studentImpl.setStudentphoto("");
		}
		else {
			studentImpl.setStudentphoto(studentphoto);
		}

		if (createDate == Long.MIN_VALUE) {
			studentImpl.setCreateDate(null);
		}
		else {
			studentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentImpl.setModifiedDate(null);
		}
		else {
			studentImpl.setModifiedDate(new Date(modifiedDate));
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		studentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		studentName = objectInput.readUTF();
		studentMobileNumber = objectInput.readUTF();
		studentDesignation = objectInput.readUTF();
		studentphoto = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(studentId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		if (studentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentName);
		}

		if (studentMobileNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentMobileNumber);
		}

		if (studentDesignation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentDesignation);
		}

		if (studentphoto == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentphoto);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long studentId;
	public long groupId;
	public long companyId;
	public String studentName;
	public String studentMobileNumber;
	public String studentDesignation;
	public String studentphoto;
	public long createDate;
	public long modifiedDate;

}