package automation_exercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Case_01 {
    /*
    Test Case 1: Register User
        1. Launch browser
        2. Navigate to url 'http://automationexercise.com'
        3. Verify that home page is visible successfully
        4. Click on 'Signup / Login' button
        5. Verify 'New User Signup!' is visible
        6. Enter name and email address
        7. Click 'Signup' button
        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        9. Fill details: Title, Name, Email, Password, Date of birth
        10. Select checkbox 'Sign up for our newsletter!'
        11. Select checkbox 'Receive special offers from our partners!'
        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        13. Click 'Create Account button'
        14. Verify that 'ACCOUNT CREATED!' is visible
        15. Click 'Continue' button
        16. Verify that 'Logged in as username' is visible
        17. Click 'Delete Account' button
        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */


    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        String expectedURL = "https://automationexercise.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement userSignUpElement = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

        Assert.assertTrue(userSignUpElement.isDisplayed());

        //6. Enter name and email address
        WebElement nameElement = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        nameElement.sendKeys("Burak");

        WebElement emailElement = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        emailElement.sendKeys("brk@gmail.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement accountInfoElement = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        Assert.assertTrue(accountInfoElement.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();

        WebElement passwordElement = driver.findElement(By.xpath("//input[@data-qa='password']"));
        passwordElement.sendKeys("password");

        driver.findElement(By.xpath("//option[text()='2']")).click();
        driver.findElement(By.xpath("//option[text()='January']")).click();
        driver.findElement(By.xpath("//option[text()='1997']")).click();

        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();

        //11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Burak");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Tetik");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Trendyol");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Ankara/Turkey");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Zonguldak/Turkey");
        driver.findElement(By.xpath("//option[text()='Canada']")).click();
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Anatolia");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Ankara");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("06850");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("22290751");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement createdElement = driver.findElement(By.xpath("//b[text()='Account Created!']"));
        Assert.assertTrue(createdElement.isDisplayed());

        //15. Click 'Continue' button
        driver.findElement(By.xpath("//a[text()='Continue']")).click();

        //16. Verify that 'Logged in as username' is visible
        WebElement loggedElement = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        Assert.assertTrue(loggedElement.isDisplayed());

        //17. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement deletedElement = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        Assert.assertTrue(deletedElement.isDisplayed());

        driver.findElement(By.xpath("//a[text()='Continue']")).click();

    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.automationexercise.com/login");

        WebElement nameElement = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));

        Actions actions = new Actions(driver);
        actions
                .sendKeys(nameElement, "Burak")
                .sendKeys(Keys.TAB)
                .sendKeys("asdf@asdfg")
                .perform();


    }

    @Test
    public void test3(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Actions actions = new Actions(driver);

        driver.get("https://www.automationexercise.com/");

        WebElement productsElement = driver.findElement(By.xpath("//*[text()=' Products']"));

        actions.click(productsElement).perform();

        List<WebElement> webElements = driver.findElements(By.xpath("//*[text()='View Product']"));

        actions.scrollToElement(webElements.get(4));

       actions.click(webElements.get(0)).perform();

       WebElement txtElement = driver.findElement(By.xpath("//*[text()='Blue Top']"));
       Assert.assertTrue(txtElement.isDisplayed());

       driver.close();

    }


}
