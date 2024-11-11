/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.model.impl;

import com.dualdb.model.Professor;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Professor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProfessorCacheModel
	implements CacheModel<Professor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProfessorCacheModel)) {
			return false;
		}

		ProfessorCacheModel professorCacheModel = (ProfessorCacheModel)object;

		if (pId == professorCacheModel.pId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", pId=");
		sb.append(pId);
		sb.append(", pName=");
		sb.append(pName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Professor toEntityModel() {
		ProfessorImpl professorImpl = new ProfessorImpl();

		if (uuid == null) {
			professorImpl.setUuid("");
		}
		else {
			professorImpl.setUuid(uuid);
		}

		professorImpl.setPId(pId);

		if (pName == null) {
			professorImpl.setPName("");
		}
		else {
			professorImpl.setPName(pName);
		}

		professorImpl.resetOriginalValues();

		return professorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		pId = objectInput.readInt();
		pName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeInt(pId);

		if (pName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pName);
		}
	}

	public String uuid;
	public int pId;
	public String pName;

}