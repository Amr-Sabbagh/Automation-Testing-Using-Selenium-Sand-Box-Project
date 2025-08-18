package botPomPages;

import engine.FluentBot;
import org.openqa.selenium.By;

public class DuckDuckGoSearchResultBotPage {

    By searchResultsElement = By.xpath("(//div//ol/li)[1]//h2//a");

    protected final FluentBot bot;

    public DuckDuckGoSearchResultBotPage(FluentBot bot) {
        this.bot = bot;
    }

    public String getFirstSearchResultLink() {
        return bot.getAttribute(searchResultsElement, "href");
    }

}