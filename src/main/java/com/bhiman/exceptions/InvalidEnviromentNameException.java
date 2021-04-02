package com.bhiman.exceptions;
import org.apache.log4j.Logger;

public class InvalidEnviromentNameException extends RuntimeException {
	private static final Logger LOG=Logger.getLogger(InvalidEnviromentNameException.class);
	private String environmentname;
	public InvalidEnviromentNameException(String environmentname ){
		System.out.println("Invalid Environment name is "+environmentname);
		
	}
      public String getMessage() {
    	  LOG.info("Please specify environment property -Denv");
    	  return environmentname+"Please specify environment property -Denv ";
      }
      
      
}


