package com.dnb.etl.transform;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.dnb.etl.model.ActivityRule;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import lombok.Getter;

@Component
public class TransformRules {
	
	@Getter
	private Map<Long, ActivityRule> rules = new HashMap<>();
	
	@PostConstruct
	public void init() {
		try {
			FileReader reader = new FileReader("src/main/resources/rules/activity.csv");
			CSVReader csvReader = new CSVReader(reader);
			String[] line = null;
			//TODO need to find better way to skip header
			//skipping header
			line = csvReader.readNext();
			while((line = csvReader.readNext()) != null) {
				//Handling of NPE
				Long code = Long.parseLong(line[0]);
				String desc = line[1];
				rules.put(code, new ActivityRule(code, desc));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
