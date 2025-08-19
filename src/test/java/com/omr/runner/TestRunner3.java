package com.omr.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/failed_scenarios.txt", glue = "com.omr.stepdefinition", dryRun = false, plugin = {
		"pretty", "json:target/adactinhotel-report.json" })
public class TestRunner3 {
}
