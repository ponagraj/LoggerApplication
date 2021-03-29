package com.dnb.etl.model;

import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class XMLActivity extends DataActivity {
	private Long activityTypeCode;
	//Need to convert loggedInTime to Time Obj
	private String loggedInTime;
	private BigInteger number_of_views;
}
