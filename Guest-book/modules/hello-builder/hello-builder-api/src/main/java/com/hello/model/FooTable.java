/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hello.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;employee&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
public class FooTable extends BaseTable<FooTable> {

	public static final FooTable INSTANCE = new FooTable();

	public final Column<FooTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FooTable, Integer> employeeId = createColumn(
		"employeeId", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<FooTable, String> employeeName = createColumn(
		"employeeName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private FooTable() {
		super("employee", FooTable::new);
	}

}