package com.dnb.etl.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.dnb.etl.model.OutputLog;
import com.google.gson.Gson;

@Component
public class LogDataWriter implements DataWriter {

	
	@Override
	public void write(OutputLog log) {
		try {
			FileWriter writer = new FileWriter("src/main/resources/output/output.json");
			BufferedWriter bfrWtr = new BufferedWriter(writer);
			bfrWtr.write(new Gson().toJson(log));
			bfrWtr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
