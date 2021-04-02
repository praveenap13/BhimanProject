package com.bhiman.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

import com.bhiman.exceptions.InvalidEnviromentNameException;

public class PropertyUtil {
	private static final Logger LOG=Logger.getLogger(PropertyUtil.class);
	
	public String getProperty(String key) throws FileNotFoundException {
		Properties prop=loadApplicationProperties();
		return prop.getProperty(key);
	}
	public String getApplicationUrl() throws FileNotFoundException{
		Properties  prop=loadApplicationProperties();
		LOG.info("Launching url.."+prop.getProperty("url"));
		return prop.getProperty("url");
		
	}
	public Properties loadApplicationProperties() throws FileNotFoundException {
		String dir=System.getProperty("user.dir");
		FileInputStream file=new FileInputStream(dir+"/src/main/resources/application.properties");
		Properties prop=new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			LOG.info("Unable to read application.properties");
			e.printStackTrace();
		}
		return prop;	
	}
	public String getLocator(String key) throws IOException  {
		return getValue("OR.properties",key);	
	}
	public String getBrowserName() throws IOException {
	   String browserName=  getValue("application.properties","browser.name");
		return browserName;
	}
	public String getAppUrl() throws IOException {
		String url;
		String env=System.getProperty("env");
		if(env.equals(null)||env.isEmpty()) {
			LOG.error("Please specify enviroment property -Denv");
			throw new InvalidEnviromentNameException(env);
		}
		LOG.info("Executing test on"+env+" environment");
		url=getValue("application.properties","application."+env+".url");
		LOG.info("Launching url..."+url);
		return url;
	}
	
	public String getValue(String fileName,String key) throws IOException {
		String dir=System.getProperty("user.dir");
		System.out.println(dir);
		FileInputStream fis=null;
		try {
		fis=new FileInputStream(dir+"/src/main/resources/"+fileName);
		} catch (FileNotFoundException e) {
			System.err.println(fileName +" file not found ");
			//e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Unable to load "+fileName);
		}finally {
			fis.close();
		}
		return prop.getProperty(key);
		
		
	}
	
	
	
}
