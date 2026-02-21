package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class DuckDuckGoHomePage {

    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    private final By searchBoxLocator = By.id("searchbox_input");
    private final By searchButtonLocator = By.xpath("//div/button[@type='submit']");


    public DuckDuckGoHomePage(WebDriver driver, Wait<WebDriver> wait) {

        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToDuckDuckGo() {

        driver.navigate().to("https://duckduckgo.com/");
    }

    public void typeInSearchBox(String searchText) {

        driver.findElement(searchBoxLocator).sendKeys(searchText);
    }

    public void clickOnTheSearchButton() {
        wait.until(d-> { d.findElement(searchButtonLocator).click();return true;});
    }
}