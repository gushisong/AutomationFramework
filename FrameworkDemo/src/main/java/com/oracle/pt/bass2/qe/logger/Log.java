package com.oracle.pt.bass2.qe.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log {
	
	private Logger logger;

	public Log(final Class<?> clazz) {
		// TODO Auto-generated constructor stub
		logger=LogManager.getLogger(clazz);
	}

	public void trace(String message) {
		logger.trace(message);
	}
	
	public void debug(String message) {
		logger.debug(message);
	}
	
	public void info(String message) {
		logger.info(message);
	}
	
	public void warn(String message) {
		logger.warn(message);
	}
	
	public void error(String message) {
		logger.error(message);
	}
	
	public void fatal(String message) {
		logger.fatal(message);
	}
}
