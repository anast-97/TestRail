package tests;

import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test
    public void loginTest() {
        loginPage.open();
        loginPage.sendEmail("y.nastua97.testrail.io");
        loginPage.sendPassword("KnopochkA2007@");
        loginPage.clickToLoginButton();
    }
}
