package com.dnb.etl.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.google.gson.JsonParser;

public class XMLDataReader implements DataReader {

	private static Logger LOGGER = LoggerFactory.getLogger(JsonDataReader.class);
	
	public Reader read() {
		try {
			//TODO
			//1. remove file harding. 
			//2. Update the logic to read from a folder instead of file.
			//3. Pass the fileName from the caller
			FileReader file = new FileReader("src/main/resources/input/XML/input_data_xml.xml");
			Reader xmlReader = new BufferedReader(file);
			boolean isValid = validateFile(xmlReader);
			if(isValid) {
				return xmlReader;
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
		return true;
	}

}
