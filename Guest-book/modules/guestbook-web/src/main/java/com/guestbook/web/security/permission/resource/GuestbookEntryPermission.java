package com.guestbook.web.security.permission.resource;

import com.guestbook.model.GuestbookEntry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component (immediate = true)
public class GuestbookEntryPermission {
	
	public static boolean contains(PermissionChecker permissionChecker, Long entry, String actionId) throws PortalException {
		 return _guestbookEntryModelResourcePermission.contains(permissionChecker, entry, actionId);
    }
@Reference(
		target = "(model.class.name=com.guestbook.model.GuestbookEntry)",
		 unbind = "-")
protected void setEntryModelPermission(ModelResourcePermission<GuestbookEntry> modelResourcePermission) {
	
	 _guestbookEntryModelResourcePermission = modelResourcePermission;
}
private static ModelResourcePermission<GuestbookEntry>_guestbookEntryModelResourcePermission;
	
	}


