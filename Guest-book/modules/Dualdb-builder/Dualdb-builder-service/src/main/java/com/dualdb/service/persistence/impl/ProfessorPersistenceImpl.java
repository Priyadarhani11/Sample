/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.service.persistence.impl;

import com.dualdb.exception.NoSuchProfessorException;
import com.dualdb.model.Professor;
import com.dualdb.model.ProfessorTable;
import com.dualdb.model.impl.ProfessorImpl;
import com.dualdb.model.impl.ProfessorModelImpl;
import com.dualdb.service.persistence.ProfessorPersistence;
import com.dualdb.service.persistence.ProfessorUtil;
import com.dualdb.service.persistence.impl.constants.TESTPersistenceConstants;

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
 * The persistence implementation for the professor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ProfessorPersistence.class)
public class ProfessorPersistenceImpl
	extends BasePersistenceImpl<Professor> implements ProfessorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProfessorUtil</code> to access the professor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProfessorImpl.class.getName();

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
	 * Returns all the professors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching professors
	 */
	@Override
	public List<Professor> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Professor> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Professor> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Professor> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Professor> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Professor> orderByComparator,
		boolean useFinderCache) {

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

		List<Professor> list = null;

		if (useFinderCache) {
			list = (List<Professor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Professor professor : list) {
					if (!uuid.equals(professor.getUuid())) {
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

			sb.append(_SQL_SELECT_PROFESSOR_WHERE);

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
				sb.append(ProfessorModelImpl.ORDER_BY_JPQL);
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

				list = (List<Professor>)QueryUtil.list(
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
	 * Returns the first professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching professor
	 * @throws NoSuchProfessorException if a matching professor could not be found
	 */
	@Override
	public Professor findByUuid_First(
			String uuid, OrderByComparator<Professor> orderByComparator)
		throws NoSuchProfessorException {

		Professor professor = fetchByUuid_First(uuid, orderByComparator);

		if (professor != null) {
			return professor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProfessorException(sb.toString());
	}

	/**
	 * Returns the first professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching professor, or <code>null</code> if a matching professor could not be found
	 */
	@Override
	public Professor fetchByUuid_First(
		String uuid, OrderByComparator<Professor> orderByComparator) {

		List<Professor> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching professor
	 * @throws NoSuchProfessorException if a matching professor could not be found
	 */
	@Override
	public Professor findByUuid_Last(
			String uuid, OrderByComparator<Professor> orderByComparator)
		throws NoSuchProfessorException {

		Professor professor = fetchByUuid_Last(uuid, orderByComparator);

		if (professor != null) {
			return professor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProfessorException(sb.toString());
	}

	/**
	 * Returns the last professor in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching professor, or <code>null</code> if a matching professor could not be found
	 */
	@Override
	public Professor fetchByUuid_Last(
		String uuid, OrderByComparator<Professor> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Professor> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Professor[] findByUuid_PrevAndNext(
			int pId, String uuid,
			OrderByComparator<Professor> orderByComparator)
		throws NoSuchProfessorException {

		uuid = Objects.toString(uuid, "");

		Professor professor = findByPrimaryKey(pId);

		Session session = null;

		try {
			session = openSession();

			Professor[] array = new ProfessorImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, professor, uuid, orderByComparator, true);

			array[1] = professor;

			array[2] = getByUuid_PrevAndNext(
				session, professor, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Professor getByUuid_PrevAndNext(
		Session session, Professor professor, String uuid,
		OrderByComparator<Professor> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROFESSOR_WHERE);

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
			sb.append(ProfessorModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(professor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Professor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the professors where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Professor professor :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(professor);
		}
	}

	/**
	 * Returns the number of professors where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching professors
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROFESSOR_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"professor.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(professor.uuid IS NULL OR professor.uuid = '')";

	public ProfessorPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Professor.class);

		setModelImplClass(ProfessorImpl.class);
		setModelPKClass(int.class);

		setTable(ProfessorTable.INSTANCE);
	}

	/**
	 * Caches the professor in the entity cache if it is enabled.
	 *
	 * @param professor the professor
	 */
	@Override
	public void cacheResult(Professor professor) {
		entityCache.putResult(
			ProfessorImpl.class, professor.getPrimaryKey(), professor);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the professors in the entity cache if it is enabled.
	 *
	 * @param professors the professors
	 */
	@Override
	public void cacheResult(List<Professor> professors) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (professors.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Professor professor : professors) {
			if (entityCache.getResult(
					ProfessorImpl.class, professor.getPrimaryKey()) == null) {

				cacheResult(professor);
			}
		}
	}

	/**
	 * Clears the cache for all professors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProfessorImpl.class);

		finderCache.clearCache(ProfessorImpl.class);
	}

	/**
	 * Clears the cache for the professor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Professor professor) {
		entityCache.removeResult(ProfessorImpl.class, professor);
	}

	@Override
	public void clearCache(List<Professor> professors) {
		for (Professor professor : professors) {
			entityCache.removeResult(ProfessorImpl.class, professor);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProfessorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ProfessorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new professor with the primary key. Does not add the professor to the database.
	 *
	 * @param pId the primary key for the new professor
	 * @return the new professor
	 */
	@Override
	public Professor create(int pId) {
		Professor professor = new ProfessorImpl();

		professor.setNew(true);
		professor.setPrimaryKey(pId);

		String uuid = PortalUUIDUtil.generate();

		professor.setUuid(uuid);

		return professor;
	}

	/**
	 * Removes the professor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor that was removed
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	@Override
	public Professor remove(int pId) throws NoSuchProfessorException {
		return remove((Serializable)pId);
	}

	/**
	 * Removes the professor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the professor
	 * @return the professor that was removed
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	@Override
	public Professor remove(Serializable primaryKey)
		throws NoSuchProfessorException {

		Session session = null;

		try {
			session = openSession();

			Professor professor = (Professor)session.get(
				ProfessorImpl.class, primaryKey);

			if (professor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProfessorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(professor);
		}
		catch (NoSuchProfessorException noSuchEntityException) {
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
	protected Professor removeImpl(Professor professor) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(professor)) {
				professor = (Professor)session.get(
					ProfessorImpl.class, professor.getPrimaryKeyObj());
			}

			if (professor != null) {
				session.delete(professor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (professor != null) {
			clearCache(professor);
		}

		return professor;
	}

	@Override
	public Professor updateImpl(Professor professor) {
		boolean isNew = professor.isNew();

		if (!(professor instanceof ProfessorModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(professor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(professor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in professor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Professor implementation " +
					professor.getClass());
		}

		ProfessorModelImpl professorModelImpl = (ProfessorModelImpl)professor;

		if (Validator.isNull(professor.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			professor.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(professor);
			}
			else {
				professor = (Professor)session.merge(professor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProfessorImpl.class, professorModelImpl, false, true);

		if (isNew) {
			professor.setNew(false);
		}

		professor.resetOriginalValues();

		return professor;
	}

	/**
	 * Returns the professor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the professor
	 * @return the professor
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	@Override
	public Professor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProfessorException {

		Professor professor = fetchByPrimaryKey(primaryKey);

		if (professor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProfessorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return professor;
	}

	/**
	 * Returns the professor with the primary key or throws a <code>NoSuchProfessorException</code> if it could not be found.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor
	 * @throws NoSuchProfessorException if a professor with the primary key could not be found
	 */
	@Override
	public Professor findByPrimaryKey(int pId) throws NoSuchProfessorException {
		return findByPrimaryKey((Serializable)pId);
	}

	/**
	 * Returns the professor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor, or <code>null</code> if a professor with the primary key could not be found
	 */
	@Override
	public Professor fetchByPrimaryKey(int pId) {
		return fetchByPrimaryKey((Serializable)pId);
	}

	/**
	 * Returns all the professors.
	 *
	 * @return the professors
	 */
	@Override
	public List<Professor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Professor> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Professor> findAll(
		int start, int end, OrderByComparator<Professor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Professor> findAll(
		int start, int end, OrderByComparator<Professor> orderByComparator,
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

		List<Professor> list = null;

		if (useFinderCache) {
			list = (List<Professor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PROFESSOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PROFESSOR;

				sql = sql.concat(ProfessorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Professor>)QueryUtil.list(
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
	 * Removes all the professors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Professor professor : findAll()) {
			remove(professor);
		}
	}

	/**
	 * Returns the number of professors.
	 *
	 * @return the number of professors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PROFESSOR);

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
		return "pId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PROFESSOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProfessorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the professor persistence.
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

		ProfessorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ProfessorUtil.setPersistence(null);

		entityCache.removeCache(ProfessorImpl.class.getName());
	}

	@Override
	@Reference(
		target = TESTPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TESTPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TESTPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PROFESSOR =
		"SELECT professor FROM Professor professor";

	private static final String _SQL_SELECT_PROFESSOR_WHERE =
		"SELECT professor FROM Professor professor WHERE ";

	private static final String _SQL_COUNT_PROFESSOR =
		"SELECT COUNT(professor) FROM Professor professor";

	private static final String _SQL_COUNT_PROFESSOR_WHERE =
		"SELECT COUNT(professor) FROM Professor professor WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "professor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Professor exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Professor exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProfessorPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}