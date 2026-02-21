package botPomPages;

import engine.FluentBot;
import org.openqa.selenium.By;

public class DuckDuckGoHomeBotPage {

    protected FluentBot bot;

    //private final By searchBoxLocator = By.xpath("//div/input[@class='searchbox_input__rnFzM']");
    private final By searchBoxLocator = By.id("searchbox_input");

    private final By searchButtonLocator = By.xpath("//div/button[@type='submit']");


    public DuckDuckGoHomeBotPage(FluentBot bot) {

        this.bot = bot;
    }

    public DuckDuckGoHomeBotPage navigateToDuckDuckGo() {

        bot.navigateTo("https://duckduckgo.com/");
        return this;
    }

//    public DuckDuckGoHomeBotPage typeInSearchBox(String searchText) {
//
//        bot.type(searchBoxLocator,searchText);
//        return this;
//    }

//    public DuckDuckGoSearchResultBotPage clickOnTheSearchButton() {
//
//        bot.click(searchButtonLocator);
//
//        return new DuckDuckGoSearchResultBotPage(bot);
//    }

    public DuckDuckGoSearchResultBotPage search(String searchText){
        bot.type(searchBoxLocator, searchText)
           .click(searchButtonLocator);

        return new DuckDuckGoSearchResultBotPage(bot);
//        return typeInSearchBox(searchText)
//                .clickOnTheSearchButton();
    }
}