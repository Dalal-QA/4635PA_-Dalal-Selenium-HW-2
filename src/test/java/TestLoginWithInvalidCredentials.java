import base.BasePage;
import loginwithinvalidcredentials.LoginWithInvalidCredentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginWithInvalidCredentials extends BasePage {

    LoginWithInvalidCredentials loginWithInvalidCredentials;

    @Test(groups = {"smoke"})
    public void testLoginWithInvalidCredentials(){

        loginWithInvalidCredentials= new LoginWithInvalidCredentials();
        String invalidEmail= "connor.smith@gmail.com";
        String invalidPassword= "Ayden1213";
        loginWithInvalidCredentials.getLogIn(invalidEmail,invalidPassword);
        Assert.assertTrue(isElementVisible(loginWithInvalidCredentials.errorMessageLogin));
    }
}
