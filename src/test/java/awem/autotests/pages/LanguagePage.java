package awem.autotests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LanguagePage {
    SelenideElement
            itemLanguage = $x("//*[@class='header__language-item']"),
            itemLanguageActive = $x("//*[@class='header__language-item header__language-item--active']"),
            shouldText = $x("//*[contains(text(), 'Create games. Evolve within a team')]");


    @Step("Смена языка на Англ.")
    public LanguagePage сhangeLanguageOnSite() {
        open("");
        itemLanguageActive.hover();
        itemLanguage.click();
        return this;
    }

    @Step("Проверка успешной смены языка")
    public LanguagePage checkLanguageChange() {
        shouldText.shouldBe(Condition.visible);
        return this;
    }
}
