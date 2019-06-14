package com.aspire.newprojectutil.model;

import java.util.List;

public class Goal {

	long goalId;
	String description;
	List<Objective> objectiveList;

	public long getGoalId() {
		return goalId;
	}

	public void setGoalId(long goalId) {
		this.goalId = goalId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Objective> getObjectiveList() {
		return objectiveList;
	}

	public void setObjectiveList(List<Objective> objectiveList) {
		this.objectiveList = objectiveList;
	}

	@Override
	public String toString() {
		return "Goal [goalId=" + goalId + ", description=" + description + ", objectiveList=" + objectiveList + "]";
	}

}
