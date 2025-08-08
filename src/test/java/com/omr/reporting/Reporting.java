package com.omr.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void report(String json) {
		File file = new File("C:\\Greens\\Eclipse-greens\\Cucumber_11Am\\target");
		Configuration configuration = new Configuration(file, "Adactin Hotel Booking");
		configuration.addClassifications("Branch", "OMR");
		configuration.addClassifications("Trainer", "Velmurugan sir");
		configuration.addClassifications("Batch", "Cucumber");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
