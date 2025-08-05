package seleniumPOMTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomPages.CheckBoxesPage;

public class AssertingOnTwoCheckBoxesPOMTest {
    WebDriver driver;
    CheckBoxesPage checkBoxesPage;

    @BeforeMethod
    public void before() {
        // Initialize the WebDriver and CheckBoxesPage
        driver = new ChromeDriver();
        checkBoxesPage = new CheckBoxesPage(driver);
    }

    @Test
    public void checkBoxesTest() {
        // Navigate to the CheckBoxes page
        checkBoxesPage.navigateToCheckBoxesPage();

        // Click the first checkbox
        checkBoxesPage.clickTheFirstCheckBox();

        // Assert that both checkboxes are selected
        Assert.assertTrue(checkBoxesPage.getFirstCheckBox().isSelected() &&
                                   checkBoxesPage.getSecondCheckBox().isSelected());
    }

    @AfterMethod
    public void afterMethod() {
        // Close the browser
        driver.quit();
    }
}
