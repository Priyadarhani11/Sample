package com.example.user.portlet;

import com.example.user.constants.NewUserPortletKeys;
import com.liferay.analytics.reports.info.item.AnalyticsReportsInfoItem.Action;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserConstants;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletModeException;
import javax.portlet.WindowStateException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Lenovo
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=NewUser",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + NewUserPortletKeys.NEWUSER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class NewUserPortlet extends MVCPortlet {

	private static final Log logger = LogFactoryUtil.getLog(NewUserPortlet.class);

	public void signupURL(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, ParseException, IOException, PortletModeException, WindowStateException, java.text.ParseException {

	ServiceContext serviceContext = ServiceContextFactory.getInstance(User.class.getName(), actionRequest);

	ThemeDisplay themeDisplay=(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			logger.info("In sign up method:::::::::");

			long creatorUserId = 0l;

			long companyId = PortalUtil.getCompanyId(actionRequest);

			boolean autoPassword = false;

			//String login = ParamUtil.getString(actionRequest, "login");
			String password1 = "hellopassword";
			String password2 = "hellopassword";

//			Arg password2 same as password1

			boolean autoScreenName = false;

			String screenName = ParamUtil.getString(actionRequest, "screenName");

			String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");

			Locale locale = Locale.getDefault();

			String firstName = ParamUtil.getString(actionRequest, "firstName");

			String middleName = ParamUtil.getString(actionRequest, "middleName");

			String lastName = ParamUtil.getString(actionRequest, "lastName");

			long prefixId = 0l;

			long suffixId = 0l;

			boolean male = true;

			//Birthday date conversions /

			String dateOfBirth = ParamUtil.getString(actionRequest, "dateOfBirth");

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			Date date = formatter.parse(dateOfBirth);

			Calendar calendar = Calendar.getInstance();

			calendar.setTime(date);

			int birthMonth = calendar.get(Calendar.MONTH);

			int dayOfMonth = calendar.get(Calendar.DATE);

			int birthYear = calendar.get(Calendar.YEAR);

		//	/ Birthday Date converted /

			String jobTitle = ParamUtil.getString(actionRequest, "jobTitle");

			long[] groupId = ParamUtil.getLongValues(actionRequest, "groupId");

			long[] organizationId = ParamUtil.getLongValues(actionRequest, "organizationId");

			long[] roleId = ParamUtil.getLongValues(actionRequest, "roleId");

			long[] userGroupId = ParamUtil.getLongValues(actionRequest, "userGroupId");

			boolean sendMail = false;
			
			try {

				logger.info("creatorUserId  :::::::::::::" + creatorUserId);

				logger.info("companyId ID :::::::::::::" + companyId);

				logger.info("autoPassword :::::::::::::" + autoPassword);

				logger.info("password1 :::::::::::::" + password1);

				logger.info("password2 :::::::::::::" + password2);

				logger.info("autoScreenName  :::::::::::::" + autoScreenName);

				logger.info("screenName  :::::::::::::" + screenName);

				logger.info("emailAddress  :::::::::::::" + emailAddress);

				logger.info("locale  :::::::::::::" + locale);

				logger.info("firstName  :::::::::::::" + firstName);

				logger.info("middleName  :::::::::::::" + middleName);

				logger.info("lastName  :::::::::::::" + lastName);

				logger.info("prefixId  :::::::::::::" + prefixId);

				logger.info("suffixId  :::::::::::::" + suffixId);

				logger.info("male  :::::::::::::" + male);

				logger.info("dateOfBirth  :::::::::::::" + dateOfBirth);

				logger.info("prefixId  :::::::::::::" + prefixId);

				logger.info("year of birth  :::::::::::::" + calendar.get(Calendar.YEAR));

				logger.info("month of birth  :::::::::::::" + calendar.get(Calendar.MONTH));

				logger.info("date of  birth month  :::::::::::::" + calendar.get(Calendar.DATE));

				logger.info("jobTitle  :::::::::::::" + jobTitle);

				logger.info("groupId  :::::::::::::" + groupId);

				logger.info("organizationId  :::::::::::::" + organizationId);

				logger.info("roleId  :::::::::::::" + roleId);

				logger.info("prefixId  :::::::::::::" + prefixId);

				logger.info("prefixId  :::::::::::::" + userGroupId);

				logger.info("sendMail  :::::::::::::" + sendMail);

				User user = UserLocalServiceUtil.addUser(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, screenName, emailAddress, locale, firstName, middleName, lastName, prefixId, suffixId, male, birthMonth, dayOfMonth, birthYear,  jobTitle, UserConstants.TYPE_REGULAR, groupId, organizationId, roleId, userGroupId, sendMail, serviceContext);
				
				 UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			        File file = uploadRequest.getFile("profPict");
			        byte[] portraitByte = FileUtil.getBytes(file);
			        
			        if (file != null ) {
			            UserLocalServiceUtil.updatePortrait(user.getUserId(), portraitByte);
			        }
			       
				logger.info("After ::::::::::::::::::::::::: Added :::::::::::::::::::::::::::user");

				logger.info("Generated User id after adding ::::::::::::"+user.getUserId());

			} catch (Exception e) {

				logger.error(e.getMessage());

		}

		}
}