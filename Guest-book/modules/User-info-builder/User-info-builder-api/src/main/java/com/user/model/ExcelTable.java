/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;CUSTOM_Excel&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Excel
 * @generated
 */
public class ExcelTable extends BaseTable<ExcelTable> {

	public static final ExcelTable INSTANCE = new ExcelTable();

	public final Column<ExcelTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExcelTable, Long> excelId = createColumn(
		"excelId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ExcelTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExcelTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExcelTable, Long> phoneNumber = createColumn(
		"phoneNumber", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ExcelTable() {
		super("CUSTOM_Excel", ExcelTable::new);
	}

}