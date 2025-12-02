package com.bella.framework.api;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;

public class UsersApiSteps extends ApiTestBase {

    private Response response;

    @Given("the users API is available")
    public void the_users_api_is_available() {
        System.out.println("Base URI: " + io.restassured.RestAssured.baseURI);
    }

    @When("I request user with id {int}")
    public void i_request_user_with_id(Integer id) {
        response = request
                .when()
                .get("/users/" + id);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer expectedStatus) {
        int actualStatus = response.getStatusCode();
        System.out.println("Status code = " + actualStatus);
        System.out.println("Response body:");
        System.out.println(response.asPrettyString());

        Assert.assertEquals(actualStatus, expectedStatus.intValue(),
                "Unexpected status code");
    }

    @Then("the response should contain username {string}")
    public void the_response_should_contain_username(String expectedUsername) {
        String actualUsername = response.jsonPath().getString("username");
        System.out.println("Username in response = " + actualUsername);
        Assert.assertEquals(actualUsername, expectedUsername,
                "Unexpected username in response");
    }
}
