
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
public class GradleTestRunner {

    @RunWith(Cucumber.class)
    @CucumberOptions (
            glue = {"ru.alfabank.steps", "steps", "ru.netology.web.step"},
            format = {"pretty", "json:build/cucumber/cucumber1.json"},
            features = {"/Users/vera/Documents/HOMEWORKSAUTO/6-2/2-4-2-Akita/build/resources/test/features/Вход.feature"},
            monochrome = false
    )
    public static class GradleTestRunner1 { }

    @RunWith(Cucumber.class)
    @CucumberOptions (
            glue = {"ru.alfabank.steps", "steps", "ru.netology.web.step"},
            format = {"pretty", "json:build/cucumber/cucumber2.json"},
            features = {"/Users/vera/Documents/HOMEWORKSAUTO/6-2/2-4-2-Akita/build/resources/test/features/Перевод с карты2 на карту1.feature"},
            monochrome = false
    )
    public static class GradleTestRunner2 { }

    @RunWith(Cucumber.class)
    @CucumberOptions (
            glue = {"ru.alfabank.steps", "steps", "ru.netology.web.step"},
            format = {"pretty", "json:build/cucumber/cucumber3.json"},
            features = {"/Users/vera/Documents/HOMEWORKSAUTO/6-2/2-4-2-Akita/build/resources/test/features/Поиск репозиториев.feature"},
            monochrome = false
    )
    public static class GradleTestRunner3 { }

}
