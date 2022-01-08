package bindings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Base;

public class Hooks extends Base {
    public static WebDriver driver;

    /**
     * This is the final setup function that helps configure all attributes
     * required to start the test. This includes the following:
     * - Specify the OS attributes for the script to know
     * - Set the browser properties for the testing browser
     * - Initiate the web driver
     * - Initialize the objects for all page classes to be used during the test run.
     *
     * @return the global driver to be used across all tests.
     */
    public WebDriver Setup() {
        setSystemProperties();
        try {
            InitiateDriver();
        } catch (Exception e) {
        }
        InitializePages();
        return driver;
    }

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

    private WebDriver InitiateDriver() throws Exception {
        String browser;
        System.out.println("Initiating WebDriver");
        String _browser = System.getProperty("browser");
        if (null != _browser && !_browser.isEmpty()) {
            browser = _browser;
        } else {
            browser = "chrome";
        }
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new Error("Unknown browser");
        }
        
        return driver;
    }

    public void closeDriver() {
        driver.quit();

    }

}
