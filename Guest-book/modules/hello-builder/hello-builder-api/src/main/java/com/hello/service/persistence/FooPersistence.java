/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hello.service.persistence;

import com.hello.exception.NoSuchFooException;
import com.hello.model.Foo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooUtil
 * @generated
 */
@ProviderType
public interface FooPersistence extends BasePersistence<Foo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the foos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching foos
	 */
	public java.util.List<Foo> findByUuid(String uuid);

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
	public java.util.List<Foo> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Foo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo>
			orderByComparator);

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
	public java.util.List<Foo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching foo
	 * @throws NoSuchFooException if a matching foo could not be found
	 */
	public Foo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Foo>
				orderByComparator)
		throws NoSuchFooException;

	/**
	 * Returns the first foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching foo, or <code>null</code> if a matching foo could not be found
	 */
	public Foo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo>
			orderByComparator);

	/**
	 * Returns the last foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching foo
	 * @throws NoSuchFooException if a matching foo could not be found
	 */
	public Foo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Foo>
				orderByComparator)
		throws NoSuchFooException;

	/**
	 * Returns the last foo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching foo, or <code>null</code> if a matching foo could not be found
	 */
	public Foo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo>
			orderByComparator);

	/**
	 * Returns the foos before and after the current foo in the ordered set where uuid = &#63;.
	 *
	 * @param employeeId the primary key of the current foo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next foo
	 * @throws NoSuchFooException if a foo with the primary key could not be found
	 */
	public Foo[] findByUuid_PrevAndNext(
			int employeeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Foo>
				orderByComparator)
		throws NoSuchFooException;

	/**
	 * Removes all the foos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of foos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching foos
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the foo in the entity cache if it is enabled.
	 *
	 * @param foo the foo
	 */
	public void cacheResult(Foo foo);

	/**
	 * Caches the foos in the entity cache if it is enabled.
	 *
	 * @param foos the foos
	 */
	public void cacheResult(java.util.List<Foo> foos);

	/**
	 * Creates a new foo with the primary key. Does not add the foo to the database.
	 *
	 * @param employeeId the primary key for the new foo
	 * @return the new foo
	 */
	public Foo create(int employeeId);

	/**
	 * Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the foo
	 * @return the foo that was removed
	 * @throws NoSuchFooException if a foo with the primary key could not be found
	 */
	public Foo remove(int employeeId) throws NoSuchFooException;

	public Foo updateImpl(Foo foo);

	/**
	 * Returns the foo with the primary key or throws a <code>NoSuchFooException</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the foo
	 * @return the foo
	 * @throws NoSuchFooException if a foo with the primary key could not be found
	 */
	public Foo findByPrimaryKey(int employeeId) throws NoSuchFooException;

	/**
	 * Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the foo
	 * @return the foo, or <code>null</code> if a foo with the primary key could not be found
	 */
	public Foo fetchByPrimaryKey(int employeeId);

	/**
	 * Returns all the foos.
	 *
	 * @return the foos
	 */
	public java.util.List<Foo> findAll();

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
	public java.util.List<Foo> findAll(int start, int end);

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
	public java.util.List<Foo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo>
			orderByComparator);

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
	public java.util.List<Foo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the foos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of foos.
	 *
	 * @return the number of foos
	 */
	public int countAll();

}