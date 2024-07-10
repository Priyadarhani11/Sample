/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Salary service. Represents a row in the &quot;BANK_Salary&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SalaryModel
 * @generated
 */
@ImplementationClassName("com.demo.bank.model.impl.SalaryImpl")
@ProviderType
public interface Salary extends PersistedModel, SalaryModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.demo.bank.model.impl.SalaryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Salary, Long> SALARY_ID_ACCESSOR =
		new Accessor<Salary, Long>() {

			@Override
			public Long get(Salary salary) {
				return salary.getSalaryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Salary> getTypeClass() {
				return Salary.class;
			}

		};

}