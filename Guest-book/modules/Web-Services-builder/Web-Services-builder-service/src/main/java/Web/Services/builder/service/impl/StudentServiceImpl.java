/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Web.Services.builder.service.impl;

import Web.Services.builder.model.Student;
import Web.Services.builder.service.base.StudentServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=foo",
		"json.web.service.context.path=Student"
	},
	service = AopService.class
)
public class StudentServiceImpl extends StudentServiceBaseImpl {

	@Override
	public Student addStudent(long groupId, String studentName, String mobileNumber, String email,
			ServiceContext serviceContext) throws PortalException {
		
		return studentLocalService.addStudent(groupId, studentName, mobileNumber, email, serviceContext);
	}
	public Student updateStudent(long studentId, String studentName, String mobileNumber, String email)
			throws PortalException {
		
		return studentLocalService.updateStudent(studentId, studentName, mobileNumber, email);
	}

	@Override
	public Student deleteStudent(long studentId) throws PortalException {
		return studentLocalService.deleteStudent(studentId);
	}

	 public List<Student> getAllStudents() {
	        return studentLocalService.getStudents(-1, -1);
	    }
	@Override
	public Student getStudent(long studentId) throws PortalException {
		return studentLocalService.getStudent(studentId);
	}	
}
	

