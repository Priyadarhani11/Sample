/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Excel service. Represents a row in the &quot;CUSTOM_Excel&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExcelModel
 * @generated
 */
@ImplementationClassName("com.user.model.impl.ExcelImpl")
@ProviderType
public interface Excel extends ExcelModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.user.model.impl.ExcelImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Excel, Long> EXCEL_ID_ACCESSOR =
		new Accessor<Excel, Long>() {

			@Override
			public Long get(Excel excel) {
				return excel.getExcelId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Excel> getTypeClass() {
				return Excel.class;
			}

		};

}