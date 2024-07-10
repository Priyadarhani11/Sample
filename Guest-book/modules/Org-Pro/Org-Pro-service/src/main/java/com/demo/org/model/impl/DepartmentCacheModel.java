/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.model.impl;

import com.demo.org.model.Department;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Department in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DepartmentCacheModel
	implements CacheModel<Department>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DepartmentCacheModel)) {
			return false;
		}

		DepartmentCacheModel departmentCacheModel =
			(DepartmentCacheModel)object;

		if (departmentId == departmentCacheModel.departmentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, departmentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", departmentId=");
		sb.append(departmentId);
		sb.append(", departmentNo=");
		sb.append(departmentNo);
		sb.append(", departmentName=");
		sb.append(departmentName);
		sb.append(", departmentAddress=");
		sb.append(departmentAddress);
		sb.append(", departmentPin=");
		sb.append(departmentPin);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", bankId=");
		sb.append(bankId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Department toEntityModel() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		if (uuid == null) {
			departmentImpl.setUuid("");
		}
		else {
			departmentImpl.setUuid(uuid);
		}

		departmentImpl.setDepartmentId(departmentId);

		if (departmentNo == null) {
			departmentImpl.setDepartmentNo("");
		}
		else {
			departmentImpl.setDepartmentNo(departmentNo);
		}

		if (departmentName == null) {
			departmentImpl.setDepartmentName("");
		}
		else {
			departmentImpl.setDepartmentName(departmentName);
		}

		if (departmentAddress == null) {
			departmentImpl.setDepartmentAddress("");
		}
		else {
			departmentImpl.setDepartmentAddress(departmentAddress);
		}

		departmentImpl.setDepartmentPin(departmentPin);
		departmentImpl.setEmployeeId(employeeId);
		departmentImpl.setBankId(bankId);

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		departmentId = objectInput.readLong();
		departmentNo = objectInput.readUTF();
		departmentName = objectInput.readUTF();
		departmentAddress = objectInput.readUTF();

		departmentPin = objectInput.readInt();

		employeeId = objectInput.readLong();

		bankId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(departmentId);

		if (departmentNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(departmentNo);
		}

		if (departmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(departmentName);
		}

		if (departmentAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(departmentAddress);
		}

		objectOutput.writeInt(departmentPin);

		objectOutput.writeLong(employeeId);

		objectOutput.writeLong(bankId);
	}

	public String uuid;
	public long departmentId;
	public String departmentNo;
	public String departmentName;
	public String departmentAddress;
	public int departmentPin;
	public long employeeId;
	public long bankId;

}