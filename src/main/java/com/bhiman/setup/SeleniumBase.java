// package com.bhiman.setup;
//
// import java.io.IOException;
// import java.util.concurrent.TimeUnit;
//
// import org.apache.log4j.Logger;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
//
// import com.bhiman.util.Constants;
// import com.bhiman.util.PropertyUtil;
//
// import io.github.bonigarcia.wdm.WebDriverManager;
//
// public class SeleniumBase {
// private static final Logger LOG = Logger.getLogger(SeleniumBase.class);
// PropertyUtil prop = new PropertyUtil();
//
// @BeforeMethod
// public void setup() throws IOException {
// PropertyUtil prop = new PropertyUtil();
// switch (prop.getBrowserName()) {
//
// case "Chrome":
// LOG.info("Launching chrome browser...");
// WebDriverManager.chromedriver().setup();
// Constants.driver = new ChromeDriver();
//
// break;
// case "Edge":
// LOG.info("Launching edge browser...");
// WebDriverManager.edgedriver().setup();
// Constants.driver = new EdgeDriver();
//
// break;
// default:
// LOG.error("Invalid browser name");
// break;
// }
// Constants.driver.get(prop.getAppUrl());
// Constants.driver.manage().window().maximize();
// Constants.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
// }
//
// @AfterMethod
// public void tearDown() {
//
// }
// /*
// * public WebDriver getDriver() { if(Constants.driver.equals(null)) { throw
// new
// * NullPointerException("driver instance is not initialized"); } return
// * Constants.driver; }
// */
// }
