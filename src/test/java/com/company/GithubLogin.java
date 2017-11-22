package com.company;

import org.testng.annotations.Test;
import pages.GitHubLoginPage;

import static core.WebDriverListener.getDriver;

public class GithubLogin {

  @Test
  public void loginWIthValidCredentials() throws InterruptedException {
    getDriver().get("https://github.com/login");

    new GitHubLoginPage()
            .login("artembashlak@gmail.com", "hello123.");
    Thread.sleep(5000);

  }
}
