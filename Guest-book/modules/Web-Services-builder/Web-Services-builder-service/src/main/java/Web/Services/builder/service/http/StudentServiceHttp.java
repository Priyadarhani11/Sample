/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package Web.Services.builder.service.http;

import Web.Services.builder.service.StudentServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>StudentServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentServiceHttp {

	public static Web.Services.builder.model.Student addStudent(
			HttpPrincipal httpPrincipal, long groupId, String studentName,
			String mobileNumber, String email,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "addStudent",
				_addStudentParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, studentName, mobileNumber, email,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (Web.Services.builder.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static Web.Services.builder.model.Student updateStudent(
			HttpPrincipal httpPrincipal, long studentId, String studentName,
			String mobileNumber, String email)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "updateStudent",
				_updateStudentParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentId, studentName, mobileNumber, email);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (Web.Services.builder.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static Web.Services.builder.model.Student deleteStudent(
			HttpPrincipal httpPrincipal, long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "deleteStudent",
				_deleteStudentParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (Web.Services.builder.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<Web.Services.builder.model.Student>
		getAllStudents(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "getAllStudents",
				_getAllStudentsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<Web.Services.builder.model.Student>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static Web.Services.builder.model.Student getStudent(
			HttpPrincipal httpPrincipal, long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				StudentServiceUtil.class, "getStudent",
				_getStudentParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, studentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (Web.Services.builder.model.Student)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(StudentServiceHttp.class);

	private static final Class<?>[] _addStudentParameterTypes0 = new Class[] {
		long.class, String.class, String.class, String.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updateStudentParameterTypes1 =
		new Class[] {long.class, String.class, String.class, String.class};
	private static final Class<?>[] _deleteStudentParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getAllStudentsParameterTypes3 =
		new Class[] {};
	private static final Class<?>[] _getStudentParameterTypes4 = new Class[] {
		long.class
	};

}