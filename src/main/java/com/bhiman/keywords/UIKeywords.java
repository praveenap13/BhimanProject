package com.bhiman.keywords;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.bhiman.util.Constants;
import com.bhiman.util.PropertyUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	private static final Logger LOG=Logger.getLogger(UIKeywords.class);
	PropertyUtil prop=new PropertyUtil();
	public void openBrowser() throws IOException {

		String browsername= prop.getBrowserName();
		switch(browsername) {
		case "Chrome":
			openChrome();
			break;
		case "Edge":
			openEdge();
			
			break;
			default:
				System.out.println("Invalid browser");
				break;
		}
	}

	public void openChrome() {
		LOG.info("opening chorme browser");
		WebDriverManager.chromedriver().setup();
		Constants.driver=new ChromeDriver();
		Constants.driver.manage().window().maximize();
	}
	public void openEdge() {
		LOG.info("opening Edge browser");
		WebDriverManager.chromedriver().setup();
		Constants.driver=new EdgeDriver();
		Constants.driver.manage().window().maximize();
	}
	
	public void openUrl() throws IOException {
		String url=prop.getAppUrl();
		Constants.driver.get(url);
	}

	public void click(WebElement element) {
		LOG.info("Clicking on element "+element);
		element.click();	
	}
	public void click(By by) {
		Constants.driver.findElement(by).click();
	}
	/*
	public void enterText(WebElement element,String text) {
		LOG.info("Entering text "+text+"in element "+element.getText());	
		element.sendKeys(text);
	}
	*/
	public void enterText(By by,String text) {
		LOG.info("Entering text in element "+text);
		
		Constants.driver.findElement(by).sendKeys(text);
		
	}
	
	
	
}
