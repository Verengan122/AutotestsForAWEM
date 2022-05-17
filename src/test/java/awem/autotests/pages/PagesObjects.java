package awem.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PagesObjects {
    protected SelenideElement
    itemlanguage = $x("//*[@class='header__language-item']"),
    itemlanguageActive = $x("//*[@class='header__language-item header__language-item--active']"),
    shouldText = $x("//*[contains(text(), 'Create games. Evolve within a team')]"),
    awemGames =  $x("//*[@href='https://awem.com/games/']"),
    awemCariers = $x("//*[@href='https://awem.com/careers/']"),
    cariersQA = $x("//*[@href='https://awem.com/careers/qa/']"),
    vacancuMidleQA  = $x("//*[@href='https://awem.com/vacancy/middle-software-testing-engineer/']"),
    buttonResponse = $x("//*[@class='btn js-popup-open btn--vacancy-intro']"),
    searchForTextInForm = $x("//div[contains(@class, 'popup popup-vacancy')]" +
            "//*[@class='popup__title' and text()='Откликнуться на вакансию']");

}
