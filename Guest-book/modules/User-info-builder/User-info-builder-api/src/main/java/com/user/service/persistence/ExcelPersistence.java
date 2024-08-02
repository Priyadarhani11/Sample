/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.user.exception.NoSuchExcelException;
import com.user.model.Excel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the excel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExcelUtil
 * @generated
 */
@ProviderType
public interface ExcelPersistence extends BasePersistence<Excel> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExcelUtil} to access the excel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the excels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching excels
	 */
	public java.util.List<Excel> findByUuid(String uuid);

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
	public java.util.List<Excel> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Excel> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator);

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
	public java.util.List<Excel> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public Excel findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Excel>
				orderByComparator)
		throws NoSuchExcelException;

	/**
	 * Returns the first excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public Excel fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator);

	/**
	 * Returns the last excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public Excel findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Excel>
				orderByComparator)
		throws NoSuchExcelException;

	/**
	 * Returns the last excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public Excel fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator);

	/**
	 * Returns the excels before and after the current excel in the ordered set where uuid = &#63;.
	 *
	 * @param excelId the primary key of the current excel
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public Excel[] findByUuid_PrevAndNext(
			long excelId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Excel>
				orderByComparator)
		throws NoSuchExcelException;

	/**
	 * Removes all the excels where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of excels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching excels
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the excels where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @return the matching excels
	 */
	public java.util.List<Excel> findByPhoneNumber(long phoneNumber);

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
	public java.util.List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end);

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
	public java.util.List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator);

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
	public java.util.List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public Excel findByPhoneNumber_First(
			long phoneNumber,
			com.liferay.portal.kernel.util.OrderByComparator<Excel>
				orderByComparator)
		throws NoSuchExcelException;

	/**
	 * Returns the first excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public Excel fetchByPhoneNumber_First(
		long phoneNumber,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator);

	/**
	 * Returns the last excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	public Excel findByPhoneNumber_Last(
			long phoneNumber,
			com.liferay.portal.kernel.util.OrderByComparator<Excel>
				orderByComparator)
		throws NoSuchExcelException;

	/**
	 * Returns the last excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel, or <code>null</code> if a matching excel could not be found
	 */
	public Excel fetchByPhoneNumber_Last(
		long phoneNumber,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator);

	/**
	 * Returns the excels before and after the current excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param excelId the primary key of the current excel
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public Excel[] findByPhoneNumber_PrevAndNext(
			long excelId, long phoneNumber,
			com.liferay.portal.kernel.util.OrderByComparator<Excel>
				orderByComparator)
		throws NoSuchExcelException;

	/**
	 * Removes all the excels where phoneNumber = &#63; from the database.
	 *
	 * @param phoneNumber the phone number
	 */
	public void removeByPhoneNumber(long phoneNumber);

	/**
	 * Returns the number of excels where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @return the number of matching excels
	 */
	public int countByPhoneNumber(long phoneNumber);

	/**
	 * Caches the excel in the entity cache if it is enabled.
	 *
	 * @param excel the excel
	 */
	public void cacheResult(Excel excel);

	/**
	 * Caches the excels in the entity cache if it is enabled.
	 *
	 * @param excels the excels
	 */
	public void cacheResult(java.util.List<Excel> excels);

	/**
	 * Creates a new excel with the primary key. Does not add the excel to the database.
	 *
	 * @param excelId the primary key for the new excel
	 * @return the new excel
	 */
	public Excel create(long excelId);

	/**
	 * Removes the excel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel that was removed
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public Excel remove(long excelId) throws NoSuchExcelException;

	public Excel updateImpl(Excel excel);

	/**
	 * Returns the excel with the primary key or throws a <code>NoSuchExcelException</code> if it could not be found.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	public Excel findByPrimaryKey(long excelId) throws NoSuchExcelException;

	/**
	 * Returns the excel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel, or <code>null</code> if a excel with the primary key could not be found
	 */
	public Excel fetchByPrimaryKey(long excelId);

	/**
	 * Returns all the excels.
	 *
	 * @return the excels
	 */
	public java.util.List<Excel> findAll();

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
	public java.util.List<Excel> findAll(int start, int end);

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
	public java.util.List<Excel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator);

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
	public java.util.List<Excel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Excel>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the excels from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of excels.
	 *
	 * @return the number of excels
	 */
	public int countAll();

}