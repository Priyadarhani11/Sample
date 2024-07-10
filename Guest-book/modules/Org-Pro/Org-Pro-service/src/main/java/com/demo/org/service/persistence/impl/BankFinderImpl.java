package com.demo.org.service.persistence.impl;

import com.demo.org.model.Bank;
import com.demo.org.model.impl.BankImpl;
import com.demo.org.service.persistence.BankFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.Collections;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = BankFinder.class)
public class BankFinderImpl extends BankFinderBaseImpl implements BankFinder {

	@Reference
	private CustomSQL _customSQL;

	public List<Bank> getBankAllDetails(String bankName) {
		System.out.println("Inside Custom 3 table method");
		Session session = null;
		List<Bank> bankList = Collections.EMPTY_LIST;
		try {
			session = openSession();
			String sql = _customSQL.get(getClass(), "getBankAllDetails");
			System.out.println("Query......> " + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("Bank", BankImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(bankName);
			bankList = (List<Bank>) sqlQuery.list();
			return bankList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return bankList;
	}
}
