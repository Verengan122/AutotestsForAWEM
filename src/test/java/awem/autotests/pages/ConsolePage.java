package awem.autotests.pages;

import awem.autotests.helpers.DriverUtils;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class ConsolePage {

    @Step("Проверка журнала консоли на наличие ошибок")
    public ConsolePage checkingTheConsoleLog() {
        open(baseUrl);
        String consoleLogs = DriverUtils.getConsoleLogs();
        String errorText = "SEVERE";

        assertThat(consoleLogs).doesNotContain(errorText);
        return this;
    }
}
