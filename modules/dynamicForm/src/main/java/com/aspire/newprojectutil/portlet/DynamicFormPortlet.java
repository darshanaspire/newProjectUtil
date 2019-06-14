package com.aspire.newprojectutil.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.aspire.newprojectutil.constants.DynamicFormPortletKeys;
import com.aspire.newprojectutil.model.Goal;
import com.aspire.newprojectutil.model.Measure;
import com.aspire.newprojectutil.model.Objective;
import com.aspire.newprojectutil.model.Strategy;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author aspire101
 */
@Component(immediate = true,
    property = {"com.liferay.portlet.display-category=category.sample",
        "com.liferay.portlet.instanceable=true", "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/view.jsp",
        "com.liferay.portlet.header-portlet-css=/css/main.css",
        "com.liferay.portlet.footer-portlet-javascript=/js/main.js",
        "javax.portlet.name=" + DynamicFormPortletKeys.DynamicForm,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user"},
    service = Portlet.class)
public class DynamicFormPortlet extends MVCPortlet {

  private static Log log = LogFactoryUtil.getLog(DynamicFormPortlet.class);

  @Override
  public void render(RenderRequest renderRequest, RenderResponse renderResponse)
      throws IOException, PortletException {
    log.info("========= Render method START =========");
    JSONObject responseMap = JSONFactoryUtil.createJSONObject();
    createObjectiveData(renderRequest, renderResponse, responseMap);
    log.info("========= Render method END =========");
    super.render(renderRequest, renderResponse);
  }

  @Override
  public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
      throws IOException, PortletException {
    // TODO Auto-generated method stub

    String action = ParamUtil.getString(resourceRequest, "action");
    JSONObject responseMap = JSONFactoryUtil.createJSONObject();
    switch (action) {
      case "getObjectiveData":
        break;
      default:
        break;
    }
    // resourceResponse.getWriter().print(responseMap.toString());
    log.info("======= This is Serve Resource method =======");
    super.serveResource(resourceRequest, resourceResponse);
  }

  public void createObjectiveData(RenderRequest renderRequest, RenderResponse renderResponse,
      JSONObject responseMap) throws IOException {
    log.info("this is createObjectiveObjectAndReturn =========== STARTS");
    int value = 1;
    Goal goal = new Goal();
    goal.setDescription("This is First Goal.");
    goal.setGoalId(1);
    Objective objective = new Objective();
    objective.setDescription("This is Objective Description.");
    objective.setObjectiveId(1);
    objective.setStrategyList(getStrategyList());
    List<Objective> objectiveList = new ArrayList<>();
    objectiveList.add(objective);
    goal.setObjectiveList(objectiveList);
    log.info("Goal Data -->  " + goal.toString());
    responseMap.put("success", true);
    renderRequest.setAttribute("goal", goal);
    log.info("this is createObjectiveObjectAndReturn =========== ENDS");
  }

  private List<Strategy> getStrategyList() {
    List<Strategy> list = new ArrayList<>();
    Strategy strategy = new Strategy();
    strategy.setStrategyId(1);
    strategy.setDescription("This is First strategy");
    strategy.setMeasureList(getMeasureList());
    list.add(strategy);
    return list;
  }

  private List<Measure> getMeasureList() {
    List<Measure> list = new ArrayList<>();
    Measure measure = new Measure();
    measure.setMeasureId(1);
    measure.setDescription("This is First Measure");
    list.add(measure);
    return list;
  }

}
