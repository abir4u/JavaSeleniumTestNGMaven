package stepdefinitions;

import cucumber.api.java.en.And;
import pages.Base;

public class NavigationStepDefs extends Base {

    @And("^I am on the landing page$")
    public void i_am_on_the_landing_page() {
        getPage("https://softwareimprove.wordpress.com/");
    }

}
