package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class DuckDuckGoSearchResult {

    By searchResultsElement = By.xpath("(//div//ol/li)[1]//h2//a");

    protected final WebDriver driver;
    protected final Wait<WebDriver> wait;

    public DuckDuckGoSearchResult(WebDriver driver, Wait<WebDriver> wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public String getFirstSearchResultLink() {
        return this.wait.until(d -> d.findElement(searchResultsElement)).getAttribute("href");
    }

}