/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Web.Services.builder.model.impl;

import Web.Services.builder.model.Student;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

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
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", studentName=");
		sb.append(studentName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", mobileNumber=");
		sb.append(mobileNumber);
		sb.append(", email=");
		sb.append(email);
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
		studentImpl.setUserId(userId);

		if (studentName == null) {
			studentImpl.setStudentName("");
		}
		else {
			studentImpl.setStudentName(studentName);
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

		if (mobileNumber == null) {
			studentImpl.setMobileNumber("");
		}
		else {
			studentImpl.setMobileNumber(mobileNumber);
		}

		if (email == null) {
			studentImpl.setEmail("");
		}
		else {
			studentImpl.setEmail(email);
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

		userId = objectInput.readLong();
		studentName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		mobileNumber = objectInput.readUTF();
		email = objectInput.readUTF();
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

		objectOutput.writeLong(userId);

		if (studentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(studentName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (mobileNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobileNumber);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public String uuid;
	public long studentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String studentName;
	public long createDate;
	public long modifiedDate;
	public String mobileNumber;
	public String email;

}