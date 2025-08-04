package seleniumPOMTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropPOMTest {

    WebDriver driver;
    DragAndDropPage dragAndDropPage;

    @BeforeMethod
    public void beforeMethod() {
        // Initialize the WebDriver (e.g., ChromeDriver)
        driver = new ChromeDriver();

        // Initialize the DragAndDropPage object
        dragAndDropPage = new DragAndDropPage(driver);
    }

    @Test
    public void task9POM() {

        // Navigate to the Drag and Drop page
        dragAndDropPage.navigateToDragAndDropPage();

        // Perform the drag and drop action
        WebElement dropAreaElement = dragAndDropPage.dragAndDropTheElement();

        // Assert that the text in the drop area has changed to "Dropped!"
        Assert.assertEquals(dropAreaElement.getText(),"Dropped!");

    }
    @AfterMethod
    public void afterMethod() {
        // Close the browser
        driver.quit();
    }
}
