package com.bhiman.util;

import java.io.FileNotFoundException;
import org.apache.log4j.Logger;

public class Config {
	private static final Logger LOG=Logger.getLogger(Config.class);
   public static String getBrowserName() throws FileNotFoundException {
	   PropertyUtil prop=new PropertyUtil();
	  String browser= prop.getProperty("browser.name");
	  LOG.info("Lauching brawser  ...");
	 return browser;   
   }
   
   public static String getAppUrl() throws FileNotFoundException {
	   PropertyUtil prop=new PropertyUtil();
	   String url= prop.getProperty("application.beta.url");
		  LOG.info("Lauching brawser  ..."+ url);
	  return  prop.getProperty(url);
	    
   }
	
	
}

