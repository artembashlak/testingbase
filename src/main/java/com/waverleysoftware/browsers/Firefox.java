package com.waverleysoftware.browsers;

import io.github.sskorol.core.Browser;

/**
 * Init browser Firefox start here with webdriver supplier library.
 */
public class Firefox implements Browser {

    public Name name() {
        return Name.Firefox;
    }
}