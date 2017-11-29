package com.company;

import com.waverleysoftware.pages.GitHubLoginPage;
import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.SkipException;
import org.testng.annotations.Test;

import static com.waverleysoftware.core.PageFactory.open;

/** Simple login : github.com */
@Slf4j
public class GithubLogin {

    @Test
    @Feature("Login")
    @Story("1")
    @Issue("1")
    @TmsLink("1")
    @Severity(SeverityLevel.BLOCKER)
    public void loginWIthValidCredentials() {
        open(GitHubLoginPage.class).login("artembashlak@gmail.com", "hello123.");
    }

    @Test
    public void skippingTest() {
        throw new SkipException("Not implemented");
    }

    @Test
    public void infrastructureIssueTest() {
        throw new RuntimeException("Infrastructure problems");
    }
}



