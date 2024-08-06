/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hello.service.persistence;

import com.hello.model.Foo;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the foo service. This utility wraps <code>com.hello.service.persistence.impl.FooPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooPersistence
 * @generated
 */
public class FooUtil {

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
	public static void clearCache(Foo foo) {
		getPersistence().clearCache(foo);
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
	public static Map<Serializable, Foo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Foo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Foo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Foo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Foo update(Foo foo) {
		return getPersistence().update(foo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Foo update(Foo foo, ServiceContext serviceContext) {
		return getPersistence().update(foo, serviceContext);
	}

	/**
	 * Returns all the foos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching foos
	 */
	public static List<Foo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the foos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of foos
	 * @param end the upper bound of the range of foos (not inclusive)
	 * @return the range of matching foos
	 */
	public static List<Foo> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the foos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of foos
	 * @param end the upper bound of the range of foos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching foos
	 */
	public static List<Foo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Foo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the foos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of foos
	 * @param end the upper bound of the range of foos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching foos
	 */
	public static List<Foo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching foo
	 * @throws NoSuchFooException if a matching foo could not be found
	 */
	public static Foo findByUuid_First(
			String uuid, OrderByComparator<Foo> orderByComparator)
		throws com.hello.exception.NoSuchFooException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching foo, or <code>null</code> if a matching foo could not be found
	 */
	public static Foo fetchByUuid_First(
		String uuid, OrderByComparator<Foo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching foo
	 * @throws NoSuchFooException if a matching foo could not be found
	 */
	public static Foo findByUuid_Last(
			String uuid, OrderByComparator<Foo> orderByComparator)
		throws com.hello.exception.NoSuchFooException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching foo, or <code>null</code> if a matching foo could not be found
	 */
	public static Foo fetchByUuid_Last(
		String uuid, OrderByComparator<Foo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the foos before and after the current foo in the ordered set where uuid = &#63;.
	 *
	 * @param employeeId the primary key of the current foo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next foo
	 * @throws NoSuchFooException if a foo with the primary key could not be found
	 */
	public static Foo[] findByUuid_PrevAndNext(
			int employeeId, String uuid,
			OrderByComparator<Foo> orderByComparator)
		throws com.hello.exception.NoSuchFooException {

		return getPersistence().findByUuid_PrevAndNext(
			employeeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the foos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of foos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching foos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the foo in the entity cache if it is enabled.
	 *
	 * @param foo the foo
	 */
	public static void cacheResult(Foo foo) {
		getPersistence().cacheResult(foo);
	}

	/**
	 * Caches the foos in the entity cache if it is enabled.
	 *
	 * @param foos the foos
	 */
	public static void cacheResult(List<Foo> foos) {
		getPersistence().cacheResult(foos);
	}

	/**
	 * Creates a new foo with the primary key. Does not add the foo to the database.
	 *
	 * @param employeeId the primary key for the new foo
	 * @return the new foo
	 */
	public static Foo create(int employeeId) {
		return getPersistence().create(employeeId);
	}

	/**
	 * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the foo
	 * @return the foo that was removed
	 * @throws NoSuchFooException if a foo with the primary key could not be found
	 */
	public static Foo remove(int employeeId)
		throws com.hello.exception.NoSuchFooException {

		return getPersistence().remove(employeeId);
	}

	public static Foo updateImpl(Foo foo) {
		return getPersistence().updateImpl(foo);
	}

	/**
	 * Returns the foo with the primary key or throws a <code>NoSuchFooException</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the foo
	 * @return the foo
	 * @throws NoSuchFooException if a foo with the primary key could not be found
	 */
	public static Foo findByPrimaryKey(int employeeId)
		throws com.hello.exception.NoSuchFooException {

		return getPersistence().findByPrimaryKey(employeeId);
	}

	/**
	 * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the foo
	 * @return the foo, or <code>null</code> if a foo with the primary key could not be found
	 */
	public static Foo fetchByPrimaryKey(int employeeId) {
		return getPersistence().fetchByPrimaryKey(employeeId);
	}

	/**
	 * Returns all the foos.
	 *
	 * @return the foos
	 */
	public static List<Foo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the foos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of foos
	 * @param end the upper bound of the range of foos (not inclusive)
	 * @return the range of foos
	 */
	public static List<Foo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the foos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of foos
	 * @param end the upper bound of the range of foos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of foos
	 */
	public static List<Foo> findAll(
		int start, int end, OrderByComparator<Foo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the foos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FooModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of foos
	 * @param end the upper bound of the range of foos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of foos
	 */
	public static List<Foo> findAll(
		int start, int end, OrderByComparator<Foo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the foos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of foos.
	 *
	 * @return the number of foos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FooPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(FooPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile FooPersistence _persistence;

}