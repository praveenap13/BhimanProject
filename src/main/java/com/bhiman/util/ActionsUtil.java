package com.bhiman.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.bhiman.keywords.WaitForElement;

public class ActionsUtil {
	Actions act = new Actions(Constants.driver);

	public void findElementClick(By locator) {
		Constants.driver.findElement(locator).click();
	}

	public void findElementSendKeys(By locator, String value) {
		Constants.driver.findElement(locator).sendKeys(value);
	}

	public static String findElementGetText(By locator) {
		return Constants.driver.findElement(locator).getText();
	}

	public static WebElement getElement(By locator) {
		return Constants.driver.findElement(locator);
	}

	public static void selectDropdownValue(By locator, String type, String value) {
		Select select = new Select(getElement(locator));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("please pass the correct selection criteria..");
			break;
		}
	}

	public void checkErrorMsg(By locator, String expectedMessage, String errMessage) {
		String msg = ActionsUtil.findElementGetText(locator);
		Assert.assertEquals(msg, expectedMessage, errMessage);
	}

	public void mousehowerOn(By locator) {
		WebElement targetElement = Constants.driver.findElement(locator);
		WaitForElement.elementToBePresent(locator);
		act.moveToElement(targetElement).perform();
		JavascriptExecutor executor = (JavascriptExecutor) Constants.driver;
		executor.executeScript("arguments[0].click();", targetElement);
	}

	public void clickOnWithJavascriptExecutor(By locator) {
		WebElement target = Constants.driver.findElement(locator);
		WaitForElement.elementToBeClickable(locator);
		act.moveToElement(target).perform();
		JavascriptExecutor executor = (JavascriptExecutor) Constants.driver;
		executor.executeScript("arguments[0].click();", target);
	}

	public void clickOn(By locator) {
		Constants.driver.findElement(locator).click();
	}

	public void alertAccept() {
		Constants.driver.switchTo().alert().accept();
	}

	public void alertDismiss() {
		Constants.driver.switchTo().alert().dismiss();
	}

	public boolean isEmptyField(By locator) {
		// WaitForElement.elementToBePresent(locator);
		return getElement(locator).getText().isEmpty();
	}

}
