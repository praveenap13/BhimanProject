package com.bhiman.util;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseTest {

	private static final Logger LOG = Logger.getLogger(SeleniumBaseTest.class);
	PropertyUtil prop = new PropertyUtil();

	@Before
	public void launchApplication() throws IOException {
		switch (Config.getBrowserName()) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			Constants.driver.manage().window().maximize();
			break;
		case "Firefox":
			break;
		case "IE":
			break;
		default:
			break;

		}
		Constants.driver.get(prop.getAppUrl());

	}

	@After
	public void tearDown() throws Exception {
		Constants.driver.quit();
		LOG.info("Closed all browser window...");
	}

}
