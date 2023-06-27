package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Register']")).click();
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Shy");
        driver.findElement(By.id("LastName")).sendKeys("Birunt");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("14");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1984");
        driver.findElement(By.id("Email")).sendKeys("shy@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("shy2317");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("shy2317");
        driver.findElement(By.id("register-button")).click();
        String actualMessage=driver.findElement(By.xpath("//div[@class='result']")).getText();
        String expectedMessage="Your registration completed";
        Assert.assertEquals("Message not displayed",actualMessage,expectedMessage);
    }






}
