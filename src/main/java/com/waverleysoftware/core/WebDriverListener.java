package com.waverleysoftware.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import static java.util.Optional.ofNullable;


/**
 * Driver setup will be here.
 */
public class WebDriverListener implements IInvokedMethodListener {

private static final ThreadLocal<WebDriver> WEBDRIVER_CONTAINER = new ThreadLocal<>();


    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            WebDriverManager.getInstance(ChromeDriver.class).setup();
            WEBDRIVER_CONTAINER.set(new ChromeDriver());
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            ofNullable(getDriver()).ifPresent(WebDriver::quit);
            WEBDRIVER_CONTAINER.remove();
        }
    }

    public static WebDriver getDriver() {
        return WEBDRIVER_CONTAINER.get();
    }
}

