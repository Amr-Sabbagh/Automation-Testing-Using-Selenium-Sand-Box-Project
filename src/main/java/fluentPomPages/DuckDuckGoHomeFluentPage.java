package fluentPomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class DuckDuckGoHomeFluentPage {

    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    private final By searchBoxLocator = By.id("searchbox_input");
    private final By searchButtonLocator = By.xpath("//div/button[@type='submit']");


    public DuckDuckGoHomeFluentPage(WebDriver driver, Wait<WebDriver> wait) {

        this.driver = driver;
        this.wait = wait;
    }

    public DuckDuckGoHomeFluentPage navigateToDuckDuckGo() {

        driver.navigate().to("https://duckduckgo.com/");
        return this;
    }

    public DuckDuckGoHomeFluentPage typeInSearchBox(String searchText) {

        driver.findElement(searchBoxLocator).sendKeys(searchText);
        return this;
    }

    public DuckDuckGoSearchResultFluentPage clickOnTheSearchButton() {

        driver.findElement(searchButtonLocator).click();
        return new DuckDuckGoSearchResultFluentPage(driver, wait); // Assuming you will handle the Wait in the next page
    }
}