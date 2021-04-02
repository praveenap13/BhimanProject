package com.bhiman.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	
	public static WebElement getElement(By locator) {
		return Constants.driver.findElement(locator);
	}
	public static void selectDropdownValue(By locator,String type,String value) {
		Select select=new Select(getElement(locator));
		switch(type) {
		case "index":select.selectByIndex(Integer.parseInt(value));
		  break;
		case "value":select.selectByValue(value);
		break;
		case "visibletext":select.selectByVisibleText(value);
		break;
		default:
			System.out.println("please pass the correct selection criteria..");
			break;
		}
	}

}
