package awem.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class VacanciPage {
    SelenideElement
            awemCariers = $x("//*[@href='https://awem.com/careers/']"),
            cariersQA = $x("//*[@href='https://awem.com/careers/qa/']"),
            vacancuMidleQA  = $x("//*[@href='https://awem.com/vacancy/middle-software-testing-engineer/']"),
            buttonResponse = $x("//*[@class='btn js-popup-open btn--vacancy-intro']"),
            searchForTextInForm = $x("//div[contains(@class, 'popup popup-vacancy')]" +
                    "//*[@class='popup__title' and text()='Откликнуться на вакансию']");


    @Step("Проверка наличия вакансии QA middle на сайте")
    public VacanciPage сheckingAvailabilityVacanciesOnSite() {
        open(baseUrl);
        awemCariers.shouldBe(visible).click();
        cariersQA.scrollIntoView("{block : \"center\"}").shouldBe(visible).click();
        vacancuMidleQA.scrollIntoView("{block : \"center\"}").click();
        buttonResponse.scrollIntoView("{block : \"center\"}").click();
        return this;
    }

    @Step("Проверка открытия формы отправки формы резюме")
    public VacanciPage validationOpeningFormsSubmitResume() {
        searchForTextInForm.shouldBe(visible);
        return this;
    }
}
