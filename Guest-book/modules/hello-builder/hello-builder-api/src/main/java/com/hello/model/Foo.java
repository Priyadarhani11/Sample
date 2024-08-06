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
 * The extended model interface for the Foo service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FooModel
 * @generated
 */
@ImplementationClassName("com.hello.model.impl.FooImpl")
@ProviderType
public interface Foo extends FooModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.hello.model.impl.FooImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Foo, Integer> EMPLOYEE_ID_ACCESSOR =
		new Accessor<Foo, Integer>() {

			@Override
			public Integer get(Foo foo) {
				return foo.getEmployeeId();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<Foo> getTypeClass() {
				return Foo.class;
			}

		};

}