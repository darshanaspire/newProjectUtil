package com.aspire.newprojectutil.model;

import java.util.List;

public class Measure {

	long measureId;
	String description;

	public long getMeasureId() {
		return measureId;
	}

	public void setMeasureId(long measureId) {
		this.measureId = measureId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Measure [measureId=" + measureId + ", description=" + description + "]";
	}

}
