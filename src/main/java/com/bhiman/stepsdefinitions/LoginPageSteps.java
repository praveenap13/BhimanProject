package com.bhiman.stepsdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitForElement;
import com.bhiman.pages.LoginPage;
import com.bhiman.util.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private static final Logger LOG=Logger.getLogger(LoginPageSteps.class);
	LoginPage login =new LoginPage();
/*
	@Before
	public void launchApplication() throws IOException {
		UIKeywords keywords=new UIKeywords();
	    keywords.openBrowser();
	    keywords.openUrl();
		
	}
	*/
	@Given("user enters {string} as username.")
	public void user_enters_username(String username) {
		   login.enterMobileNumber(username);
	}
	
	@And("user enters {string} as password.")
	public void user_enters_password(String password) {
	   login.enterPassword(password);
	}
	@When("click on login button.")
	public void clickOnloginbutton() {
		login.clickOnLoginBtn();
	}

}
