package seleniumFlatTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertingOnTwoCheckBoxesTest {
    //declaring a WebDriver instance
    WebDriver driver;

    @BeforeMethod
    public void before() {

        //opening the Chrome browser
        driver = new ChromeDriver();

    }

    @Test
    public void task6(){
        // navigate to the page
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

        // locating the first checkbox
        WebElement firstCheckBoxElement = driver.findElement(By.xpath("(//form/input)[1]"));

        // checking Checkbox 1
        firstCheckBoxElement.click();

        // locating both checkboxes
        WebElement secondCheckBoxesElement = driver.findElement(By.xpath("//form/input[2]"));

        Assert.assertTrue(secondCheckBoxesElement.isSelected()&&firstCheckBoxElement.isSelected());
    }

    @AfterMethod
    public void afterMethod() {

        //closing the Chrome browser
        driver.quit();

    }

}
