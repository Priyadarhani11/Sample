/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.dualdb.model.impl;

import com.dualdb.model.Professor;
import com.dualdb.model.ProfessorModel;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
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
 * The base model implementation for the Professor service. Represents a row in the &quot;professors&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ProfessorModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProfessorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProfessorImpl
 * @generated
 */
@JSON(strict = true)
public class ProfessorModelImpl
	extends BaseModelImpl<Professor> implements ProfessorModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a professor model instance should use the <code>Professor</code> interface instead.
	 */
	public static final String TABLE_NAME = "professors";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"pId", Types.INTEGER},
		{"pName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pId", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("pName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table professors (uuid_ VARCHAR(75) null,pId INTEGER not null primary key,pName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table professors";

	public static final String ORDER_BY_JPQL = " ORDER BY professor.pId ASC";

	public static final String ORDER_BY_SQL = " ORDER BY professors.pId ASC";

	public static final String DATA_SOURCE = "extDataSource";

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
	public static final long PID_COLUMN_BITMASK = 2L;

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

	public ProfessorModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _pId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Professor.class;
	}

	@Override
	public String getModelClassName() {
		return Professor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Professor, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Professor, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Professor, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Professor)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Professor, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Professor, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Professor)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Professor, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Professor, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Professor, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Professor, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Professor, Object>>();

			attributeGetterFunctions.put("uuid", Professor::getUuid);
			attributeGetterFunctions.put("pId", Professor::getPId);
			attributeGetterFunctions.put("pName", Professor::getPName);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Professor, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Professor, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Professor, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Professor, String>)Professor::setUuid);
			attributeSetterBiConsumers.put(
				"pId", (BiConsumer<Professor, Integer>)Professor::setPId);
			attributeSetterBiConsumers.put(
				"pName", (BiConsumer<Professor, String>)Professor::setPName);

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
	public int getPId() {
		return _pId;
	}

	@Override
	public void setPId(int pId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pId = pId;
	}

	@JSON
	@Override
	public String getPName() {
		if (_pName == null) {
			return "";
		}
		else {
			return _pName;
		}
	}

	@Override
	public void setPName(String pName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pName = pName;
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
	public Professor toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Professor>
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
		ProfessorImpl professorImpl = new ProfessorImpl();

		professorImpl.setUuid(getUuid());
		professorImpl.setPId(getPId());
		professorImpl.setPName(getPName());

		professorImpl.resetOriginalValues();

		return professorImpl;
	}

	@Override
	public Professor cloneWithOriginalValues() {
		ProfessorImpl professorImpl = new ProfessorImpl();

		professorImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		professorImpl.setPId(this.<Integer>getColumnOriginalValue("pId"));
		professorImpl.setPName(this.<String>getColumnOriginalValue("pName"));

		return professorImpl;
	}

	@Override
	public int compareTo(Professor professor) {
		int primaryKey = professor.getPrimaryKey();

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

		if (!(object instanceof Professor)) {
			return false;
		}

		Professor professor = (Professor)object;

		int primaryKey = professor.getPrimaryKey();

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
	public CacheModel<Professor> toCacheModel() {
		ProfessorCacheModel professorCacheModel = new ProfessorCacheModel();

		professorCacheModel.uuid = getUuid();

		String uuid = professorCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			professorCacheModel.uuid = null;
		}

		professorCacheModel.pId = getPId();

		professorCacheModel.pName = getPName();

		String pName = professorCacheModel.pName;

		if ((pName != null) && (pName.length() == 0)) {
			professorCacheModel.pName = null;
		}

		return professorCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Professor, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Professor, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Professor, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Professor)this);

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

		private static final Function<InvocationHandler, Professor>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Professor.class, ModelWrapper.class);

	}

	private String _uuid;
	private int _pId;
	private String _pName;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Professor, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Professor)this);
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
		_columnOriginalValues.put("pId", _pId);
		_columnOriginalValues.put("pName", _pName);
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

		columnBitmasks.put("pId", 2L);

		columnBitmasks.put("pName", 4L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Professor _escapedModel;

}