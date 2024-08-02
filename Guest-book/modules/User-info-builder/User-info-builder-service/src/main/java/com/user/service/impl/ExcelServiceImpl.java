/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.service.impl;

import com.liferay.portal.aop.AopService;

import com.user.service.base.ExcelServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=custom",
		"json.web.service.context.path=Excel"
	},
	service = AopService.class
)
public class ExcelServiceImpl extends ExcelServiceBaseImpl {
}