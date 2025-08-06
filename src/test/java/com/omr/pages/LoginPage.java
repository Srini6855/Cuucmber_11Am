package com.omr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omr.baseclass.Baseclass;

public class LoginPage extends Baseclass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUsername;
	@FindBy(id = "password")
	private WebElement txtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(xpath = "//div[@class='auth_error']//b")
	private WebElement textErrorMessage;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTextErrorMessage() {
		return textErrorMessage;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void enterCredentials(String username, String password) {
		elementSendKeys(txtUsername, username);
		elementSendKeys(txtPassword, password);
	}

	public void clickLogin() {
		elementClick(btnLogin);
	}

	public String actualErrorMessage() {
		return elementGetText(textErrorMessage);
	}

}
