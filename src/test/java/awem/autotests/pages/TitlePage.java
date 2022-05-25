package awem.autotests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class TitlePage {

    @Step("Проверка заголовка главной страницы сайта ")
    public TitlePage checkTitleSiteAwem() {
        open(baseUrl);
        String expectedTitle = "Awem Games";
        String actualTitle = title();

        assertThat(actualTitle).isEqualTo(expectedTitle);
        return this;
    }
}
