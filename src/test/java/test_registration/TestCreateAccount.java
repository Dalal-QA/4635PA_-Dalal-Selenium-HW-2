package test_registration;

import app.pom.registrationpage.RegistrationPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateAccount extends BasePage {

    @Test(priority = 4, groups= {"BAT"})
    public void testRegistration(){
        RegistrationPage registrationPage;

        registrationPage= new RegistrationPage();

        String firstName= "Nancy";
        String lastName ="Blando";
        String email="nancy.blandino1@gmail.com";
        String password="Liam@#Ayden125";

        registrationPage.doRegistration(firstName,lastName,email,password);

        Assert.assertTrue(isElementVisible(registrationPage.registrationResultText));

    }
}
