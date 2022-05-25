package awem.autotests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class GamesPage {
    SelenideElement
            awemGames =  $x("//*[@href='https://awem.com/games/']"),
            awemGamesCradleOfEmpires = $x("//*[text() = 'Cradle of Empires']");

    @Step("Наличие игры Cradle of Empires во вкладке игры")
    public GamesPage checkIfTheGameYouWantIsInTheGamesTab() {
        open(baseUrl);
        awemGames.click();
        return this;
    }

    @Step("Проверка наличия нужной игры во вкладке игры")
    public GamesPage checkTheDisplayOfTheDesiredGame() {
        awemGamesCradleOfEmpires.shouldBe(Condition.visible);
        return this;
    }
}
