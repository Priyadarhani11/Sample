/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hello.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Foo service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.hello.model.impl.FooModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.hello.model.impl.FooImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
@ProviderType
public interface FooModel extends BaseModel<Foo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a foo model instance should use the {@link Foo} interface instead.
	 */

	/**
	 * Returns the primary key of this foo.
	 *
	 * @return the primary key of this foo
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this foo.
	 *
	 * @param primaryKey the primary key of this foo
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the uuid of this foo.
	 *
	 * @return the uuid of this foo
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this foo.
	 *
	 * @param uuid the uuid of this foo
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the employee ID of this foo.
	 *
	 * @return the employee ID of this foo
	 */
	public int getEmployeeId();

	/**
	 * Sets the employee ID of this foo.
	 *
	 * @param employeeId the employee ID of this foo
	 */
	public void setEmployeeId(int employeeId);

	/**
	 * Returns the employee name of this foo.
	 *
	 * @return the employee name of this foo
	 */
	@AutoEscape
	public String getEmployeeName();

	/**
	 * Sets the employee name of this foo.
	 *
	 * @param employeeName the employee name of this foo
	 */
	public void setEmployeeName(String employeeName);

	@Override
	public Foo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}