package test_subscribe;

import app.pom.homepage.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubscribe extends BasePage {
    @Test(priority = 10 , groups = {"BAT"})
    public void testSubscribe(){
        Homepage homepage= new Homepage();
        String email="sadouni.dalal@gmail.com";
        homepage.DoSubscribe(email);

        Assert.assertTrue(isElementVisible(homepage.confirmSubscriptionMessage));
    }
}
