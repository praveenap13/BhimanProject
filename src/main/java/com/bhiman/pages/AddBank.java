package com.bhiman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bhiman.keywords.WaitForElement;
import com.bhiman.util.ActionsUtil;
import com.bhiman.util.Constants;

public class AddBank {
	ActionsUtil actionutil = new ActionsUtil();

	private By masterMenu = By.xpath("//span[contains(text(),'Masters')]");
	private By banksubMenu = By.xpath("//a[contains(text(),'Banks')]");
	private By addbankBtn = By.xpath("//a[@id='add_btn']");

	private By bankNameTxt = By.cssSelector("#bank_name");
	private By accHoldernameTxt = By.cssSelector("#account_name");
	private By accNumberTxt = By.cssSelector("#account_no");
	private By bankAccTypeDrpdwn = By.cssSelector("#bank_account_type");
	private By ifscTxt = By.cssSelector("#ifsc_code");
	private By micrTxt = By.cssSelector("#micr_code");
	private By submitViewBankBtn = By.xpath("//input[@type='submit']");

	public void mouseHowerOnMasterMenu() {
		actionutil.mousehowerOn(masterMenu);
	}

	public void clickOnBankSubMenu() {
		WebElement banktarget = Constants.driver.findElement(banksubMenu);
		WaitForElement.elementToBeClickable(banksubMenu);
		Constants.action.moveToElement(banktarget).perform();
		JavascriptExecutor executor = (JavascriptExecutor) Constants.driver;
		executor.executeScript("arguments[0].click();", banktarget);

	}

	public void clickOnAddBankBtn() {
		WaitForElement.elementToBeClickable(addbankBtn);
		WebElement element = Constants.driver.findElement(By.xpath("//a[@id='add_btn']"));
		JavascriptExecutor executor = (JavascriptExecutor) Constants.driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void enterBankName(String bankName) {
		Constants.driver.findElement(bankNameTxt).sendKeys(bankName);
	}

	public void enterAccountHolderName(String accHolderName) {
		Constants.driver.findElement(accHoldernameTxt).sendKeys(accHolderName);
	}

	public void enterAccountNumber(String accNumber) {
		Constants.driver.findElement(accNumberTxt).sendKeys(accNumber);
	}

	public void selectBankAccountType(String type) {
		Select bankAccountTypeDrpdwn = new Select(Constants.driver.findElement(bankAccTypeDrpdwn));
		bankAccountTypeDrpdwn.selectByVisibleText(type);
	}

	public void clickOnSubmitBtn() {
		Constants.driver.findElement(submitViewBankBtn).click();
	}

	public void enterIFSCCode(String ifsc) {
		Constants.driver.findElement(ifscTxt).sendKeys(ifsc);
	}

	public void enterMICRCode(String micr) {
		Constants.driver.findElement(micrTxt).sendKeys(micr);
	}

}
