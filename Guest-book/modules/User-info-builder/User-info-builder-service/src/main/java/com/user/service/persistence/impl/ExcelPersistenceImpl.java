/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.user.exception.NoSuchExcelException;
import com.user.model.Excel;
import com.user.model.ExcelTable;
import com.user.model.impl.ExcelImpl;
import com.user.model.impl.ExcelModelImpl;
import com.user.service.persistence.ExcelPersistence;
import com.user.service.persistence.ExcelUtil;
import com.user.service.persistence.impl.constants.CUSTOMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the excel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExcelPersistence.class)
public class ExcelPersistenceImpl
	extends BasePersistenceImpl<Excel> implements ExcelPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExcelUtil</code> to access the excel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExcelImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the excels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching excels
	 */
	@Override
	public List<Excel> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Excel> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Excel> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Excel> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Excel> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Excel> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Excel> list = null;

		if (useFinderCache) {
			list = (List<Excel>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Excel excel : list) {
					if (!uuid.equals(excel.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_EXCEL_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExcelModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Excel>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	@Override
	public Excel findByUuid_First(
			String uuid, OrderByComparator<Excel> orderByComparator)
		throws NoSuchExcelException {

		Excel excel = fetchByUuid_First(uuid, orderByComparator);

		if (excel != null) {
			return excel;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExcelException(sb.toString());
	}

	/**
	 * Returns the first excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel, or <code>null</code> if a matching excel could not be found
	 */
	@Override
	public Excel fetchByUuid_First(
		String uuid, OrderByComparator<Excel> orderByComparator) {

		List<Excel> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	@Override
	public Excel findByUuid_Last(
			String uuid, OrderByComparator<Excel> orderByComparator)
		throws NoSuchExcelException {

		Excel excel = fetchByUuid_Last(uuid, orderByComparator);

		if (excel != null) {
			return excel;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchExcelException(sb.toString());
	}

	/**
	 * Returns the last excel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel, or <code>null</code> if a matching excel could not be found
	 */
	@Override
	public Excel fetchByUuid_Last(
		String uuid, OrderByComparator<Excel> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Excel> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Excel[] findByUuid_PrevAndNext(
			long excelId, String uuid,
			OrderByComparator<Excel> orderByComparator)
		throws NoSuchExcelException {

		uuid = Objects.toString(uuid, "");

		Excel excel = findByPrimaryKey(excelId);

		Session session = null;

		try {
			session = openSession();

			Excel[] array = new ExcelImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, excel, uuid, orderByComparator, true);

			array[1] = excel;

			array[2] = getByUuid_PrevAndNext(
				session, excel, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Excel getByUuid_PrevAndNext(
		Session session, Excel excel, String uuid,
		OrderByComparator<Excel> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EXCEL_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ExcelModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(excel)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Excel> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the excels where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Excel excel :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(excel);
		}
	}

	/**
	 * Returns the number of excels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching excels
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXCEL_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "excel.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(excel.uuid IS NULL OR excel.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPhoneNumber;
	private FinderPath _finderPathWithoutPaginationFindByPhoneNumber;
	private FinderPath _finderPathCountByPhoneNumber;

	/**
	 * Returns all the excels where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @return the matching excels
	 */
	@Override
	public List<Excel> findByPhoneNumber(long phoneNumber) {
		return findByPhoneNumber(
			phoneNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Excel> findByPhoneNumber(long phoneNumber, int start, int end) {
		return findByPhoneNumber(phoneNumber, start, end, null);
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
	@Override
	public List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end,
		OrderByComparator<Excel> orderByComparator) {

		return findByPhoneNumber(
			phoneNumber, start, end, orderByComparator, true);
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
	@Override
	public List<Excel> findByPhoneNumber(
		long phoneNumber, int start, int end,
		OrderByComparator<Excel> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByPhoneNumber;
				finderArgs = new Object[] {phoneNumber};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByPhoneNumber;
			finderArgs = new Object[] {
				phoneNumber, start, end, orderByComparator
			};
		}

		List<Excel> list = null;

		if (useFinderCache) {
			list = (List<Excel>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Excel excel : list) {
					if (phoneNumber != excel.getPhoneNumber()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_EXCEL_WHERE);

			sb.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ExcelModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(phoneNumber);

				list = (List<Excel>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	@Override
	public Excel findByPhoneNumber_First(
			long phoneNumber, OrderByComparator<Excel> orderByComparator)
		throws NoSuchExcelException {

		Excel excel = fetchByPhoneNumber_First(phoneNumber, orderByComparator);

		if (excel != null) {
			return excel;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("phoneNumber=");
		sb.append(phoneNumber);

		sb.append("}");

		throw new NoSuchExcelException(sb.toString());
	}

	/**
	 * Returns the first excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching excel, or <code>null</code> if a matching excel could not be found
	 */
	@Override
	public Excel fetchByPhoneNumber_First(
		long phoneNumber, OrderByComparator<Excel> orderByComparator) {

		List<Excel> list = findByPhoneNumber(
			phoneNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel
	 * @throws NoSuchExcelException if a matching excel could not be found
	 */
	@Override
	public Excel findByPhoneNumber_Last(
			long phoneNumber, OrderByComparator<Excel> orderByComparator)
		throws NoSuchExcelException {

		Excel excel = fetchByPhoneNumber_Last(phoneNumber, orderByComparator);

		if (excel != null) {
			return excel;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("phoneNumber=");
		sb.append(phoneNumber);

		sb.append("}");

		throw new NoSuchExcelException(sb.toString());
	}

	/**
	 * Returns the last excel in the ordered set where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching excel, or <code>null</code> if a matching excel could not be found
	 */
	@Override
	public Excel fetchByPhoneNumber_Last(
		long phoneNumber, OrderByComparator<Excel> orderByComparator) {

		int count = countByPhoneNumber(phoneNumber);

		if (count == 0) {
			return null;
		}

		List<Excel> list = findByPhoneNumber(
			phoneNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Excel[] findByPhoneNumber_PrevAndNext(
			long excelId, long phoneNumber,
			OrderByComparator<Excel> orderByComparator)
		throws NoSuchExcelException {

		Excel excel = findByPrimaryKey(excelId);

		Session session = null;

		try {
			session = openSession();

			Excel[] array = new ExcelImpl[3];

			array[0] = getByPhoneNumber_PrevAndNext(
				session, excel, phoneNumber, orderByComparator, true);

			array[1] = excel;

			array[2] = getByPhoneNumber_PrevAndNext(
				session, excel, phoneNumber, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Excel getByPhoneNumber_PrevAndNext(
		Session session, Excel excel, long phoneNumber,
		OrderByComparator<Excel> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EXCEL_WHERE);

		sb.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ExcelModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(phoneNumber);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(excel)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Excel> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the excels where phoneNumber = &#63; from the database.
	 *
	 * @param phoneNumber the phone number
	 */
	@Override
	public void removeByPhoneNumber(long phoneNumber) {
		for (Excel excel :
				findByPhoneNumber(
					phoneNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(excel);
		}
	}

	/**
	 * Returns the number of excels where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @return the number of matching excels
	 */
	@Override
	public int countByPhoneNumber(long phoneNumber) {
		FinderPath finderPath = _finderPathCountByPhoneNumber;

		Object[] finderArgs = new Object[] {phoneNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXCEL_WHERE);

			sb.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(phoneNumber);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PHONENUMBER_PHONENUMBER_2 =
		"excel.phoneNumber = ?";

	public ExcelPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Excel.class);

		setModelImplClass(ExcelImpl.class);
		setModelPKClass(long.class);

		setTable(ExcelTable.INSTANCE);
	}

	/**
	 * Caches the excel in the entity cache if it is enabled.
	 *
	 * @param excel the excel
	 */
	@Override
	public void cacheResult(Excel excel) {
		entityCache.putResult(ExcelImpl.class, excel.getPrimaryKey(), excel);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the excels in the entity cache if it is enabled.
	 *
	 * @param excels the excels
	 */
	@Override
	public void cacheResult(List<Excel> excels) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (excels.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Excel excel : excels) {
			if (entityCache.getResult(ExcelImpl.class, excel.getPrimaryKey()) ==
					null) {

				cacheResult(excel);
			}
		}
	}

	/**
	 * Clears the cache for all excels.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExcelImpl.class);

		finderCache.clearCache(ExcelImpl.class);
	}

	/**
	 * Clears the cache for the excel.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Excel excel) {
		entityCache.removeResult(ExcelImpl.class, excel);
	}

	@Override
	public void clearCache(List<Excel> excels) {
		for (Excel excel : excels) {
			entityCache.removeResult(ExcelImpl.class, excel);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExcelImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ExcelImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new excel with the primary key. Does not add the excel to the database.
	 *
	 * @param excelId the primary key for the new excel
	 * @return the new excel
	 */
	@Override
	public Excel create(long excelId) {
		Excel excel = new ExcelImpl();

		excel.setNew(true);
		excel.setPrimaryKey(excelId);

		String uuid = PortalUUIDUtil.generate();

		excel.setUuid(uuid);

		return excel;
	}

	/**
	 * Removes the excel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel that was removed
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	@Override
	public Excel remove(long excelId) throws NoSuchExcelException {
		return remove((Serializable)excelId);
	}

	/**
	 * Removes the excel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the excel
	 * @return the excel that was removed
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	@Override
	public Excel remove(Serializable primaryKey) throws NoSuchExcelException {
		Session session = null;

		try {
			session = openSession();

			Excel excel = (Excel)session.get(ExcelImpl.class, primaryKey);

			if (excel == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExcelException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(excel);
		}
		catch (NoSuchExcelException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Excel removeImpl(Excel excel) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(excel)) {
				excel = (Excel)session.get(
					ExcelImpl.class, excel.getPrimaryKeyObj());
			}

			if (excel != null) {
				session.delete(excel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (excel != null) {
			clearCache(excel);
		}

		return excel;
	}

	@Override
	public Excel updateImpl(Excel excel) {
		boolean isNew = excel.isNew();

		if (!(excel instanceof ExcelModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(excel.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(excel);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in excel proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Excel implementation " +
					excel.getClass());
		}

		ExcelModelImpl excelModelImpl = (ExcelModelImpl)excel;

		if (Validator.isNull(excel.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			excel.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(excel);
			}
			else {
				excel = (Excel)session.merge(excel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(ExcelImpl.class, excelModelImpl, false, true);

		if (isNew) {
			excel.setNew(false);
		}

		excel.resetOriginalValues();

		return excel;
	}

	/**
	 * Returns the excel with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the excel
	 * @return the excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	@Override
	public Excel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExcelException {

		Excel excel = fetchByPrimaryKey(primaryKey);

		if (excel == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExcelException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return excel;
	}

	/**
	 * Returns the excel with the primary key or throws a <code>NoSuchExcelException</code> if it could not be found.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel
	 * @throws NoSuchExcelException if a excel with the primary key could not be found
	 */
	@Override
	public Excel findByPrimaryKey(long excelId) throws NoSuchExcelException {
		return findByPrimaryKey((Serializable)excelId);
	}

	/**
	 * Returns the excel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel, or <code>null</code> if a excel with the primary key could not be found
	 */
	@Override
	public Excel fetchByPrimaryKey(long excelId) {
		return fetchByPrimaryKey((Serializable)excelId);
	}

	/**
	 * Returns all the excels.
	 *
	 * @return the excels
	 */
	@Override
	public List<Excel> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Excel> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Excel> findAll(
		int start, int end, OrderByComparator<Excel> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Excel> findAll(
		int start, int end, OrderByComparator<Excel> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Excel> list = null;

		if (useFinderCache) {
			list = (List<Excel>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXCEL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXCEL;

				sql = sql.concat(ExcelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Excel>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the excels from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Excel excel : findAll()) {
			remove(excel);
		}
	}

	/**
	 * Returns the number of excels.
	 *
	 * @return the number of excels
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EXCEL);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "excelId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EXCEL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExcelModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the excel persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByPhoneNumber = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPhoneNumber",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"phoneNumber"}, true);

		_finderPathWithoutPaginationFindByPhoneNumber = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPhoneNumber",
			new String[] {Long.class.getName()}, new String[] {"phoneNumber"},
			true);

		_finderPathCountByPhoneNumber = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhoneNumber",
			new String[] {Long.class.getName()}, new String[] {"phoneNumber"},
			false);

		ExcelUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExcelUtil.setPersistence(null);

		entityCache.removeCache(ExcelImpl.class.getName());
	}

	@Override
	@Reference(
		target = CUSTOMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CUSTOMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CUSTOMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EXCEL =
		"SELECT excel FROM Excel excel";

	private static final String _SQL_SELECT_EXCEL_WHERE =
		"SELECT excel FROM Excel excel WHERE ";

	private static final String _SQL_COUNT_EXCEL =
		"SELECT COUNT(excel) FROM Excel excel";

	private static final String _SQL_COUNT_EXCEL_WHERE =
		"SELECT COUNT(excel) FROM Excel excel WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "excel.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Excel exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Excel exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExcelPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}