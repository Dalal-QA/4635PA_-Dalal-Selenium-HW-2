package test_login;

import loginpage.LogInPage;
import loginpage.WelcomeLoginPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BasePage {

    LogInPage logInPage;

    @Test(groups = {"smoke"})

    public void testLoginWithValidCredentials(){
       logInPage= new LogInPage();
        String validEmail ="connie.smith@gmail.com";
        String validPassword="AydenLiam1213";
        logInPage.getLogIn(validEmail,validPassword);
        Assert.assertTrue(isElementVisible(logInPage.resultLoginMessage));

    }


}
