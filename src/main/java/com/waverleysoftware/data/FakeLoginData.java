package com.waverleysoftware.data;

import org.testng.annotations.DataProvider;

/**
 * Data for incorrect login user.
 */
public class FakeLoginData {

    @DataProvider(name = "emptyPassword")
    public static Object[][] emptyPassword() {
        return new Object[][]{
                {"user@gmail.com", ""},
                {"user@gmail2.com", "  "}};
    }
}
