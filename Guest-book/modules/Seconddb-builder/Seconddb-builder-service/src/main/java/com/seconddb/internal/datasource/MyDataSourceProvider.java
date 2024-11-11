package com.seconddb.internal.datasource;


import com.liferay.portal.kernel.dao.jdbc.DataSourceFactory;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Reference;

public class MyDataSourceProvider implements DataSource {

	@Activate
	public void activate() {
		Properties properties = new Properties();
		properties.put("driverClassName", "com.mysql.cj.jdbc.Driver");
		properties.put("url",
				"jdbc:mysql://localhost/second?characterEncoding=UTF-8&dontTrackOpenResources=true&holdResultsOpenOverStatementClose=true&serverTimezone=GMT&useFastDateParsing=false&useUnicode=true");
		properties.put("username", "root");
		properties.put("password", "root");

		try {
			dataSource = dataSourceFactory.initDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Reference
	private DataSourceFactory dataSourceFactory;
	
	@Reference
	private DataSource dataSource;

	@Reference(target = "(osgi.jndi.service.name=jdbc/extDataSource)")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return dataSource.unwrap(iface);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return dataSource.isWrapperFor(iface);
	}

	@Override
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return dataSource.getConnection(username, password);
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return dataSource.getLogWriter();
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		dataSource.setLogWriter(out);
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		dataSource.setLoginTimeout(seconds);
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return dataSource.getLoginTimeout();
	}

}
