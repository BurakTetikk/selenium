package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LoginSignInPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginTest1 {

    LoginSignInPage page = new LoginSignInPage();

    @Given("Go to website")
    public void goToWebSite() {
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        page.clickSingInElement();
    }

    @And("Type name {string}")
    public void typeName(String name) {
        page.setNameElement(name);
    }

    @And("Type email {string}")
    public void typeEmail(String email) {
        page.setEmailElement(email);
    }

}
