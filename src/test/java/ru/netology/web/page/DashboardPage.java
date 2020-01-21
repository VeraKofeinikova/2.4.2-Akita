package ru.netology.web.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
//import ru.netology.web.poka_ne_nuzhno.DashboardPagePaymentForm;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Name("Дашбоард")
public class DashboardPage extends AkitaPage {
    private SelenideElement ul = $(By.className("list_theme_alfa-on-white"));

    public DashboardPage() {
        ul.shouldBe(Condition.visible);
    }

    private static SelenideElement firstButtonActionDeposite = $$(By.className("button_view_extra")).first();
    private static SelenideElement secondButtonActionDeposite = $$(By.className("button_view_extra")).last();

//    public static DashboardPagePaymentForm FromCard2ToCard1Payment() {
//        firstButtonActionDeposite.click();
//        return new DashboardPagePaymentForm();
//    }
//
//    public static DashboardPagePaymentForm FromCard1ToCard2Payment() {
//        secondButtonActionDeposite.click();
//        return new DashboardPagePaymentForm();
//    }
}

