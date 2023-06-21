package test_modifyfromcart;

import base.BasePage;
import modifyFromCartPage.ModifyFromCartPage;
import org.testng.annotations.Test;

public class TestModifyFromCart extends BasePage {


   ModifyFromCartPage modifyFromCartPage;

    @Test (groups={"smoke"})
    public void testModifyFromCart(){
        modifyFromCartPage = new ModifyFromCartPage();
        String validEmail ="connie.smith@gmail.com";
        String validPassword="AydenLiam1213";
        modifyFromCartPage.getLogIn(validEmail,validPassword);
        modifyFromCartPage.clickCartIcon();
        modifyFromCartPage.clickEditIcon();
        modifyFromCartPage.clickOnMSizeBox();
        modifyFromCartPage.clickOnUpdateCart();


    }
}
