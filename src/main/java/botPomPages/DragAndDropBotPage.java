package botPomPages;

import engine.FluentBot;
import org.openqa.selenium.By;

public class DragAndDropBotPage {
    protected FluentBot bot;

    private final By draggableElementLocator = By.xpath("//div/p[text()='Drag me to my target']");
    private final By dropAreaElementLocator = By.id("droppable");

    public DragAndDropBotPage(FluentBot bot){
        this.bot = bot;
    }
    public DragAndDropBotPage navigateToDragAndDrop(){
        bot.navigateTo("https://jqueryui.com/resources/demos/droppable/default.html");
        return this;
    }
    public String dragAndDropTheElement(){
        return bot.dragAndDrop(draggableElementLocator, dropAreaElementLocator).getText(dropAreaElementLocator);
    }

//    public String getDropAreaElementText(){
//        return bot.getText(dropAreaElementLocator);
//    }

}
