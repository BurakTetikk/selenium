package lesson_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //driver.manage().window().getSize() - > içinde olduğu sayfanın pixel olarak ölçülerini döndürür
        System.out.println(driver.manage().window().getSize()); // (945, 1012) (w, h)
        System.out.println(driver.manage().window().getSize().height); // 1012

        //driver.manage().window().getPosition() -> içinde olduğu sayfanın sol alt konumunu pixel olarak döndürür
        System.out.println(driver.manage().window().getPosition());

        // driver.manage().window().setPosition(new Point(15, 15)); -> içinde olduğu sayfanın sol alt konumunu pixel olarak istediğimiz noktaya getirir
        driver.manage().window().setPosition(new Point(15, 15));

        // driver.manage().window().setSize(new Dimension(900, 900)); -> içinde olduğu sayfanın pixel olarak ölçülerini istediğimiz boyuta getirir
        driver.manage().window().setSize(new Dimension(900, 900));

        System.out.println("New size: " + driver.manage().window().getSize());
        System.out.println("New position: " + driver.manage().window().getPosition());

        // driver.manage().window().minimize(); -> içinde olduğu sayfayı maximize yapar
        driver.manage().window().minimize();
        System.out.println("Maximize size: " + driver.manage().window().getSize());//Maximize size: (900, 900)
        System.out.println("Maximize position: " + driver.manage().window().getPosition());//Maximize position: (15, 15)

        // driver.manage().window().fullscreen(); -> içinde olduğu sayfayı fullscreen yapar
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen size: " + driver.manage().window().getSize());//Fullscreen size: (1920, 1080)
        System.out.println("Fullscreen position: " + driver.manage().window().getPosition());//Fullscreen position: (0, 0)

        // driver.manage().window().minimize(); -> sayfayı simge durumuna küçültür
        driver.manage().window().minimize();


        /*
            driver'a sayfanın yüklenmesi ve kullanacağımız web elementlerin bulunması için bekleyeceği maximum süreyi belirtir
            driver bu süre içerisinde  sayfa yüklenir/web element bulunursa beklemeden çalışmaya devam eder.
            bu süre bittiği halde sayfa yüklenememiş/element bulunamamışsa exception vererek çalışmayı durdurur
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
            Driver'ın istediğimiz işlemleri yaparken sorunla karşılaşmaması için driver.manage() methodlarından
            maximize() ve implicitlyWait() methodlarını her testte kullanılması faydalı olacaktır.
         */

        driver.close();





    }
}
