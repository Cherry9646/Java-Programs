package com.Utility;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class facebooklog {

	public static Logger log = Logger.getLogger("facebooklog");
	
	public static void info(String Message) {
		
PropertyConfigurator.configure("C:\\Users\\Cherry\\eclipse-workspace\\firstproject1\\Log4j.properties");
	log.info(Message);
	}
	
}
