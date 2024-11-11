/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package student.headless.builder.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;STU_student&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see student
 * @generated
 */
public class studentTable extends BaseTable<studentTable> {

	public static final studentTable INSTANCE = new studentTable();

	public final Column<studentTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<studentTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<studentTable, String> standard = createColumn(
		"standard", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private studentTable() {
		super("STU_student", studentTable::new);
	}

}