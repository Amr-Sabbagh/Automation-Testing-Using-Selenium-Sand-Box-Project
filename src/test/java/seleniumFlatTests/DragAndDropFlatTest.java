package seleniumFlatTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropFlatTest {

    //declaring a WebDriver instance
    WebDriver driver;

    @BeforeMethod
    public void before() {

        //opening the Chrome browser
        driver = new ChromeDriver();

    }

    @Test
    public void dragAndDropFlatTest(){
        // navigate to the page
        driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");

        // locating the draggable element
        WebElement DraggableElement = driver.findElement(By.xpath("//div/p[text()='Drag me to my target']"));

        // locating the drop area element
        WebElement DropAreaElement = driver.findElement(By.id("droppable"));

        // dragging and dropping the element
        new Actions(driver).dragAndDrop(DraggableElement, DropAreaElement).perform();

        //asserting that the draggable text changed to "Dropped!"
        Assert.assertEquals(DropAreaElement.getText(),"Dropped!");


    }

    @AfterMethod
    public void afterMethod() {

        //closing the Chrome browser
        driver.quit();

    }

}
