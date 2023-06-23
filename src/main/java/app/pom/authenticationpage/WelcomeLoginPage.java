package app.pom.authenticationpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeLoginPage extends BasePage {


    @FindBy(xpath = "//div[@class='panel header']//span[@class='logged-in']")
    public WebElement welcomeTextMessage;

    public WelcomeLoginPage() {
        PageFactory.initElements(driver, this);
    }




}
