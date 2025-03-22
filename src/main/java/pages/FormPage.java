package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormPage extends BasePage{

    public FormPage (WebDriver driver) {
        super(driver);
    }

    private By essentialInputsLocators = By.xpath("//input[contains(@class,'oxd-input oxd-input--active')]");
    private final List<WebElement> essentialInputsElements = findElements(essentialInputsLocators);
    private By dropDownLocators = By.xpath("//div[contains(@class,'oxd-select-text-input')]");
    private final List<WebElement> dropDownElements = findElements(dropDownLocators);
    private By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    private By saveButton = By.xpath("//button[@type='submit' and contains(., 'Save')]");
    private By cancelButton = By.xpath("//button[@type='button' and contains(., 'Cancel')]");


    public FormPage enterUserName(String username){
        essentialInputsElements.get(1).sendKeys(username);
        return this;
    }

    public FormPage enterPassword(String password){
        essentialInputsElements.get(2).sendKeys(password);
        return this;
    }

    public FormPage enterConfirmPassword(String confirmPassword){
        essentialInputsElements.get(3).sendKeys(confirmPassword);
        return this;
    }

    public void selectUserRole(String role) {
        dropDownElements.get(0).click();
        By optionLocator = By.xpath("//div[@role='listbox']//span[text()='" + role + "']");
        findElement(optionLocator).click();

    }

    public void selectStatus(String status) {
        dropDownElements.get(1).click();
        By optionLocator = By.xpath("//div[@role='listbox']//span[text()='" + status + "']");
        findElement(optionLocator).click();
    }

    public void enterEmployeeName(String subName , String empName) {
        findElement(employeeName).sendKeys(subName);
        By optionLocator = By.xpath("//div[@role='listbox']//span[text()='" + empName + "']");
        findElement(optionLocator).click();
    }

    public HomePage AddRecord() {
        driver.findElement(saveButton).click();
        return new HomePage(driver);
    }

    public void clickCancel() {
        driver.findElement(cancelButton).click();
    }

}
