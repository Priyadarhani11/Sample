/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hello.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Employee service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeModel
 * @generated
 */
@ImplementationClassName("com.hello.model.impl.EmployeeImpl")
@ProviderType
public interface Employee extends EmployeeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.hello.model.impl.EmployeeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Employee, Integer> EMPLOYEE_ID_ACCESSOR =
		new Accessor<Employee, Integer>() {

			@Override
			public Integer get(Employee employee) {
				return employee.getEmployeeId();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Employee> getTypeClass() {
				return Employee.class;
			}

		};

}