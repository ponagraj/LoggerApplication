package com.dnb.etl.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonDataReader implements DataReader {

	private static Logger LOGGER = LoggerFactory.getLogger(JsonDataReader.class);
	
	public Reader read() {
		try {
			//TODO
			//1. remove file harding. 
			//2. Update the logic to read from a folder instead of file.
			//3. Pass the fileName from the caller
			FileReader file = new FileReader("src/main/resources/input/JSON/input_data_json.json");
			Reader jsonReader = new BufferedReader(file);
			boolean isValid = validateFile(jsonReader);
			if(isValid) {
				return jsonReader;
			} else {
				return null;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean validateFile(Reader json){
		 //TODO we should always catch/throw specfic exceptions 
		//to get more info about the exception and useful for debugging.
		try {
			JsonParser parser = new JsonParser();
			//JsonElement jsonEle = parser.parse(json);
			//LOGGER.info("File Validated: " +jsonEle);
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

}
