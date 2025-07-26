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

public class Bot {

    WebDriver driver;
    Wait<WebDriver> wait;

    public Bot(){
        driver = initializeDriver();

        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
    }

    private WebDriver initializeDriver() {
        WebDriver driver;
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        driver = switch (browser) {
            case "firefox" -> new FirefoxDriver();
            case "edge" -> new EdgeDriver();
            case "safari" -> new SafariDriver();
            default -> new ChromeDriver();
        };
        return driver;
    }

    public void quitTheBrowser() {
        driver.quit();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public String getAttribute(By locator, String attribute) {
        return wait.until(d -> d.findElement(locator)).getAttribute(attribute);
    }
}
