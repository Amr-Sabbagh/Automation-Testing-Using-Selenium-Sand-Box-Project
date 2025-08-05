package seleniumFluentPOMTest;

import fluentPOMPages.CheckBoxesFluentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomPages.CheckBoxesPage;

public class AssertingOnTwoCheckBoxesFluentPOMTest {
    WebDriver driver;
    CheckBoxesFluentPage checkBoxesFluentPage;

    @BeforeMethod
    public void before() {
        // Initialize the WebDriver and CheckBoxesPage
        driver = new ChromeDriver();
        checkBoxesFluentPage = new CheckBoxesFluentPage(driver);
    }

    @Test
    public void checkBoxesTest() {
        // Navigate to the CheckBoxes page and click the first checkbox
        checkBoxesFluentPage.navigateToCheckBoxesPage()
                            .clickTheFirstCheckBox();

        // Assert that both checkboxes are clicked
        Assert.assertTrue(checkBoxesFluentPage.getFirstCheckBox().isSelected() &&
                                   checkBoxesFluentPage.getSecondCheckBox().isSelected());
    }

    @AfterMethod
    public void afterMethod() {
        // Close the browser
        driver.quit();
    }
}
