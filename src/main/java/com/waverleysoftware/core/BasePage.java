package com.waverleysoftware.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

import static com.waverleysoftware.BaseConfig.BASE_CONFIG;
import static com.waverleysoftware.core.WebDriverListener.getDriver;


/**
 * Base page for all pages.
 */
public abstract class BasePage {

    private WebDriver driver;
    private final WebDriverWait wait;

    public BasePage() {
        this.driver = getDriver();
        this.wait = new WebDriverWait(driver,BASE_CONFIG.waitTimeout());
    }


    protected void type(final By locator, final CharSequence text, final Function<By, ExpectedCondition<WebElement>> condition){
        waitFor(locator, condition).sendKeys(text);
    }
    protected void type(final By locator, final CharSequence text){
        type(locator, text, ExpectedConditions::visibilityOfElementLocated);
    }

    private WebElement waitFor(final By locator, final Function<By, ExpectedCondition<WebElement>> condition) {
        return wait.until(condition.apply(locator));
    }

}
