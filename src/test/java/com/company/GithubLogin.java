package com.company;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import pages.GitHubLoginPage;

import static core.WebDriverListener.getDriver;

/**
 * Simple login : github.com
 */

@Slf4j
public class GithubLogin {

  @Test
  public void loginWIthValidCredentials() throws InterruptedException {
    getDriver().get(System.getenv("URL"));
    log.info(System.getenv("URL"));

    new GitHubLoginPage()
            .login("artembashlak@gmail.com", "hello123.");
  }
}
