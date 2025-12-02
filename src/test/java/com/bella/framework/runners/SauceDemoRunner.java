package com.bella.framework.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Admin\\Desktop\\selenium-java-testng-framework\\src\\main\\resources\\features",
        glue = "com.bella.framework.steps",
        plugin = {
                "pretty",
                "html:target/cucumber-saucedemo-report.html",
                "json:target/cucumber-saucedemo-report.json"
        },
        monochrome = true,
        tags = "@saucedemo"
)
public class SauceDemoRunner extends AbstractTestNGCucumberTests {
}
