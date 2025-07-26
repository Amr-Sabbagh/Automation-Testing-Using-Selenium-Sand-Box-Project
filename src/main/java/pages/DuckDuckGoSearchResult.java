package pages;

import engine.Bot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class DuckDuckGoSearchResult {

    By searchResultsElement = By.xpath("(//div//ol/li)[1]//h2//a");

    WebDriver driver;
    Wait<WebDriver> wait;

//    public DuckDuckGoSearchResult(WebDriver driver, Wait<WebDriver> wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }

    Bot bot = new Bot();

    public String getFirstSearchResultLink() {
//        return this.wait.until(d -> d.findElement(searchResultsElement)).getAttribute("href");
        return bot.getAttribute(searchResultsElement, "href");
    }

}
