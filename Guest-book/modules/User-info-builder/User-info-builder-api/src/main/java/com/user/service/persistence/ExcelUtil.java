/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.user.model.Excel;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the excel service. This utility wraps <code>com.user.service.persistence.impl.ExcelPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExcelPersistence
 * @generated
 */
public class ExcelUtil {

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
	public static void clearCache(Excel excel) {
		getPersistence().clearCache(excel);
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
	public static Map<Serializable, Excel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Excel> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Excel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Excel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Excel> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Excel update(Excel excel) {
		return getPersistence().update(excel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Excel update(Excel excel, ServiceContext serviceContext) {
		return getPersistence().update(excel, serviceContext);
	}

	/**
	 * Returns all the excels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching excels
	 */
	public static List<Excel> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the excels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @return the range of matching excels
	 */
	public static List<Excel> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the excels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching excels
	 */
	public static List<Excel> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Excel> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the excels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching excels
	 */
	public static List<Excel> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Excel> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public static Excel findByUuid_First(
			String uuid, OrderByComparator<Excel> orderByComparator)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public static Excel fetchByUuid_First(
		String uuid, OrderByComparator<Excel> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public static Excel findByUuid_Last(
			String uuid, OrderByComparator<Excel> orderByComparator)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public static Excel fetchByUuid_Last(
		String uuid, OrderByComparator<Excel> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the excels before and after the current excel in the ordered set where uuid = &#63;.
	 *
	 * @param excelId the primary key of the current excel
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public static Excel[] findByUuid_PrevAndNext(
			long excelId, String uuid,
			OrderByComparator<Excel> orderByComparator)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().findByUuid_PrevAndNext(
			excelId, uuid, orderByComparator);
	}

	/**
	 * Removes all the excels where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of excels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching excels
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the excels where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @return the matching excels
	 */
	public static List<Excel> findByPhoneNumber(long phoneNumber) {
		return getPersistence().findByPhoneNumber(phoneNumber);
	}

	/**
	 * Returns a range of all the excels where phoneNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param phoneNumber the phone number
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @return the range of matching excels
	 */
	public static List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end) {

		return getPersistence().findByPhoneNumber(phoneNumber, start, end);
	}

	/**
	 * Returns an ordered range of all the excels where phoneNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param phoneNumber the phone number
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching excels
	 */
	public static List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end,
		OrderByComparator<Excel> orderByComparator) {

		return getPersistence().findByPhoneNumber(
			phoneNumber, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the excels where phoneNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param phoneNumber the phone number
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching excels
	 */
	public static List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end,
		OrderByComparator<Excel> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByPhoneNumber(
			phoneNumber, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public static Excel findByPhoneNumber_First(
			long phoneNumber, OrderByComparator<Excel> orderByComparator)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().findByPhoneNumber_First(
			phoneNumber, orderByComparator);
	}

	/**
	 * Returns the first excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public static Excel fetchByPhoneNumber_First(
		long phoneNumber, OrderByComparator<Excel> orderByComparator) {

		return getPersistence().fetchByPhoneNumber_First(
			phoneNumber, orderByComparator);
	}

	/**
	 * Returns the last excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public static Excel findByPhoneNumber_Last(
			long phoneNumber, OrderByComparator<Excel> orderByComparator)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().findByPhoneNumber_Last(
			phoneNumber, orderByComparator);
	}

	/**
	 * Returns the last excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public static Excel fetchByPhoneNumber_Last(
		long phoneNumber, OrderByComparator<Excel> orderByComparator) {

		return getPersistence().fetchByPhoneNumber_Last(
			phoneNumber, orderByComparator);
	}

	/**
	 * Returns the excels before and after the current excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param excelId the primary key of the current excel
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public static Excel[] findByPhoneNumber_PrevAndNext(
			long excelId, long phoneNumber,
			OrderByComparator<Excel> orderByComparator)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().findByPhoneNumber_PrevAndNext(
			excelId, phoneNumber, orderByComparator);
	}

	/**
	 * Removes all the excels where phoneNumber = &#63; from the database.
	 *
	 * @param phoneNumber the phone number
	 */
	public static void removeByPhoneNumber(long phoneNumber) {
		getPersistence().removeByPhoneNumber(phoneNumber);
	}

	/**
	 * Returns the number of excels where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @return the number of matching excels
	 */
	public static int countByPhoneNumber(long phoneNumber) {
		return getPersistence().countByPhoneNumber(phoneNumber);
	}

	/**
	 * Caches the excel in the entity cache if it is enabled.
	 *
	 * @param excel the excel
	 */
	public static void cacheResult(Excel excel) {
		getPersistence().cacheResult(excel);
	}

	/**
	 * Caches the excels in the entity cache if it is enabled.
	 *
	 * @param excels the excels
	 */
	public static void cacheResult(List<Excel> excels) {
		getPersistence().cacheResult(excels);
	}

	/**
	 * Creates a new excel with the primary key. Does not add the excel to the database.
	 *
	 * @param excelId the primary key for the new excel
	 * @return the new excel
	 */
	public static Excel create(long excelId) {
		return getPersistence().create(excelId);
	}

	/**
	 * Removes the excel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel that was removed
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public static Excel remove(long excelId)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().remove(excelId);
	}

	public static Excel updateImpl(Excel excel) {
		return getPersistence().updateImpl(excel);
	}

	/**
	 * Returns the excel with the primary key or throws a <code>NoSuchExcelException</code> if it could not be found.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public static Excel findByPrimaryKey(long excelId)
		throws com.user.exception.NoSuchExcelException {

		return getPersistence().findByPrimaryKey(excelId);
	}

	/**
	 * Returns the excel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel, or <code>null</code> if a excel with the primary key could not be found
	 */
	public static Excel fetchByPrimaryKey(long excelId) {
		return getPersistence().fetchByPrimaryKey(excelId);
	}

	/**
	 * Returns all the excels.
	 *
	 * @return the excels
	 */
	public static List<Excel> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the excels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @return the range of excels
	 */
	public static List<Excel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the excels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of excels
	 */
	public static List<Excel> findAll(
		int start, int end, OrderByComparator<Excel> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the excels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of excels
	 */
	public static List<Excel> findAll(
		int start, int end, OrderByComparator<Excel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the excels from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of excels.
	 *
	 * @return the number of excels
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExcelPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ExcelPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ExcelPersistence _persistence;

}