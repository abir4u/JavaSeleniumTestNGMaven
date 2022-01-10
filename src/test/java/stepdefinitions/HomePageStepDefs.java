package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Homepage;
import pages.SearchResultPage;

import java.util.List;

public class HomePageStepDefs {

    private Homepage homepage = new Homepage(DriverFactory.getDriver());
    private SearchResultPage searchResultPage = new SearchResultPage(DriverFactory.getDriver());

    @Given("I am on Google search engine")
    public void the_page_title_is_correct() {
        String title = homepage.getHomePageTitle();
        Assert.assertTrue(title.contains("Google"), "The title for the Google search engine was incorrect.\n"
                + "Expected Title: Google\n" + "Received Title: " + title);
    }

    @When("I search by {string}")
    public void i_search_by(String string) {
        homepage.performSearch(string);
    }

    @Then("I should have atleast one link to {string} in the search result")
    public void i_should_have_atleast_one_link_to_in_the_search_result(String string) {
        List<WebElement> listOfHeaderLinks = searchResultPage.fetchAllHeaderLinksForUrl(string);
        Assert.assertTrue(listOfHeaderLinks.size() > 0, "No links containing url "
                + string + " were found in the search result");
    }

}
