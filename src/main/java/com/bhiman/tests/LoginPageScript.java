// package com.bhiman.tests;
//
// import java.io.IOException;
// import org.apache.log4j.Logger;
// import org.testng.annotations.Test;
// import com.bhiman.keywords.UIKeywords;
// import com.bhiman.keywords.WaitForElement;
// import com.bhiman.pages.LoginPage;
// import com.bhiman.pages.LoginPageTest;
// import com.bhiman.setup.SeleniumBase;
// import com.bhiman.util.Locator;
//
// public class LoginPageScript extends SeleniumBase{
// private static Logger LOG = Logger.getLogger(LoginPageTest.class);
//
// @Test
// public void tc_01() throws IOException {
// LOG.info("searching mobile number");
// LoginPage loginpage = new LoginPage();
// loginpage.enterMobileNumber("9876543210");
// loginpage.enterPassword("admin");
// WaitForElement.elementToBePresent(loginpage.loginBtn);
// loginpage.clickOnLoginBtn();
// }
// }
