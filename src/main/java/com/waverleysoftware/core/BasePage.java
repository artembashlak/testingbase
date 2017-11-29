package com.waverleysoftware.core;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.waverleysoftware.core.WaitCondition.allVisible;
import static com.waverleysoftware.core.WaitCondition.visible;
import static com.waverleysoftware.utils.ElementTypeUtils.elementOf;
import static com.waverleysoftware.utils.ElementTypeUtils.streamOf;
import static io.github.sskorol.listeners.BaseListener.getDriverMetaData;

/** Base Page for all pages. */
public abstract class BasePage implements Page {

  private WebDriver driver;
  private final WebDriverWait wait;

  public BasePage() {
    this.driver = getDriverMetaData()._1;
    this.wait = getDriverMetaData()._2;
  }

  protected void type(final By locator, final CharSequence text, WaitCondition condition) {
    elementOf(waitFor(locator, condition)).sendKeys(text);
  }

  protected void type(final By locator, final CharSequence text) {
    type(locator, text, visible);
  }

  protected List<String> getTextNodes(final By locator) {
    return getTextNodes(locator, allVisible);
  }

  protected List<String> getTextNodes(final By locator, final WaitCondition condition) {
    return streamOf(waitFor(locator, condition)).map(WebElement::getText).toList();
  }

  @Step("Navigate to {url}")
  public Page navigateTo(final String url) {
    driver.get(url);
    return this;
  }

  @SuppressWarnings("unchecked")
  private <T> T waitFor(final By locator, WaitCondition condition) {
    return (T) wait.until(condition.getType().apply(locator));
  }
}
