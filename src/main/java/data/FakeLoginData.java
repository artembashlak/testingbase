package data;

import org.testng.annotations.DataProvider;

public class FakeLoginData {

    @DataProvider(name = "emptyPassword")
    public static Object[][] emptyPassword() {
        return new Object[][]{
                {"user@gmail.com", ""},
                {"user@gmail.com", "  "}

        };
    }
}
