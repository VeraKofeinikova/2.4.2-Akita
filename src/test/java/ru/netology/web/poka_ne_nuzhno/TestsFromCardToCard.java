//package ru.netology.web.poka_ne_nuzhno;
//
//import lombok.val;
//import org.junit.jupiter.api.*;
//import ru.netology.web.data.DataHelper;
//import ru.netology.web.page.DashboardPage;
//import ru.netology.web.poka_ne_nuzhno.DashboardPagePaymentForm;
//import ru.netology.web.page.LoginPage;
//
//import static com.codeborne.selenide.Selenide.open;
//
//public class TestsFromCardToCard {
//    @BeforeAll
//    public static void Login() {
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
//    @DisplayName("Успешный перевод 100 рублей с карты2 на карту1 и обратно")
//    void SendFromCard1ToCard2AndBack() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val amountOfMoney = DataHelper.oneHundredRubles();
//        val numberOfCard2 = DataHelper.cardWithTwo();
//        val DashBoardNewBalance100RublesFromCard2ToCard1 = DashboardPagePaymentForm.fromCard2ToCard1OneHundredRubles(amountOfMoney, numberOfCard2);
//
//        val dashboardPaymentFormFromCard1ToCard2 = DashboardPage.FromCard1ToCard2Payment();
//        val numberOfCard1 = DataHelper.cardWithOne();
//        val DashBoardNewBalance100RublesFromCard1ToCard2 = DashboardPagePaymentForm.fromCard1ToCard2OneHundredRubles(amountOfMoney, numberOfCard1);
//    }
//
//    @Test
//    @DisplayName("Нажать любую Пополнить, а на странице Пополнения нажать Отменить, вернулись на страницу баланса")
//    void cancelOfPayment() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val dashBoardPage = DashboardPagePaymentForm.clickCancelandReturn();
//    }
//
//    @Test
//    @DisplayName("Ввести номер карты неполностью типа 5559 000")
//    void NotWriteFullNumberOfCard() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val amountOfMoney = DataHelper.oneHundredRubles();
//        val cardWithNotFullNumber = DataHelper.cardWithNotFullNumber();
//        val dashboardPage = DashboardPagePaymentForm.notificationAboutNotFullNumberCard(amountOfMoney, cardWithNotFullNumber);
//    }
//
//    @Test
//    @DisplayName("Ввести несуществующую карту 5559 0000 0000 0003")
//    void WrongNumberOfCardFromWhichWeTakeMoney() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val amountOfMoney = DataHelper.oneHundredRubles();
//        val cardDontExist = DataHelper.cardDontExist();
//        val dashboardPage = DashboardPagePaymentForm.notificationYouDontHaveSuchCard(amountOfMoney, cardDontExist);
//    }
//
//    @Test
//    @DisplayName("Ввести тот же номер карты, на которую переводим")
//    void tryToMakePaymentFromSameCard() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val amountOfMoney = DataHelper.oneHundredRubles();
//        val numberOfCard1 = DataHelper.cardWithOne();
//        val dashBoardPage = DashboardPagePaymentForm.notificationSameNumberOfCard(amountOfMoney, numberOfCard1);
//    }
//
//    @Test
//    @DisplayName("Нажать любую Пополнить, а на странице Пополнения не ввести номер карты, с которой переводим")
//    void tryToMakePaymentWithEmptyNumberOfCard() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val amountOfMoney = DataHelper.oneHundredRubles();
//        val emptynumberOfCard = DataHelper.emptyNumberOfCard();
//        val dashBoardPage = DashboardPagePaymentForm.notificationOfNoNumberOfCardAtInputFrom(amountOfMoney, emptynumberOfCard);
//    }
//
//    @Test
//    @DisplayName("Нажать любую Пополнить, а на странице Пополнения не ввести количество денег")
//    void tryToMakePaymentWithEmptyAmountOfMoney() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val amountOfMoney = DataHelper.emptyAmountOfMoney();
//        val numberOfCard2 = DataHelper.cardWithTwo();
//        val dashBoardPage = DashboardPagePaymentForm.notificationOfEmptyAmountOfMoney(amountOfMoney, numberOfCard2);
//    }
//
//    @Test
//    @DisplayName("Невозможно перевести на другую карту сумму, большую чем баланс карты")
//    void shouldNotMakePaymentIfAmountOfSendingBiggerThenBalanceOfCard() {
//        val dashboardPaymentFormFromCard2ToCard1 = DashboardPage.FromCard2ToCard1Payment();
//        val amountOfMoney = DataHelper.twentyThousandsRubles();
//        val numberOfCard2 = DataHelper.cardWithTwo();
//        val dashboardPage = DashboardPagePaymentForm.notificationMoreThenBalanceOfCard(amountOfMoney, numberOfCard2);
//    }
//}
