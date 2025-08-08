package com.omr.stepdefinition;

import java.io.IOException;

import com.omr.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {

	@Before
	public void initialSetip() throws IOException {
		browserLaunch(getPropertValue("browser"));
		maximizewindow();
		implicitWait();
		launchtheappln(getPropertValue("url"));
	}

	@After
	public void postCondtns(Scenario scenario) throws IOException, InterruptedException {
		scenario.attach(takesscreenshotByte(), "image/png", "Every Scenario");
	}

	@BeforeStep
	public void beforeStep(Scenario scenario) {
		scenario.attach(takesscreenshotByte(), "image/png", "Before step");
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		scenario.attach(takesscreenshotByte(), "image/png", "After step");
	}

}
