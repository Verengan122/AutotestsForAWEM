package awem.autotests.tests;

import awem.autotests.config.TestBase;
import awem.autotests.steps.StepsTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestsUI extends TestBase {

    @Test
    @DisplayName("Проверка заголовка")
    void checkingTitle() {
        new StepsTests()
                .checkTitleSiteAwem();
    }

    @Test
    @DisplayName("Проверка смены языка сайта на англ")
    void languageChange() {
        new StepsTests()
                .сhangeLanguageOnSite()
                .checkLanguageChange();
    }

    @Test
    @DisplayName("Проверка наличия игры Cradle of Empires по влкаде Игры")
    void presenceOfTheGame() {
        new StepsTests()
                .checkIfTheGameYouWantIsInTheGamesTab()
                .checkTheDisplayOfTheDesiredGame();
    }

    @Test
    @DisplayName("Проверка журнала консоли на наличие ошибок")
    void consoleShouldNotHaveErrorsTest() {
        new StepsTests()
                .checkingTheConsoleLog();
    }

    @Test
    @DisplayName("Проверка наличия вакансии на сайте")
    void job() {
    new StepsTests()
            .сheckingAvailabilityVacanciesOnSite()
            .validationOpeningFormsSubmitResume();
    }
}