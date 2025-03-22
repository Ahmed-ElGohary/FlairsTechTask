package stepdefinitions;

import io.cucumber.java.en.When;
import pages.FormPage;
import base.BaseTest;
import pages.HomePage;

public class FormSteps extends BaseTest {
    FormPage formPage;
    HomePage homePage;

    public FormSteps() {
        this.formPage = new FormPage(driver);
        this.homePage = new HomePage(driver);
    }

    @When("I fill in user details with {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_user_details(String username, String password, String role, String status, String empSubName, String empName) {
        formPage.enterUserName(username);
        formPage.enterPassword(password);
        formPage.enterConfirmPassword(password);
        formPage.selectUserRole(role);
        formPage.selectStatus(status);
        formPage.enterEmployeeName(empSubName,empName);
    }

    @When("I click on save button")
    public void i_click_save_button() {
        homePage = formPage.AddRecord();
    }

    @When("I search for the username {string}")
    public void i_search_username(String username) {
        homePage.searchWithUserName(username);
    }

    @When("I delete the found user")
    public void i_delete_found_user() {
        homePage.deleteFoundUser();
    }
}
