package com.dnb.etl.parser;

import java.io.IOException;
import java.io.Reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dnb.etl.enums.DataFormatType;
import com.dnb.etl.extract.DataExtractorStrategy;
import com.dnb.etl.model.DataActivity;
import com.dnb.etl.model.OutputLog;
import com.dnb.etl.reader.DataReaderStrategy;
import com.dnb.etl.transform.DataTransformer;
import com.dnb.etl.writer.DataWriter;

@Component
/**
 * This class parses the input files based on the
 * format type, does etl and write to the out file
 * @author Nagaraju
 *
 */
public class DataParser implements Parser {

	//reader strategy file to read based on format type
	@Autowired
	private DataReaderStrategy readerStrategy;
	
	//extracter strategy file to read based on format type
	@Autowired
	private DataExtractorStrategy extracterStrategy;
	
	//transforms the data
	@Autowired
	private DataTransformer transformer;
	
	//data writer to out file
	@Autowired
	private DataWriter writer;
	
	private static Logger LOGGER = LoggerFactory.getLogger(DataReaderStrategy.class);
	
	/**
	 * This method does
	 * 1. Reads the data based on format type
	 * 2. Extract required fields
	 * 3. Transforms based on rules
	 * 4. writes the data to out file
	 */
	public void parse(DataFormatType format) {
		//1. read data
		Reader reader = readerStrategy.read(format);
		if(reader == null) {
			LOGGER.info("Reader empty, cannot do ETL");
			return;
		}
		//2. extract the necessary info
		DataActivity activity = extracterStrategy.extract(format, reader);

		//3. transform the data
		OutputLog log = transformer.transform(activity);
		
		//4. load the data
		writer.write(log);
	}
}
