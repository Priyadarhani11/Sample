/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SalaryService}.
 *
 * @author Brian Wing Shun Chan
 * @see SalaryService
 * @generated
 */
public class SalaryServiceWrapper
	implements SalaryService, ServiceWrapper<SalaryService> {

	public SalaryServiceWrapper() {
		this(null);
	}

	public SalaryServiceWrapper(SalaryService salaryService) {
		_salaryService = salaryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _salaryService.getOSGiServiceIdentifier();
	}

	@Override
	public SalaryService getWrappedService() {
		return _salaryService;
	}

	@Override
	public void setWrappedService(SalaryService salaryService) {
		_salaryService = salaryService;
	}

	private SalaryService _salaryService;

}