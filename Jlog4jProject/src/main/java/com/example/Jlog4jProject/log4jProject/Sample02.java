package com.example.Jlog4jProject.log4jProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Sample02 {
	static Logger log = Logger.getLogger(Sample02.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");
		log.error("ErrorOccurs");
		log.debug("Debugging");
		log.fatal("CriticalErrors");
		log.warn("Warning");

	}

}
