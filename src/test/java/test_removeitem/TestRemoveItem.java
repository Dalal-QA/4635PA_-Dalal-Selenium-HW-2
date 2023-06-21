package test_removeitem;

import base.BasePage;
import org.testng.annotations.Test;
import remove_itempage.RemoveItemPage;

public class TestRemoveItem extends BasePage {
    RemoveItemPage removeItemPage;

    @Test(groups={"smoke"})
    public void testRemoveItemFromCart(){
        removeItemPage= new RemoveItemPage();
        String searchTerm="Pullover";
//        String[] searchTerms = excelData.readStringArray("testDoSearch");
//        String searchTerm = searchTerms[9];
        removeItemPage.removeItemFromCart(searchTerm);



    }
}
