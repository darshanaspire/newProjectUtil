package com.aspire.newprojectutil.model;

import java.util.List;

public class Objective {

	long objectiveId;
	String description;
	List<Strategy> strategyList;

	public long getObjectiveId() {
		return objectiveId;
	}

	public void setObjectiveId(long objectiveId) {
		this.objectiveId = objectiveId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Strategy> getStrategyList() {
		return strategyList;
	}

	public void setStrategyList(List<Strategy> strategyList) {
		this.strategyList = strategyList;
	}

	@Override
	public String toString() {
		return "Objective [objectiveId=" + objectiveId + ", description=" + description + ", strategyList="
				+ strategyList + "]";
	}

}
