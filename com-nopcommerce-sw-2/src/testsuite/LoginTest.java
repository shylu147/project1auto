package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Not redirected to Login page", expectedText, actualText);

    }
    @Test
    public void verifyErrorMessageWithValidCredentials() {
        // Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the Email Field Enter Email address
        driver.findElement(By.id("Email")).sendKeys("shy@gmail.com");
        //Find the password Field and Enter the password
        driver.findElement(By.name("Password")).sendKeys("shy2317");
        //Click on Login Button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedMessage = "Log out";

        String actualMessage = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Log out text is not displayed",expectedMessage,actualMessage);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        // Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the Email Field Enter Email address
        driver.findElement(By.id("Email")).sendKeys("shy@gmail.com");
        //Find the password Field and Enter the password
        driver.findElement(By.name("Password")).sendKeys("shy231");
        //Click on Login Button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        System.out.println(actualMessage);
        Assert.assertEquals("Error message not displayed",actualMessage,expectedMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
