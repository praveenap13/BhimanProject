package com.bhiman.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.bhiman.keywords.WaitForElement;
import com.bhiman.util.ActionsUtil;
import com.bhiman.util.Constants;



//Emt element
public class AddProjects extends ActionsUtil{
	private static final Logger LOG=Logger.getLogger(AddProjects.class);
	public By mastermain =By.xpath("//span[contains(text(),'Masters')]");
	public By projectsSubmenu=By.xpath("//body/div[3]/nav[1]/ul[1]/li[2]/ul[1]/li[8]/a[1]");
	public By addProjectBtn=By.cssSelector("#add_btn");

	private By branchNameDrpdwn=By.cssSelector("#branch_id");
	private By projectNametxt=By.cssSelector("#project_name");
	private By noOfPlotstxt=By.cssSelector("#no_of_plot");
	private By totalAreaTxt=By.cssSelector("#total_area");
	private By rateTxt=By.cssSelector("#rate");
	private By totalAmtTxt=By.cssSelector("#total_amount");
	private By layoutUploadBtn=By.cssSelector("#layout");
	private By naOrderBtn=By.cssSelector("#na_order");
	private By seventwelveBtn=By.cssSelector("#seven_by_twelve");
	private By submitProjectBtn=By.name("project_add");
	private By cancelProjectBtn=By.id("Reset");
	
	private By msgSuccessLine=By.cssSelector(".swal2-content");
    private By okProjectmsgBtn=By.cssSelector(".swal2-confirm.styled");
    
    //error lables
    private By branchNameErrMsg=By.cssSelector("#branch_id-error");
    private By projectNameErrmsg=By.cssSelector("#project_name-error");
    private By noOfPlotsErrMsg=By.cssSelector("#no_of_plot-error");
    private By totalareaErrMsg=By.cssSelector("#total_area-error");
    private By rateErrMsg=By.cssSelector("#rate-error");
    private By totalAmountErrMsg=By.cssSelector("#total_amount-error");
    
    private By layoutPopupMsg=By.xpath("//div[contains(text(),'Please Upload Layout File.')]");


	Actions act=new Actions(Constants.driver);
	public void mouseHowerOnMasterMenu(){
		mousehowerOn(mastermain);
	}
	public void clickOnProjectsSubMenu(){
		clickOnWithJavascriptExecutor(projectsSubmenu);
	}
	public void clickOnAddProjectBtn(){
		clickOn(addProjectBtn);
	}
	public void selectBranchName(String value) {
		selectDropdownValue(branchNameDrpdwn,"visibletext",value);
	}
	public void enterProjectName(String projectName) {
		Constants.driver.findElement(projectNametxt).sendKeys(projectName);
	}
	public void enterNumberOfPlots(String no) {
		Constants.driver.findElement(noOfPlotstxt).sendKeys(no);
	}
	public void enterTotalArea(String totalArea) {
		Constants.driver.findElement(totalAreaTxt).sendKeys(totalArea);
		}
	public void enterRate(String rate) {
		Constants.driver.findElement(rateTxt).sendKeys(rate);
	}
	public int getTotalAmount(String amt) {
		return Integer.parseInt(Constants.driver.findElement(totalAmtTxt).getText());
	}
	public void uploadLayOut(String path){
		Constants.driver.findElement(layoutUploadBtn).sendKeys(path);
	}
	public void uploadNAOrder(String path){
		Constants.driver.findElement(naOrderBtn).sendKeys(path);
	}
	public void uploadsevenTwelve(String path) {
		Constants.driver.findElement(seventwelveBtn).sendKeys(path);
	}
	public void submitProject(){
		Constants.driver.findElement(submitProjectBtn).click();
	}
	public String getSuccessMsg() {
		return Constants.driver.findElement(msgSuccessLine).getText();
	}
	public void clickOK() {
		Constants.driver.findElement(okProjectmsgBtn).click();
	}
	public String getErrorMsg() {
		return Constants.driver.findElement(layoutPopupMsg).getText();
	}
	
	//error msg
	
	public void checkBranchErrorMsg(){
		checkErrorMsg(branchNameErrMsg,"Please Enter Branch Name","not matched");
		
	}
	public void  checkProjectnameErrorMsg() {
		checkErrorMsg(projectNameErrmsg,"Please Enter Project Name","Not matched");
	}
	public void checkNoOfPlotsErrmsg() {
		checkErrorMsg(noOfPlotsErrMsg,"Please Enter No of Plot","Not matched");
	}
	public void checkTotalAreaErrmsg() {
		checkErrorMsg(totalareaErrMsg,"Please Enter Total Area","Not matchd");
	}
	public void checkRateErrmsg() {
		checkErrorMsg(rateErrMsg,"Please Enter Rate","Not Matched");
	}
	public void checkTotalAmtErrmsg() {
		checkErrorMsg(totalAmountErrMsg,"Please Enter Total Amount","Not Matched");
	}
	public void clickOnCancelbtn() {
		clickOn(cancelProjectBtn);
	}
	public void acceptCancelAlert() {
		alertAccept();
		//WaitForElement.elementToBePresent(branchNameDrpdwn);
		
	}
	public boolean isEmptyBranchName() {
		//WaitForElement.elementToBePresent(branchNameDrpdwn);
		return isEmptyField(branchNameDrpdwn);	
	}
	public boolean  isEmptyProjectName() {
		return isEmptyField(projectNametxt);
	}
	public boolean  isEmptyNoOfPlots() {
		return isEmptyField(noOfPlotstxt);
	}
	public boolean  isEmptyTotalArea() {
		return isEmptyField(totalAreaTxt);
	}
	public boolean  isEmptyRate() {
		return isEmptyField(rateTxt);
	}
	public boolean  isEmptyTotalamt() {
		return isEmptyField(totalAmtTxt);
	}
	
	
}
