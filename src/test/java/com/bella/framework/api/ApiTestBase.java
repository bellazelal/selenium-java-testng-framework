package com.bella.framework.api;



import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ApiTestBase {

    protected RequestSpecification request;

    public ApiTestBase() {
        // Yeni base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        request = RestAssured
                .given()
                .contentType("application/json");
    }
}
