<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/init.jsp" %>
<h1>Testing</h1>

<style>
/* General Styles */
body {
    font-family: Arial, sans-serif;
}

h1 {
    color: #0077c0; /* Liferay's default blue */
}

/* Management Toolbar Styles */
.clay-management-toolbar {
    background-color: #f4f6f8;
    border-bottom: 1px solid #d3d3d3;
}

.clay-management-toolbar .management-bar {
    padding: 10px;
}

/* Navigation Bar Styles */
.clay-navigation-bar {
    background-color: #eaeff3;
}

.clay-navigation-bar .nav-item .nav-link {
    color: #333;
}

.clay-navigation-bar .nav-item .nav-link.active {
    font-weight: bold;
    color: #0077c0;
}

/* Container Fluid Styles */
.clay-container-fluid {
    padding: 20px;
    background-color: #fff;
}

/* Sidebar Panel Styles */
.sidenav-container {
    background-color: #f8f9fa;
    border-left: 1px solid #d3d3d3;
}

.sidenav-container .sidenav-content {
    padding: 20px;
}

/* Breadcrumb Styles */
.lfr-breadcrumb {
    margin-bottom: 20px;
    background-color: #eaeff3;
    padding: 10px;
    border-radius: 4px;
}

.lfr-breadcrumb .breadcrumb-item a {
    color: #0077c0;
    text-decoration: none;
}

.lfr-breadcrumb .breadcrumb-item.active {
    color: #333;
}

/* Form Styles */
.aui .aui-form {
    background-color: #fff;
    padding: 20px;
    border: 1px solid #d3d3d3;
    border-radius: 4px;
}

.aui .aui-form .field {
    margin-bottom: 15px;
}

.aui .aui-form .field label {
    font-weight: bold;
}

/* Custom Styles for Web Content */
.web-content-item {
    margin-bottom: 20px;
    padding: 15px;
    border: 1px solid #d3d3d3;
    border-radius: 4px;
    background-color: #f8f9fa;
}

.web-content-item h2 {
    margin-top: 0;
}

.web-content-item p {
    margin: 0;
}
</style>

<portlet:renderURL var="fragmentRenderURL">
<portlet:param name="mvcPath" value="/childview.jsp"/>
</portlet:renderURL>

<div class="mb-5">
    <a href="<%= fragmentRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Fragment
    </a>
</div>


<%
JournalManagementToolbarDisplayContext journalManagementToolbarDisplayContext = null;

if (!journalDisplayContext.isSearch() || journalDisplayContext.isWebContentTabSelected()) {
	journalManagementToolbarDisplayContext = new JournalManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, journalDisplayContext, trashHelper);
}
else if (journalDisplayContext.isVersionsTabSelected()) {
	journalManagementToolbarDisplayContext = new JournalArticleVersionsManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, journalDisplayContext, trashHelper);
}
else if (journalDisplayContext.isCommentsTabSelected()) {
	journalManagementToolbarDisplayContext = new JournalArticleCommentsManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, journalDisplayContext, trashHelper);
}
else {
	journalManagementToolbarDisplayContext = new JournalManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, journalDisplayContext, trashHelper);
}
%>

<liferay-ui:success key='<%= portletDisplay.getId() + "requestProcessed" %>' message="your-request-completed-successfully" />

<portlet:actionURL name="/journal/restore_trash_entries" var="restoreTrashEntriesURL" />

<liferay-trash:undo
	portletURL="<%= restoreTrashEntriesURL %>"
/>

<clay:navigation-bar
	inverted="<%= true %>"
	navigationItems='<%= journalDisplayContext.getNavigationItems("web-content") %>'
/>

<clay:management-toolbar
	managementToolbarDisplayContext="<%= journalManagementToolbarDisplayContext %>"
	propsTransformer="js/ManagementToolbarPropsTransformer"
/>

<div class="closed sidenav-container sidenav-right" id="<portlet:namespace />infoPanelId">
	<c:if test="<%= journalDisplayContext.isShowInfoButton() %>">
		<liferay-portlet:resourceURL copyCurrentRenderParameters="<%= false %>" id="/journal/info_panel" var="sidebarPanelURL">
			<portlet:param name="folderId" value="<%= String.valueOf(journalDisplayContext.getFolderId()) %>" />
		</liferay-portlet:resourceURL>

		<liferay-frontend:sidebar-panel
			resourceURL="<%= sidebarPanelURL %>"
			searchContainerId="articles"
		>
			<liferay-util:include page="/info_panel.jsp" servletContext="<%= application %>" />
		</liferay-frontend:sidebar-panel>
	</c:if>

	<clay:container-fluid
		cssClass="container-view sidenav-content"
	>
		<c:if test="<%= !journalDisplayContext.isNavigationMine() && !journalDisplayContext.isNavigationRecent() %>">
			<liferay-site-navigation:breadcrumb
				breadcrumbEntries="<%= JournalPortletUtil.getPortletBreadcrumbEntries(journalDisplayContext.getFolder(), request, journalDisplayContext.getPortletURL(null)) %>"
			/>
		</c:if>
		

		<aui:form action="<%= journalDisplayContext.getPortletURL(null) %>" method="get" name="fm">
			<aui:input name="<%= ActionRequest.ACTION_NAME %>" type="hidden" />
			<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
			<aui:input name="groupId" type="hidden" value="<%= scopeGroupId %>" />
			<aui:input name="newFolderId" type="hidden" />

			<c:choose>
				<c:when test="<%= !journalDisplayContext.isSearch() %>">
					<liferay-util:include page="/view_entries.jsp" servletContext="<%= application %>" />
				</c:when>
				<c:otherwise>
					<clay:navigation-bar
						cssClass="mt-4"
						navigationItems="<%= journalDisplayContext.getSearchNavigationItems() %>"
					/>

					<c:choose>
						<c:when test="<%= journalDisplayContext.isWebContentTabSelected() %>">
							<liferay-util:include page="/view_entries.jsp" servletContext="<%= application %>" />
						</c:when>
						<c:when test="<%= journalDisplayContext.isVersionsTabSelected() %>">
							<liferay-util:include page="/view_versions.jsp" servletContext="<%= application %>" />
						</c:when>
						<c:when test="<%= journalDisplayContext.isCommentsTabSelected() %>">
							<liferay-util:include page="/view_comments.jsp" servletContext="<%= application %>" />
						</c:when>
						<c:otherwise>
							<liferay-util:include page="/view_entries.jsp" servletContext="<%= application %>" />
						</c:otherwise>
					</c:choose>
				</c:otherwise>
			</c:choose>
		</aui:form>
	</clay:container-fluid>
</div>

<%@ include file="/friendly_url_changed_message.jspf" %>