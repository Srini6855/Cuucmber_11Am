package com.omr.stepdefinition;

import org.junit.Assert;

import com.omr.baseclass.Baseclass;
import com.omr.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC01_LoginStep extends Baseclass {
	PageObjectManager manager = new PageObjectManager();

	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) {
		manager.getLoginPage().enterCredentials(username, password);

	}

	@When("User click login button")
	public void user_click_login_button() {
		manager.getLoginPage().clickLogin();
	}

	@Then("User verify the success message after login {string}")
	public void user_verify_the_success_message_after_login(String expectedWelcomeMessage) {
		String actualWelcomeMessage = manager.getSearchPage().actualWelcomeMessage();
		Assert.assertEquals("Verify the welcome message after login", expectedWelcomeMessage, actualWelcomeMessage);
	}

	@Then("User verify the error after clicking login {string}")
	public void user_verify_the_error_after_clicking_login(String expectedErrorMessage) {
		String actualErrorMessage = manager.getLoginPage().actualErrorMessage();
		Assert.assertTrue("Verify the errror message after failure login",
				actualErrorMessage.contains(expectedErrorMessage));
	}

}
