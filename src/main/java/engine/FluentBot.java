package engine;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentBot {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public FluentBot() {
        driver = initDriver();
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(1))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
    }

    private WebDriver initDriver() {
        WebDriver driver;
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        switch (browser) {
            case "firefox" -> driver = new FirefoxDriver();
            case "safari" -> driver = new SafariDriver();
            case "edge" -> driver = new EdgeDriver();
            default -> driver = new ChromeDriver();
        }
        return driver;
    }

    public FluentBot navigateTo(String url) {

        driver.navigate().to(url);
        return this;
    }

    public void quit() {

        driver.quit();
    }

    public FluentBot click(By locator) {
        wait.until(d -> {
            d.findElement(locator).click();
            return true;
        });
        return this;
    }

    public FluentBot type(By locator, String text) {
        wait.until(d -> {
            d.findElement(locator).clear();
            d.findElement(locator).sendKeys(text);
            return true;
        });
        return this;
    }


    public String getAttribute(By locator, String attribute) {
        return wait.until(d -> d.findElement(locator).getAttribute(attribute));
    }
}
