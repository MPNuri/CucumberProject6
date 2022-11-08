package StepDefinition;

import POM.HomePageElements;
import Utils.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class PayeeSteps {

    WebDriver driver = Driver.getDriver();
    HomePageElements homePageElements;

    @When("User clicks on Add New Payee")
    public void user_clicks_on_add_new_payee() throws InterruptedException {
        homePageElements = new HomePageElements();
        homePageElements.payeePageValidation();
    }
    @When("User should able to add {string}, {string}, {string}, {string} information")
    public void user_should_able_to_add_information(String name, String address, String account, String details) throws InterruptedException {
        homePageElements = new HomePageElements();
        homePageElements.addingNewPayee(name,address,account,details);
    }
    @Then("user should see success message")
    public void user_should_see_success_message() {
        homePageElements = new HomePageElements();
        homePageElements.validationAfterNewPayee();
    }
}
