package ru.netology.web.step;

import cucumber.api.java.ru.Пусть;
import lombok.val;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.netology.web.data.DataHelper;
import ru.netology.web.page.LoginPage;
import ru.netology.web.page.VerificationPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static ru.alfabank.tests.core.helpers.PropertyLoader.loadProperty;

public class TemplateSteps {
    // главный класс, отвечающий за сопровождение шагов
    private final AkitaScenario scenario = AkitaScenario.getInstance();

    // говорим, что обрабатываем часть "Пусть"
// через регулярные выражения вытаскиваем значения между скобками
    @Пусть("^пользователь залогинен с именем \"([^\"]*)\" и паролем \"([^\"]*)\"$")

    public void loginWithNameAndPassword(String login, String password) {
        // из .properties файла читаем свойство loginUrl
        val loginUrl = loadProperty("loginUrl");
        open(loginUrl);
        // устанавливаем текущую страницу
        scenario.setCurrentPage(page(LoginPage.class));
        val loginPage = (LoginPage) scenario.getCurrentPage().appeared();
        val authInfo = new DataHelper.AuthInfo(login, password);
        scenario.setCurrentPage(loginPage.validLogin(authInfo));
        val verificationPage = (VerificationPage) scenario.getCurrentPage().appeared();
        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        scenario.setCurrentPage(verificationPage.validVerify(verificationCode));

        scenario.getCurrentPage().appeared();
    }
}

