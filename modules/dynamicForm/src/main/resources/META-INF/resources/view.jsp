<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/init.jsp"%>
<%@ page import="com.liferay.portal.kernel.util.Validator"%>

<p>
	<b><liferay-ui:message key="dynamicform.caption"/></b>
</p>
<aui:button name="resourceurlbtn" value="value" onClick="callResourceUrl();" />
<aui:button-row>
    <aui:button onClick="<%= viewDynamicFormURL.toString() %>" value="View Dynamic Form"></aui:button>
</aui:button-row>


