package com.bella.framework.core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // ----------------- GENERIC HELPER METHODS -----------------

    // Locator ile WebElement bul
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Element görünür olana kadar bekle
    protected void waitForVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Element tıklanabilir olana kadar bekle
    protected void waitForClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Tıklama
    protected void click(By locator) {
        waitForClickable(locator);
        find(locator).click();
    }

    // Yazı yazma
    protected void type(By locator, String text) {
        waitForVisible(locator);
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }

    // Text alma
    protected String getText(By locator) {
        waitForVisible(locator);
        return find(locator).getText();
    }

    // Title alma
    public String getPageTitle() {
        return driver.getTitle();
    }
}







