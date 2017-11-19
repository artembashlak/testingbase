package pages;

import org.openqa.selenium.WebDriver;
import utils.LoadableComponent;

public class Login extends LoadableComponent<Login> {
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver =driver;
    }
    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
