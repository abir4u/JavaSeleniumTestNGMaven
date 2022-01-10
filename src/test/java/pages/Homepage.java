package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;

    private By primeLogo = By.className("customlogolink");

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public boolean isLogoExist() {
        return driver.findElement(primeLogo).isDisplayed();
    }
}
