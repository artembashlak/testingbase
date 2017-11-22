package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.WebDriverListener.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Page object representing github login page.
 */
public class GitHubLoginPage {

    private By loginField = By.cssSelector("#login_field");
    private By passwordField = By.name("password");
    private By commitButton = By.name("commit");
    private By errorBox = By.className("flash-error");

    public String getPageUrl() {
        return "https://github.com/";
    }

    public void login(String login, String password) {
        final WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(elementToBeClickable(loginField)).sendKeys(login);
        wait.until(elementToBeClickable(passwordField)).sendKeys(password);
        wait.until(elementToBeClickable(commitButton)).click();
    }

    public boolean isLoginError() {
        return getDriver().findElement(errorBox).isDisplayed();
    }

    public String getErrorMessage() {
        return getDriver().findElement(errorBox).getText();
    }
}
