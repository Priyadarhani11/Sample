/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.user.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExcelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExcelLocalService
 * @generated
 */
public class ExcelLocalServiceWrapper
	implements ExcelLocalService, ServiceWrapper<ExcelLocalService> {

	public ExcelLocalServiceWrapper() {
		this(null);
	}

	public ExcelLocalServiceWrapper(ExcelLocalService excelLocalService) {
		_excelLocalService = excelLocalService;
	}

	/**
	 * Adds the excel to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExcelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param excel the excel
	 * @return the excel that was added
	 */
	@Override
	public com.user.model.Excel addExcel(com.user.model.Excel excel) {
		return _excelLocalService.addExcel(excel);
	}

	@Override
	public void addMyEntity(String name, String address, long phoneNumber) {
		_excelLocalService.addMyEntity(name, address, phoneNumber);
	}

	/**
	 * Creates a new excel with the primary key. Does not add the excel to the database.
	 *
	 * @param excelId the primary key for the new excel
	 * @return the new excel
	 */
	@Override
	public com.user.model.Excel createExcel(long excelId) {
		return _excelLocalService.createExcel(excelId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _excelLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the excel from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExcelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param excel the excel
	 * @return the excel that was removed
	 */
	@Override
	public com.user.model.Excel deleteExcel(com.user.model.Excel excel) {
		return _excelLocalService.deleteExcel(excel);
	}

	/**
	 * Deletes the excel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExcelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel that was removed
	 * @throws PortalException if a excel with the primary key could not be found
	 */
	@Override
	public com.user.model.Excel deleteExcel(long excelId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _excelLocalService.deleteExcel(excelId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _excelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _excelLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _excelLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _excelLocalService.dynamicQuery();
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

		return _excelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.user.model.impl.ExcelModelImpl</code>.
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

		return _excelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.user.model.impl.ExcelModelImpl</code>.
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

		return _excelLocalService.dynamicQuery(
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

		return _excelLocalService.dynamicQueryCount(dynamicQuery);
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

		return _excelLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.user.model.Excel fetchExcel(long excelId) {
		return _excelLocalService.fetchExcel(excelId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _excelLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the excel with the primary key.
	 *
	 * @param excelId the primary key of the excel
	 * @return the excel
	 * @throws PortalException if a excel with the primary key could not be found
	 */
	@Override
	public com.user.model.Excel getExcel(long excelId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _excelLocalService.getExcel(excelId);
	}

	/**
	 * Returns a range of all the excels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.user.model.impl.ExcelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of excels
	 * @param end the upper bound of the range of excels (not inclusive)
	 * @return the range of excels
	 */
	@Override
	public java.util.List<com.user.model.Excel> getExcels(int start, int end) {
		return _excelLocalService.getExcels(start, end);
	}

	/**
	 * Returns the number of excels.
	 *
	 * @return the number of excels
	 */
	@Override
	public int getExcelsCount() {
		return _excelLocalService.getExcelsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _excelLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _excelLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _excelLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public boolean isPhoneNumberExists(long phoneNumber) {
		return _excelLocalService.isPhoneNumberExists(phoneNumber);
	}

	/**
	 * Updates the excel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExcelLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param excel the excel
	 * @return the excel that was updated
	 */
	@Override
	public com.user.model.Excel updateExcel(com.user.model.Excel excel) {
		return _excelLocalService.updateExcel(excel);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _excelLocalService.getBasePersistence();
	}

	@Override
	public ExcelLocalService getWrappedService() {
		return _excelLocalService;
	}

	@Override
	public void setWrappedService(ExcelLocalService excelLocalService) {
		_excelLocalService = excelLocalService;
	}

	private ExcelLocalService _excelLocalService;

}