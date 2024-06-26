<%@page import="com.liferay.portal.kernel.search.Document"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.search.Field"%>
<%@page import="java.util.Map"%>
<%@page import="com.guestbook.model.Guestbook"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.guestbook.service.GuestbookLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.guestbook.service.GuestbookEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.search.Hits"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.search.IndexerRegistryUtil"%>
<%@page import="com.guestbook.model.GuestbookEntry"%>
<%@page import="com.liferay.portal.kernel.search.SearchContextFactory"%>
<%@page import="com.liferay.portal.kernel.search.Indexer"%>
<%@page import="com.liferay.portal.kernel.search.SearchContext"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@include file="../init.jsp"%>

<%
  String keywords = ParamUtil.getString(request, "keywords");
  long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");
%>
<portlet:renderURL var="searchURL">
	<portlet:param name="mvcPath" 
	value="/guestbook/view_search.jsp" />
</portlet:renderURL>
<portlet:renderURL var="viewURL">
	<portlet:param 
		name="mvcPath" 
		value="/guestbook/view.jsp" 
	/>
</portlet:renderURL>
<aui:form action="${searchURL}" name="fm">

	<liferay-ui:header backURL="${viewURL}" title="back" />

	<div class="row">
		<div class="col-md-8">
			<aui:input inlineLabel="left" label="" name="keywords" placeholder="search-entries" size="256" />
		</div>

		<div class="col-md-4">
			<aui:button type="submit" value="search" />
		</div>
	</div>
</aui:form>

<%
	SearchContext searchContext = SearchContextFactory.getInstance(request);

	searchContext.setKeywords(keywords);
	searchContext.setAttribute("paginationType", "more");
	searchContext.setStart(0);
	searchContext.setEnd(10);

    Indexer<GuestbookEntry> indexer = IndexerRegistryUtil.getIndexer(GuestbookEntry.class);

    Hits hits = indexer.search(searchContext);

    List<GuestbookEntry> entries = new ArrayList<GuestbookEntry>();

    for (int i = 0; i < hits.getDocs().length; i++) {
			Document doc = hits.doc(i);

			long entryId = GetterUtil
			.getLong(doc.get(Field.ENTRY_CLASS_PK));

			GuestbookEntry entry = null;

			try {
					entry = GuestbookEntryLocalServiceUtil.getGuestbookEntry(entryId);
			} catch (PortalException pe) {
					_log.error(pe.getLocalizedMessage());
			} catch (SystemException se) {
					_log.error(se.getLocalizedMessage());
			}

			entries.add(entry);
	}

	List<Guestbook> guestbooks = GuestbookLocalServiceUtil.getGuestbooks(scopeGroupId);

	Map<String, String> guestbookMap = new HashMap<String, String>();

	for (Guestbook guestbook : guestbooks) {
			guestbookMap.put(Long.toString(guestbook.getGuestbookId()), guestbook.getName());
	}
%>

<liferay-ui:search-container delta="10" 
	emptyResultsMessage="no-entries-were-found" 
	total="<%= entries.size() %>">
		<liferay-ui:search-container-results
				results="<%= entries %>"
/>

	<liferay-ui:search-container-row
			className="com.guestbook.model.GuestbookEntry"
			keyProperty="entryId" modelVar="entry" escapedModel="<%=true%>">

        <liferay-ui:search-container-column-text name="guestbook"
            value="<%=guestbookMap.get(Long.toString(entry.getGuestbookId()))%>" />

        <liferay-ui:search-container-column-text property="message" />

        <liferay-ui:search-container-column-text property="name" />
        
        <liferay-ui:search-container-column-jsp
            path="/guestbook/entry_actions.jsp"
            align="right" />
   </liferay-ui:search-container-row>
   
   <liferay-ui:search-iterator />

</liferay-ui:search-container>

<%!
	private static Log _log = LogFactoryUtil.getLog("html.guestbook.view_search_jsp");
%>