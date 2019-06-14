package com.aspire.newprojectutil.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.aspire.newprojectutil.constants.DynamicFormPortletKeys;
import com.aspire.newprojectutil.util.MessageUtils;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(property = { "javax.portlet.name=" + DynamicFormPortletKeys.DynamicForm,
		"mvc.command.name=/editDynamicForm" }, service = MVCActionCommand.class)

public class EditDynamicForm extends BaseMVCActionCommand {
	private static Log log = LogFactoryUtil.getLog(EditDynamicForm.class.getName());

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		log.info("This is Edit dynamic Form");
		String isViewEdit = ParamUtil.getString(actionRequest, "isViewEdit");
		actionRequest.setAttribute("isViewEdit", isViewEdit);
		actionResponse.setRenderParameter("jspPage", "/create-CBSecondary.jsp");
		MessageUtils.hideDefualtSuccessMessage(actionRequest);
	}
}
