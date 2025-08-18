package seleniumFluentPomTest;

import fluentPomPages.DuckDuckGoHomeFluentPage;
import fluentPomPages.DuckDuckGoSearchResultFluentPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindingTheFirstSearchResultFluentPomTest {
    //declaring a WebDriver instance
    WebDriver driver;

    //declaring an explicit wait instance
    Wait<WebDriver> wait;

    //declaring a DuckDuckGoHome instance
    DuckDuckGoHomeFluentPage duckDuckGoHomeFluentPage ;
    DuckDuckGoSearchResultFluentPage duckDuckGoSearchResultFluentPage;

    @BeforeMethod
    public void beforeMethod(){
        //opening the Chrome browser
        driver = new ChromeDriver();

        //setting up the explicit wait
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

        //setting up the DuckDuckGoHome page object
        duckDuckGoHomeFluentPage = new DuckDuckGoHomeFluentPage(driver,wait);
    }

    @Test
    public void firstSearchResultFluentPOMTest() {

        duckDuckGoSearchResultFluentPage = duckDuckGoHomeFluentPage.navigateToDuckDuckGo()
                                           .typeInSearchBox("Selenium WebDriver")
                                           .clickOnTheSearchButton();


        //asserting the first search result is https://www.selenium.dev/documentation/webdriver/
        Assert.assertEquals(duckDuckGoSearchResultFluentPage.getFirstSearchResultLink(),
                "https://www.selenium.dev/documentation/webdriver/");

    }

    @AfterMethod
    public void afterMethod() {
        //closing the browser
        driver.quit();
    }
}
