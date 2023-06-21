package modifyFromCartPage;

import base.BasePage;
import loginpage.WelcomeLoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyFromCartPage extends BasePage {


    @FindBy(xpath = "//div[@class='panel header']//a[contains(.,'Sign In')]")
    public WebElement loginLink;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement inputPassword ;
    @FindBy(xpath = "//button[@class='action login primary']/span[.='Sign In']")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[1]/a")
    public WebElement cartIcon;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/checkout/cart/configure/id/219863/product_id/1060/']")
    public WebElement editIcon;
    @FindBy(xpath = "//div[@class='swatch-attribute size']//div[.='M']")
    public WebElement sizeMBox;
    @FindBy(xpath = "//span[.='Update Cart']")
    public WebElement updateCartButton;

    @FindBy(xpath = "//div[.='Hera Pullover Hoodie was updated in your shopping cart.']")
    public WebElement resultUpdateText;


    public ModifyFromCartPage() {
        PageFactory.initElements(driver, this);


    }
        public void clickLoginLink() {
            safeClickOnElement(loginLink);
        }
        public void setInputEmail(String validEmail){
            sendKeysToElement(inputEmail, validEmail);
        }
        public void setInputPassword(String validPassword){
            sendKeysToElement(inputPassword, validPassword);
        }
        public void clickLoginButton() {
            safeClickOnElement(loginButton);
    }
    public void clickCartIcon(){
        safeClickOnElement(cartIcon);
    }
    public void clickEditIcon(){
        safeClickOnElement(editIcon);
    }
    public void clickOnMSizeBox(){
        safeClickOnElement(sizeMBox);
    }
    public void clickOnUpdateCart(){
        safeClickOnElement(updateCartButton);
    }

        public WelcomeLoginPage getLogIn(String validEmail, String validPassword){
            clickLoginLink();
            setInputEmail(validEmail);
            setInputPassword(validPassword);
            clickLoginButton();
            return new WelcomeLoginPage();
        }
    }

