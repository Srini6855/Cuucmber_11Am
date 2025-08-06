package com.omr.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "com.omr.stepdefinition",tags = "@Login1",dryRun = false)
public class TestRunner {

}
