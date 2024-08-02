/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.service.impl;

import com.demo.org.model.Bank;
import com.demo.org.service.base.BankLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.demo.org.model.Bank",
	service = AopService.class
)
public class BankLocalServiceImpl extends BankLocalServiceBaseImpl {
	
	public List<Bank> findByBankName(String bankName) {
		return bankPersistence.findBybankName(bankName);
	}
	
	
	public List<Bank> getBankAllDetails(String bankName) {
		return bankFinder.getBankAllDetails(bankName);
		
	}
}