/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;ORG_Department&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
public class DepartmentTable extends BaseTable<DepartmentTable> {

	public static final DepartmentTable INSTANCE = new DepartmentTable();

	public final Column<DepartmentTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, Long> departmentId = createColumn(
		"departmentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DepartmentTable, String> departmentNo = createColumn(
		"departmentNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, String> departmentName = createColumn(
		"departmentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, String> departmentAddress =
		createColumn(
			"departmentAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, Integer> departmentPin = createColumn(
		"departmentPin", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, Long> employeeId = createColumn(
		"employeeId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DepartmentTable, Long> bankId = createColumn(
		"bankId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DepartmentTable() {
		super("ORG_Department", DepartmentTable::new);
	}

}