package com.bella.framework.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/api_users.feature",
        glue = "com.bella.framework.api",
        plugin = {
                "pretty",
                "html:target/cucumber-api-report.html",
                "json:target/cucumber-api-report.json"
        },
        monochrome = true,
        tags = "@api"
)
public class ApiRunner extends AbstractTestNGCucumberTests {
}
