package com.user.service;

import com.liferay.admin.kernel.util.Omniadmin;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.LocaleUtil;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

/**
 * @author Lenovo
 */
@Component(
	immediate = true,
	property = {
	
	},
	service = UserService.class
)
public class UserService  {

	private static final Log _log =LogFactoryUtil.getLog(UserService.class);
	private User creatorUserId;
	public User createUser(
            long companyId, String emailAddress, String firstName, String middleName, String lastName, 
            boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle, 
            ServiceContext serviceContext) throws Exception {

		boolean autoPassword = false;
        String password1 = "test";
        String password2 = "test";
        boolean autoScreenName = true;
        String screenName = null;
        long facebookId = 0;
        String openId = null;
        Locale locale = LocaleUtil.getDefault();
        long prefixId = 0;
        long suffixId = 0;
        long[] groupIds = null;
        long[] organizationIds = null;
        long[] roleIds = null;
        long[] userGroupIds = null;
        boolean sendEmail = false;
		
        User user = UserLocalServiceUtil.addUser(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, screenName, emailAddress, locale, firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail, serviceContext)();
        _log.info("User created: " + user.getUserId());
			return user;
			
	}
}