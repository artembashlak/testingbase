package com.waverleysoftware.pages;

import com.waverleysoftware.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.waverleysoftware.BaseConfig.BASE_CONFIG;
import static com.waverleysoftware.core.WaitCondition.visible;
import static com.waverleysoftware.core.WebDriverListener.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/** Page object representing github login Page. */
public class GitHubLoginPage extends BasePage {

  private By loginField = By.cssSelector("#login_field");
  private By passwordField = By.name("password");
  private By commitButton = By.name("commit");
  private By errorBox = By.className("flash-error");
  private WebDriverWait wait = new WebDriverWait(getDriver(), BASE_CONFIG.waitTimeout());

  public void login(String login, String password) {
    type(loginField, login, visible);
    type(passwordField, password, visible);
    wait.until(elementToBeClickable(commitButton)).click();
  }

  public boolean isLoginError() {
    return getDriver().findElement(errorBox).isDisplayed();
  }

  public String getErrorMessage() {
    return getDriver().findElement(errorBox).getText();
  }

  @Override
  public String url() {
    return BASE_CONFIG.url();
  }
}
