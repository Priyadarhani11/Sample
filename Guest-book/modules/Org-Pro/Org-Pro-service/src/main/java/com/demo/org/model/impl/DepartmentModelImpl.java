/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.model.impl;

import com.demo.org.model.Department;
import com.demo.org.model.DepartmentModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Department service. Represents a row in the &quot;ORG_Department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>DepartmentModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DepartmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentImpl
 * @generated
 */
@JSON(strict = true)
public class DepartmentModelImpl
	extends BaseModelImpl<Department> implements DepartmentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a department model instance should use the <code>Department</code> interface instead.
	 */
	public static final String TABLE_NAME = "ORG_Department";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"departmentId", Types.BIGINT},
		{"departmentNo", Types.VARCHAR}, {"departmentName", Types.VARCHAR},
		{"departmentAddress", Types.VARCHAR}, {"departmentPin", Types.INTEGER},
		{"employeeId", Types.BIGINT}, {"bankId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("departmentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("departmentNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("departmentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("departmentAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("departmentPin", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("employeeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bankId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ORG_Department (uuid_ VARCHAR(75) null,departmentId LONG not null primary key,departmentNo VARCHAR(75) null,departmentName VARCHAR(75) null,departmentAddress VARCHAR(75) null,departmentPin INTEGER,employeeId LONG,bankId LONG)";

	public static final String TABLE_SQL_DROP = "drop table ORG_Department";

	public static final String ORDER_BY_JPQL =
		" ORDER BY department.departmentId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ORG_Department.departmentId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long DEPARTMENTID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public DepartmentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _departmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDepartmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _departmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Department.class;
	}

	@Override
	public String getModelClassName() {
		return Department.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Department, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Department, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Department, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Department)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Department, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Department, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Department)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Department, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Department, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Department, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Department, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Department, Object>>();

			attributeGetterFunctions.put("uuid", Department::getUuid);
			attributeGetterFunctions.put(
				"departmentId", Department::getDepartmentId);
			attributeGetterFunctions.put(
				"departmentNo", Department::getDepartmentNo);
			attributeGetterFunctions.put(
				"departmentName", Department::getDepartmentName);
			attributeGetterFunctions.put(
				"departmentAddress", Department::getDepartmentAddress);
			attributeGetterFunctions.put(
				"departmentPin", Department::getDepartmentPin);
			attributeGetterFunctions.put(
				"employeeId", Department::getEmployeeId);
			attributeGetterFunctions.put("bankId", Department::getBankId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Department, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Department, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Department, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Department, String>)Department::setUuid);
			attributeSetterBiConsumers.put(
				"departmentId",
				(BiConsumer<Department, Long>)Department::setDepartmentId);
			attributeSetterBiConsumers.put(
				"departmentNo",
				(BiConsumer<Department, String>)Department::setDepartmentNo);
			attributeSetterBiConsumers.put(
				"departmentName",
				(BiConsumer<Department, String>)Department::setDepartmentName);
			attributeSetterBiConsumers.put(
				"departmentAddress",
				(BiConsumer<Department, String>)
					Department::setDepartmentAddress);
			attributeSetterBiConsumers.put(
				"departmentPin",
				(BiConsumer<Department, Integer>)Department::setDepartmentPin);
			attributeSetterBiConsumers.put(
				"employeeId",
				(BiConsumer<Department, Long>)Department::setEmployeeId);
			attributeSetterBiConsumers.put(
				"bankId", (BiConsumer<Department, Long>)Department::setBankId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getDepartmentId() {
		return _departmentId;
	}

	@Override
	public void setDepartmentId(long departmentId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_departmentId = departmentId;
	}

	@JSON
	@Override
	public String getDepartmentNo() {
		if (_departmentNo == null) {
			return "";
		}
		else {
			return _departmentNo;
		}
	}

	@Override
	public void setDepartmentNo(String departmentNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_departmentNo = departmentNo;
	}

	@JSON
	@Override
	public String getDepartmentName() {
		if (_departmentName == null) {
			return "";
		}
		else {
			return _departmentName;
		}
	}

	@Override
	public void setDepartmentName(String departmentName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_departmentName = departmentName;
	}

	@JSON
	@Override
	public String getDepartmentAddress() {
		if (_departmentAddress == null) {
			return "";
		}
		else {
			return _departmentAddress;
		}
	}

	@Override
	public void setDepartmentAddress(String departmentAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_departmentAddress = departmentAddress;
	}

	@JSON
	@Override
	public int getDepartmentPin() {
		return _departmentPin;
	}

	@Override
	public void setDepartmentPin(int departmentPin) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_departmentPin = departmentPin;
	}

	@JSON
	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_employeeId = employeeId;
	}

	@JSON
	@Override
	public long getBankId() {
		return _bankId;
	}

	@Override
	public void setBankId(long bankId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bankId = bankId;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Department.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Department toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Department>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		departmentImpl.setUuid(getUuid());
		departmentImpl.setDepartmentId(getDepartmentId());
		departmentImpl.setDepartmentNo(getDepartmentNo());
		departmentImpl.setDepartmentName(getDepartmentName());
		departmentImpl.setDepartmentAddress(getDepartmentAddress());
		departmentImpl.setDepartmentPin(getDepartmentPin());
		departmentImpl.setEmployeeId(getEmployeeId());
		departmentImpl.setBankId(getBankId());

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public Department cloneWithOriginalValues() {
		DepartmentImpl departmentImpl = new DepartmentImpl();

		departmentImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		departmentImpl.setDepartmentId(
			this.<Long>getColumnOriginalValue("departmentId"));
		departmentImpl.setDepartmentNo(
			this.<String>getColumnOriginalValue("departmentNo"));
		departmentImpl.setDepartmentName(
			this.<String>getColumnOriginalValue("departmentName"));
		departmentImpl.setDepartmentAddress(
			this.<String>getColumnOriginalValue("departmentAddress"));
		departmentImpl.setDepartmentPin(
			this.<Integer>getColumnOriginalValue("departmentPin"));
		departmentImpl.setEmployeeId(
			this.<Long>getColumnOriginalValue("employeeId"));
		departmentImpl.setBankId(this.<Long>getColumnOriginalValue("bankId"));

		return departmentImpl;
	}

	@Override
	public int compareTo(Department department) {
		long primaryKey = department.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Department)) {
			return false;
		}

		Department department = (Department)object;

		long primaryKey = department.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Department> toCacheModel() {
		DepartmentCacheModel departmentCacheModel = new DepartmentCacheModel();

		departmentCacheModel.uuid = getUuid();

		String uuid = departmentCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			departmentCacheModel.uuid = null;
		}

		departmentCacheModel.departmentId = getDepartmentId();

		departmentCacheModel.departmentNo = getDepartmentNo();

		String departmentNo = departmentCacheModel.departmentNo;

		if ((departmentNo != null) && (departmentNo.length() == 0)) {
			departmentCacheModel.departmentNo = null;
		}

		departmentCacheModel.departmentName = getDepartmentName();

		String departmentName = departmentCacheModel.departmentName;

		if ((departmentName != null) && (departmentName.length() == 0)) {
			departmentCacheModel.departmentName = null;
		}

		departmentCacheModel.departmentAddress = getDepartmentAddress();

		String departmentAddress = departmentCacheModel.departmentAddress;

		if ((departmentAddress != null) && (departmentAddress.length() == 0)) {
			departmentCacheModel.departmentAddress = null;
		}

		departmentCacheModel.departmentPin = getDepartmentPin();

		departmentCacheModel.employeeId = getEmployeeId();

		departmentCacheModel.bankId = getBankId();

		return departmentCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Department, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Department, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Department, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Department)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Department>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Department.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _departmentId;
	private String _departmentNo;
	private String _departmentName;
	private String _departmentAddress;
	private int _departmentPin;
	private long _employeeId;
	private long _bankId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Department, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Department)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("departmentId", _departmentId);
		_columnOriginalValues.put("departmentNo", _departmentNo);
		_columnOriginalValues.put("departmentName", _departmentName);
		_columnOriginalValues.put("departmentAddress", _departmentAddress);
		_columnOriginalValues.put("departmentPin", _departmentPin);
		_columnOriginalValues.put("employeeId", _employeeId);
		_columnOriginalValues.put("bankId", _bankId);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("departmentId", 2L);

		columnBitmasks.put("departmentNo", 4L);

		columnBitmasks.put("departmentName", 8L);

		columnBitmasks.put("departmentAddress", 16L);

		columnBitmasks.put("departmentPin", 32L);

		columnBitmasks.put("employeeId", 64L);

		columnBitmasks.put("bankId", 128L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Department _escapedModel;

}