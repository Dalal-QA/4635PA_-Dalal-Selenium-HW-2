package test_login;

import app.login.LogInPage;
import app.login.WelcomeLoginPage;
import app.pom.homepage.Homepage;
import app.resultpage.SearchResultPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_search.TestSearch;

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
