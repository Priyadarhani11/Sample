/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProfessorService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProfessorService
 * @generated
 */
public class ProfessorServiceWrapper
	implements ProfessorService, ServiceWrapper<ProfessorService> {

	public ProfessorServiceWrapper() {
		this(null);
	}

	public ProfessorServiceWrapper(ProfessorService professorService) {
		_professorService = professorService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _professorService.getOSGiServiceIdentifier();
	}

	@Override
	public ProfessorService getWrappedService() {
		return _professorService;
	}

	@Override
	public void setWrappedService(ProfessorService professorService) {
		_professorService = professorService;
	}

	private ProfessorService _professorService;

}