/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Web.Services.builder.service.impl;

import Web.Services.builder.model.Student;
import Web.Services.builder.service.base.StudentLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.IOException;
import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=Web.Services.builder.model.Student",
	service = AopService.class
)
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
	
	public Student addStudent(long groupId, String studentName, String mobileNumber,String email, ServiceContext serviceContext) throws PortalException {
		
		Group group = GroupLocalServiceUtil.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		
		long studentId = counterLocalService.increment(Student.class.getName());
		Student student = createStudent(studentId);
		student.setGroupId(groupId);
		student.setCompanyId(group.getCompanyId());
		student.setUserId(userId);
		student.setStudentName(studentName);
		
		student.setMobileNumber(mobileNumber);
		student.setEmail(email);
		student.setCreateDate(new Date());
		student.setModifiedDate(new Date());
		
		return super.addStudent(student);
	}
	public Student updateStudent(long studentId, String studentName,String mobileNumber,String email) throws PortalException {
		
Student student = getStudent(studentId);
		
student.setStudentName(studentName);
		
student.setMobileNumber(mobileNumber);
student.setEmail(email);
student.setModifiedDate(new Date());
		
		
		return super.updateStudent(student);
	}
		@Override
		public Student addStudent(Student student) {
			throw new  UnsupportedOperationException("Not Supported");
	}
	
}