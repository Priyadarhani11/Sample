/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.org.model.impl;

import com.demo.org.model.Bank;
import com.demo.org.model.BankModel;

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
 * The base model implementation for the Bank service. Represents a row in the &quot;ORG_Bank&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>BankModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BankImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BankImpl
 * @generated
 */
@JSON(strict = true)
public class BankModelImpl extends BaseModelImpl<Bank> implements BankModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bank model instance should use the <code>Bank</code> interface instead.
	 */
	public static final String TABLE_NAME = "ORG_Bank";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"bankId", Types.BIGINT},
		{"bankName", Types.VARCHAR}, {"bankAddress", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bankId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bankName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bankAddress", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ORG_Bank (uuid_ VARCHAR(75) null,bankId LONG not null primary key,bankName VARCHAR(75) null,bankAddress VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table ORG_Bank";

	public static final String ORDER_BY_JPQL = " ORDER BY bank.bankId ASC";

	public static final String ORDER_BY_SQL = " ORDER BY ORG_Bank.bankId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long BANKNAME_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long BANKID_COLUMN_BITMASK = 4L;

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

	public BankModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _bankId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBankId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bankId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Bank.class;
	}

	@Override
	public String getModelClassName() {
		return Bank.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Bank, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Bank, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Bank, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Bank)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Bank, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Bank, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Bank)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Bank, Object>> getAttributeGetterFunctions() {
		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Bank, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Bank, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Bank, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Bank, Object>>();

			attributeGetterFunctions.put("uuid", Bank::getUuid);
			attributeGetterFunctions.put("bankId", Bank::getBankId);
			attributeGetterFunctions.put("bankName", Bank::getBankName);
			attributeGetterFunctions.put("bankAddress", Bank::getBankAddress);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Bank, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Bank, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Bank, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Bank, String>)Bank::setUuid);
			attributeSetterBiConsumers.put(
				"bankId", (BiConsumer<Bank, Long>)Bank::setBankId);
			attributeSetterBiConsumers.put(
				"bankName", (BiConsumer<Bank, String>)Bank::setBankName);
			attributeSetterBiConsumers.put(
				"bankAddress", (BiConsumer<Bank, String>)Bank::setBankAddress);

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

	@JSON
	@Override
	public String getBankName() {
		if (_bankName == null) {
			return "";
		}
		else {
			return _bankName;
		}
	}

	@Override
	public void setBankName(String bankName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bankName = bankName;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalBankName() {
		return getColumnOriginalValue("bankName");
	}

	@JSON
	@Override
	public String getBankAddress() {
		if (_bankAddress == null) {
			return "";
		}
		else {
			return _bankAddress;
		}
	}

	@Override
	public void setBankAddress(String bankAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bankAddress = bankAddress;
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
			0, Bank.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Bank toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Bank>
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
		BankImpl bankImpl = new BankImpl();

		bankImpl.setUuid(getUuid());
		bankImpl.setBankId(getBankId());
		bankImpl.setBankName(getBankName());
		bankImpl.setBankAddress(getBankAddress());

		bankImpl.resetOriginalValues();

		return bankImpl;
	}

	@Override
	public Bank cloneWithOriginalValues() {
		BankImpl bankImpl = new BankImpl();

		bankImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		bankImpl.setBankId(this.<Long>getColumnOriginalValue("bankId"));
		bankImpl.setBankName(this.<String>getColumnOriginalValue("bankName"));
		bankImpl.setBankAddress(
			this.<String>getColumnOriginalValue("bankAddress"));

		return bankImpl;
	}

	@Override
	public int compareTo(Bank bank) {
		long primaryKey = bank.getPrimaryKey();

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

		if (!(object instanceof Bank)) {
			return false;
		}

		Bank bank = (Bank)object;

		long primaryKey = bank.getPrimaryKey();

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
	public CacheModel<Bank> toCacheModel() {
		BankCacheModel bankCacheModel = new BankCacheModel();

		bankCacheModel.uuid = getUuid();

		String uuid = bankCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			bankCacheModel.uuid = null;
		}

		bankCacheModel.bankId = getBankId();

		bankCacheModel.bankName = getBankName();

		String bankName = bankCacheModel.bankName;

		if ((bankName != null) && (bankName.length() == 0)) {
			bankCacheModel.bankName = null;
		}

		bankCacheModel.bankAddress = getBankAddress();

		String bankAddress = bankCacheModel.bankAddress;

		if ((bankAddress != null) && (bankAddress.length() == 0)) {
			bankCacheModel.bankAddress = null;
		}

		return bankCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Bank, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Bank, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Bank, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Bank)this);

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

		private static final Function<InvocationHandler, Bank>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Bank.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _bankId;
	private String _bankName;
	private String _bankAddress;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Bank, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Bank)this);
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
		_columnOriginalValues.put("bankId", _bankId);
		_columnOriginalValues.put("bankName", _bankName);
		_columnOriginalValues.put("bankAddress", _bankAddress);
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

		columnBitmasks.put("bankId", 2L);

		columnBitmasks.put("bankName", 4L);

		columnBitmasks.put("bankAddress", 8L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Bank _escapedModel;

}