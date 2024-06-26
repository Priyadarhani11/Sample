/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.guestbook.service.impl;

import com.guestbook.exception.GuestbookNameException;
import com.guestbook.model.Guestbook;
import com.guestbook.model.GuestbookEntry;
import com.guestbook.service.GuestbookEntryLocalService;
import com.guestbook.service.base.GuestbookLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.guestbook.model.Guestbook",
	service = AopService.class
)
public class GuestbookLocalServiceImpl extends GuestbookLocalServiceBaseImpl {
	
	public Guestbook addGuestbook(long userId, String name,
			ServiceContext serviceContext) throws PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);
		
		Date now = new Date();

		validate(name);

		long guestbookId = counterLocalService.increment();

		Guestbook guestbook = guestbookPersistence.create(guestbookId);
		guestbook.setUuid(serviceContext.getUuid());
		guestbook.setUserId(userId);
		guestbook.setGroupId(groupId);
		guestbook.setCompanyId(user.getCompanyId());
		guestbook.setUserName(user.getFullName());
		guestbook.setCreateDate(serviceContext.getCreateDate(now));
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);

		guestbookPersistence.update(guestbook);
		resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
			    Guestbook.class.getName(), guestbookId, false, true, true);

		return guestbook;
	}

	
	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new GuestbookNameException();
			
		}
	}
	
	public Guestbook updateGuestbook(long userId, long guestbookId, 
			String name, ServiceContext serviceContext) throws PortalException,
	    SystemException {
		
		Date now = new Date();
		validate (name);
		Guestbook guestbook = getGuestbook(guestbookId);
		User user = userLocalService.getUser(userId);
		
		guestbook.setUserId(userId);
		guestbook.setUserName(user.getFullName());
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);
		
		guestbookPersistence.update(guestbook);
		resourceLocalService.updateResources(serviceContext.getCompanyId(),
			    serviceContext.getScopeGroupId(), 
			    Guestbook.class.getName(), guestbookId,
			    serviceContext.getModelPermissions());
		
		return guestbook;
	}
	public Guestbook deleteGuestbook(long guestbookId,
			ServiceContext serviceContext) throws PortalException,
	SystemException {
		
		 Guestbook guestbook = getGuestbook(guestbookId);
		 
		 List<GuestbookEntry> entries = _guestbookEntryLocalService.getGuestbookEntries(
				 serviceContext.getScopeGroupId(),guestbookId);
		 for (GuestbookEntry entry : entries) {
			 _guestbookEntryLocalService.deleteGuestbookEntry(entry.getEntryId());
		 }
		 guestbook = deleteGuestbook(guestbook);	
		 resourceLocalService.deleteResource(serviceContext.getCompanyId(),
				    Guestbook.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				    guestbookId);
		
		return guestbook;
		
	}
	
	@Reference
	private GuestbookEntryLocalService _guestbookEntryLocalService;
}