package com.company;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTest {
    public static WebDriver driver;
    public static WebDriverManager webDriverManager;

    @BeforeTest
    @Parameters("browser")
    public void driverUp(String browser) throws Exception {
        if(browser.equalsIgnoreCase("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }

    }

    @Test(description = "Check if title Google")
    @Parameters("")
    public void test_Chrome() throws Exception {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @AfterTest
    public void driverDown() {
        driver.quit();
    }
}