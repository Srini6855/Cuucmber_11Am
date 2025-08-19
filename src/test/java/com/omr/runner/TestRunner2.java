package com.omr.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "com.omr.stepdefinition", tags = "@Login1", dryRun = false, plugin = {
		"pretty", "json:target/adactinhotel-report.json", "rerun:target/failed_scenarios.txt" })
public class TestRunner2 {
}
