package com.dnb.etl.reader;

import java.io.Reader;

import com.dnb.etl.enums.DataFormatType;

public interface DataReader {
	
	/**
	 * This methods reads the file and returns reader
	 * @return
	 */
	Reader read();
	
	/**
	 * This method validates the file before doing ETL on it
	 * @param data
	 * @return
	 */
	boolean validateFile(Reader data);
}
