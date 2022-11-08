package StepDefinition;

import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    WebDriver driver = Driver.getDriver();

    @Before
    public void setUp() {
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        // this is not the way we work driver.quit();
        Driver.driverQuit(); // this will work perfectly.
    }
}
