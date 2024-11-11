<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="permission.caption"/></b>
</p>

<c:if
					test="${permissionChecker.hasPermission(scopeGroupId, portletDisplay.rootPortletId, portletDisplay.resourcePK, ADD_DETAILS)}">
					<h3>Add now</h3>
				</c:if>