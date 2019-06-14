package com.aspire.newprojectutil.util;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * Provide session related utility methods
 * 
 * @author aspire101
 */
public class MessageUtils {

	/**
	 * @param requestParam
	 * @param message
	 * @param request
	 */
	public static void saveError(String requestParam, String message, PortletRequest request) {
		request.setAttribute(requestParam, message);
		SessionErrors.add(request, requestParam);
		hideDefualtErrorMessage(request);
	}

	/**
	 * @param requestParam
	 * @param message
	 * @param request
	 */
	public static void saveMessage(String requestParam, String message, PortletRequest request) {
		request.setAttribute(requestParam, message);
		SessionMessages.add(request, requestParam);
		hideDefualtSuccessMessage(request);
	}

	/**
	 * Hide default message
	 * 
	 * @param request
	 */
	public static void hideDefualtErrorMessage(PortletRequest request) {
		SessionMessages.add(request,
				PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/**
	 * Hide Default success message
	 * 
	 * @param request
	 */
	public static void hideDefualtSuccessMessage(PortletRequest request) {
		SessionMessages.add(request,
				PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
}
