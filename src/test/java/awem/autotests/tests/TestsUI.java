package awem.autotests.tests;

import awem.autotests.config.TestBase;
import awem.autotests.pages.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestsUI extends TestBase {

    @Test
    @DisplayName("Проверка заголовка")
    void checkingTitle() {
        new TitlePage()
                .checkTitleSiteAwem();
    }

    @Test
    @DisplayName("Проверка смены языка сайта на англ")
    void languageChange() {
        new LanguagePage()
                .сhangeLanguageOnSite()
                .checkLanguageChange();
    }

    @Test
    @DisplayName("Проверка наличия игры Cradle of Empires по влкаде Игры")
    void presenceOfTheGame() {
        new GamesPage()
                .checkIfTheGameYouWantIsInTheGamesTab()
                .checkTheDisplayOfTheDesiredGame();
    }

    @Test
    @DisplayName("Проверка журнала консоли на наличие ошибок")
    void consoleShouldNotHaveErrorsTest() {
        new ConsolePage()
                .checkingTheConsoleLog();
    }

    @Test
    @DisplayName("Проверка наличия вакансии на сайте")
    void job() {
    new VacanciPage()
            .сheckingAvailabilityVacanciesOnSite()
            .validationOpeningFormsSubmitResume();
    }
}