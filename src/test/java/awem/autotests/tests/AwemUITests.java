package awem.autotests.tests;

import awem.autotests.config.TestBase;
import awem.autotests.helpers.DriverUtils;
import awem.autotests.pages.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class AwemUITests extends TestBase {

    @Test
    @DisplayName("Проверка заголовка")
    void checkTitleSiteAwem() {
        open("");
        String expectedTitle = "Awem Games";
        String actualTitle = title();

        assertThat(actualTitle).isEqualTo(expectedTitle);
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
    void consoleShouldNotHaveErrorsTest(){
        open("");
        String consoleLogs = DriverUtils.getConsoleLogs();
        String errorText = "SEVERE";

        assertThat(consoleLogs).doesNotContain(errorText);
    }

    @Test
    @DisplayName("Проверка наличия вакансии на сайте")
    void checkForJobVacanciesOnTheSite() {
         new VacancyPage()
            .сheckingAvailabilityVacanciesOnSite()
            .validationOpeningFormsSubmitResume();
    }
}