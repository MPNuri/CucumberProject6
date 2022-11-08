package POM;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginElements extends BasePOM{

    WebDriver driver = Driver.getDriver();

    public LoginElements() {
        PageFactory.initElements(driver,this);
    }

    String currentURL;
    @FindBy(id = "user_login")
    private WebElement userName;

    @FindBy(id = "user_password")
    private WebElement userPassword;

    @FindBy(css = "input[type='submit']")
    private WebElement loginButton;

    @FindBy(css = "a[href='/index.html']")
    private WebElement enterValidation;

    String afterLogin = "http://zero.webappsecurity.com/index.html";

    public void loginPageAssertion() {
        waitMethodsInOne(userName);
        Assert.assertTrue(userName.isDisplayed());
        Assert.assertTrue(userPassword.isDisplayed());
        //  Assert.assertTrue(loginButton.isDisplayed());
        // Assert.assertTrue(currentURL.contains("http://zero.webappsecurity.com/login.html"));
    }

    public void loginCredentials(String name, String password) {
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        loginButton.click();
        driver.navigate().back();
        wait.until(ExpectedConditions.urlToBe("http://zero.webappsecurity.com/index.html"));
    }

    public void validation() {
        Assert.assertTrue(afterLogin.contains("/index.html"));
        wait.until(ExpectedConditions.urlToBe("http://zero.webappsecurity.com/index.html"));
    }






}

