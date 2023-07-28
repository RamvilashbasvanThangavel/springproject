package com.example.Jlog4jProject.log4jProject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {
	static Logger log = Logger.getLogger(Sample.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Information");
		log.error("ErrorOccurs");
		log.debug("Debugging");
		log.fatal("CriticalErrors");
		log.warn("Warning");

	}

}
