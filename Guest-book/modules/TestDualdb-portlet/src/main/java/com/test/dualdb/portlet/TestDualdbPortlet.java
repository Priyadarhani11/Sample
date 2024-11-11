package com.test.dualdb.portlet;

import com.test.dualdb.constants.TestDualdbPortletKeys;

import java.io.IOException;
import java.util.List;

import com.dualdb.model.Professor;
import com.dualdb.service.ProfessorLocalService;
import com.dualdb.service.ProfessorLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

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
		"javax.portlet.display-name=TestDualdb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TestDualdbPortletKeys.TESTDUALDB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TestDualdbPortlet extends MVCPortlet {
	
	@Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
			
		List<Professor> pp = ProfessorLocalServiceUtil.getProfessors(-1, -1);
		System.out.println("professor :::::::::::::" +pp);
			super.render(renderRequest, renderResponse);
		}
	
@Reference	
	ProfessorLocalService professorLocalService;
}