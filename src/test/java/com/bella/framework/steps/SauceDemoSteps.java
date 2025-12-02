package com.bella.framework.steps;


import com.bella.framework.pages.SauceInventoryPage;
import com.bella.framework.pages.SauceLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SauceDemoSteps {

    private WebDriver driver;
    private SauceLoginPage loginPage;
    private SauceInventoryPage inventoryPage;

    public SauceDemoSteps() {
        this.driver = Hooks.driver;  // Hooks içindeki static driver
    }

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_saucedemo_login_page() {
        loginPage = new SauceLoginPage(driver);
        loginPage.open();
    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        loginPage.loginAsStandardUser();
    }

    @Then("I should see the products page")
    public void i_should_see_the_products_page() {
        inventoryPage = new SauceInventoryPage(driver);
        boolean onProducts = inventoryPage.isOnProductsPage();
        Assert.assertTrue(onProducts, "User is not on the products page!");
    }


}
