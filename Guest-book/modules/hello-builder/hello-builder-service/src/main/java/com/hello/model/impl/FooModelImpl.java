/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.hello.model.impl;

import com.hello.model.Foo;
import com.hello.model.FooModel;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
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
 * The base model implementation for the Foo service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>FooModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FooImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooImpl
 * @generated
 */
@JSON(strict = true)
public class FooModelImpl extends BaseModelImpl<Foo> implements FooModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a foo model instance should use the <code>Foo</code> interface instead.
	 */
	public static final String TABLE_NAME = "employee";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"employeeId", Types.INTEGER},
		{"employeeName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("employeeId", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("employeeName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table employee (uuid_ VARCHAR(75) null,employeeId INTEGER not null primary key,employeeName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table employee";

	public static final String ORDER_BY_JPQL = " ORDER BY foo.employeeId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY employee.employeeId ASC";

	public static final String DATA_SOURCE = "secondDatabase";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static final boolean ENTITY_CACHE_ENABLED = true;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static final boolean FINDER_CACHE_ENABLED = true;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static final boolean COLUMN_BITMASK_ENABLED = true;

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

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.hello.service.util.ServiceProps.get(
			"lock.expiration.time.com.hello.model.Foo"));

	public FooModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Foo.class;
	}

	@Override
	public String getModelClassName() {
		return Foo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Foo, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Foo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Foo, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Foo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Foo, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Foo, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Foo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Foo, Object>> getAttributeGetterFunctions() {
		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Foo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Foo, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Foo, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Foo, Object>>();

			attributeGetterFunctions.put("uuid", Foo::getUuid);
			attributeGetterFunctions.put("employeeId", Foo::getEmployeeId);
			attributeGetterFunctions.put("employeeName", Foo::getEmployeeName);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Foo, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Foo, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Foo, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Foo, String>)Foo::setUuid);
			attributeSetterBiConsumers.put(
				"employeeId", (BiConsumer<Foo, Integer>)Foo::setEmployeeId);
			attributeSetterBiConsumers.put(
				"employeeName", (BiConsumer<Foo, String>)Foo::setEmployeeName);

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
	public int getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(int employeeId) {
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
	public Foo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Foo> escapedModelProxyProviderFunction =
				EscapedModelProxyProviderFunctionHolder.
					_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FooImpl fooImpl = new FooImpl();

		fooImpl.setUuid(getUuid());
		fooImpl.setEmployeeId(getEmployeeId());
		fooImpl.setEmployeeName(getEmployeeName());

		fooImpl.resetOriginalValues();

		return fooImpl;
	}

	@Override
	public Foo cloneWithOriginalValues() {
		FooImpl fooImpl = new FooImpl();

		fooImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		fooImpl.setEmployeeId(
			this.<Integer>getColumnOriginalValue("employeeId"));
		fooImpl.setEmployeeName(
			this.<String>getColumnOriginalValue("employeeName"));

		return fooImpl;
	}

	@Override
	public int compareTo(Foo foo) {
		int primaryKey = foo.getPrimaryKey();

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

		if (!(object instanceof Foo)) {
			return false;
		}

		Foo foo = (Foo)object;

		int primaryKey = foo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Foo> toCacheModel() {
		FooCacheModel fooCacheModel = new FooCacheModel();

		fooCacheModel.uuid = getUuid();

		String uuid = fooCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			fooCacheModel.uuid = null;
		}

		fooCacheModel.employeeId = getEmployeeId();

		fooCacheModel.employeeName = getEmployeeName();

		String employeeName = fooCacheModel.employeeName;

		if ((employeeName != null) && (employeeName.length() == 0)) {
			fooCacheModel.employeeName = null;
		}

		return fooCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Foo, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Foo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Foo, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Foo)this);

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

		private static final Function<InvocationHandler, Foo>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Foo.class, ModelWrapper.class);

	}

	private String _uuid;
	private int _employeeId;
	private String _employeeName;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Foo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Foo)this);
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

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Foo _escapedModel;

}