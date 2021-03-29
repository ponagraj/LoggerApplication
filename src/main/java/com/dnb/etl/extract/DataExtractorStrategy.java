package com.dnb.etl.extract;

import java.io.Reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.dnb.etl.enums.DataFormatType;
import com.dnb.etl.model.DataActivity;

/**
 * This class extracts the data based on format type
 * @author Nagaraju
 *
 */
@Component
public class DataExtractorStrategy {

	private static Logger LOGGER = LoggerFactory.getLogger(DataExtractorStrategy.class);
	
	/**
	 * Extracts the data from reader based on format type
	 * @param formatType data format type
	 * @param reader Buffered Reader
	 * @return class Activity
	 */
	public DataActivity extract(DataFormatType formatType, Reader reader) {
		switch(formatType) {
		case JSON:
			return new JsonDataExtractor().extract(reader);
		case XML:
			return new XMLDataExtracter().extract(reader);
		default:
			LOGGER.info("We are currently not supporting this type of formats");
			return null;
		}
	
	}
}
