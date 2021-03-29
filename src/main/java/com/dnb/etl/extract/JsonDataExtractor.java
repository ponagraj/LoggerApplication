package com.dnb.etl.extract;

import java.io.Reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dnb.etl.model.DataActivity;
import com.dnb.etl.model.JsonFileActivity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Json Data Extractor for extracting data from json files
 * @author Nagaraju
 *
 */
public class JsonDataExtractor implements DataExtracter {
	
	private static Logger LOGGER = LoggerFactory.getLogger(JsonDataExtractor.class);
	
	@Override
	public DataActivity extract(Reader reader) {
		JsonParser parser = new JsonParser();
		JsonElement jsonEle = parser.parse(reader);
		Gson gson = new Gson();
		JsonFileActivity activity = gson.fromJson(jsonEle, JsonFileActivity.class);
		return activity.getActivity();
	}

}
