package seleniumBotTests;

import botPomPages.DragAndDropBotPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropBotTest extends BotTestCase{
    @Test
    public void dragAndDropTest(){
        DragAndDropBotPage dragAndDropBotPage = new DragAndDropBotPage(bot);

        String DropElementText = dragAndDropBotPage.navigateToDragAndDrop()
                .dragAndDropTheElement();

        Assert.assertEquals(DropElementText,"Dropped!");

    }
}
