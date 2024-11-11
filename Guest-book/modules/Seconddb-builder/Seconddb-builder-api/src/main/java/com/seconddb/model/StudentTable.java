/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.seconddb.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;students&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentTable extends BaseTable<StudentTable> {

	public static final StudentTable INSTANCE = new StudentTable();

	public final Column<StudentTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StudentTable, Integer> studentId = createColumn(
		"studentId", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<StudentTable, String> studentName = createColumn(
		"studentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private StudentTable() {
		super("students", StudentTable::new);
	}

}