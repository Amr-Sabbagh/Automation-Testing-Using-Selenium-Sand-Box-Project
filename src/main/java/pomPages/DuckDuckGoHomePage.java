package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DuckDuckGoHomePage {

    protected WebDriver driver;

    private final By searchBoxLocator = By.id("searchbox_input");
    private final By searchButtonLocator = By.xpath("//div/button[@type='submit']");


    public DuckDuckGoHomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void navigateToDuckDuckGo() {

        driver.navigate().to("https://duckduckgo.com/");
    }

    public void typeInSearchBox(String searchText) {

        driver.findElement(searchBoxLocator).sendKeys(searchText);
    }

    public void clickOnTheSearchButton() {
        driver.findElement(searchButtonLocator).click();
    }
}