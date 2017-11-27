package com.company;

import com.waverleysoftware.pages.GitHubLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static com.waverleysoftware.core.PageFactory.open;

/** Simple login : github.com */
@Slf4j
public class GithubLogin {

  @Test
  public void loginWIthValidCredentials() throws InterruptedException {
    open(GitHubLoginPage.class).login("artembashlak@gmail.com", "hello123.");
  }
}
