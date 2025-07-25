package pages;

import engine.Bot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class DuckDuckGoHome {
    String duckDuckGoUrl = "https://duckduckgo.com/";

    By searchBoxLocator = By.xpath("//div/input[@class='searchbox_input__rnFzM']");
    By searchButtonLocator = By.xpath("//div/button[@type='submit']");

//    WebDriver driver;
//    Wait<WebDriver> wait;

    Bot bot = new Bot();

//    public DuckDuckGoHome(WebDriver driver, Wait<WebDriver> wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }

    public void navigateToDuckDuckGo() {
//        driver.navigate().to(duckDuckGoUrl);
        bot.navigateTo(duckDuckGoUrl);
    }

    public void typeInSearchBox(String searchText) {
//        driver.findElement(searchBoxLocator).sendKeys(searchText);
        bot.type(searchBoxLocator, searchText);
    }

    public void clickOnTheSearchButton() {
//        driver.findElement(searchButtonLocator).click();
        bot.click(searchButtonLocator);
    }
}
