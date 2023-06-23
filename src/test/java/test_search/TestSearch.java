package test_search;

import app.pom.homepage.Homepage;
import app.pom.resultpage.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {


    @Test(groups = {"BAT"})
    public void testDoSearchWithoutExcelSheet(){
        Homepage homepage= new Homepage();
        String searchTerm="women T shirts";
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));


    }
    @Test(priority = 1,groups = {"BAT"})
    public void testDoSearch(){
        Homepage homepage = new Homepage();
        String[] searchTerms= excelData.readStringArray("testDoSearch");
        String searchTerm = searchTerms[0];

        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }

    @Test(priority = 2 ,groups = {"BAT"},dataProviderClass = data_providers.DataProviders.class, dataProvider = "testDoSearch")
    public void testDoSearch(String searchTerm){
        Homepage homepage= new Homepage();
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }

    @Test(priority = 3,groups={"BAT"})
    public void testDoSearchWithInvalidSearchTerm() {

        Homepage homepage = new Homepage();
        String searchTerm = "@#$^";
        SearchResultPage searchResultPage = homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.resultInvalidSearchTerm));
    }

}
