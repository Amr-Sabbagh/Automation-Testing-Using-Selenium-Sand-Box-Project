package seleniumFlatTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;


public class FindingTheFirstSearchResultFlatTest {

    //declaring a WebDriver instance
    WebDriver driver;

    //declaring an explicit wait instance
    Wait<WebDriver> wait;

    @BeforeMethod
    public void before() {

        //opening the Chrome browser
        driver = new ChromeDriver();

        //setting up the explicit wait
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
    }

    @Test
    public void firstSearchResultFlatTest(){

        //navigate to the page
        driver.navigate().to("https://duckduckgo.com/");

        //locating the search box
        By searchBoxLocator = By.id("searchbox_input");
        driver.findElement(searchBoxLocator).sendKeys("Selenium WebDriver");

        //locating the search button
        By searchButtonLocator = By.xpath("//div/button[@type='submit']");
        driver.findElement(searchButtonLocator).click();

        //locating search result elements
        By searchResultsElement = By.xpath("(//div//ol/li)[1]//h2//a");

        //asserting the first search result is https://www.selenium.dev/documentation/webdriver/
        Assert.assertEquals(wait.until(d-> d.findElement(searchResultsElement)).getAttribute("href"),
                            "https://www.selenium.dev/documentation/webdriver/");

    }

    @AfterMethod
    public void afterMethod() {

        //closing the Chrome browser
        driver.quit();

    }

}
