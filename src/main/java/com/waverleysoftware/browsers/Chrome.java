package com.waverleysoftware.browsers;

import io.github.sskorol.core.Browser;

/**
 * Init browser Chrome start here with webdriver supplier library.
 */
public class Chrome implements Browser {

    public Name name() {
        return Name.Chrome;
    }
}