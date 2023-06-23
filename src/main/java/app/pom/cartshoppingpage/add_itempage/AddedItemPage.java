package app.pom.cartshoppingpage.add_itempage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddedItemPage extends BasePage {
     public AddedItemPage(){
         PageFactory.initElements(driver,this);

     }

    @FindBy(xpath = "//div[@class='message-success success message']/div[contains(.,'You added Hera Pullover Hoodie to your shopping cart.')]")
    WebElement testResult;
}


