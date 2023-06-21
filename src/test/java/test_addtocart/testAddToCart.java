package test_addtocart;

import add_itempage.AddItemPage;
import add_itempage.AddedItemPage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testAddToCart extends BasePage {

    AddItemPage addItemPage;

    @Test(groups="smoke")
    public void testAddItemToCart(){
        addItemPage=new AddItemPage();

        String[] searchTerms = excelData.readStringArray("testDoSearch");
        String searchTerm = searchTerms[9];
        addItemPage.addItemToTheCart(searchTerm);


//        String searchItem="Pullover";
//        addItemPage.AddItemToTheCart(searchItem);
//
        Assert.assertTrue(isElementVisible(AddedItemPage.driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"))));

    }


}
