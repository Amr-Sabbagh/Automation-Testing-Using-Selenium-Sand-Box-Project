package botPomPages;

import engine.Bot;
import org.openqa.selenium.By;

public class DuckDuckGoSearchResultBotPage {

    By searchResultsElement = By.xpath("(//div//ol/li)[1]//h2//a");

    protected final Bot bot;

    public DuckDuckGoSearchResultBotPage(Bot bot) {
        this.bot = bot;
    }

    public String getFirstSearchResultLink() {
        return bot.getAttribute(searchResultsElement, "href");
    }

}