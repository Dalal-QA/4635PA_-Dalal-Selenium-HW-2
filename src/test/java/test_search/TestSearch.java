package test_search;

import app.pom.homepage.Homepage;
import app.resultpage.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {
    Homepage homepage;

    @Test(groups = {"smoke"})
    public void testDoSearchWithoutExcelSheet(){
        homepage= new Homepage();
        String searchTerm="women T shirts";
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));


    }
    @Test(groups = {"smoke"})
    public void testDoSearch(){
        homepage = new Homepage();
        String[] searchTerms= excelData.readStringArray("testDoSearch");
        String searchTerm = searchTerms[0];

        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }

    @Test(groups = {"smoke"},dataProviderClass = data_providers.DataProviders.class, dataProvider = "testDoSearch")
    public void testDoSearch(String searchTerm){
        homepage= new Homepage();
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }
}
