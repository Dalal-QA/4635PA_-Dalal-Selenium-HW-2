package test_removeitem;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import remove_itempage.RemoveItemPage;

import java.util.Set;

public class TestRemoveItem extends BasePage {
    RemoveItemPage removeItemPage;

    @Test(groups={"smoke"})
    public void testRemoveItemFromCart  (){
        removeItemPage= new RemoveItemPage();
        String searchTerm="Pullover";
//        String[] searchTerms = excelData.readStringArray("testDoSearch");
//        String searchTerm = searchTerms[9];

//
//        String defaultFrame = driver.getWindowHandle();
//        WebElement newWindowButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a"));
//        newWindowButton.click();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for(String handle : windowHandles){
//            if(!handle.equals(defaultFrame)){
//                driver.switchTo().window(handle);
//                break;
//            }
//        }
//        WebElement removeIemIcon = driver.findElement(By.xpath("//a[contains(.,'Remove')]"));
//        removeIemIcon.click();

        removeItemPage.removeItemFromCart(searchTerm);

        //Assert.assertTrue(isElementVisible(driver.findElement(By.xpath("//strong[@class='subtitle empty']"))));




    }
}
