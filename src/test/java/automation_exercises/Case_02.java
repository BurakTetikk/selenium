package automation_exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Case_02 {
/*
       Test Case 2: Login User with correct email and password
        1. Launch browser
        2. Navigate to url 'http://automationexercise.com'
        3. Verify that home page is visible successfully
        4. Click on 'Signup / Login' button
        5. Verify 'Login to your account' is visible
        6. Enter correct email address and password
        7. Click 'login' button
        8. Verify that 'Logged in as username' is visible
        9. Click 'Delete Account' button
        10. Verify that 'ACCOUNT DELETED!' is visible
 */

    @Test
    public void test01(){

        //1. Launch browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        SoftAssert softAssert = new SoftAssert();

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        Actions actions = new Actions(driver);
        String expectedURL = "https://automationexercise.com/";
        String actualURL = driver.getCurrentUrl();

        softAssert.assertEquals(actualURL, expectedURL, "Home Page");

        //4. Click on 'Signup / Login' button
        WebElement signupElement = driver.findElement(By.xpath("//*[text()=' Signup / Login']"));

        actions.click(signupElement).perform();

        //5. Verify 'Login to your account' is visible
        WebElement verifyLogin = driver.findElement(By.xpath("//*[text()='Login to your account']"));
        softAssert.assertTrue(verifyLogin.isDisplayed(), "Verify 'Login to your account'");


        //6. Enter correct email address and password
        //7. Click 'login' button
        WebElement emailElement = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        actions
                .sendKeys(emailElement, "brk@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("password")
                .sendKeys(Keys.TAB)
                .click(driver.findElement(By.xpath("//button[@data-qa='login-button']")))
                .perform();


        //8. Verify that 'Logged in as username' is visible
        WebElement loggedElement = driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
        softAssert.assertTrue(loggedElement.isDisplayed(), "Logged Element");

        //9. Click 'Delete Account' button
        WebElement deleteElement = driver.findElement(By.xpath("//*[text()=' Delete Account']"));
        actions
                .click(deleteElement)
                .perform();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement verifyDelete = driver.findElement(By.xpath("//*[text()='Account Deleted!']"));
        softAssert.assertTrue(verifyDelete.isDisplayed(), "Delete Verify");


        softAssert.assertAll();

        driver.close();



    }


}
