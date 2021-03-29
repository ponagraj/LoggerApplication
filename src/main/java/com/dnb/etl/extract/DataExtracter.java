package com.dnb.etl.extract;

import java.io.Reader;

import com.dnb.etl.model.DataActivity;

/**
 * This interface helps in extracting data from given reader
 * @author Nagaraju
 *
 */
public interface DataExtracter {
	/**
	 * Extract the data from reader
	 * @param reader Buffered Reader
	 * @return activity class
	 */
	DataActivity extract(Reader reader);
}
