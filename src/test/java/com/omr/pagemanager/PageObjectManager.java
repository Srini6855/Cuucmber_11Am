package com.omr.pagemanager;

import com.omr.pages.LoginPage;
import com.omr.pages.SearchPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private SearchPage searchPage;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchPage getSearchPage() {
		return (searchPage == null) ? searchPage = new SearchPage() : searchPage;
	}

}
