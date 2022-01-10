package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.Homepage;

public class HomePageStepDefs {

    private Homepage homepage = new Homepage(DriverFactory.getDriver());

    @Given("the page title is correct")
    public void the_page_title_is_correct() {
        String title = homepage.getHomePageTitle();
        Assert.assertTrue(title.contains("Software Improve"));
    }
}
