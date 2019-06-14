<%@ include file="/init.jsp"%>
<div class="hide" id="isDynamicFormPage">true</div>
<html>
<body>
	<hr>
	${goal}
	<hr>
	<%-- ${editProcess} --%>
	<aui:form action="action" method="post" name="name">
		<c:forEach item="goal" var="goal">
			<aui:field-wrapper label="label">
				<aui:input name="name" type="type" value="value" />
			</aui:field-wrapper>
		</c:forEach>
	</aui:form>
</body>
</html>



