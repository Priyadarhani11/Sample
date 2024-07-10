/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.demo.bank.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchSalaryException extends NoSuchModelException {

	public NoSuchSalaryException() {
	}

	public NoSuchSalaryException(String msg) {
		super(msg);
	}

	public NoSuchSalaryException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchSalaryException(Throwable throwable) {
		super(throwable);
	}

}