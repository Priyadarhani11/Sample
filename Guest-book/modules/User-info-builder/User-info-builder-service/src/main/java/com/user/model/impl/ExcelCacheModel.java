/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.user.model.Excel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Excel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExcelCacheModel implements CacheModel<Excel>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExcelCacheModel)) {
			return false;
		}

		ExcelCacheModel excelCacheModel = (ExcelCacheModel)object;

		if (excelId == excelCacheModel.excelId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, excelId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", excelId=");
		sb.append(excelId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Excel toEntityModel() {
		ExcelImpl excelImpl = new ExcelImpl();

		if (uuid == null) {
			excelImpl.setUuid("");
		}
		else {
			excelImpl.setUuid(uuid);
		}

		excelImpl.setExcelId(excelId);

		if (name == null) {
			excelImpl.setName("");
		}
		else {
			excelImpl.setName(name);
		}

		if (address == null) {
			excelImpl.setAddress("");
		}
		else {
			excelImpl.setAddress(address);
		}

		excelImpl.setPhoneNumber(phoneNumber);

		excelImpl.resetOriginalValues();

		return excelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		excelId = objectInput.readLong();
		name = objectInput.readUTF();
		address = objectInput.readUTF();

		phoneNumber = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(excelId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(phoneNumber);
	}

	public String uuid;
	public long excelId;
	public String name;
	public String address;
	public long phoneNumber;

}