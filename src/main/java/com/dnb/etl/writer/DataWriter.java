package com.dnb.etl.writer;

import com.dnb.etl.model.OutputLog;

public interface DataWriter {
	void write(OutputLog log);
}
