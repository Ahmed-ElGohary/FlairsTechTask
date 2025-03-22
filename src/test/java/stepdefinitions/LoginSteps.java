package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import base.BaseTest;

public class LoginSteps extends BaseTest {
    LoginPage loginPage;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
        loginPage = new LoginPage(driver);
    }

    @When("I enter {string} as username")
    public void i_enter_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("I enter {string} as password")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }
}
