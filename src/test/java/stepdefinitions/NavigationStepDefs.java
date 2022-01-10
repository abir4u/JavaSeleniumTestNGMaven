package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;

public class NavigationStepDefs {

    @And("^I am on the landing page$")
    public void i_am_on_the_landing_page() {
        DriverFactory.getDriver().get("https://softwareimprove.wordpress.com/");
    }

}
