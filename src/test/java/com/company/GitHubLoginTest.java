package com.company;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.GitHubHomePage;
import pages.GitHubLoginPage;

import static core.DriverSetup.getDriver;

public class GitHubLoginTest {

        @Test
        public void login_with_valid_credentials() {
            GitHubLoginPage loginPage = new GitHubHomePage().open().goToLoginPage();
            loginPage.login("user", "password");
        }

    @AfterClass
    public static void tearDown() {
        getDriver().close();
    }
}