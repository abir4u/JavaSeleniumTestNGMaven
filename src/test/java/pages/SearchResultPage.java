package pages;

import factory.SharedWrappers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends SharedWrappers {

    private WebDriver driver;
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private By sectionHeaderLink(String url) {
        return inspectors.getSelectorByXpath("//div[@id='search']//cite[contains(., '" + url + "')]");
    }

    public List<WebElement> fetchAllHeaderLinksForUrl(String url) {
        return driver.findElements(sectionHeaderLink(url));
    }

}
