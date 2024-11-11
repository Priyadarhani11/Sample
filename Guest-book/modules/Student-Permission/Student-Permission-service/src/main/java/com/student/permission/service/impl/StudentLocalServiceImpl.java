/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.student.permission.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.student.permission.exception.NoSuchStudentException;
import com.student.permission.model.Student;
import com.student.permission.service.base.StudentLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.student.permission.model.Student",
	service = AopService.class
)
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
	
	@Override
	public Student addStudent(long groupId, long companyId, String studentName, String studentMobileNumber,
			String studentDesignation, ServiceContext serviceContext) {
		
		long studentId = counterLocalService.increment(Student.class.getName());
		Student student = studentPersistence.create(studentId);
	
		student.setGroupId(groupId);
		student.setCompanyId(companyId);
		student.setStudentName(studentName);
		student.setStudentMobileNumber(studentMobileNumber);
		student.setStudentDesignation(studentDesignation);
		
		student.setCreateDate(new Date());
		student.setModifiedDate(new Date());
		studentLocalService.addStudent(student);
		return super.addStudent(student);
		
	}

	@Override
	public Student deleteStudent(long studentId) throws PortalException{
		
		Student student = studentPersistence.findByPrimaryKey(studentId);
		return super.deleteStudent(student);
	
	}
	
	  @Override 
	  public Student updateStudent(long studentId, String studentName,
	  String studentMobileNumber, String studentDesignation, ServiceContext
	  serviceContext) throws PortalException {
	  
		  
	  Student student = studentPersistence.findByPrimaryKey(studentId);
	 
	  
	  student.setStudentName(studentName);
	  student.setStudentMobileNumber(studentMobileNumber);
	  student.setStudentDesignation(studentDesignation);
	 
	  student = studentPersistence.update(student);
	  return super.updateStudent(student);
	  
	}
	  //Finder Method
	  public List<Student> getStudentDesignation(String studentDesignation)
	  {
		  return studentPersistence.findBystudentDesignation(studentDesignation);
	  }
	  
}
