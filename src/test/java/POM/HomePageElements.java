package POM;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Locale;

public class HomePageElements extends BasePOM{

    public HomePageElements() {
        PageFactory.initElements(driver,this);
    }

    WebDriver driver = Driver.getDriver();

    @FindBy(css = "#onlineBankingMenu>div>strong")
    private WebElement onlineBanking;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    private WebElement payBillsButton;

    @FindBy(xpath = "//a[@href='#ui-tabs-2']")
    private WebElement newPayeeButton;

    @FindBy(xpath = "//h2[text()='Who are you paying?']")
    private WebElement newPayeeHeader;

    String header = "Who are you paying?";

    @FindBy(id = "np_new_payee_name")
    private WebElement payeeNameInput;

    @FindBy(id = "np_new_payee_address")
    private WebElement payeeAddressInput;

    @FindBy(id = "np_new_payee_account")
    private WebElement payeeAccountInput;

    @FindBy(id = "np_new_payee_details")
    private WebElement payeeDetailsInput;

    @FindBy(id = "add_new_payee")
    private WebElement addingPayee;

    @FindBy(id = "alert_content")
    private WebElement newPayeeValidation;

    String newPayeeURL = "http://zero.webappsecurity.com/bank/pay-bills.html";

    public void payeePageValidation() throws InterruptedException {
        Thread.sleep(2500);
        //wait.until(ExpectedConditions.visibilityOf(moreServicesButton));
        //Assert.assertTrue(moreServicesButton.isDisplayed());
    }

    public void addingNewPayee(String payeeName, String payeeAddress, String payeeAccount, String payeeDetails) throws InterruptedException {
        Thread.sleep(2500);
        onlineBanking.click();
        wait.until(ExpectedConditions.urlContains("online-banking"));
        waitMethodsInOne(payBillsButton);
        newPayeeButton.click();
        payeeNameInput.sendKeys(payeeName);
        payeeAddressInput.sendKeys(payeeAddress);
        payeeAccountInput.sendKeys(payeeAccount);
        payeeDetailsInput.sendKeys(payeeDetails);
    }

    public void validationAfterNewPayee() {
        Assert.assertTrue(newPayeeValidation.isDisplayed());
        Assert.assertTrue(newPayeeValidation.getText().toLowerCase().contains("successfully "));
    }




}
