/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.service.persistence;

import com.demo.bank.exception.NoSuchSalaryException;
import com.demo.bank.model.Salary;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the salary service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SalaryUtil
 * @generated
 */
@ProviderType
public interface SalaryPersistence extends BasePersistence<Salary> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SalaryUtil} to access the salary persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the salaries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching salaries
	 */
	public java.util.List<Salary> findByUuid(String uuid);

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
	public java.util.List<Salary> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Salary> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Salary>
			orderByComparator);

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
	public java.util.List<Salary> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Salary>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching salary
	 * @throws NoSuchSalaryException if a matching salary could not be found
	 */
	public Salary findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Salary>
				orderByComparator)
		throws NoSuchSalaryException;

	/**
	 * Returns the first salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching salary, or <code>null</code> if a matching salary could not be found
	 */
	public Salary fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Salary>
			orderByComparator);

	/**
	 * Returns the last salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching salary
	 * @throws NoSuchSalaryException if a matching salary could not be found
	 */
	public Salary findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Salary>
				orderByComparator)
		throws NoSuchSalaryException;

	/**
	 * Returns the last salary in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching salary, or <code>null</code> if a matching salary could not be found
	 */
	public Salary fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Salary>
			orderByComparator);

	/**
	 * Returns the salaries before and after the current salary in the ordered set where uuid = &#63;.
	 *
	 * @param salaryId the primary key of the current salary
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next salary
	 * @throws NoSuchSalaryException if a salary with the primary key could not be found
	 */
	public Salary[] findByUuid_PrevAndNext(
			long salaryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Salary>
				orderByComparator)
		throws NoSuchSalaryException;

	/**
	 * Removes all the salaries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of salaries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching salaries
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the salary in the entity cache if it is enabled.
	 *
	 * @param salary the salary
	 */
	public void cacheResult(Salary salary);

	/**
	 * Caches the salaries in the entity cache if it is enabled.
	 *
	 * @param salaries the salaries
	 */
	public void cacheResult(java.util.List<Salary> salaries);

	/**
	 * Creates a new salary with the primary key. Does not add the salary to the database.
	 *
	 * @param salaryId the primary key for the new salary
	 * @return the new salary
	 */
	public Salary create(long salaryId);

	/**
	 * Removes the salary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param salaryId the primary key of the salary
	 * @return the salary that was removed
	 * @throws NoSuchSalaryException if a salary with the primary key could not be found
	 */
	public Salary remove(long salaryId) throws NoSuchSalaryException;

	public Salary updateImpl(Salary salary);

	/**
	 * Returns the salary with the primary key or throws a <code>NoSuchSalaryException</code> if it could not be found.
	 *
	 * @param salaryId the primary key of the salary
	 * @return the salary
	 * @throws NoSuchSalaryException if a salary with the primary key could not be found
	 */
	public Salary findByPrimaryKey(long salaryId) throws NoSuchSalaryException;

	/**
	 * Returns the salary with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param salaryId the primary key of the salary
	 * @return the salary, or <code>null</code> if a salary with the primary key could not be found
	 */
	public Salary fetchByPrimaryKey(long salaryId);

	/**
	 * Returns all the salaries.
	 *
	 * @return the salaries
	 */
	public java.util.List<Salary> findAll();

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
	public java.util.List<Salary> findAll(int start, int end);

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
	public java.util.List<Salary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Salary>
			orderByComparator);

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
	public java.util.List<Salary> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Salary>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the salaries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of salaries.
	 *
	 * @return the number of salaries
	 */
	public int countAll();

}