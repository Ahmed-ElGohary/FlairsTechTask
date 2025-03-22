# FlairsTechTask - E2E User Management Test

This project is an end-to-end (E2E) test automation solution for managing users on the OrangeHRM platform ([OrangeHRM Demo](https://opensource-demo.orangehrmlive.com/)). It uses Cucumber, Selenium, and TestNG to automate the process of adding and deleting a user, verifying the record count, and ensuring the system behaves as expected.

## Project Overview
The task focuses on automating the following scenario:
1. Log in to OrangeHRM as an admin.
2. Navigate to the "System Users" page.
3. Add a new user with specific details (username, password, role, status, employee name).
4. Verify the number of records increases by 1.
5. Search for the newly added user and delete them.
6. Verify the number of records decreases by 1.

## Tech Stack
- **Java**: Programming language for test automation.
- **Selenium WebDriver**: For browser automation.
- **Cucumber**: For Behavior-Driven Development (BDD) with Gherkin syntax.
- **TestNG**: Test runner and framework for executing tests.
- **Maven**: Dependency management and build tool.

## Project Structure
```
FlairsTechTask/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/
│   │           ├── BasePage.java       # Base class for page objects
│   │           ├── FormPage.java       # Page object for the "Add System User" form
│   │           ├── HomePage.java       # Page object for the "System Users" page
│   │           └── LoginPage.java      # Page object for the login page
│   ├── test/
│   │   ├── java/
│   │   │   ├── base/
│   │   │   │   └── BaseTest.java       # Base class for test setup
│   │   │   ├── runner/
│   │   │   │   └── TestRunner.java     # Cucumber TestNG runner
│   │   │   ├── stepdefinitions/
│   │   │   │   ├── FormSteps.java      # Step definitions for form actions
│   │   │   │   ├── HomeSteps.java      # Step definitions for homepage actions
│   │   │   │   ├── Hooks.java          # Cucumber hooks for setup/teardown
│   │   │   │   └── LoginSteps.java     # Step definitions for login actions
│   │   └── resources/
│   │       └── features/
│   │           └── user_management.feature  # Cucumber feature file
├── .gitignore
├── pom.xml
└── testng.xml
```

## Prerequisites
- **Java 11+**: Ensure Java is installed.
- **Maven**: For dependency management and building the project.
- **Chrome Browser**: The tests use ChromeDriver for browser automation.
- **Git**: To clone the repository.

## Setup Instructions
### Clone the Repository:
```sh
git clone https://github.com/Ahmed-ElGohary/FlairsTechTask.git
cd FlairsTechTask
```
### Install Dependencies:
```sh
mvn clean install
```
### Run the Tests:
#### Using Maven:
```sh
mvn test
```
#### Using TestNG:
```sh
mvn test -DsuiteXmlFile=testng.xml
```

## Test Scenario
The `user_management.feature` file defines the following scenario:
1. Navigate to OrangeHRM and log in as Admin.
2. Go to the "Admin" section and note the initial number of user records.
3. Add a new user with the following details:
   - **Username**: Ahmed143
   - **Password**: Asd@123
   - **Role**: Admin
   - **Status**: Enabled
   - **Employee Name**: Charles Carter (or a valid employee in your instance)
4. Verify the record count increases by 1.
5. Search for the user "Ahmed143" and delete them.
6. Reload the page and verify the record count decreases by 1.

## Notes
- **Employee Name**: The test uses "Charles Carter" as the employee name. Ensure this employee exists in your OrangeHRM instance, or update the feature file with a valid employee name.
- **Driver Management**: The driver is currently static for simplicity. For parallel execution, consider using dependency injection (e.g., PicoContainer).
- **Reports**: Cucumber reports are generated in `target/cucumber-reports.html`.

## Author
**Ahmed ElGohary**  
GitHub: [Ahmed-ElGohary](https://github.com/Ahmed-ElGohary)

