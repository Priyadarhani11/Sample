package com.guestbook.web.security.permission.resource;

import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		service = DynamicInclude.class
	)

public class CustomLoginDynamicInclude implements DynamicInclude{

	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {
		httpServletResponse.getWriter().write("This is dynamic include customization::::");
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		dynamicIncludeRegistry.register("com.liferay.login.web#/login.jsp#alertPre");
	}
}
