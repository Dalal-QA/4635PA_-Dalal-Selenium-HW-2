package test_contactus;

import app.pom.contactuspage.ContactUsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUs extends BasePage {

    @Test(priority = 11 , groups = {"BAT"})
    public void testContactUs(){
        ContactUsPage contactUsPage= new ContactUsPage();
        String name= "Dalal";
        String email="connie.smith@gmail.com";
        String phoneNumber= "2675287485";
        String comment= "We go the best teacher ";
        contactUsPage.doContactUs(name,email,phoneNumber,comment);

        Assert.assertTrue(isElementVisible(contactUsPage.thankYouForContactingUsMessage));
    }
}
