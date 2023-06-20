package app.pom.homepage;

import app.resultpage.SearchResultPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy (xpath = "//a[@href='https://magento.softwaretestingboard.com/']")
    public WebElement logo;

    @FindBy (xpath = "//input[@id='search']")
    public WebElement inputSearchBar;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement buttonActionSearch;

    public Homepage(){

        PageFactory.initElements(driver, this);
    }
// single responsibility methods
    public void inputSearchTerm(String searchTerm){

        clearSendKeysToElement(inputSearchBar,searchTerm);
    }
    public void clickActionSearchButton(){
        safeClickOnElement(buttonActionSearch);
    }

//Work flow method
    public SearchResultPage doSearch(String searchTerm){
        inputSearchTerm(searchTerm);
        clickActionSearchButton();
   return new SearchResultPage();
    }

}
