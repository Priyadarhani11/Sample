/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.model.impl;

import com.demo.org.model.Bank;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bank in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BankCacheModel implements CacheModel<Bank>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BankCacheModel)) {
			return false;
		}

		BankCacheModel bankCacheModel = (BankCacheModel)object;

		if (bankId == bankCacheModel.bankId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bankId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bankId=");
		sb.append(bankId);
		sb.append(", bankName=");
		sb.append(bankName);
		sb.append(", bankAddress=");
		sb.append(bankAddress);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bank toEntityModel() {
		BankImpl bankImpl = new BankImpl();

		if (uuid == null) {
			bankImpl.setUuid("");
		}
		else {
			bankImpl.setUuid(uuid);
		}

		bankImpl.setBankId(bankId);

		if (bankName == null) {
			bankImpl.setBankName("");
		}
		else {
			bankImpl.setBankName(bankName);
		}

		if (bankAddress == null) {
			bankImpl.setBankAddress("");
		}
		else {
			bankImpl.setBankAddress(bankAddress);
		}

		bankImpl.resetOriginalValues();

		return bankImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bankId = objectInput.readLong();
		bankName = objectInput.readUTF();
		bankAddress = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bankId);

		if (bankName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bankName);
		}

		if (bankAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bankAddress);
		}
	}

	public String uuid;
	public long bankId;
	public String bankName;
	public String bankAddress;

}