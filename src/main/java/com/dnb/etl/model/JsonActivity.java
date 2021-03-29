package com.dnb.etl.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonActivity extends DataActivity {
	private String activityTypeDescription;
	private String signedInTime;
	
	private JsonActivity activity;
}
