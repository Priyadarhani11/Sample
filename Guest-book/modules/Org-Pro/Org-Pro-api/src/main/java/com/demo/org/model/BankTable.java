/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;ORG_Bank&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
public class BankTable extends BaseTable<BankTable> {

	public static final BankTable INSTANCE = new BankTable();

	public final Column<BankTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BankTable, Long> bankId = createColumn(
		"bankId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BankTable, String> bankName = createColumn(
		"bankName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BankTable, String> bankAddress = createColumn(
		"bankAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private BankTable() {
		super("ORG_Bank", BankTable::new);
	}

}