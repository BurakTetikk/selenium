package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

    @Given("Go to Amazon website")
    public void go_to_amazon_website() {
        System.out.println("Amazon");
    }

    @Given("Login")
    public void login() {
        System.out.println("login");
    }

    @Given("Enter name")
    public void enter_name() {
        System.out.println("name");
    }

    @Given("Enter password")
    public void enter_password() {
        System.out.println("password");
    }

    @When("Click submit")
    public void click_submit() {
        System.out.println("submit");
    }

    @Then("Verify success message")
    public void verify_success_message() {
        System.out.println("success");
    }
}
