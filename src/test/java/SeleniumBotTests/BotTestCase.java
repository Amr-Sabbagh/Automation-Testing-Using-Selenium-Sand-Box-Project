package SeleniumBotTests;

import engine.Bot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BotTestCase {

    Bot bot;

    @BeforeMethod
    public void before() {
        bot = new Bot();
    }

    @AfterMethod
    public void after() {
        bot.quit();
    }
}
