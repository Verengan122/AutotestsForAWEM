package awem.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PagesObjects {
    protected SelenideElement
    itemlanguage = $x("//*[@class='header__language-item']"),
    itemlanguageActive = $x("//*[@class='header__language-item header__language-item--active']"),
    shouldText = $x("//*[contains(text(), 'Create games. Evolve within a team')]");

}
