<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.student.permission.model.Student"%>
<%@ include file="./init.jsp"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

<!-- DataTables CSS -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css">

<!-- DataTables JS -->
<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>

<portlet:renderURL var="EntryRenderURL">
	<portlet:param name="jspPage" value='/student/form.jsp' />
</portlet:renderURL>

<%
	ThemeDisplay themeDisplay2 = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	List<Student> studentEntries = (List<Student>) request.getAttribute("studentList");

	PortletURL viewExampleEntryDataURL = renderResponse.createRenderURL();
	PortletURL editExampleEntryURL = renderResponse.createRenderURL();
	PortletURL deleteExampleEntryURL = renderResponse.createActionURL();
%>

<%-- <%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kerne l.util.WebKeys"%>
<%@page
	import="com.liferay.portal.kernel.security.permission.PermissionChecker"%>

<portlet:defineObjects />

<% 
    User user2 = themeDisplay.getUser();

    boolean superAdmin = themeDisplay.getPermissionChecker().isOmniadmin();
    boolean isProAdmin = RoleLocalServiceUtil.hasUserRole(user.getUserId(), themeDisplay.getCompanyId(), "PROADMIN", true);
    boolean Admin = RoleLocalServiceUtil.hasUserRole(user.getUserId(), themeDisplay.getCompanyId(), "ADMIN", true);
    
%> --%>

<div class="card"
	style="max-width: 1000px; margin: auto; padding: 20px;">
	<div class="card-header"
		style="background-color: #00ff62; color: white; text-align: center; padding: 15px;">
		<h1 class="card-title" style="margin: 0;">Student List</h1>
	</div>

	<c:if
		test="${permissionChecker.hasPermission(scopeGroupId, portletDisplay.rootPortletId, portletDisplay.resourcePK, ADD_STUDENT)}">


		<aui:a href="<%=EntryRenderURL.toString()%>" label="Add Employee"
			cssClass="btn btn-light" />
	</c:if>

	<div class="card-body">
		<aui:form method="post">
			<table id="moduleTable" class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>Name</th>
						<th>Mobile Number</th>
						<th>Designation</th>
					
						<c:if
							test="${permissionChecker.hasPermission(scopeGroupId, portletDisplay.rootPortletId, portletDisplay.resourcePK, VIEW_EMPLOYEE)}">


							<th>Action</th>
						</c:if>
					</tr>
				</thead>
				<tbody>
					<%
						for (Student student : studentEntries) {
								viewExampleEntryDataURL.setParameter("studentId", String.valueOf(student.getStudentId()));
								viewExampleEntryDataURL.setParameter("jspPage", "/student/ShowData.jsp");
								editExampleEntryURL.setParameter("studentId", String.valueOf(student.getStudentId()));
								editExampleEntryURL.setParameter("jspPage", "/student/update.jsp");
								deleteExampleEntryURL.setParameter("studentId", String.valueOf(student.getStudentId()));
								deleteExampleEntryURL.setParameter(ActionRequest.ACTION_NAME, "deleteEntry");
					%>
					<tr>
						<td><%=student.getStudentName()%></td>
						<td><%=student.getStudentMobileNumber()%></td>
						<td><%=student.getStudentDesignation()%></td>
						
						<c:if
							test="${permissionChecker.hasPermission(scopeGroupId, portletDisplay.rootPortletId, portletDisplay.resourcePK, VIEW_STUDENT)}">

							<td><liferay-ui:icon-menu direction="left-side"
									markupView="lexicon" showWhenSingleIcon="<%=true%>">
									<liferay-ui:icon image="view" message="View"
										url="<%=viewExampleEntryDataURL.toString()%>" />
									<c:if
										test="${permissionChecker.hasPermission(scopeGroupId, portletDisplay.rootPortletId, portletDisplay.resourcePK, UPDATE_STUDENT)}">

										<liferay-ui:icon image="edit" message="Edit"
											url="<%=editExampleEntryURL.toString()%>" />
									</c:if>
									<c:if
										test="${permissionChecker.hasPermission(scopeGroupId, portletDisplay.rootPortletId, portletDisplay.resourcePK, DELETE_STUDENT)}">
										<liferay-ui:icon image="delete" message="Delete"
											url="<%=deleteExampleEntryURL.toString()%>" />
									</c:if>
								</liferay-ui:icon-menu></td>
						</c:if>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</aui:form>
	</div>
</div>

<script>
	$(document).ready(function() {
		$('#moduleTable').DataTable();

	});
</script>


<style>
.employee-photo img {
	border-radius: 50%;
	width: 50px;
	height: 50px;
	object-fit: cover;
}

.card {
	border: 1px solid #dee2e6;
	border-radius: 0.25rem;
	box-shadow: 0 0.125rem 0.25rem rgba(0, 0, 0, 0.075);
}

.table th, .table td {
	vertical-align: middle;
}

.table th {
	background-color: #f8f9fa;
	color: #343a40;
}

.btn-light {
	margin-left: 800px;
	margin-top: 12px;
}
</style>
