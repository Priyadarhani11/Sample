<%@page import="com.student.permission.service.StudentLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.student.permission.model.Student"%>
<%@ include file="../init.jsp"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

<portlet:actionURL name="backToList" var="backToListURL">
    <portlet:param name="mvcRenderCommandName" value="/view.jsp" />
</portlet:actionURL>

<portlet:renderURL var="EntryRenderURL">
	<portlet:param name="jspPage" value='/view.jsp' />
</portlet:renderURL>

<%
long studentId = ParamUtil.getLong(request, "studentId");
Student student = null;

if (studentId > 0) {
	student = StudentLocalServiceUtil.fetchStudent(studentId);
}
%>

<div class="container mt-4">
    <div class="card shadow-sm" style="max-width: 500px; margin: auto; border-radius: 10px;">
        <div class="card-header text-center" style="background-color: #007bff; color: white; border-top-left-radius: 10px; border-top-right-radius: 10px;">
            <h2 class="card-title mb-0">Student Details</h2>
        </div>
        <%-- <div class="card-body">
             <div class="form-group text-center">
                <label><strong>Profile Photo:</strong></label>
                <div>
                    <%
                    String empPhotoBase64 = employee.getEmployeephoto();
                    if (empPhotoBase64 != null && !empPhotoBase64.isEmpty()) {
                    %>
                    <img src="data:image/png;base64,<%= empPhotoBase64 %>" alt="Employee Photo"
                        style="width: 100px; height: 100px; border-radius: 50%; border: 2px solid #007bff; box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);" />
                    <%
                    } else {
                    %>
                    <img src="/image/user_male_portrait?img_id=0&img_id_token=ml8ak%2BZFyxdJKXMun4My4PavmL4%3D&t=1704777810332"
                        alt="Default Photo" style="width: 100px; height: 100px; border-radius: 50%; border: 2px solid #007bff; box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);" />
                    <p>No Photo</p>
                    <%
                    }
                    %> --%>
                </div>
            </div>
            <div class="form-group">
                <label><strong>Student Name:</strong></label>
                <p><%= student.getStudentName() %></p>
            </div>

            <div class="form-group">
                <label><strong>Mobile Number:</strong></label>
                <p><%= student.getStudentMobileNumber() %></p>
            </div>

            <div class="form-group">
                <label><strong>Designation:</strong></label>
                <p><%= student.getStudentDesignation() %></p>
            </div>

            

             <div class="text-center mt-3">
                <button type="button" class="btn btn-secondary" onclick="window.location.href='<%= backToListURL.toString() %>';">
                    Back to List
                </button>
            </div>
        </div>
    </div>
</div>

<style>
    .card {
        transition: transform 0.3s;
    }
    .card:hover {
        transform: scale(1.02);
    }
</style>
