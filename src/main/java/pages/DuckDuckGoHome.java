package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class DuckDuckGoHome {

    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    private final By searchBoxLocator = By.xpath("//div/input[@class='searchbox_input__rnFzM']");
    private final By searchButtonLocator = By.xpath("//div/button[@type='submit']");


    public DuckDuckGoHome(WebDriver driver, Wait<WebDriver> wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToDuckDuckGo() {

        driver.navigate().to("https://duckduckgo.com/");
    }

    public void typeInSearchBox(String searchText) {

        driver.findElement(searchBoxLocator).sendKeys(searchText);
    }

    public DuckDuckGoSearchResult clickOnTheSearchButton() {
        driver.findElement(searchButtonLocator).click();
        return new DuckDuckGoSearchResult(driver, wait);
    }
}