package bindings;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import util.ConfigReader;

import java.util.Properties;

public class AppHooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties properties;

    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        properties = configReader.initProp();
    }

    @Before(order = 1)
    public void launchBrowser() {
        String browser = properties.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.initDriver(browser);
    }

    @Before(order = 2)
    public void loadLandingPage() {
        String landingPageUrl = properties.getProperty("url");
        driver.get(landingPageUrl);
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take screenshot
            String screenshotName = scenario.getName().replaceAll("", "");
            byte [] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }

    @After(order = 0)
    public void quitBrowser() {
        driver.quit();
    }
}
