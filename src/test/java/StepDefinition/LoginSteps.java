package StepDefinition;

import POM.LoginElements;
import io.cucumber.java.en.*;

public class LoginSteps {

    LoginElements loginElements;

    @Given("User is on LoginPage")
    public void user_is_on_login_page() {
        loginElements = new LoginElements();
        loginElements.loginPageAssertion();
    }

    @When("User enters login credentials as Username {string} Password {string}")
    public void user_enters_login_credentials_as_username_password(String name, String password) {
        loginElements = new LoginElements();
        loginElements.loginCredentials(name,password);
    }

    @Then("User Successfully login")
    public void user_successfully_login() {
        loginElements = new LoginElements();
        loginElements.validation();
    }


}
