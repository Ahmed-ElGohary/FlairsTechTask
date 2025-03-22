package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By userNameField = By.name("username");
    By passwordField = By.name("password");

    By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage enterUsername(String username) {
        findElement(userNameField).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        findElement(loginButton).click();
        return this;
    }

    public HomePage login (String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        return new HomePage(driver);
    }


}
