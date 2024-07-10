/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;BANK_Salary&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Salary
 * @generated
 */
public class SalaryTable extends BaseTable<SalaryTable> {

	public static final SalaryTable INSTANCE = new SalaryTable();

	public final Column<SalaryTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SalaryTable, Long> salaryId = createColumn(
		"salaryId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SalaryTable, Long> employeeId = createColumn(
		"employeeId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SalaryTable, Double> amount = createColumn(
		"amount", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<SalaryTable, String> currency = createColumn(
		"currency_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SalaryTable, Date> paymentDate = createColumn(
		"paymentDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private SalaryTable() {
		super("BANK_Salary", SalaryTable::new);
	}

}