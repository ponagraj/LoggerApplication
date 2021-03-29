package com.dnb.etl.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivityRule {
	
	private Long activityCode;
	
	private String activityDescription;
	
	public ActivityRule(Long code, String desc) {
		this.activityCode = code;
		this.activityDescription = desc;
	}
}
