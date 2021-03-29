package com.dnb.etl.parser;

import com.dnb.etl.enums.DataFormatType;

public interface Parser {
	/**
	 * /**
	 * This method does
	 * 1. Reads the data based on format type
	 * 2. Extract required fields
	 * 3. Transforms based on rules
	 * 4. writes the data to out file
	 *
	 * @param format type of data to be parsed
	 */
	void parse(DataFormatType format);
}
