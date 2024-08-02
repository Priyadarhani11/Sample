package com.custon.portlet;

import com.custon.constants.CustomSqlPortletKeys;
import com.demo.org.model.Bank;
import com.demo.org.model.Department;
import com.demo.org.model.Employee;
import com.demo.org.service.BankLocalService;
import com.demo.org.service.BankLocalServiceUtil;
import com.demo.org.service.DepartmentLocalService;
import com.demo.org.service.EmployeeLocalService;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Dell
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CustomSql",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CustomSqlPortletKeys.CUSTOMSQL,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CustomSqlPortlet extends MVCPortlet {
	
	@Reference
	private BankLocalService bankLocalService;
	
	@Reference
	private EmployeeLocalService employeeLocalService;
	
	@Reference
	private DepartmentLocalService departmentLocalService;
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		String bankName = renderRequest.getParameter("bankName");
		
		List<Bank> bankList = bankLocalService.getBanks(-1, -1);
		List<Employee> employeeList = employeeLocalService.getEmployees(-1, -1);
		List<Department> departmentList = departmentLocalService.getDepartments(-1, -1);
		
		System.out.println("bankList......." +bankList);
		System.out.println("employeeList......." +employeeList);
		System.out.println("departmentList......." +departmentList);
		
		renderRequest.setAttribute("bankList", bankList);
		renderRequest.setAttribute("employeeList", employeeList);
		renderRequest.setAttribute("departmentList", departmentList);
		
		 // Use finder method
		
		/*
		 * List<Bank> bankListByName = bankLocalService.findByName(bankName);
		 * renderRequest.setAttribute("bankListByName", bankListByName);
		 */
		
		//dynamic query
		/*
		 * DynamicQuery bankList1 = BankLocalServiceUtil.dynamicQuery(); Criterion
		 * criterion = RestrictionsFactoryUtil.eq("bankName", "PNB"); criterion =
		 * RestrictionsFactoryUtil.and(criterion,
		 * RestrictionsFactoryUtil.eq("bankAddress", "Bangalore")); bankList1.add
		 * (criterion);
		 * 
		 * List<Bank> bankList2 = BankLocalServiceUtil.dynamicQuery(bankList1);
		 * renderRequest.setAttribute("bankList2", bankList2);
		 */
		String bankName1 = bankLocalService.findByBankName("PNB").get(0).getBankName();
		System.out.println("Bank name : " + bankName1);
		
		super.render(renderRequest, renderResponse);
	}
	
	
}