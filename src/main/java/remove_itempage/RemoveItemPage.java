package remove_itempage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveItemPage extends BasePage {


    @FindBy(xpath = "//input[@id='search']")
    public WebElement inputSearchBar;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement buttonActionSearch;

    @FindBy(xpath = "//a[contains(.,'Hera Pullover Hoodie')]")
    public WebElement wantedItem;


    @FindBy(id="option-label-size-143-item-167")
    public WebElement sizeBox;

    @FindBy(id= "option-label-color-93-item-50")
    WebElement colorBox;

    @FindBy(id="product-addtocart-button")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement numberOfItemInCart;

    @FindBy(xpath = "//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")
    WebElement removeItemIcon;
    @FindBy(xpath = "/html/body/div[3]/aside[2]/div[2]/footer/button[2]")
    WebElement okRemoveItemButton;
    @FindBy(xpath = "//*[@id=\"minicart-content-wrapper\"]/div[2]/strong")
    WebElement removedItemResultText;

    public RemoveItemPage(){
        PageFactory.initElements(driver,this);

    }

    public void inputSearchTerm(String searchTerm){

        clearSendKeysToElement(inputSearchBar,searchTerm);
    }
    public void clickActionSearchButton(){

        safeClickOnElement(buttonActionSearch);
    }
    public void clickOnTheItem(){
        safeClickOnElement(wantedItem);
    }
    public void selectYourSize(){
        safeClickOnElement(sizeBox);
    }
    public void selectAColor(){
        safeClickOnElement(colorBox);
    }
    public void clickOnAddToCartButton(){
        safeClickOnElement(addToCartButton);
    }

    public void clickOnNumberOfItemInCart(){
        safeClickOnElement(numberOfItemInCart);

    }

    public void clickOnRemoveItemIcon(){
        safeClickOnElement(removeItemIcon);
    }
    public void clickOnOkRemoveItem(){
        safeClickOnElement(okRemoveItemButton);
    }

    public void removeItemFromCart(String searchTerm) {
        inputSearchTerm(searchTerm);
        clickActionSearchButton();
        clickOnTheItem();
        selectYourSize();
        selectAColor();
        clickOnAddToCartButton();
        clickOnNumberOfItemInCart();
        clickOnRemoveItemIcon();
        clickOnOkRemoveItem();

    }


    }
