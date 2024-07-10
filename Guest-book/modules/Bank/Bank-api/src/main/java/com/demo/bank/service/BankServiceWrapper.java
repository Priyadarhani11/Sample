/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BankService}.
 *
 * @author Brian Wing Shun Chan
 * @see BankService
 * @generated
 */
public class BankServiceWrapper
	implements BankService, ServiceWrapper<BankService> {

	public BankServiceWrapper() {
		this(null);
	}

	public BankServiceWrapper(BankService bankService) {
		_bankService = bankService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bankService.getOSGiServiceIdentifier();
	}

	@Override
	public BankService getWrappedService() {
		return _bankService;
	}

	@Override
	public void setWrappedService(BankService bankService) {
		_bankService = bankService;
	}

	private BankService _bankService;

}