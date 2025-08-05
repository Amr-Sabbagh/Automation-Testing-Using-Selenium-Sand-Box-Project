package seleniumFluentPOMTest;

import fluentPOMPages.DragAndDropFluentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropFluentPOMTest {

    WebDriver driver;
    DragAndDropFluentPage dragAndDropFluentPage;

    @BeforeMethod
    public void beforeMethod() {
        // Initialize the WebDriver (e.g., ChromeDriver)
        driver = new ChromeDriver();

        // Initialize the DragAndDropPage object
        dragAndDropFluentPage = new DragAndDropFluentPage(driver);
    }

    @Test
    public void dragAndDropFluentPOMTest() {

        // Navigate to the Drag and Drop page and Perform the drag and drop action
        WebElement dropAreaElement = dragAndDropFluentPage.navigateToDragAndDropPage()
                                                          .dragAndDropTheElement();

        // Assert that the text in the drop area has changed to "Dropped!"
        Assert.assertEquals(dropAreaElement.getText(),"Dropped!");

    }
    @AfterMethod
    public void afterMethod() {
        // Close the browser
        driver.quit();
    }
}
