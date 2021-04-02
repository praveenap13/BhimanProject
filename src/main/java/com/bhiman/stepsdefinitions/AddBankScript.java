package com.bhiman.stepsdefinitions;

import java.util.List;

import org.testng.Assert;

import com.bhiman.pages.AddBank;
import com.bhiman.pages.LoginPage;
import com.bhiman.util.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBankScript {
	AddBank addBank = new AddBank();
	LoginPage login = new LoginPage();

	@Given("user enter {string} as username")
	public void user_enter_as_username(String mobile) {
		login.enterMobileNumber(mobile);
	}

	@Given("user enters {string} as password")
	public void user_enters_as_password(String password) {
		login.enterPassword(password);
	}

	@Given("click on login button")
	public void click_on_login_button() throws InterruptedException {
		login.clickOnLoginBtn();

	}
	/*
	 * 
	 * @Given("indexpage is opened") public void indexpage_is_opened() { String
	 * indexUrl = Constants.driver.getCurrentUrl(); Assert.assertEquals(indexUrl,
	 * "http://103.50.162.196/testing/index.php"); }
	 */

	@Given("mousehover on master menu and click on Banks")
	public void mousehover_on_master_menu_and_click_on_banks() throws InterruptedException {
		System.out.println(Constants.driver.getCurrentUrl());
		addBank.mouseHowerOnMasterMenu();
		addBank.clickOnBankSubMenu();
	}

	@Then("user on bank interface")
	public void verify_bank_interface_is_displayed() {
		String bankUrl = Constants.driver.getCurrentUrl();
		Assert.assertEquals(bankUrl, "http://103.50.162.196/testing/bank.php");
	}

	@Then("click on add button")
	public void click_on_add_button() {
		addBank.clickOnAddBankBtn();
	}

	@Then("verify add bank page is opened.")
	public void verifyAddbankPageOpened() {
		String viewbankUrl = Constants.driver.getCurrentUrl();
		Assert.assertEquals(viewbankUrl, "http://103.50.162.196/testing/bank.php#");
	}

	@When("user enters the following details")
	public void user_enters_the_following_details(DataTable addBankTable) {

		List<List<String>> bankdetailList = addBankTable.asLists(String.class);
		for (List<String> record : bankdetailList) {
			System.out.println(record);
		}

	}

	@Then("user should be add bank successfully")
	public void user_should_be_add_bank_successfully() {
		System.out.println("user adeed");
	}

}
