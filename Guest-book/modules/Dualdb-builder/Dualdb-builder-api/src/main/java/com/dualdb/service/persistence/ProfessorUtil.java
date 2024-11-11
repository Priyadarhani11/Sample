/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.service.persistence;

import com.dualdb.model.Professor;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the professor service. This utility wraps <code>com.dualdb.service.persistence.impl.ProfessorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfessorPersistence
 * @generated
 */
public class ProfessorUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Professor professor) {
		getPersistence().clearCache(professor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Professor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Professor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Professor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Professor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Professor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Professor update(Professor professor) {
		return getPersistence().update(professor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Professor update(
		Professor professor, ServiceContext serviceContext) {

		return getPersistence().update(professor, serviceContext);
	}

	/**
	 * Returns all the professors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching professors
	 */
	public static List<Professor> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the professors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of professors
	 * @param end the upper bound of the range of professors (not inclusive)
	 * @return the range of matching professors
	 */
	public static List<Professor> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the professors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of professors
	 * @param end the upper bound of the range of professors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching professors
	 */
	public static List<Professor> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Professor> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the professors where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of professors
	 * @param end the upper bound of the range of professors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching professors
	 */
	public static List<Professor> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Professor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching professor
	 * @throws NoSuchProfessorException if a matching professor could not be found
	 */
	public static Professor findByUuid_First(
			String uuid, OrderByComparator<Professor> orderByComparator)
		throws com.dualdb.exception.NoSuchProfessorException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching professor, or <code>null</code> if a matching professor could not be found
	 */
	public static Professor fetchByUuid_First(
		String uuid, OrderByComparator<Professor> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching professor
	 * @throws NoSuchProfessorException if a matching professor could not be found
	 */
	public static Professor findByUuid_Last(
			String uuid, OrderByComparator<Professor> orderByComparator)
		throws com.dualdb.exception.NoSuchProfessorException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching professor, or <code>null</code> if a matching professor could not be found
	 */
	public static Professor fetchByUuid_Last(
		String uuid, OrderByComparator<Professor> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the professors before and after the current professor in the ordered set where uuid = &#63;.
	 *
	 * @param pId the primary key of the current professor
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next professor
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	public static Professor[] findByUuid_PrevAndNext(
			int pId, String uuid,
			OrderByComparator<Professor> orderByComparator)
		throws com.dualdb.exception.NoSuchProfessorException {

		return getPersistence().findByUuid_PrevAndNext(
			pId, uuid, orderByComparator);
	}

	/**
	 * Removes all the professors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of professors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching professors
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the professor in the entity cache if it is enabled.
	 *
	 * @param professor the professor
	 */
	public static void cacheResult(Professor professor) {
		getPersistence().cacheResult(professor);
	}

	/**
	 * Caches the professors in the entity cache if it is enabled.
	 *
	 * @param professors the professors
	 */
	public static void cacheResult(List<Professor> professors) {
		getPersistence().cacheResult(professors);
	}

	/**
	 * Creates a new professor with the primary key. Does not add the professor to the database.
	 *
	 * @param pId the primary key for the new professor
	 * @return the new professor
	 */
	public static Professor create(int pId) {
		return getPersistence().create(pId);
	}

	/**
	 * Removes the professor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor that was removed
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	public static Professor remove(int pId)
		throws com.dualdb.exception.NoSuchProfessorException {

		return getPersistence().remove(pId);
	}

	public static Professor updateImpl(Professor professor) {
		return getPersistence().updateImpl(professor);
	}

	/**
	 * Returns the professor with the primary key or throws a <code>NoSuchProfessorException</code> if it could not be found.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	public static Professor findByPrimaryKey(int pId)
		throws com.dualdb.exception.NoSuchProfessorException {

		return getPersistence().findByPrimaryKey(pId);
	}

	/**
	 * Returns the professor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor, or <code>null</code> if a professor with the primary key could not be found
	 */
	public static Professor fetchByPrimaryKey(int pId) {
		return getPersistence().fetchByPrimaryKey(pId);
	}

	/**
	 * Returns all the professors.
	 *
	 * @return the professors
	 */
	public static List<Professor> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the professors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professors
	 * @param end the upper bound of the range of professors (not inclusive)
	 * @return the range of professors
	 */
	public static List<Professor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the professors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professors
	 * @param end the upper bound of the range of professors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of professors
	 */
	public static List<Professor> findAll(
		int start, int end, OrderByComparator<Professor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the professors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professors
	 * @param end the upper bound of the range of professors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of professors
	 */
	public static List<Professor> findAll(
		int start, int end, OrderByComparator<Professor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the professors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of professors.
	 *
	 * @return the number of professors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProfessorPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ProfessorPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ProfessorPersistence _persistence;

}