package awem.autotests.steps;

import awem.autotests.helpers.DriverUtils;
import awem.autotests.pages.PagesObjects;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StepsTests extends PagesObjects {

    @Step("Смена языка на Англ.")
    public StepsTests сhangeLanguageOnSite() {
        open(baseUrl);
        itemlanguageActive().hover();
        itemlanguage().click();
        return this;
    }

    @Step("Проверка успешной смены языка")
    public StepsTests checkLanguageChange() {
        shouldText("Create games. Evolve within a team").shouldBe(Condition.visible);
        return this;
    }

    @Step("Наличие игры Cradle of Empires во вкладке игры")
    public StepsTests checkIfTheGameYouWantIsInTheGamesTab() {
        open(baseUrl);
        awemGames().click();
        return this;
    }

    @Step("Проверка наличия нужной игры во вкладке игры")
    public StepsTests checkTheDisplayOfTheDesiredGame() {
        awemGamesCradleOfEmpires("Cradle of Empires").shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка заголовка главной страницы сайта ")
    public StepsTests checkTitleSiteAwem() {
        open(baseUrl);
        String expectedTitle = "Awem Games";
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(expectedTitle);
        return this;
    }

    @Step("Проверка журнала консоли на наличие ошибок")
    public StepsTests checkingTheConsoleLog() {
        open(baseUrl);
        String consoleLogs = DriverUtils.getConsoleLogs();
        String errorText = "SEVERE";
        assertThat(consoleLogs).doesNotContain(errorText);
        return this;
    }

    @Step("Проверка наличия вакансии QA midle на сайте")
    public StepsTests сheckingAvailabilityVacanciesOnSite() {
        open(baseUrl);
        awemCariers().shouldBe(visible).click();
        cariersQA().scrollIntoView("{block : \"center\"}").shouldBe(visible).click();
        vacancuMidleQA().scrollIntoView("{block : \"center\"}").click();
        buttonResponse().scrollIntoView("{block : \"center\"}").click();
        return this;
    }

    @Step("Проверка открытия формы отправки формы резюме")
    public StepsTests validationOpeningFormsSubmitResume() {
        searchForTextInForm("Откликнуться на вакансию").shouldBe(visible);
        return this;
    }
}