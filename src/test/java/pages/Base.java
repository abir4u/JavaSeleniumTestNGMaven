package pages;

import org.openqa.selenium.support.PageFactory;

import static bindings.Hooks.driver;

public class Base {

    static protected Homepage homepage;

    public void InitializePages() {

        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    public void getPage(String _url) {
        driver.get(_url);
    }

}
