package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    /**
     * This method is used to initialize the threadlocal driver on the basis of given browser.
     * @param browser
     * @return This will return threadLocalDriver.
     */
    public WebDriver initDriver(String browser) {
        setSystemProperties();

        if (browser.equals("chrome")) {
            threadLocalDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            threadLocalDriver.set(new FirefoxDriver());
        } else {
            throw new Error("Unknown browser");
        }

        getDriver().manage().deleteAllCookies();

        return getDriver();
    }

    /**
     * This is used to get the driver with ThreadLocal
     * @return
     */
    public static synchronized WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    /**
     * This method is to detect OS platform and set the driver accordingly.
     */
    private void setSystemProperties() {
        String path = System.getProperty("user.dir") + "/src/test/supportingFiles/drivers/";

        if (System.getProperty("os.name").contains("Win")) {
            System.setProperty("webdriver.chrome.driver", path + "win/chromedriver.exe");
            System.setProperty("webdriver.firefox.marionette", path + "win/geckodriver.exe");

        } else if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", path + "mac/chromedriver");
            System.setProperty("webdriver.gecko.driver", path + "mac/geckodriver");
        }
    }

}
