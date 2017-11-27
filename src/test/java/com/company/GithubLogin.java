package com.company;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import com.waverleysoftware.pages.GitHubLoginPage;

import static com.waverleysoftware.BaseConfig.BASE_CONFIG;
import static com.waverleysoftware.core.WebDriverListener.getDriver;

/**
 * Simple login : github.com
 */

@Slf4j
public class GithubLogin {

  @Test
  public void loginWIthValidCredentials() throws InterruptedException {
    getDriver().get(BASE_CONFIG.url());

      new GitHubLoginPage()
            .login("artembashlak@gmail.com", "hello123.");
  }
}
