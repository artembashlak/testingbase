package pages;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Home page of github will be here.
 */

public class GitHubHomePage extends BasePage<GitHubHomePage> {

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.titleContains("The world's leading software development platform · GitHub");
    }

    @Override
    public String getPageUrl() {
        return "";
    }

    public GitHubLoginPage goToLoginPage() {
        return new GitHubLoginPage().openPage(GitHubLoginPage.class);
    }

    public GitHubHomePage open() {
        return new GitHubHomePage().openPage(GitHubHomePage.class);
    }

}
