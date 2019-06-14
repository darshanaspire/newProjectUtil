package com.aspire.newprojectutil.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.aspire.newprojectutil.constants.DynamicFormPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

@Component(property = { "javax.portlet.name=" + DynamicFormPortletKeys.DynamicForm,
		"mvc.command.name=/viewDynamicForm" }, service = MVCActionCommand.class)

public class viewDynamicForm extends BaseMVCActionCommand {
	private static Log log = LogFactoryUtil.getLog(viewDynamicForm.class.getName());

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		log.info("This is viewDynamicForm");

	}
}
