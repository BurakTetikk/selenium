package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Abstract;
import utilities.Driver;

public class LoginSignInPage extends Abstract {
    private WebDriver driver;

    public LoginSignInPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    private WebElement signInElement;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement nameElement;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement emailElement;





    public void clickSingInElement(){
        clickContactUs(signInElement);
    }

    public void setNameElement(String name) {
        sendKeys(nameElement, name);
    }

    public void setEmailElement(String email){
        sendKeys(emailElement, email);
    }
}
