package com.guestbook.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component (immediate = true,
property = {
		"javax.portlet.name=" + "GUESTBOOKWEB",
        "mvc.command.name=/guestbook/delete_entry"
    },
    service = MVCActionCommand.class
)

public class DeleteEntryMVCActionCommand implements MVCActionCommand{

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		return false;
	}

}
