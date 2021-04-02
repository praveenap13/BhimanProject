package com.bhiman.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.bhiman.keywords.WaitForElement;
import com.bhiman.util.Constants;

public class LoginPage {
	private static final Logger LOG = Logger.getLogger(LoginPage.class);
	private By mobileTxtbx = By.cssSelector("#username");
	private By passwordtxtBx = By.cssSelector("#password");
	public By loginBtn = By.cssSelector("button[type='submit']");// button[contains(text(),'Login')]

	public void enterMobileNumber(String mobileNumber) {
		Constants.driver.findElement(mobileTxtbx).sendKeys(mobileNumber);
	}

	public void enterPassword(String password) {
		Constants.driver.findElement(passwordtxtBx).sendKeys(password);
	}

	public void clickOnLoginBtn() {
		Constants.driver.findElement(loginBtn).click();
		WaitForElement.pageLoadTime(20);
		LOG.info("Clicked on login button");
	}

}
