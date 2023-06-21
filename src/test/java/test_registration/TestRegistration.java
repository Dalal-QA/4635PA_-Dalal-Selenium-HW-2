package test_registration;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import registrationpage.RegistrationPage;

public class TestRegistration extends BasePage {

    @Test(groups= {"smoke"})
   public void testRegistration(){
        RegistrationPage registrationPage;

        registrationPage= new RegistrationPage();

        String firstName= "Nancy";
        String lastName ="Blando";
        String email="nancy.blan@gmail.com";
        String password="Liam@#Ayden125";
        String confirmPassword="Liam@#Ayden125";
        registrationPage.doRegistration(firstName,lastName,email,password);

        Assert.assertTrue(isElementVisible(registrationPage.registrationResultText));


    }

}
