package fluentPOMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropFluentPage {
    protected WebDriver driver;

    private final By DraggableElementLocator = By.xpath("//div/p[text()='Drag me to my target']");
    private final By DropAreaElementLocator = By.id("droppable");

    public DragAndDropFluentPage(WebDriver driver) {

        this.driver = driver;
    }

    public DragAndDropFluentPage navigateToDragAndDropPage() {
        driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
        return this;
    }

    public WebElement dragAndDropTheElement(){
        // locating the draggable element
        WebElement DraggableElement = driver.findElement(DraggableElementLocator);

        // locating the drop area element
        WebElement DropAreaElement = driver.findElement(DropAreaElementLocator);

        // dragging and dropping the element
        new Actions(driver).dragAndDrop(DraggableElement, DropAreaElement).perform();

        return DropAreaElement;
    }

}
