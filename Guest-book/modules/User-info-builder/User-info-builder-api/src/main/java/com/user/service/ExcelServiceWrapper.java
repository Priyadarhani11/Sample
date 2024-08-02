/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExcelService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExcelService
 * @generated
 */
public class ExcelServiceWrapper
	implements ExcelService, ServiceWrapper<ExcelService> {

	public ExcelServiceWrapper() {
		this(null);
	}

	public ExcelServiceWrapper(ExcelService excelService) {
		_excelService = excelService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _excelService.getOSGiServiceIdentifier();
	}

	@Override
	public ExcelService getWrappedService() {
		return _excelService;
	}

	@Override
	public void setWrappedService(ExcelService excelService) {
		_excelService = excelService;
	}

	private ExcelService _excelService;

}