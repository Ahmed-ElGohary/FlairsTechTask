package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FormPage;
import pages.HomePage;
import base.BaseTest;


public class HomeSteps extends BaseTest {
    HomePage homePage;
    FormPage formPage;
    int oldRecordCount, newRecordCount;

    @When("I click on the Admin tab on the left side menu")
    public void i_click_admin_tab() {
        homePage = new HomePage(driver);
        homePage.clickOnAdminLink();
    }

    @Then("I note the number of records")
    public void i_note_number_of_records() {
        oldRecordCount = homePage.findRecordsNum();
    }

    @When("I click on add button")
    public void i_click_add_button() {
        formPage = homePage.clickOnAddButton();
    }
    @Then("the number of records should increase by 1")
    public void records_should_increase() {
        newRecordCount = homePage.findRecordsNum();
        Assert.assertEquals(oldRecordCount + 1, newRecordCount);
    }

    @Then("the number of records should decrease by 1")
    public void records_should_decrease() {
        newRecordCount = homePage.findRecordsNum();
        Assert.assertEquals(oldRecordCount, newRecordCount);
    }
}
