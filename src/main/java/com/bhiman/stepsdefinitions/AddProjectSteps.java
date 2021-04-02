package com.bhiman.stepsdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.bhiman.keywords.WaitForElement;
import com.bhiman.pages.AddProjects;
import com.bhiman.pages.LoginPage;
import com.bhiman.util.ActionsUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AddProjectSteps  {
	LoginPage login=new LoginPage();
	AddProjects addproject=new AddProjects();
	ActionsUtil actionUtil=new ActionsUtil();
	@Given("mousehover on master menu")
	public void mousehover_on_master_menu() {
		addproject.mouseHowerOnMasterMenu();
	}

	@Given("click on projects submenu")
	public void click_on_projects_submenu() {
		addproject.clickOnProjectsSubMenu();
	}

	@Given("click on add project button")
	public void click_on_add_project_button() {
		addproject.clickOnAddProjectBtn();
	}

	@When("user select {string} as branch name")
	public void user_select_as_branch_name(String value) {
		addproject.selectBranchName(value);
	}

	@When("user enters  {string} as project name")
	public void user_enters_as_project_name(String projectName) {
		addproject.enterProjectName(projectName);
	}

	@When("user enters {string} as number of plots")
	public void user_enters_as_number_of_plots(String noOfPlots) {
		addproject.enterNumberOfPlots(noOfPlots);
	}

	@When("user enters {string} as total area")
	public void user_enters_as_total_area(String totalArea) {
		addproject.enterTotalArea(totalArea);
	}

	@When("user enters {string} as rate")
	public void user_enters_as_rate(String rate) {
		addproject.enterRate(rate);
	}
	
	@When("user upload {string} as layout file")
	public void user_upload_as_layout_file(String path) {
		addproject.uploadLayOut(path);
	}

	@When("user upload {string} as NAOrder file")
	public void user_upload_as_na_order_file(String path) {
		addproject.uploadNAOrder(path);
	}

	@When("user upload {string} as sevenTwelve file")
	public void user_upload_as_seven_twelve_file(String path) {
		addproject.uploadsevenTwelve(path);
	}
	@When("click on submit")
	public void click_on_submit() {
		addproject.submitProject();
	}
	@When("verify msg project created successfully.")
	public void verify_msg_project_created_successfully() {
		Assert.assertEquals(addproject.getSuccessMsg(), "Project Added.","Not matched");
	}

	@When("click on ok button")
	public void click_on_ok_button() {
		addproject.clickOK();
	}
	
	//-Error message
	@When("user click on submit button")
	public void user_click_on_submit_button() {
		addproject.submitProject();
	}

	@When("verify branch name error message")
	public void verify_branch_name_error_message() {
		addproject.checkBranchErrorMsg();
	}

	@When("verify project name error message")
	public void verify_project_name_error_message() {
		addproject.checkProjectnameErrorMsg();
	}

	@When("verify NoOfPlots error message")
	public void verify_no_of_plots_error_message() {
		addproject.checkNoOfPlotsErrmsg();
	}

	@When("verify totalArea error message")
	public void verify_total_area_error_message() {
		addproject.checkTotalAreaErrmsg();
	}

	@When("verify rate error message")
	public void verify_rate_error_message() {
		addproject.checkRateErrmsg();
	}

	@When("verify totalAmt error message")
	public void verify_total_amt_error_message() {
		addproject.checkTotalAmtErrmsg();
	}
	@When("click on cancel button")
	public void click_on_cancel_button() {
		addproject.clickOnCancelbtn();
	}
	@And("accept alert")
	public void accept_alert() {
		addproject.acceptCancelAlert();
	}
	@And("verify all fields are cleared")
	public void verify_all_fields_are_cleared() {
		
		//Assert.assertEquals(addproject.isEmptyBranchName(),true,"Not matched");
		Assert.assertEquals(addproject.isEmptyProjectName(),true,"Not matched");
		Assert.assertEquals(addproject.isEmptyNoOfPlots(),true,"Not matched");
		Assert.assertEquals(addproject.isEmptyTotalArea(),true,"Not matched");
		Assert.assertEquals(addproject.isEmptyRate(),true,"Not matched");
		Assert.assertEquals(addproject.isEmptyTotalamt(),true,"Not matched");	
	}
	

@When("verify error message for files")
public void verify_error_message_for_files() {
	Assert.assertEquals(addproject.getErrorMsg(),"Please Upload Layout File.","not matched");
	
}


}
