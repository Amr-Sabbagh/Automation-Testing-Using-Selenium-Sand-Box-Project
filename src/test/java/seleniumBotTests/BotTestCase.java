package seleniumBotTests;

import engine.FluentBot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BotTestCase {

    FluentBot bot;

    @BeforeMethod
    public void before() {
        bot = new FluentBot();
    }

    @AfterMethod
    public void after() {
        bot.quit();
    }
}
