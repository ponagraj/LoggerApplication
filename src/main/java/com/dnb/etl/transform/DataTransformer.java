package com.dnb.etl.transform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dnb.etl.model.DataActivity;
import com.dnb.etl.model.ActivityRule;
import com.dnb.etl.model.JsonActivity;
import com.dnb.etl.model.OutputLog;
import com.dnb.etl.model.XMLActivity;
import com.dnb.etl.reader.DataReaderStrategy;

@Component
public class DataTransformer implements Transformer {

	@Autowired
	private TransformRules rules;
	
	private static Logger LOGGER = LoggerFactory.getLogger(DataTransformer.class);
	
	@Override
	public OutputLog transform(DataActivity activity) {
		OutputLog log = new OutputLog();
		
		if(activity == null) {
			return log;
		}
		log.setUser(activity.getUserName());
		log.setWebsite(activity.getWebsiteName());
		if(activity instanceof JsonActivity) {
			log.setActivityTypeDescription(((JsonActivity)activity).getActivityTypeDescription());
			log.setSignedInTime(((JsonActivity)activity).getSignedInTime());
		} else if(activity instanceof XMLActivity) {
			ActivityRule value = rules.getRules().get(((XMLActivity)activity).getActivityTypeCode());
			if(value == null) {
				LOGGER.info("activity code is not present in the rules");
			} else {
				log.setActivityTypeDescription(value.getActivityDescription());
				log.setSignedInTime(((XMLActivity)activity).getLoggedInTime());
			}
		}
		return log;
	}

}
