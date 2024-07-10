/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.bank.model.impl;

import com.demo.bank.model.Employee;
import com.demo.bank.model.EmployeeModel;

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
 * The base model implementation for the Employee service. Represents a row in the &quot;BANK_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>EmployeeModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeImpl
 * @generated
 */
@JSON(strict = true)
public class EmployeeModelImpl
	extends BaseModelImpl<Employee> implements EmployeeModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee model instance should use the <code>Employee</code> interface instead.
	 */
	public static final String TABLE_NAME = "BANK_Employee";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"employeeId", Types.BIGINT},
		{"employeeName", Types.VARCHAR}, {"employeeAddress", Types.VARCHAR},
		{"employeePhoneNo", Types.BIGINT}, {"employeePinNo", Types.INTEGER},
		{"bankId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("employeeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("employeeName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("employeeAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("employeePhoneNo", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("employeePinNo", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("bankId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table BANK_Employee (uuid_ VARCHAR(75) null,employeeId LONG not null primary key,employeeName VARCHAR(75) null,employeeAddress VARCHAR(75) null,employeePhoneNo LONG,employeePinNo INTEGER,bankId LONG)";

	public static final String TABLE_SQL_DROP = "drop table BANK_Employee";

	public static final String ORDER_BY_JPQL =
		" ORDER BY employee.employeeId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY BANK_Employee.employeeId ASC";

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
	public static final long EMPLOYEEID_COLUMN_BITMASK = 2L;

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

	public EmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Employee, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Employee, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Employee, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Employee)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Employee, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Employee, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Employee)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Employee, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Employee, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Employee, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Employee, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Employee, Object>>();

			attributeGetterFunctions.put("uuid", Employee::getUuid);
			attributeGetterFunctions.put("employeeId", Employee::getEmployeeId);
			attributeGetterFunctions.put(
				"employeeName", Employee::getEmployeeName);
			attributeGetterFunctions.put(
				"employeeAddress", Employee::getEmployeeAddress);
			attributeGetterFunctions.put(
				"employeePhoneNo", Employee::getEmployeePhoneNo);
			attributeGetterFunctions.put(
				"employeePinNo", Employee::getEmployeePinNo);
			attributeGetterFunctions.put("bankId", Employee::getBankId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Employee, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Employee, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Employee, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Employee, String>)Employee::setUuid);
			attributeSetterBiConsumers.put(
				"employeeId",
				(BiConsumer<Employee, Long>)Employee::setEmployeeId);
			attributeSetterBiConsumers.put(
				"employeeName",
				(BiConsumer<Employee, String>)Employee::setEmployeeName);
			attributeSetterBiConsumers.put(
				"employeeAddress",
				(BiConsumer<Employee, String>)Employee::setEmployeeAddress);
			attributeSetterBiConsumers.put(
				"employeePhoneNo",
				(BiConsumer<Employee, Long>)Employee::setEmployeePhoneNo);
			attributeSetterBiConsumers.put(
				"employeePinNo",
				(BiConsumer<Employee, Integer>)Employee::setEmployeePinNo);
			attributeSetterBiConsumers.put(
				"bankId", (BiConsumer<Employee, Long>)Employee::setBankId);

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
	public String getEmployeeName() {
		if (_employeeName == null) {
			return "";
		}
		else {
			return _employeeName;
		}
	}

	@Override
	public void setEmployeeName(String employeeName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_employeeName = employeeName;
	}

	@JSON
	@Override
	public String getEmployeeAddress() {
		if (_employeeAddress == null) {
			return "";
		}
		else {
			return _employeeAddress;
		}
	}

	@Override
	public void setEmployeeAddress(String employeeAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_employeeAddress = employeeAddress;
	}

	@JSON
	@Override
	public long getEmployeePhoneNo() {
		return _employeePhoneNo;
	}

	@Override
	public void setEmployeePhoneNo(long employeePhoneNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_employeePhoneNo = employeePhoneNo;
	}

	@JSON
	@Override
	public int getEmployeePinNo() {
		return _employeePinNo;
	}

	@Override
	public void setEmployeePinNo(int employeePinNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_employeePinNo = employeePinNo;
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
			0, Employee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Employee toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Employee>
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
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setUuid(getUuid());
		employeeImpl.setEmployeeId(getEmployeeId());
		employeeImpl.setEmployeeName(getEmployeeName());
		employeeImpl.setEmployeeAddress(getEmployeeAddress());
		employeeImpl.setEmployeePhoneNo(getEmployeePhoneNo());
		employeeImpl.setEmployeePinNo(getEmployeePinNo());
		employeeImpl.setBankId(getBankId());

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public Employee cloneWithOriginalValues() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		employeeImpl.setEmployeeId(
			this.<Long>getColumnOriginalValue("employeeId"));
		employeeImpl.setEmployeeName(
			this.<String>getColumnOriginalValue("employeeName"));
		employeeImpl.setEmployeeAddress(
			this.<String>getColumnOriginalValue("employeeAddress"));
		employeeImpl.setEmployeePhoneNo(
			this.<Long>getColumnOriginalValue("employeePhoneNo"));
		employeeImpl.setEmployeePinNo(
			this.<Integer>getColumnOriginalValue("employeePinNo"));
		employeeImpl.setBankId(this.<Long>getColumnOriginalValue("bankId"));

		return employeeImpl;
	}

	@Override
	public int compareTo(Employee employee) {
		long primaryKey = employee.getPrimaryKey();

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

		if (!(object instanceof Employee)) {
			return false;
		}

		Employee employee = (Employee)object;

		long primaryKey = employee.getPrimaryKey();

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
	public CacheModel<Employee> toCacheModel() {
		EmployeeCacheModel employeeCacheModel = new EmployeeCacheModel();

		employeeCacheModel.uuid = getUuid();

		String uuid = employeeCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			employeeCacheModel.uuid = null;
		}

		employeeCacheModel.employeeId = getEmployeeId();

		employeeCacheModel.employeeName = getEmployeeName();

		String employeeName = employeeCacheModel.employeeName;

		if ((employeeName != null) && (employeeName.length() == 0)) {
			employeeCacheModel.employeeName = null;
		}

		employeeCacheModel.employeeAddress = getEmployeeAddress();

		String employeeAddress = employeeCacheModel.employeeAddress;

		if ((employeeAddress != null) && (employeeAddress.length() == 0)) {
			employeeCacheModel.employeeAddress = null;
		}

		employeeCacheModel.employeePhoneNo = getEmployeePhoneNo();

		employeeCacheModel.employeePinNo = getEmployeePinNo();

		employeeCacheModel.bankId = getBankId();

		return employeeCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Employee, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Employee, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Employee, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Employee)this);

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

		private static final Function<InvocationHandler, Employee>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Employee.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _employeeId;
	private String _employeeName;
	private String _employeeAddress;
	private long _employeePhoneNo;
	private int _employeePinNo;
	private long _bankId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Employee, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Employee)this);
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
		_columnOriginalValues.put("employeeId", _employeeId);
		_columnOriginalValues.put("employeeName", _employeeName);
		_columnOriginalValues.put("employeeAddress", _employeeAddress);
		_columnOriginalValues.put("employeePhoneNo", _employeePhoneNo);
		_columnOriginalValues.put("employeePinNo", _employeePinNo);
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

		columnBitmasks.put("employeeId", 2L);

		columnBitmasks.put("employeeName", 4L);

		columnBitmasks.put("employeeAddress", 8L);

		columnBitmasks.put("employeePhoneNo", 16L);

		columnBitmasks.put("employeePinNo", 32L);

		columnBitmasks.put("bankId", 64L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Employee _escapedModel;

}