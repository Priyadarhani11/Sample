/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.model.impl;

import com.demo.bank.model.Employee;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeCacheModel
	implements CacheModel<Employee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)object;

		if (employeeId == employeeCacheModel.employeeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", employeeAddress=");
		sb.append(employeeAddress);
		sb.append(", employeePhoneNo=");
		sb.append(employeePhoneNo);
		sb.append(", employeePinNo=");
		sb.append(employeePinNo);
		sb.append(", bankId=");
		sb.append(bankId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		if (uuid == null) {
			employeeImpl.setUuid("");
		}
		else {
			employeeImpl.setUuid(uuid);
		}

		employeeImpl.setEmployeeId(employeeId);

		if (employeeName == null) {
			employeeImpl.setEmployeeName("");
		}
		else {
			employeeImpl.setEmployeeName(employeeName);
		}

		if (employeeAddress == null) {
			employeeImpl.setEmployeeAddress("");
		}
		else {
			employeeImpl.setEmployeeAddress(employeeAddress);
		}

		employeeImpl.setEmployeePhoneNo(employeePhoneNo);
		employeeImpl.setEmployeePinNo(employeePinNo);
		employeeImpl.setBankId(bankId);

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		employeeId = objectInput.readLong();
		employeeName = objectInput.readUTF();
		employeeAddress = objectInput.readUTF();

		employeePhoneNo = objectInput.readLong();

		employeePinNo = objectInput.readInt();

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

		objectOutput.writeLong(employeeId);

		if (employeeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (employeeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employeeAddress);
		}

		objectOutput.writeLong(employeePhoneNo);

		objectOutput.writeInt(employeePinNo);

		objectOutput.writeLong(bankId);
	}

	public String uuid;
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhoneNo;
	public int employeePinNo;
	public long bankId;

}