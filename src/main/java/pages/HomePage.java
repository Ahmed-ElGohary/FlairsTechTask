package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }
    private By adminLink = By.xpath("//a[contains(@href, '/web/index.php/admin/viewAdminModule')]");
    private By recordsSpan = By.xpath("//div/span[contains(@class,'oxd-text--span')]");
    private By addButton = By.xpath("//button[contains(., 'Add')]");
    private By searchInputsLocators = By.xpath("//input[contains(@class,'oxd-input oxd-input--active')]");
    private final By searchButtonLocator = By.xpath("//button[@type='submit' and contains(., 'Search')]");
    private final By deleteRecLocator = By.xpath("//i[contains(@class,'bi-trash')]");

    // inner div //div[@class="oxd-dialog-container-default--inner"]
    private final By confirmDeleteLocator = By.xpath("//button[contains(.,'Yes, Delete')]");
    public int findRecordsNum () {
        int recordsNum = 0 ;
        WebElement recordsElement = findElement(recordsSpan);
        String text = recordsElement.getText();
        return recordsNum = Integer.parseInt(text.replaceAll("[^0-9]", ""));
    }
    public HomePage searchWithUserName(String username){
        List<WebElement> searchInputElements = findElements(searchInputsLocators);
        searchInputElements.get(1).sendKeys(username);
        findElement(searchButtonLocator).click();
        return this;
    }

    public HomePage deleteFoundUser() {
        findElement(deleteRecLocator).click();
        findElement(confirmDeleteLocator).click();
        reloadPage();
        return this;
    }

    public FormPage clickOnAddButton () {
        findElement(addButton).click();
        return new FormPage(driver);
    }

    public HomePage clickOnAdminLink() {
        findElement(adminLink).click();
        return this;
    }




}
