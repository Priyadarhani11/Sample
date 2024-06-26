package com.guestbook.web.portlet;


import com.guestbook.constants.GuestbookWebPortletKeys;
import com.guestbook.model.GuestbookEntry;
import com.guestbook.service.GuestbookEntryLocalService;
import com.guestbook.service.GuestbookLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component (immediate = true,
property = {
		"javax.portlet.name=" + GuestbookWebPortletKeys.GUESTBOOKWEB,
	        "mvc.command.name=/addEntry"
	    },
	    service = MVCActionCommand.class
	)

public class AddEntryMVCActionCommand implements MVCActionCommand{

	@Reference
	private GuestbookEntryLocalService _guestbookEntryLocalService;

	@Reference
	private GuestbookLocalService _guestbookLocalService;
	
	@Override
	public boolean processAction(ActionRequest request, ActionResponse response) throws PortletException {
		System.out.println("entry added");
		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(GuestbookEntry.class.getName(), request);
		} catch (PortalException e1) {
			
			e1.printStackTrace();
		}

		String userName = ParamUtil.getString(request, "name");
		String email = ParamUtil.getString(request, "email");
		String message = ParamUtil.getString(request, "message");
		long mobile = ParamUtil.getLong(request, "mobile");
		long guestbookId = ParamUtil.getLong(request, "guestbookId");
		long entryId = ParamUtil.getLong(request, "entryId");
	
		System.out.println("entryId" + entryId);

		if (entryId > 0) {
			try {
				_guestbookEntryLocalService.updateGuestbookEntry(serviceContext.getUserId(), guestbookId, entryId,
						userName, email, message, mobile, serviceContext);

				response.setRenderParameter("guestbookId", Long.toString(guestbookId));
				SessionMessages.add(request, "entryAdded");
			} catch (Exception e) {
				SessionErrors.add(request, e.getClass().getName());
				PortalUtil.copyRequestParameters(request, response);
				response.setRenderParameter("mvcPath", "/guestbook/edit_entry.jsp");
			}
		} else {
			try {
				_guestbookEntryLocalService.addGuestbookEntry(serviceContext.getUserId(), guestbookId, userName, email,
						message, mobile, serviceContext);

				response.setRenderParameter("guestbookId", Long.toString(guestbookId));
			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/guestbook/edit_entry.jsp");
			}
		}
		return false;
	}
	
}
