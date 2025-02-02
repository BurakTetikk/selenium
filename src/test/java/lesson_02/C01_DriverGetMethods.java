package lesson_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // driver.get("url") -> yazdığımız url'e gider
        driver.get("https:/www.amazon.com");


        // driver.getTitle() -> içinde olduğu sayfanın başlığını döndürür
        System.out.println(driver.getTitle()); // Amazon.com. Spend less. Smile more.

        // driver.getCurrentUrl() -> içinde olduğu sayfanın URL'ini döndürür.
        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/

        // driver.getPageSource() -> içinde bulunduğu sayfanın kaynak kodlarını döndürür
        //System.out.println(driver.getPageSource());

        // driver.getWindowHandle() -> içinde bulunduğu sayfanın UNIQUE hash kodunu döndürür
        System.out.println(driver.getWindowHandle()); // 1B313300A39C5B691BE1DBB3CC01C9C6

        // driver.getWindowHandles() -> driver çalışırken açılan tüm sayfaların UNIQUE hash kodunu döndürür
        System.out.println(driver.getWindowHandles());


    }
}
