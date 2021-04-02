package com.bhiman.util;

import java.io.IOException;
import org.openqa.selenium.By;

public class Locator {
	private static PropertyUtil prop=new PropertyUtil();
	private static String loginpagemobileTxtbx;
    private static String loginpagepasswordtxtBx;
    private static String loginpageloginBtn;

	public static  By getLoginpagemobileTxtbx() {
		setLoginpagemobileTxtbx();
		By by=By.xpath("loginpagemobileTxtbx");
		return by;
	}
	public  static void setLoginpagemobileTxtbx() {
		try {    
			loginpagemobileTxtbx = prop.getLocator("loginpage.xpath.mobileTxtbx");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	public static By getLoginpagepasswordtxtBx() {
		setLoginpagepasswordtxtBx();
		By by=By.cssSelector("loginpagepasswordtxtBx");
		return by;
	}
	public  static void setLoginpagepasswordtxtBx() {
		try {
	          loginpagepasswordtxtBx = prop.getLocator("loginpage.css.passwordtxtBx");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static By getLoginpageloginBtn() {
		setLoginpageloginBtn();
		By by=By.cssSelector(loginpageloginBtn);
		return by;
	}
	public static void setLoginpageloginBtn() {
		try {
			  loginpageloginBtn = prop.getLocator("loginpage.css.loginBtn");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
}
