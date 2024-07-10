<%@ include file="/init.jsp" %>

<portlet:renderURL var = "customSQLRenderURL">
<portlet:param name = "mvcPath" value = "/customSQLPage.jsp" />
</portlet:renderURL>

<div class="mb-5">
<a href="<%= customSQLRenderURL %>" class="btn  btn-primary btn-default">
<i class="glyphicon glyphicon-plus"></i> Custom SQL
</a>
</div> 

