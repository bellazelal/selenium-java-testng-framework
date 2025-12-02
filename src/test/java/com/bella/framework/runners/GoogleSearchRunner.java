package com.bella.framework.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/google_search.feature",
        glue = "com.bella.framework",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class GoogleSearchRunner extends AbstractTestNGCucumberTests {
}

