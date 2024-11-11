/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package student.headless.builder.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import student.headless.builder.model.student;

/**
 * The cache model class for representing student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class studentCacheModel implements CacheModel<student>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof studentCacheModel)) {
			return false;
		}

		studentCacheModel studentCacheModel = (studentCacheModel)object;

		if (id == studentCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", standard=");
		sb.append(standard);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public student toEntityModel() {
		studentImpl studentImpl = new studentImpl();

		studentImpl.setId(id);

		if (name == null) {
			studentImpl.setName("");
		}
		else {
			studentImpl.setName(name);
		}

		if (standard == null) {
			studentImpl.setStandard("");
		}
		else {
			studentImpl.setStandard(standard);
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		name = objectInput.readUTF();
		standard = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (standard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(standard);
		}
	}

	public long id;
	public String name;
	public String standard;

}