package com.omr.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.omr.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks extends Baseclass {
	
	
	@Before
	public void initialSetip() {
		browserLaunch("googleChrome");
		maximizewindow();
		implicitWait();
		launchtheappln("https://adactinhotelapp.com/index.php");
	}
	
	@After
	public void postCondtns() throws IOException {
		File takescreenshot = takescreenshot();
		File des = new File("C:\\Greens\\Eclipse-greens\\Cucumber_11Am\\Screenshots\\sample.png");
		FileUtils.copyFile(takescreenshot, des);
		closeCurrent();
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("Before Step");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("After step");
	}

}
