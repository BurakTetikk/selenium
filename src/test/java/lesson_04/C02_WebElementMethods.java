package lesson_04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WebElementMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.xpath("//input[@type='text']"));

        email.sendKeys("asdfghj");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

        password.sendKeys("asdfghj");

        WebElement submit = driver.findElement(By.xpath("//button[@name='login']"));

        submit.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement error = driver.findElement(By.xpath("//span[@class='x1lliihq x1plvlek xryxfnj x1n2onr6 x1ji0vk5 x18bv5gf x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xt4736n x1havqas x1f0sm9e x12qp5cl xzsf02u x1yc453h xudqn12 x3x7a5m']"));

        if (error.isDisplayed()){
            System.out.println(error.getText());
        }

        driver.close();


    }
}
