package com.dnb.etl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dnb.etl.enums.DataFormatType;
import com.dnb.etl.parser.DataParser;

@SpringBootApplication
public class LoggerApplication {

	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);
		DataParser parser = context.getBean(DataParser.class);
		parser.parse(DataFormatType.XML);
	}
	
/**
 * TODOs to make it production ready application
1. Solve all the TODOs in the code.
2. Better exception handling. Create custom handlers with error codes.
3. Move the constants to contant files
4. Better logging to make it easy to debug. Classification of logging. Use info for user information related, error for any exception related.
5. Decide on whether to move forward or halt in case of errrors.
6. The data readers are harded to files. There can be multiple files which means folders. Need to change the logic based on requirement.
7. Can there be combination of json and xml files in the input path? => if so, a mechanism to identify the files and then do processing accordingly. (typically, based on file extension)
8. More and more comments for each of the classes, fields, methods etc.
9. Unit test code coverage covering all corner cases. 
 */

}
