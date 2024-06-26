package com.guestbook.web.portlet;

import com.guestbook.constants.GuestbookWebPortletKeys;
import com.guestbook.exception.NoSuchGuestbookEntryException;
import com.guestbook.model.Guestbook;
import com.guestbook.model.GuestbookEntry;
import com.guestbook.service.GuestbookEntryLocalService;
import com.guestbook.service.GuestbookEntryLocalServiceUtil;
import com.guestbook.service.GuestbookLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
        "com.liferay.portlet.display-category=category.social",
        "com.liferay.portlet.header-portlet-css=/css/main.css",
        "com.liferay.portlet.instanceable=false",
        "javax.portlet.display-name=GuestbookWeb",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/guestbook/view.jsp",
        "javax.portlet.name=" + GuestbookWebPortletKeys.GUESTBOOKWEB,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user"
}, service = Portlet.class)
public class GuestbookWebPortlet extends MVCPortlet {

    private static final Log logger = LogFactoryUtil.getLog(GuestbookWebPortlet.class);

    @Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
            throws IOException, PortletException {
        String email = ParamUtil.getString(resourceRequest, "emailId");
        logger.info("EMAILID::::::::::::::" + email);
        JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
        JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
        try {
            GuestbookEntry guestbookEntry = GuestbookEntryLocalServiceUtil.getByEmailId(email);
            jsonObject.put("availability", "no");
            logger.info("Guest book entry::::::::::" + guestbookEntry);
        } catch (NoSuchGuestbookEntryException e) {
            logger.warn(e.getMessage());
            jsonObject.put("availability", "yes");
        }
        jsonArray.put(jsonObject);
        resourceResponse.getWriter().write(jsonArray.toString());
    }

    public void serveResource1(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
            throws IOException, PortletException {
        Long mobile = ParamUtil.getLong(resourceRequest, "mobile");
        logger.info("Mobile:::::::" + mobile);
        JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
        JSONObject jsonResponse = JSONFactoryUtil.createJSONObject();

        try {
            GuestbookEntry guestbookEntry = GuestbookEntryLocalServiceUtil.getByMobile(mobile);
            jsonResponse.put("availability", "no");
            logger.info("Guest book entry::::::::::" + guestbookEntry);
        } catch (NoSuchGuestbookEntryException e) {
            logger.warn(e.getMessage());
            jsonResponse.put("availability", "yes");
        }
        jsonArray.put(jsonResponse);
        resourceResponse.getWriter().write(jsonArray.toString());
    }

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse)
            throws IOException, PortletException {
        try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(Guestbook.class.getName(), renderRequest);

            long groupId = serviceContext.getScopeGroupId();
            long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");

            List<Guestbook> guestbooks = _guestbookLocalService.getGuestbooks(-1, -1);

            if (guestbooks.isEmpty()) {
                Guestbook guestbook = _guestbookLocalService.addGuestbook(
                        serviceContext.getUserId(), "Main", serviceContext);

                guestbookId = guestbook.getGuestbookId();
            }

            if (guestbookId == 0) {
                guestbookId = guestbooks.get(0).getGuestbookId();
            }
            renderRequest.setAttribute("guestbookId", guestbookId);
        } catch (Exception e) {
            throw new PortletException(e);
        }
        super.render(renderRequest, renderResponse);
    }

    public void deleteEntry(ActionRequest request, ActionResponse response)
            throws PortalException {
        long entryId = ParamUtil.getLong(request, "entryId");
        long guestbookId = ParamUtil.getLong(request, "guestbookId");

        ServiceContext serviceContext = ServiceContextFactory.getInstance(GuestbookEntry.class.getName(), request);
        try {
            response.setRenderParameter("guestbookId", Long.toString(guestbookId));
            SessionMessages.add(request, "entryDeleted");
            _guestbookEntryLocalService.deleteGuestbookEntry(entryId);
        } catch (Exception e) {
            Logger.getLogger(GuestbookWebPortlet.class.getName()).log(Level.SEVERE, null, e);
            SessionErrors.add(request, e.getClass().getName());
        }
    }

    @Reference
    private GuestbookEntryLocalService _guestbookEntryLocalService;

    @Reference
    private GuestbookLocalService _guestbookLocalService;
}
