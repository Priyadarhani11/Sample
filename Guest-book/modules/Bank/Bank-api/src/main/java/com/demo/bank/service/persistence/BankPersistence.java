/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.service.persistence;

import com.demo.bank.exception.NoSuchBankException;
import com.demo.bank.model.Bank;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bank service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BankUtil
 * @generated
 */
@ProviderType
public interface BankPersistence extends BasePersistence<Bank> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BankUtil} to access the bank persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the banks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching banks
	 */
	public java.util.List<Bank> findByUuid(String uuid);

	/**
	 * Returns a range of all the banks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @return the range of matching banks
	 */
	public java.util.List<Bank> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the banks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching banks
	 */
	public java.util.List<Bank> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bank>
			orderByComparator);

	/**
	 * Returns an ordered range of all the banks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching banks
	 */
	public java.util.List<Bank> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bank>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bank
	 * @throws NoSuchBankException if a matching bank could not be found
	 */
	public Bank findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Bank>
				orderByComparator)
		throws NoSuchBankException;

	/**
	 * Returns the first bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bank, or <code>null</code> if a matching bank could not be found
	 */
	public Bank fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bank>
			orderByComparator);

	/**
	 * Returns the last bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bank
	 * @throws NoSuchBankException if a matching bank could not be found
	 */
	public Bank findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Bank>
				orderByComparator)
		throws NoSuchBankException;

	/**
	 * Returns the last bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bank, or <code>null</code> if a matching bank could not be found
	 */
	public Bank fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Bank>
			orderByComparator);

	/**
	 * Returns the banks before and after the current bank in the ordered set where uuid = &#63;.
	 *
	 * @param bankId the primary key of the current bank
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bank
	 * @throws NoSuchBankException if a bank with the primary key could not be found
	 */
	public Bank[] findByUuid_PrevAndNext(
			long bankId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Bank>
				orderByComparator)
		throws NoSuchBankException;

	/**
	 * Removes all the banks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of banks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching banks
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the bank in the entity cache if it is enabled.
	 *
	 * @param bank the bank
	 */
	public void cacheResult(Bank bank);

	/**
	 * Caches the banks in the entity cache if it is enabled.
	 *
	 * @param banks the banks
	 */
	public void cacheResult(java.util.List<Bank> banks);

	/**
	 * Creates a new bank with the primary key. Does not add the bank to the database.
	 *
	 * @param bankId the primary key for the new bank
	 * @return the new bank
	 */
	public Bank create(long bankId);

	/**
	 * Removes the bank with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bankId the primary key of the bank
	 * @return the bank that was removed
	 * @throws NoSuchBankException if a bank with the primary key could not be found
	 */
	public Bank remove(long bankId) throws NoSuchBankException;

	public Bank updateImpl(Bank bank);

	/**
	 * Returns the bank with the primary key or throws a <code>NoSuchBankException</code> if it could not be found.
	 *
	 * @param bankId the primary key of the bank
	 * @return the bank
	 * @throws NoSuchBankException if a bank with the primary key could not be found
	 */
	public Bank findByPrimaryKey(long bankId) throws NoSuchBankException;

	/**
	 * Returns the bank with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bankId the primary key of the bank
	 * @return the bank, or <code>null</code> if a bank with the primary key could not be found
	 */
	public Bank fetchByPrimaryKey(long bankId);

	/**
	 * Returns all the banks.
	 *
	 * @return the banks
	 */
	public java.util.List<Bank> findAll();

	/**
	 * Returns a range of all the banks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @return the range of banks
	 */
	public java.util.List<Bank> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the banks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of banks
	 */
	public java.util.List<Bank> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bank>
			orderByComparator);

	/**
	 * Returns an ordered range of all the banks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of banks
	 */
	public java.util.List<Bank> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Bank>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the banks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of banks.
	 *
	 * @return the number of banks
	 */
	public int countAll();

}