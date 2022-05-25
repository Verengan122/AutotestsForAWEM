package awem.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PagesObjects {
    public static SelenideElement itemlanguage() {
        return $x("//*[@class='header__language-item']");
    }

    public static SelenideElement itemlanguageActive() {
        return $x("//*[@class='header__language-item header__language-item--active']");
    }

    public static SelenideElement shouldText(String Text) {
        return $x("//*[contains(text(), '" + Text + "')]");
    }

    public static SelenideElement awemGames() {
        return $x("//*[@href='https://awem.com/games/']");
    }

    public static SelenideElement awemCariers() {
        return $x("//*[@href='https://awem.com/careers/']");
    }

    public static SelenideElement cariersQA() {
        return $x("//*[@href='https://awem.com/careers/qa/']");
    }

    public static SelenideElement vacancuMidleQA() {
        return $x("//*[@href='https://awem.com/vacancy/middle-software-testing-engineer/']");
    }

    public static SelenideElement buttonResponse() {
        return $x("//*[@class='btn js-popup-open btn--vacancy-intro']");
    }

    public static SelenideElement searchForTextInForm(String Text) {
        return $x("//div[contains(@class, 'popup popup-vacancy')]" +
                "//*[@class='popup__title' and text()='" + Text + "']");
    }

    public static SelenideElement awemGamesCradleOfEmpires(String Text) {
        return $x("//*[text() = '" + Text + "']");
    }
}
