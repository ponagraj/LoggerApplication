package com.dnb.etl.transform;

import com.dnb.etl.model.DataActivity;
import com.dnb.etl.model.OutputLog;

public interface Transformer {
	OutputLog transform(DataActivity activity);
}
