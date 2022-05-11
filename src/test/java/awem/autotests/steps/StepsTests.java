package awem.autotests.steps;

import awem.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class StepsTests {
    @Step("Смена языка на Англ.")
    public StepsTests lang() {

        open(baseUrl);
        $x("//*[@class='header__language-item header__language-item--active']").hover();
        $x("//*[@class='header__language-item']").click();
        return this;

    }

    @Step("Проверка успешной смены языка")
    public StepsTests checkingLanguageChange() {
        $x("//*[contains(text(), 'Create games. Evolve within a team')]").shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка успешной смены языка")
    public StepsTests xx(String title) {
        $x("//div[contains(@class, 'popup popup-vacancy')]//*[@class='popup__title' and text()='" + title + "']");
        return this;
    }

    @Step("Наличие игры по ссылке")
    public StepsTests thePresenceOfTheGame() {
        open(baseUrl);
        $x("//*[@href='https://awem.com/games/']").click();
        return this;
    }

    @Step("Проверка наличия игры")
    public StepsTests checkingNeedGame() {
        $x("//*[text() = 'Cradle of Empires']").shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка заголовка главной страницы AWEM")
    public StepsTests checkTitleAwem() {
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
}