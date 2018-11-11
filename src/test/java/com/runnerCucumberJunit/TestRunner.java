package com.runnerCucumberJunit;


import java.io.File;

import org.junit.AfterClass;
/**
 * The class is aimed at running Cucumber by Junit as well as generating a report in json format and html format
 */
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = { "html:target/cucumberHtmlReport", "json:target/cucumber-report.json" }, 
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
		features = "features", 
		glue = { "com.steps" },
		tags = {"@run"}
		)
public class TestRunner {
	
	    @AfterClass
	    public static void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config/report.xml"));
	    
	    }
}
