package com.bella.framework.pages;


import com.bella.framework.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceInventoryPage extends BasePage {

    private By title = By.cssSelector(".title");  // "Products" yazan başlık

    public SauceInventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {
        // Hem title text'i hem URL'i kontrol edebiliriz
        String heading = getText(title);   // BasePage.getText()
        String currentUrl = driver.getCurrentUrl();
        return heading.equalsIgnoreCase("Products")
                && currentUrl.contains("inventory");
    }
}
