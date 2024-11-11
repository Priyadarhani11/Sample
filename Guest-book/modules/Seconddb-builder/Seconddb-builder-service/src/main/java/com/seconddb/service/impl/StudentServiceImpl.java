/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.seconddb.service.impl;

import com.liferay.portal.aop.AopService;

import com.seconddb.service.base.StudentServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=test",
		"json.web.service.context.path=Student"
	},
	service = AopService.class
)
public class StudentServiceImpl extends StudentServiceBaseImpl {
}