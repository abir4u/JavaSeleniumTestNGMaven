package pages;

import factory.SharedWrappers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends SharedWrappers {

    private WebDriver driver;
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement searchTextField() {
        return inspectors.getElementByXpath("//input[@name='q']");
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public void performSearch(String keyword) {
        searchTextField().sendKeys(keyword + "\n");
    }
}
