/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.service.persistence;

import com.dualdb.exception.NoSuchProfessorException;
import com.dualdb.model.Professor;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the professor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfessorUtil
 * @generated
 */
@ProviderType
public interface ProfessorPersistence extends BasePersistence<Professor> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProfessorUtil} to access the professor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the professors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching professors
	 */
	public java.util.List<Professor> findByUuid(String uuid);

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
	public java.util.List<Professor> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Professor> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Professor>
			orderByComparator);

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
	public java.util.List<Professor> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Professor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching professor
	 * @throws NoSuchProfessorException if a matching professor could not be found
	 */
	public Professor findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Professor>
				orderByComparator)
		throws NoSuchProfessorException;

	/**
	 * Returns the first professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching professor, or <code>null</code> if a matching professor could not be found
	 */
	public Professor fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Professor>
			orderByComparator);

	/**
	 * Returns the last professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching professor
	 * @throws NoSuchProfessorException if a matching professor could not be found
	 */
	public Professor findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Professor>
				orderByComparator)
		throws NoSuchProfessorException;

	/**
	 * Returns the last professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching professor, or <code>null</code> if a matching professor could not be found
	 */
	public Professor fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Professor>
			orderByComparator);

	/**
	 * Returns the professors before and after the current professor in the ordered set where uuid = &#63;.
	 *
	 * @param pId the primary key of the current professor
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next professor
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	public Professor[] findByUuid_PrevAndNext(
			int pId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Professor>
				orderByComparator)
		throws NoSuchProfessorException;

	/**
	 * Removes all the professors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of professors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching professors
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the professor in the entity cache if it is enabled.
	 *
	 * @param professor the professor
	 */
	public void cacheResult(Professor professor);

	/**
	 * Caches the professors in the entity cache if it is enabled.
	 *
	 * @param professors the professors
	 */
	public void cacheResult(java.util.List<Professor> professors);

	/**
	 * Creates a new professor with the primary key. Does not add the professor to the database.
	 *
	 * @param pId the primary key for the new professor
	 * @return the new professor
	 */
	public Professor create(int pId);

	/**
	 * Removes the professor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor that was removed
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	public Professor remove(int pId) throws NoSuchProfessorException;

	public Professor updateImpl(Professor professor);

	/**
	 * Returns the professor with the primary key or throws a <code>NoSuchProfessorException</code> if it could not be found.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	public Professor findByPrimaryKey(int pId) throws NoSuchProfessorException;

	/**
	 * Returns the professor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor, or <code>null</code> if a professor with the primary key could not be found
	 */
	public Professor fetchByPrimaryKey(int pId);

	/**
	 * Returns all the professors.
	 *
	 * @return the professors
	 */
	public java.util.List<Professor> findAll();

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
	public java.util.List<Professor> findAll(int start, int end);

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
	public java.util.List<Professor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Professor>
			orderByComparator);

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
	public java.util.List<Professor> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Professor>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the professors from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of professors.
	 *
	 * @return the number of professors
	 */
	public int countAll();

}