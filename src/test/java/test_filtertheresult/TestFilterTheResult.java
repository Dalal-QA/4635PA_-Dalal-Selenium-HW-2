package test_filtertheresult;

import app.pom.homepage.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterTheResult extends BasePage {

    @Test(priority = 10, groups = {"BAT"})

    public void testCategoryResult() {
        Homepage homepage = new Homepage();
        homepage.doFilterTo();
        Assert.assertTrue(isElementVisible(homepage.categoryJacketResult));
    }
}
