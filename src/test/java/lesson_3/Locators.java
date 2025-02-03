package lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        element.click();

        WebElement emailBox = driver.findElement(By.xpath("//input[@id='ap_email_login']"));

        emailBox.click();

        WebElement refuseButton = driver.findElement(By.cssSelector("button[id='sp-cc-rejectall-link']"));

        refuseButton.click();

    }
}
