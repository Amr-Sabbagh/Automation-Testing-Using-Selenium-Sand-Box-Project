package seleniumBotTests;

import botPomPages.DuckDuckGoHomeBotPage;
import botPomPages.DuckDuckGoSearchResultBotPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FindingTheFirstSearchResultBotTest extends BotTestCase {

    @Test
    public void firstSearchResultBotTest(){

        DuckDuckGoHomeBotPage duckDuckGoHomeBotPage = new DuckDuckGoHomeBotPage(bot);
        DuckDuckGoSearchResultBotPage duckDuckGoSearchResultBotPage;

//        duckDuckGoSearchResultBotPage = duckDuckGoHomeBotPage.navigateToDuckDuckGo()
//                                        .typeInSearchBox("Selenium WebDriver")
//                                        .clickOnTheSearchButton();

        duckDuckGoSearchResultBotPage = duckDuckGoHomeBotPage.navigateToDuckDuckGo()
                                        .search("Selenium WebDriver");

        //duckDuckGoHomeBotPage.typeInSearchBox("Selenium WebDriver");

        //duckDuckGoHomeBotPage.clickOnTheSearchButton();

        Assert.assertEquals(duckDuckGoSearchResultBotPage.getFirstSearchResultLink(),
                "https://www.selenium.dev/documentation/webdriver/");
    }

}
