/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Web.Services.builder.service;

import Web.Services.builder.model.Student;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for Student. This utility wraps
 * <code>Web.Services.builder.service.impl.StudentServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see StudentService
 * @generated
 */
public class StudentServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>Web.Services.builder.service.impl.StudentServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Student addStudent(
			long groupId, String studentName, String mobileNumber, String email,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addStudent(
			groupId, studentName, mobileNumber, email, serviceContext);
	}

	public static Student deleteStudent(long studentId) throws PortalException {
		return getService().deleteStudent(studentId);
	}

	public static List<Student> getAllStudents() {
		return getService().getAllStudents();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Student getStudent(long studentId) throws PortalException {
		return getService().getStudent(studentId);
	}

	public static Student updateStudent(
			long studentId, String studentName, String mobileNumber,
			String email)
		throws PortalException {

		return getService().updateStudent(
			studentId, studentName, mobileNumber, email);
	}

	public static StudentService getService() {
		return _service;
	}

	public static void setService(StudentService service) {
		_service = service;
	}

	private static volatile StudentService _service;

}