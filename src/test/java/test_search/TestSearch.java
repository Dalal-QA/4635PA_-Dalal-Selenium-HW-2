package test_search;

import app.pom.homepage.Homepage;
import app.pom.homepage.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {
    Homepage homepage;
//    @Test
//    public void testDoSearch(){
//        homepage = new Homepage();
//        String[] searchTerms= excelData.readStringArray("testDoSearch");
//        String searchTerm = searchTerms[0];
//
//        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
//        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
//    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testDoSearch")
    public void testDoSearch(String searchTerm){
        homepage= new Homepage();
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }
}
