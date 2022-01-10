package wrappers;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inspectors {

    private WebDriver driver;
    public Inspectors(WebDriver driver) {
        this.driver = driver;
    }

    public By getSelectorByXpath(String xpathValue) {
        return By.xpath(xpathValue);
    }

    public WebElement getElementByXpath(String xpathValue) {
        return DriverFactory.getDriver().findElement(getSelectorByXpath(xpathValue));
    }
}
