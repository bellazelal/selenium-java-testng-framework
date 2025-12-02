package com.bella.framework.pages;


import com.bella.framework.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends BasePage {

    private By searchBox = By.name("q");

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    // Sadece keyword yazma
    public void typeSearch(String keyword) {
        type(searchBox, keyword);   // BasePage.type()
    }

    // Enter ile submit etme
    public void submitSearch() {
        find(searchBox).sendKeys(Keys.ENTER); // BasePage.find() ile element aldık
    }

    // Kombine, en çok kullanacağın metod:
    public void search(String keyword) {
        typeSearch(keyword);
        submitSearch();
    }
}



