package com.dnb.etl.extract;

import java.io.IOException;
import java.io.Reader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.dnb.etl.constants.Constants;
import com.dnb.etl.generated.Activity;
import com.dnb.etl.generated.ObjectFactory;
import com.dnb.etl.model.DataActivity;
import com.dnb.etl.model.XMLActivity;
import com.dnb.etl.reader.DataReaderStrategy;

/**
 * XML Data extracter class that extracts data from XML files
 * @author Nagaraju
 *
 */
public class XMLDataExtracter implements DataExtracter {

	private static Logger LOGGER = LoggerFactory.getLogger(DataReaderStrategy.class);
	
	public DataActivity extract(Reader reader) {
		XMLActivity xmlActivity = new XMLActivity();
		try {
			JAXBContext jaxB = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller unmarshall = jaxB.createUnmarshaller();
		    Activity obj = 
		        (Activity)unmarshall.unmarshal(reader);
		    xmlActivity.setUserName(obj.getUserName());
		    xmlActivity.setActivityTypeCode(obj.getActivityTypeCode().longValue());
		    xmlActivity.setLoggedInTime(obj.getLoggedInTime().toString());
		    xmlActivity.setNumber_of_views(obj.getNumberOfViews());
		    xmlActivity.setWebsiteName(obj.getWebsiteName());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	    return xmlActivity;
	}
}
