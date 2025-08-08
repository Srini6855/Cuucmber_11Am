package com.omr.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omr.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "com.omr.stepdefinition", tags = "@Login1", dryRun = false, plugin = {
		"pretty", "json:target/adactinhotel-report.json" })
public class TestRunner {
	@AfterClass
	public static void generateReport() {
		Reporting.report("C:\\Greens\\Eclipse-greens\\Cucumber_11Am\\target\\adactinhotel-report.json");
	}
}
