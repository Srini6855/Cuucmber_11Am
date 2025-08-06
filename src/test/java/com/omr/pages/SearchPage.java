package com.omr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omr.baseclass.Baseclass;

public class SearchPage extends Baseclass {
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username_show")
	private WebElement textWelcomeMessage;

	public WebElement getTextWelcomeMessage() {
		return textWelcomeMessage;
	}
	
	public String actualWelcomeMessage() {
		String elementGetAttribute = elementGetAttribute(textWelcomeMessage, "value");
		return elementGetAttribute;
	}
	

}
