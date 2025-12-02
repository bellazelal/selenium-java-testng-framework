package com.bella.framework.steps;


import com.bella.framework.pages.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoogleSearchSteps {

    private WebDriver driver;
    private GoogleHomePage googleHomePage;

    public GoogleSearchSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I am on the Google home page")
    public void i_am_on_the_google_home_page() {
        googleHomePage = new GoogleHomePage(driver);
        googleHomePage.open();
    }

    @When("I search for {string}")
    public void i_search_for(String keyword) {
        googleHomePage.search(keyword);
    }




    @Then("the page title should contain {string}")
    public void the_page_title_should_contain(String expected) {
        // Title içinde expected geçene kadar max 10 sn bekle
        new WebDriverWait(Hooks.driver, java.time.Duration.ofSeconds(10))
                .until(org.openqa.selenium.support.ui.ExpectedConditions.titleContains(expected));

        String title = Hooks.driver.getTitle();
        System.out.println("Title: " + title);

        Assert.assertTrue(
                title.toLowerCase().contains(expected.toLowerCase()),
                "Title does not contain expected text: " + expected );
    }

}

