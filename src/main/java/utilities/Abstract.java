package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class Abstract {
    private WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickContactUs(WebElement element) {
        driver = Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        element.click();
    }

    public void sendKeys(WebElement element, String string){

        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(string);
    }
}
