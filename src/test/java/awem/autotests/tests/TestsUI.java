package awem.autotests.tests;

import awem.autotests.config.TestBase;
import awem.autotests.steps.StepsTests;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;



public class TestsUI extends TestBase {

    @Test
    @DisplayName("Проверка заголовка")
    void checkingTitle() {
        new StepsTests()
                .checkTitleAwem();
    }

    @Test
    @DisplayName("Проверка смены языка на англ")
    void languageChange() {
        new StepsTests()
                .lang()
                .checkingLanguageChange();
    }

    @Test
    @DisplayName("Проверка наличия игры Cradle of Empires по влкаде Игры")
    void presenceOfTheGame() {
        new StepsTests()
                .thePresenceOfTheGame()
                .checkingNeedGame();
    }

    @Test
    @DisplayName("Проверка журнала консоли на наличие ошибок")
    void consoleShouldNotHaveErrorsTest() {
        new StepsTests()
                .checkingTheConsoleLog();
    }

    @Test
    void job() {
        open(baseUrl);
        $x("//*[@href='https://awem.com/careers/']").shouldBe(visible).click();
        $x("//*[@href='https://awem.com/careers/qa/']").scrollIntoView("{block : \"center\"}").shouldBe(visible).click();
        $x("//*[@href='https://awem.com/vacancy/middle-software-testing-engineer/']").scrollIntoView("{block : \"center\"}").click();
        $x("//*[@class='btn js-popup-open btn--vacancy-intro']").scrollIntoView("{block : \"center\"}").click();
        $x("//div[contains(@class, 'popup popup-vacancy')]//*[@class='popup__title' and text()='Откликнуться на вакансию']").shouldBe(visible);
//
    }


}