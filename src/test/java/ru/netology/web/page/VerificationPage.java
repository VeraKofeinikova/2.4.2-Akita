package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.netology.web.data.DataHelper;
//import ru.netology.web.poka_ne_nuzhno.VerificationPageWithWrongCode;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

@Name("Подтверждение входа")
public class VerificationPage extends AkitaPage {
    @Name("Код")
    @FindBy(css = "[data-test-id=code] input")
    public SelenideElement codeField;
    @Name("Продолжить")
    @FindBy(css = "[data-test-id=action-verify]")
    public SelenideElement verifyButton;

    public VerificationPage() {
        codeField.shouldBe(visible);
    }

    public DashboardPage validVerify(DataHelper.VerificationCode verificationCode) {
        codeField.setValue(verificationCode.getCode());
        verifyButton.click();
        return new DashboardPage();
    }

//    public VerificationPageWithWrongCode canNotVerifyWrongCode(DataHelper.VerificationCode verificationCode) {
//        codeField.setValue(verificationCode.getCode());
//        verifyButton.click();
//        return new VerificationPageWithWrongCode();
//    }

    public void assertVerifyBtnAvailable() {
        verifyButton.shouldBe(visible);
    }
}