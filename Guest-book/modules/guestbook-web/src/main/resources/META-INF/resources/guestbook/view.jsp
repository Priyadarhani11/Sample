<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="guestbookweb.caption"/></b>
</p>
<%
long guestbookId = Long.valueOf((Long)renderRequest
		.getAttribute("guestbookId"));
%>
<<aui:button-row cssClass="guestbook-buttons">

<portlet:renderURL var="addEntryURL">
<portlet:param name="mvcPath" value="/guestbook/edit_entry.jsp"/>
<portlet:param name="guestbookId" value="<%=String.valueOf(guestbookId) %>"/>

</portlet:renderURL>

</aui:button-row>












<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/guestbook/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
    <aui:button onClick="<%= addEntryURL.toString() %>"  value="Add Entry"></aui:button>
</aui:button-row>







