package pages;

import org.openqa.selenium.By;

import static core.WebDriverListener.getDriver;

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
        getDriver().findElement(loginField).sendKeys(login);
        getDriver().findElement(passwordField).sendKeys(password);
        getDriver().findElement(commitButton).click();
    }

    public boolean isLoginError() {
        return getDriver().findElement(errorBox).isDisplayed();
    }

    public String getErrorMessage() {
        return getDriver().findElement(errorBox).getText();
    }
}
