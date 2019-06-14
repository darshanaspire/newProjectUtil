package com.aspire.newprojectutil.model;

import java.util.List;

public class Strategy {

	long strategyId;
	String description;
	List<Measure> measureList;

	public long getStrategyId() {
		return strategyId;
	}

	public void setStrategyId(long strategyId) {
		this.strategyId = strategyId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Measure> getMeasureList() {
		return measureList;
	}

	public void setMeasureList(List<Measure> measureList) {
		this.measureList = measureList;
	}

	@Override
	public String toString() {
		return "Strategy [strategyId=" + strategyId + ", description=" + description + ", measureList=" + measureList
				+ "]";
	}

}
