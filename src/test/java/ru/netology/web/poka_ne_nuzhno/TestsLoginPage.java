//package ru.netology.web.poka_ne_nuzhno;
//
//import static com.codeborne.selenide.Selenide.open;
//
//import com.codeborne.selenide.Selenide;
//import lombok.val;
//import org.junit.jupiter.api.*;
//import ru.netology.web.data.DataHelper;
//import ru.netology.web.page.LoginPage;
//
//public class TestsLoginPage {
//
//    @BeforeEach
//    public void clearCookies() {
//        open("http://localhost:9999");
//        Selenide.clearBrowserCookies();
//        Selenide.clearBrowserLocalStorage();
//    }
//
//    @Test
//    @DisplayName("Успешный вход. Правильные логин-пароль-верификейшн код")
//    void LoginSuccessful() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val authInfo = DataHelper.getCorrectAuthInfo();
//        val verificationPage = loginPage.validLogin(authInfo);
//        verificationPage.assertVerifyBtnAvailable();
//        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
//        verificationPage.validVerify(verificationCode);
//    }
//
//    @Test
//    @DisplayName("Невозможно войти. Неправильный логин")
//    void LoginFailedWrongLogin() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val notValidLogin = DataHelper.getWrongAuthInfoNotValidLogin();
//        val loginPageWithError = loginPage.notValidLogin(notValidLogin);
//    }
//
//    @Test
//    @DisplayName("Невозможно войти. Неправильный пароль")
//    void LoginFailedWrongPassword() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val notValidPassword = DataHelper.getWrongAuthInfoNotValidPassword();
//        val loginPageWithError = loginPage.notValidLogin(notValidPassword);
//    }
//
//    @Test
//    @DisplayName("Невозможно войти. Правильные логин-пароль. Неправильный смс-код")
//    void LoginFailedWrongVerificationCode() {
//        open("http://localhost:9999");
//        val loginPage = new LoginPage();
//        val authInfo = DataHelper.getCorrectAuthInfo();
//        val verificationPage = loginPage.validLogin(authInfo);
//        verificationPage.assertVerifyBtnAvailable();
//        val verificationCode = DataHelper.getWrongVerificationCodeFor(authInfo);
//        verificationPage.canNotVerifyWrongCode(verificationCode);
//    }
//}

