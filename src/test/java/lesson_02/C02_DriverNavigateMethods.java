package lesson_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverNavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        // driver.navigate().to("url") -> istenen url'e gider, driver.get("url") ile aynı işlemi yapar ama forward ve backward yapılmasına imkan verir
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.youtube.com");

        //driver.navigate.back() -> bir önceki sayfaya dönüş yapar
        driver.navigate().back();

        //driver.navigate.forward() -> back() ile geldiği sayfaya geri gider
        driver.navigate().forward();

        // driver.navigate().refresh() -> içinde olduğu sayfayı yeniler
        driver.navigate().refresh();

        // driver.close(); -> driver oluşturulduğunda  açılan sayfayı kapatmak istersek
        driver.close();

        // driver.quit(); -> driver çalışırken birden fazla tab veya window açtıysa tümünü kapatır
        //driver.quit();
    }
}
