package com.bella.framework.pages;


import com.bella.framework.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginPage extends BasePage {

    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton   = By.id("login-button");
    private By errorMessage  = By.cssSelector("h3[data-test='error']");

    public SauceLoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        type(usernameInput, username);   // BasePage.type()
        type(passwordInput, password);
        click(loginButton);              // BasePage.click()
    }

    // En çok kullanacağımız: valid user
    public void loginAsStandardUser() {
        login("standard_user", "secret_sauce");
    }

    public String getErrorMessage() {
        return getText(errorMessage);    // BasePage.getText()
    }
}

