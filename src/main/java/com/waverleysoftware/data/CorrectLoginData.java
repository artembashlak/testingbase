package com.waverleysoftware.data;

import org.testng.annotations.DataProvider;

/**
 *Class that will provide com.waverleysoftware.data of User.
 */
public class CorrectLoginData {

    private static String userMail = "abashlak@waverleysoftware.com";
    private static String password = "hello123.";

    @DataProvider(name = "Correct login Data")
    public static Object[][] correctCredentials() {
        return new Object[][]{{userMail, password}};
    }
}
