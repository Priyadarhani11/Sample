package com.test.popup.portlet;

import com.test.popup.constants.PopupPortletKeys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.org.model.Bank;
import com.demo.org.service.BankLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryService;
import com.liferay.document.library.kernel.service.persistence.DLFileEntryPersistence;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.AuthTokenUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;

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
		"javax.portlet.display-name=Popup",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PopupPortletKeys.POPUP,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PopupPortlet extends MVCPortlet {
	
	@SuppressWarnings("deprecation")
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	        throws IOException, PortletException {
	    System.out.println("Inside the render method.........");

	    ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	    
	    PortletURL documentLibraryURL = renderResponse.createRenderURL();

	    try {
	        documentLibraryURL.setPortletMode(PortletMode.VIEW);
	        documentLibraryURL.setWindowState(WindowState.MAXIMIZED);

	        // Set parameters
	        documentLibraryURL.setParameter("mvcRenderCommandName", "/document_library/view.jsp");
	        documentLibraryURL.setParameter("groupId", String.valueOf(themeDisplay.getScopeGroupId()));
	        documentLibraryURL.setParameter("folderId", String.valueOf(DLFolderConstants.DEFAULT_PARENT_FOLDER_ID));
	        documentLibraryURL.setParameter("showActions", Boolean.TRUE.toString());
//	        documentLibraryURL.setParameter("p_p_id", "com_liferay_document_library_web_portlet_DLAdminPortlet");
//	        documentLibraryURL.setParameter("p_p_lifecycle", "0");
//	        documentLibraryURL.setParameter("p_p_state", WindowState.MAXIMIZED.toString());
//
//	        String authToken = AuthTokenUtil.getToken((HttpServletRequest) renderRequest);
//	        documentLibraryURL.setParameter("p_p_auth", authToken);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    String documentLibraryURLString = documentLibraryURL.toString();
	    System.out.println("documentLibraryURLString....." + documentLibraryURLString);
	    System.out.println("documentLibraryURL........" + documentLibraryURL);

	    renderRequest.setAttribute("documentLibraryURL", documentLibraryURLString);

	    super.render(renderRequest, renderResponse);
	}
}