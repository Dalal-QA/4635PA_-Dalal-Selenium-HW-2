package test_authentication;

import app.pom.authenticationpage.LogInPage;
import app.pom.authenticationpage.LoginWithInvalidCredentials;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test(priority = 5, groups = {"BAT"})

    public void testLoginWithValidCredentials() {

        LogInPage logInPage = new LogInPage();
        String validEmail = "connie.smith@gmail.com";
        String validPassword = "AydenLiam1213";
        logInPage.getLogIn(validEmail, validPassword);
        Assert.assertTrue(isElementVisible(logInPage.resultLoginMessage));

    }

    @Test(priority = 6, groups = {"BAT"})
    public void testLoginWithInvalidCredentials() {

        LoginWithInvalidCredentials loginWithInvalidCredentials = new LoginWithInvalidCredentials();
        String invalidEmail = "connor.smith@gmail.com";
        String invalidPassword = "Ayden1213";
        loginWithInvalidCredentials.getLogIn(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(loginWithInvalidCredentials.errorMessageLogin));
    }
}
