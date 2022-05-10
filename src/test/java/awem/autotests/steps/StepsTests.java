package awem.autotests.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class StepsTests {
    @Step("Смена языка на Англ.")
    public StepsTests lang() {

        open(baseUrl);
        $x("//*[@class='header__language-item header__language-item--active']").hover();
        $x("//*[@class='header__language-item']").click();
        return this;

    }

    @Step("Проверка успешной смены языка")
    public StepsTests CheckingLanguageChange(){
        $x("//*[contains(text(), 'Create games. Evolve within a team')]").shouldBe(Condition.visible);
        return this;
    }

}
