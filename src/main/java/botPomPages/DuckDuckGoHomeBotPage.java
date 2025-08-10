package botPomPages;

import engine.Bot;
import org.openqa.selenium.By;

public class DuckDuckGoHomeBotPage {

    protected Bot bot;

    private final By searchBoxLocator = By.xpath("//div/input[@class='searchbox_input__rnFzM']");
    private final By searchButtonLocator = By.xpath("//div/button[@type='submit']");


    public DuckDuckGoHomeBotPage(Bot bot) {

        this.bot = bot;
    }

    public void navigateToDuckDuckGo() {

        bot.navigateTo("https://duckduckgo.com/");
    }

    public void typeInSearchBox(String searchText) {

        bot.type(searchBoxLocator,searchText);
    }

    public void clickOnTheSearchButton() {

        bot.click(searchButtonLocator);
    }
}