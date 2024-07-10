/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.service.persistence;

import com.demo.bank.model.Salary;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the salary service. This utility wraps <code>com.demo.bank.service.persistence.impl.SalaryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SalaryPersistence
 * @generated
 */
public class SalaryUtil {

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
	public static void clearCache(Salary salary) {
		getPersistence().clearCache(salary);
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
	public static Map<Serializable, Salary> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Salary> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Salary> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Salary> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Salary> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Salary update(Salary salary) {
		return getPersistence().update(salary);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Salary update(Salary salary, ServiceContext serviceContext) {
		return getPersistence().update(salary, serviceContext);
	}

	/**
	 * Returns all the salaries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching salaries
	 */
	public static List<Salary> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the salaries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SalaryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of salaries
	 * @param end the upper bound of the range of salaries (not inclusive)
	 * @return the range of matching salaries
	 */
	public static List<Salary> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the salaries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SalaryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of salaries
	 * @param end the upper bound of the range of salaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching salaries
	 */
	public static List<Salary> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Salary> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the salaries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SalaryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of salaries
	 * @param end the upper bound of the range of salaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching salaries
	 */
	public static List<Salary> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Salary> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching salary
	 * @throws NoSuchSalaryException if a matching salary could not be found
	 */
	public static Salary findByUuid_First(
			String uuid, OrderByComparator<Salary> orderByComparator)
		throws com.demo.bank.exception.NoSuchSalaryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching salary, or <code>null</code> if a matching salary could not be found
	 */
	public static Salary fetchByUuid_First(
		String uuid, OrderByComparator<Salary> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching salary
	 * @throws NoSuchSalaryException if a matching salary could not be found
	 */
	public static Salary findByUuid_Last(
			String uuid, OrderByComparator<Salary> orderByComparator)
		throws com.demo.bank.exception.NoSuchSalaryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching salary, or <code>null</code> if a matching salary could not be found
	 */
	public static Salary fetchByUuid_Last(
		String uuid, OrderByComparator<Salary> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the salaries before and after the current salary in the ordered set where uuid = &#63;.
	 *
	 * @param salaryId the primary key of the current salary
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next salary
	 * @throws NoSuchSalaryException if a salary with the primary key could not be found
	 */
	public static Salary[] findByUuid_PrevAndNext(
			long salaryId, String uuid,
			OrderByComparator<Salary> orderByComparator)
		throws com.demo.bank.exception.NoSuchSalaryException {

		return getPersistence().findByUuid_PrevAndNext(
			salaryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the salaries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of salaries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching salaries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the salary in the entity cache if it is enabled.
	 *
	 * @param salary the salary
	 */
	public static void cacheResult(Salary salary) {
		getPersistence().cacheResult(salary);
	}

	/**
	 * Caches the salaries in the entity cache if it is enabled.
	 *
	 * @param salaries the salaries
	 */
	public static void cacheResult(List<Salary> salaries) {
		getPersistence().cacheResult(salaries);
	}

	/**
	 * Creates a new salary with the primary key. Does not add the salary to the database.
	 *
	 * @param salaryId the primary key for the new salary
	 * @return the new salary
	 */
	public static Salary create(long salaryId) {
		return getPersistence().create(salaryId);
	}

	/**
	 * Removes the salary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param salaryId the primary key of the salary
	 * @return the salary that was removed
	 * @throws NoSuchSalaryException if a salary with the primary key could not be found
	 */
	public static Salary remove(long salaryId)
		throws com.demo.bank.exception.NoSuchSalaryException {

		return getPersistence().remove(salaryId);
	}

	public static Salary updateImpl(Salary salary) {
		return getPersistence().updateImpl(salary);
	}

	/**
	 * Returns the salary with the primary key or throws a <code>NoSuchSalaryException</code> if it could not be found.
	 *
	 * @param salaryId the primary key of the salary
	 * @return the salary
	 * @throws NoSuchSalaryException if a salary with the primary key could not be found
	 */
	public static Salary findByPrimaryKey(long salaryId)
		throws com.demo.bank.exception.NoSuchSalaryException {

		return getPersistence().findByPrimaryKey(salaryId);
	}

	/**
	 * Returns the salary with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param salaryId the primary key of the salary
	 * @return the salary, or <code>null</code> if a salary with the primary key could not be found
	 */
	public static Salary fetchByPrimaryKey(long salaryId) {
		return getPersistence().fetchByPrimaryKey(salaryId);
	}

	/**
	 * Returns all the salaries.
	 *
	 * @return the salaries
	 */
	public static List<Salary> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the salaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SalaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of salaries
	 * @param end the upper bound of the range of salaries (not inclusive)
	 * @return the range of salaries
	 */
	public static List<Salary> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the salaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SalaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of salaries
	 * @param end the upper bound of the range of salaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of salaries
	 */
	public static List<Salary> findAll(
		int start, int end, OrderByComparator<Salary> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the salaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SalaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of salaries
	 * @param end the upper bound of the range of salaries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of salaries
	 */
	public static List<Salary> findAll(
		int start, int end, OrderByComparator<Salary> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the salaries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of salaries.
	 *
	 * @return the number of salaries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SalaryPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(SalaryPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile SalaryPersistence _persistence;

}