/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.model.impl;

import com.demo.bank.model.Salary;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Salary in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SalaryCacheModel implements CacheModel<Salary>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SalaryCacheModel)) {
			return false;
		}

		SalaryCacheModel salaryCacheModel = (SalaryCacheModel)object;

		if (salaryId == salaryCacheModel.salaryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, salaryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", salaryId=");
		sb.append(salaryId);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", paymentDate=");
		sb.append(paymentDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Salary toEntityModel() {
		SalaryImpl salaryImpl = new SalaryImpl();

		if (uuid == null) {
			salaryImpl.setUuid("");
		}
		else {
			salaryImpl.setUuid(uuid);
		}

		salaryImpl.setSalaryId(salaryId);
		salaryImpl.setEmployeeId(employeeId);
		salaryImpl.setAmount(amount);

		if (currency == null) {
			salaryImpl.setCurrency("");
		}
		else {
			salaryImpl.setCurrency(currency);
		}

		if (paymentDate == Long.MIN_VALUE) {
			salaryImpl.setPaymentDate(null);
		}
		else {
			salaryImpl.setPaymentDate(new Date(paymentDate));
		}

		salaryImpl.resetOriginalValues();

		return salaryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		salaryId = objectInput.readLong();

		employeeId = objectInput.readLong();

		amount = objectInput.readDouble();
		currency = objectInput.readUTF();
		paymentDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(salaryId);

		objectOutput.writeLong(employeeId);

		objectOutput.writeDouble(amount);

		if (currency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currency);
		}

		objectOutput.writeLong(paymentDate);
	}

	public String uuid;
	public long salaryId;
	public long employeeId;
	public double amount;
	public String currency;
	public long paymentDate;

}