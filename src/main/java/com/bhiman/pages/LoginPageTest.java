// package com.bhiman.pages;
//
// import java.io.IOException;
//
// import org.apache.log4j.Logger;
// import org.openqa.selenium.By;
// import org.testng.annotations.Test;
//
// import com.bhiman.keywords.UIKeywords;
// import com.bhiman.keywords.WaitForElement;
// import com.bhiman.setup.SeleniumBase;
// import com.bhiman.util.Locator;
// import com.bhiman.util.PropertyUtil;
//
//
//
// public class LoginPageTest extends SeleniumBase {
// private static Logger LOG=Logger.getLogger(LoginPageTest.class);
// @Test
// public void tc_01() throws IOException {
// UIKeywords keyword =new UIKeywords();
// LOG.info("searching mobile number");
// WaitForElement.fluentWait(Locator.getLoginpagemobileTxtbx());
//
// keyword.enterText(Locator.getLoginpagemobileTxtbx(), "9876543210");
// LOG.info("searchinh password");
// keyword.enterText(Locator.getLoginpagepasswordtxtBx(), "admin");
// LOG.info("searchitry to click login btn");
// keyword.click(Locator.getLoginpageloginBtn());
//
// }
//
// }
