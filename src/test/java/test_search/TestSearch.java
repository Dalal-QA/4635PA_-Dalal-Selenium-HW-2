package test_search;

import app.pom.homepage.Homepage;
import app.pom.homepage.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {
    Homepage homepage;
    @Test
    public void testDoSearch(){
        homepage = new Homepage();
        String searchTerm = "women T shirts";
        SearchResultPage searchResultPage= homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.textSearchTerm));
    }
}
