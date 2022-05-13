package awem.autotests.steps;

import awem.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class StepsTests {
    @Step("Смена языка на Англ.")
    public StepsTests сhangeLanguageOnSite() {

        open(baseUrl);
        $x("//*[@class='header__language-item header__language-item--active']")
                .hover();
        $x("//*[@class='header__language-item']")
                .click();
        return this;

    }

    @Step("Проверка успешной смены языка")
    public StepsTests checkLanguageChange() {
        $x("//*[contains(text(), 'Create games. Evolve within a team')]")
                .shouldBe(Condition.visible);
        return this;
    }

    @Step("Наличие игры Cradle of Empires во вкладке игры")
    public StepsTests checkIfTheGameYouWantIsInTheGamesTab() {
        open(baseUrl);
        $x("//*[@href='https://awem.com/games/']")
                .click();
        return this;
    }

    @Step("Проверка наличия нужной игры во вкладке игры")
    public StepsTests checkTheDisplayOfTheDesiredGame() {
        $x("//*[text() = 'Cradle of Empires']").shouldBe(Condition.visible);
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
        $x("//*[@href='https://awem.com/careers/']")
                .shouldBe(visible).click();
        $x("//*[@href='https://awem.com/careers/qa/']")
                .scrollIntoView("{block : \"center\"}").shouldBe(visible).click();
        $x("//*[@href='https://awem.com/vacancy/middle-software-testing-engineer/']")
                .scrollIntoView("{block : \"center\"}").click();
        $x("//*[@class='btn js-popup-open btn--vacancy-intro']")
                .scrollIntoView("{block : \"center\"}").click();
        return this;
    }

    @Step("Проверка открытия формы отправки формы резюме")
    public StepsTests validationOpeningFormsSubmitResume() {
        $x("//div[contains(@class, 'popup popup-vacancy')]" +
                "//*[@class='popup__title' and text()='Откликнуться на вакансию']")
                .shouldBe(visible);
        return this;
    }
}