# selenium-java-testng-framework
 # UI & API Automation Framework (Java, Selenium, TestNG, Cucumber, RestAssured)

This repository contains a complete QA automation framework for both **UI** and **API** testing, designed and implemented by **bellazelal (Zelal Yildiz)**.

The framework is built for learning, interview preparation, and portfolio purposes and follows common industry patterns used in SDET / QA Automation roles.

---

## 🚀 Tech Stack

**Language & Build**
- Java 17
- Maven

**Test Frameworks**
- TestNG
- Cucumber BDD (Gherkin)

**UI Automation**
- Selenium WebDriver
- WebDriverManager
- Page Object Model (POM)
- Hooks (Before/After) for WebDriver lifecycle

**API Automation**
- RestAssured
- JSON parsing with JsonPath

---

## 📁 Project Structure

```text
src
 └── test
      ├── java
      │   └── com
      │       └── bella
      │           └── framework
      │               ├── core
      │               │    ├── DriverFactory.java      # WebDriver management (ThreadLocal)
      │               │    └── BasePage.java           # Common UI helpers (click, type, waits)
      │               ├── pages
      │               │    ├── GoogleHomePage.java     # Example Google search page object (optional / demo)
      │               │    ├── SauceLoginPage.java     # UI: SauceDemo login page
      │               │    └── SauceInventoryPage.java # UI: SauceDemo products page
      │               ├── steps
      │               │    ├── Hooks.java              # Cucumber @Before/@After (WebDriver setup/teardown)
      │               │    ├── GoogleSearchSteps.java  # Step defs for Google search (demo)
      │               │    └── SauceDemoSteps.java     # Step defs for SauceDemo login scenario
      │               ├── runners
      │               │    ├── GoogleSearchRunner.java # Cucumber + TestNG runner (UI demo)
      │               │    └── SauceDemoRunner.java    # Cucumber + TestNG runner for SauceDemo UI tests
      │               └── api
      │                    ├── ApiTestBase.java        # Base class for API tests (RestAssured setup)
      │                    └── UsersApiSteps.java      # Cucumber step defs for Users API
      └── resources
          └── features
               ├── google_search.feature               # Demo: Google search scenario
               ├── saucedemo_login.feature             # UI: SauceDemo login scenario
               └── api_users.feature                   # API: Get user details scenario


## 🌐 UI Test Scenario (SauceDemo Login)

Feature file: `saucedemo_login.feature`

Feature: SauceDemo Login

  Scenario: Valid user can login successfully
    Given I am on the SauceDemo login page
    When I login with valid credentials
    Then I should see the products page


This UI test:

Opens https://www.saucedemo.com/

Logs in with valid credentials (standard_user / secret_sauce)

Verifies the inventory/products page is visible

Run from IntelliJ:

Right-click → Run SauceDemoRunner

🌐 API Test Scenario (Users API)
Feature file: api_users.feature

gherkin

@api
Feature: Users API

  Scenario: Get user details
    Given the users API is available
    When I request user with id 1
    Then the response status code should be 200
    And the response should contain username "Bret"
This API test:

Uses base URL: https://jsonplaceholder.typicode.com

Sends a GET request

Validates status code

Validates username field in JSON

Run from IntelliJ:

Right-click → Run ApiRunner


🧱 Framework Highlights
Page Object Model with clean separation between pages, steps, runners, and core logic

Reusable UI helpers (click, type, waitForVisible, etc.)

Thread-safe WebDriver using ThreadLocal

Cucumber + TestNG integration

RestAssured API base setup

Scalable design, easy to extend with more tests

Perfect for interviews, portfolio, and QA practice

▶️ How to Run
UI Tests:
bash

Run -> SauceDemoRunner.java
API Tests:
bash

Run -> ApiRunner.java


Author
Name: Bella Zelal Yildiz
GitHub: @bellazelal
Role: QA Automation Engineer / SDET
Skills: Java · Selenium · TestNG · Cucumber · RestAssured · API & UI Testing







