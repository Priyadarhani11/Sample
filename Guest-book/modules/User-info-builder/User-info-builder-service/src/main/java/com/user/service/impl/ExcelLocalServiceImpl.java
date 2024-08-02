/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.service.impl;

import com.liferay.portal.aop.AopService;
import com.user.model.Excel;
import com.user.service.base.ExcelLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.user.model.Excel",
	service = AopService.class
)
public class ExcelLocalServiceImpl extends ExcelLocalServiceBaseImpl{
	
	public void addMyEntity(String name, String address, long phoneNumber) {
        Excel excel = excelPersistence.create(counterLocalService.increment());

        excel.setName(name);
        excel.setAddress(address);
        excel.setPhoneNumber(phoneNumber); 

        excelPersistence.update(excel);
        
    }
	public boolean isPhoneNumberExists(long phoneNumber) {
        List<Excel> excels = excelPersistence.findByPhoneNumber(phoneNumber);
        return !excels.isEmpty();
    }
	
}