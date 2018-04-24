package com.instruments.hsbcProject2;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/TradesInOutDateRange.feature"},
		glue =  {"src/test/resources/steps/TradesInOutDateRange.java"},
		tags={"@Automated"}
		)
public class Runner {
}
