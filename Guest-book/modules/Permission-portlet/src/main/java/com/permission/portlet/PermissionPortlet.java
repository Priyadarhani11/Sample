package com.permission.portlet;

import com.permission.constants.PermissionPortletKeys;
import com.student.permission.model.Student;
import com.student.permission.service.StudentLocalServiceUtil;

import java.io.IOException;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Dell
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Permission",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PermissionPortletKeys.PERMISSION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PermissionPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		List<Student> studentList = StudentLocalServiceUtil.getStudents(-1, -1);
		renderRequest.setAttribute("studentList", studentList);
		super.doView(renderRequest, renderResponse);
	}
	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, IOException, PortalException {
		System.out.println("Excecuting Method::::::");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		String studentName = ParamUtil.getString(actionRequest, "studentName");
		System.out.println("Student Name::::" + studentName);
		String studentMobileNumber = ParamUtil.getString(actionRequest, "studentMobileNumber");
		String studentDesignation = ParamUtil.getString(actionRequest, "studentDesignation");
		System.out.println("studentDesignation : :::::" + studentDesignation);

		ServiceContext serviceContext = ServiceContextFactory.getInstance(PermissionPortlet.class.getName(),
				actionRequest);
		StudentLocalServiceUtil.addStudent(groupId, companyId, studentName, studentMobileNumber,
				studentDesignation, serviceContext);
		System.out.println("Student Created ::::::");
	}
	public void updateEmployee(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, IOException, PortalException {

		
		
		long studentId = ParamUtil.getLong(actionRequest, "studentId");
		System.out.println("Student ID::::" + studentId);
		String studentName = ParamUtil.getString(actionRequest, "studentName");
		System.out.println("Student Name::::" + studentName);
		String studentMobileNumber = ParamUtil.getString(actionRequest, "studentMobileNumber");
		System.out.println("studentMobileNumber::::" + studentMobileNumber);
		String studentDesignation = ParamUtil.getString(actionRequest, "studentDesignation");
		System.out.println("studentDesignation : :::::" + studentDesignation);
		/*
		 * UploadPortletRequest uploadPortletRequest =
		 * PortalUtil.getUploadPortletRequest(actionRequest); InputStream empPhotoStream
		 * = uploadPortletRequest.getFileAsStream("employeePhoto");
		 * System.out.println("employeePhoto  ::::::" + empPhotoStream);
		 */
		ServiceContext serviceContext = ServiceContextFactory.getInstance(PermissionPortlet.class.getName(),
				actionRequest);
		  
		 
		

		StudentLocalServiceUtil.updateStudent(studentId, studentName, studentMobileNumber, studentDesignation,
				serviceContext);
		_log.info("End UpdateStudent Method :::::::");
	}

	public void deleteEntry(ActionRequest request, ActionResponse response) throws Exception {
		_log.info("Started deleteStudent Method :::::::");
		/*
		 * long exampleEntryId = ParamUtil.getLong(request, "entryId");
		 * 
		 * ExampleEntryLocalServiceUtil.deleteExampleEntry(exampleEntryId);
		 */

		long studentId = ParamUtil.getLong(request, "studentId", GetterUtil.DEFAULT_LONG);
		try {
			StudentLocalServiceUtil.deleteStudent(studentId);
		} catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		_log.info("Student deleted successfully.");
	}
	private static final Log _log = LogFactoryUtil.getLog(PermissionPortlet.class);
	}
