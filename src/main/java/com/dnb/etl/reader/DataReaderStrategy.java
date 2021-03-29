package com.dnb.etl.reader;

import java.io.Reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.dnb.etl.enums.DataFormatType;

@Component
public class DataReaderStrategy {

	private static Logger LOGGER = LoggerFactory.getLogger(DataReaderStrategy.class);
	
	public Reader read(DataFormatType formatType) {
		switch(formatType) {
		case JSON:
			return new JsonDataReader().read();
		case XML:
			return new XMLDataReader().read();
		default:
			LOGGER.info("We are currently not supporting this type of formats");
			return null;
		}
	}

}
