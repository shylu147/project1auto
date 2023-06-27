package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();
       String actualText= driver.findElement(By.xpath("//a[text()='Computers ']")).getText();
       String expectedText="Computers";
       Assert.assertEquals("Computers text not displayed",actualText,expectedText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
       String actualText= driver.findElement(By.xpath("//a[text()='Electronics ']")).getText();

        String expectedText="Electronics";
        Assert.assertEquals("Electronics text not displayed",actualText,expectedText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
        String actualText= driver.findElement(By.xpath("//a[text()='Apparel ']")).getText();
        String expectedText="Apparel";
        Assert.assertEquals("Apparel text not displayed",actualText,expectedText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
        String actualText= driver.findElement(By.xpath("//a[text()='Digital downloads ']")).getText();
        String expectedText="Digital downloads";
        Assert.assertEquals("Digital downloads text not displayed",actualText,expectedText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        String actualText= driver.findElement(By.xpath("//a[text()='Books ']")).getText();
        String expectedText="Books";
        Assert.assertEquals("Books text not displayed",actualText,expectedText);
    }

    @Test
    public void userShouldNavigateToJwelryPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
        String actualText= driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();
        String expectedText="Jewelry";
        Assert.assertEquals("Jewelry text not displayed",actualText,expectedText);
    }

    @Test
    public void userShouldNavigateToGiftCardPageSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
        String actualText= driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        String expectedText="Gift Cards";
        Assert.assertEquals("Gift Cards text not displayed",actualText,expectedText);


    }}
