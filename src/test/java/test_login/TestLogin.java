package test_login;

import app.loginpage.LogInPage;
import app.loginpage.WelcomeLoginPage;
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
        Assert.assertTrue(isElementVisible(WelcomeLoginPage.driver.findElement(By.xpath("//div[@class='panel header']//span[@class='logged-in']"))));
    }


}
