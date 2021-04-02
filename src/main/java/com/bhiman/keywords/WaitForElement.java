package com.bhiman.keywords;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bhiman.util.Constants;



public class WaitForElement {

	public static void implicitlyForSeconds(int seconds) {
		Constants.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	public static void pageLoadTime(int seconds) {
		Constants.driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}
	
	public static void elementToBePresent(By locator){
		WebDriverWait wait =new WebDriverWait(Constants.driver,20);
		wait.pollingEvery(Duration.ofMillis(250));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	}
	public static void elementToBeVisible(By locator){
		WebDriverWait wait =new WebDriverWait(Constants.driver,20);
		wait.pollingEvery(Duration.ofMillis(250));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	
	}
	public static void elementToBeClickable(By locator){
		WebDriverWait wait =new WebDriverWait(Constants.driver,20);
		wait.pollingEvery(Duration.ofMillis(250));
		wait.ignoring(NoSuchElementException.class,TimeoutException.class);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	
	}
	public static void fluentWait(By locator) {
	new WebDriverWait(Constants.driver, 20)
	.ignoring(StaleElementReferenceException.class,NoSuchElementException.class)
	.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/*
	new WebDriverWait(driver, 20).until(ExpectedConditions
			.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
			*/
	/*

public WebElement waitForElementDisplayed(final Supplier<By> by,
                                              final int timeToWaitInSec) {
        Wait<Browser> wait = new FluentWait<>(this)
                .withTimeout(timeToWaitInSec, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.MILLISECONDS)
                .ignoring(WebDriverException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(by.get()));
        
        */
	
}



