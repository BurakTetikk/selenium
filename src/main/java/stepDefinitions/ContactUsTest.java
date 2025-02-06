package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ContactUsPage;
import utilities.Abstract;
import utilities.ConfigReader;
import utilities.Driver;

public class ContactUsTest extends Abstract {
    @Given("Navigate to website")
    public void navigate_to_website() {
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
    }

    @Given("Click on contact us button")
    public void click_on_contact_us_button() {
        ContactUsPage page = new ContactUsPage();
        clickContactUs(page.contactUsElement);
    }

    @Given("Select subject heading")
    public void select_subject_heading() {

    }

    @Given("Type email")
    public void type_email() {

    }

    @Given("Type order reference")
    public void type_order_reference() {

    }

    @Given("Type a message")
    public void type_a_message() {

    }

    @When("Click on send button")
    public void click_on_send_button() {

    }
}
