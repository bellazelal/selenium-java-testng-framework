package com.bella.framework.steps;

import com.bella.framework.core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        // DriverFactory.quitDriver(); // ŞİMDİLİK YORUMA AL
    }

}


