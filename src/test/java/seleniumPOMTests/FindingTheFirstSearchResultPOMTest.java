package seleniumPOMTests;

import engine.Bot;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DuckDuckGoHome;
import pages.DuckDuckGoSearchResult;

import java.time.Duration;

public class FindingTheFirstSearchResultPOMTest {
    //declaring a WebDriver instance
    Bot bot;

//    //declaring an explicit wait instance
//    Wait<WebDriver> wait;

    @BeforeMethod
    public void beforeMethod(){
//        //opening the Chrome browser
//        driver = new ChromeDriver();
//
//        //setting up the explicit wait
//        wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(2))
//                .pollingEvery(Duration.ofMillis(300))
//                .ignoring(NoSuchElementException.class);
        bot = new Bot();

    }

    @Test
    public void task3POM() {
        DuckDuckGoHome duckDuckGoHome = new DuckDuckGoHome();
        DuckDuckGoSearchResult duckDuckGoSearchResult = new DuckDuckGoSearchResult();

        duckDuckGoHome.navigateToDuckDuckGo();
        duckDuckGoHome.typeInSearchBox("Selenium WebDriver");
        duckDuckGoHome.clickOnTheSearchButton();

        //asserting the first search result is https://www.selenium.dev/documentation/webdriver/
        Assert.assertEquals(duckDuckGoSearchResult.getFirstSearchResultLink(),
                "https://www.selenium.dev/documentation/webdriver/");

    }

    @AfterMethod
    public void afterMethod() {
        //closing the browser
        bot.quitTheBrowser();
    }
}
