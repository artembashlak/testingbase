package com.waverleysoftware.pages;

import static com.waverleysoftware.BaseConfig.BASE_CONFIG;
import static com.waverleysoftware.core.WaitCondition.visible;
import static io.github.sskorol.listeners.BaseListener.getDriverMetaData;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import com.waverleysoftware.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

/** Page object representing github login Page. */
public class GitHubLoginPage extends BasePage {

    private By loginField = By.cssSelector("#login_field");
    private By passwordField = By.name("password");
    private By commitButton = By.name("commit");
    private By errorBox = By.className("flash-error");
    private WebDriverWait wait = new WebDriverWait(getDriverMetaData()._1, BASE_CONFIG.waitTimeout());

    @Step("Send correct credentials to login: \"{login}\", \"{password}\"")
  public void login(String login, String password) {
        type(loginField, login, visible);
        type(passwordField, password, visible);
        wait.until(elementToBeClickable(commitButton)).click();
    }

    public boolean isLoginError() {
        return getDriverMetaData()._1.findElement(errorBox).isDisplayed();
    }

    public String getErrorMessage() {
        return getDriverMetaData()._1.findElement(errorBox).getText();
    }

    @Override
  public String url() {
        return BASE_CONFIG.url();
    }
}
