<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />


<portlet:resourceURL var="resourceURL"></portlet:resourceURL>
<div class="hide" id="resourceURL">${resourceURL}</div>

<portlet:renderURL var="viewDynamicFormURL">
	<portlet:param name="mvcPath" value="/jsp/dynamicForm.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="viewDynamicFormURL">
	<portlet:param name="mvcPath" value="/jsp/dynamicForm.jsp"></portlet:param>
</portlet:renderURL>



<portlet:resourceURL var="getObjectiveDataURL">
	<portlet:param name="action" value="getObjectiveData"></portlet:param>
</portlet:resourceURL>
<div class="hide" id="getObjectiveDataURL">${getObjectiveDataURL}</div>
