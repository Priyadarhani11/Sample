<%@page import="com.guestbook.service.GuestbookEntryLocalServiceUtil"%>
<%@page import="com.guestbook.model.GuestbookEntry"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="../init.jsp" %>

<%
 long entryId = ParamUtil.getLong(renderRequest, "entryId");
GuestbookEntry entry = null;
if (entryId > 0) {
	entry = GuestbookEntryLocalServiceUtil.getGuestbookEntry(entryId);
}

long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");
%>
<portlet:resourceURL var="myResourceURL">
            </portlet:resourceURL>
<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/guestbook/view.jsp"></portlet:param>
</portlet:renderURL>
<portlet:actionURL name="/addEntry" var="addEntryURL" >
</portlet:actionURL>
<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">
<aui:model-context bean="<%= entry %>" model="<%= GuestbookEntry.class %>" />
<aui:fieldset>
<aui:input name="name" label="enter-name"/>
<aui:input name="email" label="enter-email" id="emailID"/>
<aui:input name="message" label="enter-message"/>
<aui:input name="mobile" label="enter-mobile" />
<aui:input name="entryId" type="hidden"/>
<aui:input name="guestbookId" type="hidden" value='<%= entry == null ? guestbookId : entry.getGuestbookId() %>'/>
</aui:fieldset>
<aui:button-row>
<aui:button type="submit"></aui:button>
<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
</aui:button-row>
</aui:form>
<script>
$('#emailavailable').hide();
$('#mobileAvailable').hide();
$("#<portlet:namespace/>emailID").on( "change", function() {
	var email = $('#<portlet:namespace/>emailID').val();
	console.log("Entered email:::"+email);
	  $.ajax({
		  async : false,
		  cache: false,
		  data : {
			  <portlet:namespace/>emailId: email
		  },
		  url: '${myResourceURL}',
		  success: function(result){
			  var response = JSON.parse(result);
		  console.log("result availability:::::::"+response[0].availability);
		  if(response[0].availability == "yes") {
			  alert('Great! Email is available to use.');
		  } else if (response[0].availability == "no"){
			  alert('Sorry! Email is taken');
		  }
	  }});
	});
	
$("#<portlet:namespace/>mobileID").on("change", function() {
	var mobile = $('#<portlet:namespace/>mobileID').val();
	console.log("Entered mobile:::" + mobile);
	$.ajax({
		async: false,
		cache: false,
		data: {
			'<portlet:namespace/>mobileId': mobile
		},
		url: '${mobileResourceURL}',
		success: function(result) {
			var response = JSON.parse(result);
			console.log("Mobile availability:::::::" + response[0].availability);
			if(response[0].availability == "yes") {
				$('#mobileAvailable').show().text('Great! Mobile is available to use.');
			} else if (response[0].availability == "no") {
				$('#mobileAvailable').show().text('Sorry! Mobile is taken.');
			}
		}
	});
});
</script>





