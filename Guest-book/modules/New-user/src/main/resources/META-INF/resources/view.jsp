<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.service.CountryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>


<p>
	<b><liferay-ui:message key="newuser.caption"/></b>
</p>

<portlet:actionURL var="signupURL"  name="signupURL"/>

<aui:form action="${signupURL}" method="POST" enctype="multipart/form-data">

<aui:input name="screenName" label="" placeholder="Screen Name"></aui:input>

<aui:input name="firstName" label="" placeholder="First Name"></aui:input>

<aui:input name="lastName" label="" placeholder="Last Name"></aui:input>

<aui:input name="emailAddress" label="" placeholder="Email Address"></aui:input>

<aui:input name="dateOfBirth" type="date" label="DOB" ></aui:input>

<aui:input name="jobTitle" label="" placeholder="Job Title"></aui:input>

<aui:input type="file" name="profPict" label="Profile Picture"/>
  <%
  List<Country> countryList = CountryLocalServiceUtil.getCompanyCountries(PortalUtil.getDefaultCompanyId());
  %>
   <aui:select name="countryId" label="Country">
        <aui:option label="Select a Country" value="" />
        <%
        for(Country countryItem : countryList) {
        %>
        <aui:option label="<%=countryItem.getName().toUpperCase()%>" value="<%=countryItem.getCountryId()%>" />
        <% } %>
    </aui:select>
    <aui:select name="regionId" label="Region">
        <aui:option label="Select a Region" value="" />
    </aui:select>
    
 

 
    <aui:button type="submit"></aui:button>


</aui:form>