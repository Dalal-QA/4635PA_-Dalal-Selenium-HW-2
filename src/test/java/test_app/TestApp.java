package test_app;

import add_itempage.AddItemPage;
import add_itempage.AddedItemPage;
import addremovemodifyfromcartpage.AddModifyCartPage;
import app.pom.homepage.Homepage;
import app.resultpage.SearchResultPage;
import base.BasePage;
import loginpage.LogInPage;
import loginwithinvalidcredentials.LoginWithInvalidCredentials;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import registrationpage.RegistrationPage;

public class TestApp extends BasePage {

    @Test(priority = 0, groups = {"BAT"})
    public void testNavigationToApplication() {
        Homepage homepage = new Homepage();

        Assert.assertTrue(isElementVisible(homepage.logo));
    }

    @Test(groups = {"BAT"})
    public void testDoSearchWithoutExcelSheet(){
        Homepage homepage= new Homepage();
        String searchTerm="women T shirts";
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));


    }
    @Test(priority = 1,groups = {"BAT"})
    public void testDoSearch(){
        Homepage homepage = new Homepage();
        String[] searchTerms= excelData.readStringArray("testDoSearch");
        String searchTerm = searchTerms[0];

        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }

    @Test(priority = 2 ,groups = {"BAT"},dataProviderClass = data_providers.DataProviders.class, dataProvider = "testDoSearch")
    public void testDoSearch(String searchTerm){
        Homepage homepage= new Homepage();
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }

    @Test(priority = 3, groups= {"BAT"})
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

    @Test(priority = 4, groups = {"BAT"})

    public void testLoginWithValidCredentials(){

        LogInPage logInPage= new LogInPage();
        String validEmail ="connie.smith@gmail.com";
        String validPassword="AydenLiam1213";
        logInPage.getLogIn(validEmail,validPassword);
        Assert.assertTrue(isElementVisible(logInPage.resultLoginMessage));

    }

    @Test(priority = 5, groups = {"BAT"})
    public void testLoginWithInvalidCredentials(){

        LoginWithInvalidCredentials loginWithInvalidCredentials= new LoginWithInvalidCredentials();
        String invalidEmail= "connor.smith@gmail.com";
        String invalidPassword= "Ayden1213";
        loginWithInvalidCredentials.getLogIn(invalidEmail,invalidPassword);
        Assert.assertTrue(isElementVisible(loginWithInvalidCredentials.errorMessageLogin));
    }

    @Test(priority = 6, groups="BAT")
    public void testAddItemToCart(){
       AddItemPage addItemPage=new AddItemPage();

        String[] searchTerms = excelData.readStringArray("testDoSearch");
        String searchTerm = searchTerms[9];
        addItemPage.addItemToTheCart(searchTerm);


//        String searchItem="Pullover";
//        addItemPage.AddItemToTheCart(searchItem);
//
        Assert.assertTrue(isElementVisible(AddedItemPage.driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"))));

    }

    @Test(priority = 7, groups = {"BAT"})
    public void addModifyRemoveFromCartData() {
        Homepage homepage = new Homepage();
        homepage.doSearch("Duffle Bag");
        AddModifyCartPage addModifyRemove=new AddModifyCartPage();
        addModifyRemove.addToCartItem();
        addModifyRemove.modifyItem();
        addModifyRemove.removeCartItem();
        Assert.assertTrue(isElementVisible(addModifyRemove.noItemsInCart));

    }
    @Test(priority = 8, groups = {"BAT"})

    public void testCategoryResult() {
        Homepage homepage = new Homepage();
        homepage.doFilterTo();
        Assert.assertTrue(isElementVisible(homepage.categoryJacketResult));

    }


}
