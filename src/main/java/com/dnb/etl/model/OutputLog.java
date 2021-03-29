package com.dnb.etl.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutputLog {
	private String user;
	
	private String website;
	
	private String activityTypeDescription;
	
	private String signedInTime;
}
