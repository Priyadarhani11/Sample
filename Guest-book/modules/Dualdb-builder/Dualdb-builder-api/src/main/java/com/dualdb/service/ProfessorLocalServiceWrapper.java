/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ProfessorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProfessorLocalService
 * @generated
 */
public class ProfessorLocalServiceWrapper
	implements ProfessorLocalService, ServiceWrapper<ProfessorLocalService> {

	public ProfessorLocalServiceWrapper() {
		this(null);
	}

	public ProfessorLocalServiceWrapper(
		ProfessorLocalService professorLocalService) {

		_professorLocalService = professorLocalService;
	}

	/**
	 * Adds the professor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professor the professor
	 * @return the professor that was added
	 */
	@Override
	public com.dualdb.model.Professor addProfessor(
		com.dualdb.model.Professor professor) {

		return _professorLocalService.addProfessor(professor);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professorLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new professor with the primary key. Does not add the professor to the database.
	 *
	 * @param pId the primary key for the new professor
	 * @return the new professor
	 */
	@Override
	public com.dualdb.model.Professor createProfessor(int pId) {
		return _professorLocalService.createProfessor(pId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professorLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the professor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pId the primary key of the professor
	 * @return the professor that was removed
	 * @throws PortalException if a professor with the primary key could not be found
	 */
	@Override
	public com.dualdb.model.Professor deleteProfessor(int pId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professorLocalService.deleteProfessor(pId);
	}

	/**
	 * Deletes the professor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professor the professor
	 * @return the professor that was removed
	 */
	@Override
	public com.dualdb.model.Professor deleteProfessor(
		com.dualdb.model.Professor professor) {

		return _professorLocalService.deleteProfessor(professor);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _professorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _professorLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _professorLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _professorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dualdb.model.impl.ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _professorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dualdb.model.impl.ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _professorLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _professorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _professorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.dualdb.model.Professor fetchProfessor(int pId) {
		return _professorLocalService.fetchProfessor(pId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _professorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _professorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _professorLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the professor with the primary key.
	 *
	 * @param pId the primary key of the professor
	 * @return the professor
	 * @throws PortalException if a professor with the primary key could not be found
	 */
	@Override
	public com.dualdb.model.Professor getProfessor(int pId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _professorLocalService.getProfessor(pId);
	}

	/**
	 * Returns a range of all the professors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dualdb.model.impl.ProfessorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professors
	 * @param end the upper bound of the range of professors (not inclusive)
	 * @return the range of professors
	 */
	@Override
	public java.util.List<com.dualdb.model.Professor> getProfessors(
		int start, int end) {

		return _professorLocalService.getProfessors(start, end);
	}

	/**
	 * Returns the number of professors.
	 *
	 * @return the number of professors
	 */
	@Override
	public int getProfessorsCount() {
		return _professorLocalService.getProfessorsCount();
	}

	/**
	 * Updates the professor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProfessorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param professor the professor
	 * @return the professor that was updated
	 */
	@Override
	public com.dualdb.model.Professor updateProfessor(
		com.dualdb.model.Professor professor) {

		return _professorLocalService.updateProfessor(professor);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _professorLocalService.getBasePersistence();
	}

	@Override
	public ProfessorLocalService getWrappedService() {
		return _professorLocalService;
	}

	@Override
	public void setWrappedService(ProfessorLocalService professorLocalService) {
		_professorLocalService = professorLocalService;
	}

	private ProfessorLocalService _professorLocalService;

}