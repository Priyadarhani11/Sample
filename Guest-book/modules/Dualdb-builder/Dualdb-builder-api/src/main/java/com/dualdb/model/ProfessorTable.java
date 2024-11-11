/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;professors&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Professor
 * @generated
 */
public class ProfessorTable extends BaseTable<ProfessorTable> {

	public static final ProfessorTable INSTANCE = new ProfessorTable();

	public final Column<ProfessorTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProfessorTable, Integer> pId = createColumn(
		"pId", Integer.class, Types.INTEGER, Column.FLAG_PRIMARY);
	public final Column<ProfessorTable, String> pName = createColumn(
		"pName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ProfessorTable() {
		super("professors", ProfessorTable::new);
	}

}