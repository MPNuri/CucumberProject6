package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
/*
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver.null;
        }
    }
 */

    public static void driverQuit() {
        if (driver != null) { // this line means if the driver is not null we will continue and close the active  driver
            driver.quit();
            driver = null; // here we empty the driver after the quit

            // if we don't have this line next scenario will fail
            // after driver.quit we need to set driver object to null
        }

    }



}
