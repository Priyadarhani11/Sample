<%@page import="com.student.permission.service.StudentLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.student.permission.model.Student"%>
<%@ include file="../init.jsp"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />


<portlet:actionURL name="updateStudent" var="updateStudentURL">
	<portlet:param name="mvcRenderCommandName" value="/view.jsp" />
</portlet:actionURL>

<%
long studentId = ParamUtil.getLong(request, "studentId");
Student student = null;

if (studentId > 0) {
	student = StudentLocalServiceUtil.fetchStudent(studentId);
}
%>

     <div class="card" style="max-width: 500px; margin: auto; padding: 20px;">
        	<div class="card-header"
	     	    style="background-color: #007bff; color: white; box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2); padding: 15px; text-align: center;">
	    	    <h2 class="card-title" style="margin: 0;">Update Student</h2>
	        </div>
	   <div class="card-body">
		    <aui:form action="<%= updateStudentURL.toString() %>" method="post"
			enctype="multipart/form-data"
			style="display: inline-block; width: 100%;">
			<!-- Hidden field to store the employee ID -->
			<aui:input name="studentId" type="hidden" 
				value="<%= student.getStudentId() %>" ></aui:input>

			<aui:input name="studentName" label="Student Name" 
				value="<%= student.getStudentName() %>"/>

			<aui:input name="studentMobileNumber" label="Mobile Number" type="tel" oninput="validateMobileNumber(this)" required="true"
				value="<%= student.getStudentMobileNumber() %>" />

			<aui:input name="studentDesignation" label="Designation"
				value="<%= student.getStudentDesignation() %>" />

			</div>	


			<aui:button type="submit" value="Update Student"
				style="margin-top: 10px;" />
		</aui:form>
	</div>
</div>

    
    <script>
function validateMobileNumber(input) {
    
    input.value = input.value.replace(/\D/g, '');

   
    if (input.value.length > 10) {
        input.value = input.value.slice(0, 10);
    }
}
</script>