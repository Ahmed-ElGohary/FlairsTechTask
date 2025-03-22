package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected final int TIMOUTINSECONDS = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMOUTINSECONDS));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    private void waitForElementsToBePresent(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMOUTINSECONDS));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    protected WebElement findElement(By locator) {
        waitForElementToBeClickable(locator);
        return driver.findElement(locator);
    }

    protected List<WebElement> findElements(By locator) {
        waitForElementsToBePresent(locator);
        return driver.findElements(locator);
    }

    protected void reloadPage () {
        driver.navigate().refresh();
    }

}