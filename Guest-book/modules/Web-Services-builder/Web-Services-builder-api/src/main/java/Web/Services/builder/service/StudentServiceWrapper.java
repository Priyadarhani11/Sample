/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Web.Services.builder.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StudentService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentService
 * @generated
 */
public class StudentServiceWrapper
	implements ServiceWrapper<StudentService>, StudentService {

	public StudentServiceWrapper() {
		this(null);
	}

	public StudentServiceWrapper(StudentService studentService) {
		_studentService = studentService;
	}

	@Override
	public Web.Services.builder.model.Student addStudent(
			long groupId, String studentName, String mobileNumber, String email,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentService.addStudent(
			groupId, studentName, mobileNumber, email, serviceContext);
	}

	@Override
	public Web.Services.builder.model.Student deleteStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentService.deleteStudent(studentId);
	}

	@Override
	public java.util.List<Web.Services.builder.model.Student> getAllStudents() {
		return _studentService.getAllStudents();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _studentService.getOSGiServiceIdentifier();
	}

	@Override
	public Web.Services.builder.model.Student getStudent(long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentService.getStudent(studentId);
	}

	@Override
	public Web.Services.builder.model.Student updateStudent(
			long studentId, String studentName, String mobileNumber,
			String email)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _studentService.updateStudent(
			studentId, studentName, mobileNumber, email);
	}

	@Override
	public StudentService getWrappedService() {
		return _studentService;
	}

	@Override
	public void setWrappedService(StudentService studentService) {
		_studentService = studentService;
	}

	private StudentService _studentService;

}