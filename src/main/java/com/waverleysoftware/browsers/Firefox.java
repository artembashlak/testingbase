package com.waverleysoftware.browsers;

import io.github.sskorol.config.XmlConfig;
import io.github.sskorol.core.Browser;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxOptions;
/**
 * Init browser Firefox start here with webdriver supplier library.
 */
public class Firefox implements Browser {

    public Name name() {
        return Name.Firefox;
    }

    public boolean isRemote() {
        return true;
    }

    public Capabilities configuration(final XmlConfig config) {
        final FirefoxOptions options = new FirefoxOptions();
        options.setCapability("enableVNC", true);
        options.setCapability("enableVideo", true);
        options.setCapability("name", config.getTestName());
        options.setCapability("screenResolution", "1280x1024x24");
        return merge(config, options);
    }
}