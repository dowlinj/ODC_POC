<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>

<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.doc.guestbook.model.Guestbook" %>
<%@ page import="com.liferay.doc.guestbook.model.Entry" %>
<%@ page import="com.liferay.doc.guestbook.service.EntryLocalServiceUtil" %>
<%@ page import="com.liferay.doc.guestbook.service.GuestbookLocalServiceUtil" %>

<portlet:defineObjects />
<theme:defineObjects />

<%
    long guestbookId = Long.valueOf((Long) renderRequest
            .getAttribute("guestbookId"));
%>

<aui:nav cssClass="nav-tabs">

    <%
        List<Guestbook> guestbooks = GuestbookLocalServiceUtil
                    .getGuestbooks(scopeGroupId);
            for (int i = 0; i < guestbooks.size(); i++) {
                Guestbook curGuestbook = (Guestbook) guestbooks.get(i);

                String cssClass = StringPool.BLANK;

                if (curGuestbook.getGuestbookId() == guestbookId) {
                    cssClass = "active";
                }
    %>

    <portlet:renderURL var="viewPageURL">
        <portlet:param name="mvcPath" value="/html/guestbook/view.jsp" />
        <portlet:param name="guestbookId"
            value="<%=String.valueOf(curGuestbook.getGuestbookId())%>" />
    </portlet:renderURL>

    <aui:nav-item cssClass="<%=cssClass%>" href="<%=viewPageURL%>"
        label="<%=HtmlUtil.escape(curGuestbook.getName())%>" />

    <%
        }
    %>

</aui:nav>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addGuestbookURL">
        <portlet:param name="mvcPath"
            value="/html/guestbook/edit_guestbook.jsp" />
    </portlet:renderURL>

    <portlet:renderURL var="addEntryURL">
        <portlet:param name="mvcPath" value="/html/guestbook/edit_entry.jsp" />
        <portlet:param name="guestbookId"
            value="<%=String.valueOf(guestbookId)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%=addGuestbookURL.toString()%>" value="Add Guestbook" />
    <aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry" />

</aui:button-row>

<liferay-ui:search-container
        total="<%=EntryLocalServiceUtil.getEntries(scopeGroupId,guestbookId).size()%>">
    <liferay-ui:search-container-results
        results="<%=EntryLocalServiceUtil.getEntries(scopeGroupId,
                        guestbookId, searchContainer.getStart(),
                        searchContainer.getEnd())%>" />

    <liferay-ui:search-container-row
        className="com.liferay.doc.guestbook.model.Entry" modelVar="entry">

        <liferay-ui:search-container-column-text property="message" />

        <liferay-ui:search-container-column-text property="name" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
