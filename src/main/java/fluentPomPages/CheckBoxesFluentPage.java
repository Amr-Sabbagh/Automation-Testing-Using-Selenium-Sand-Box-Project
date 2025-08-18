package fluentPomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxesFluentPage {
    protected WebDriver driver;

    public CheckBoxesFluentPage(WebDriver driver) {

        this.driver = driver;
    }

    private final By firstCheckBoxElementLocator = By.xpath("(//form/input)[1]");
    private final By secondCheckBoxElementLocator = By.xpath("//form/input[2]");

    public CheckBoxesFluentPage navigateToCheckBoxesPage() {

        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        return this;
    }

    public void clickTheFirstCheckBox() {

        driver.findElement(firstCheckBoxElementLocator).click();
    }

    public WebElement getFirstCheckBox() {

        return driver.findElement(firstCheckBoxElementLocator);
    }

    public WebElement getSecondCheckBox() {

        return driver.findElement(secondCheckBoxElementLocator);
    }
}
