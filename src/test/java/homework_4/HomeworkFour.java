package homework_4;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HomeworkFour {
    @BeforeMethod(description = "Opens the browser")
    public void beforeTest() {
        open("https://www.facebook.com/");
        getWebDriver().manage().window().maximize();

        $(byLinkText("Create new account")).click();

        System.out.println(getWebDriver().getTitle());
    }

    @Test(description = "Tests the first name, last name, password, and mobile phone fields")
    public void signUpTest1() {

        $(byName("firstname")).setValue("Ana");
        $(byName("lastname")).setValue("Gochashvili");

        $(byName("reg_email__")).setValue("591119158");
        $("#password_step_input").setValue("ASDasd#123");
    }

    @Test(description = "Tests the birth date fields")
    public void signUpTest2() {
        $("#month").selectOption("May");
        $("#day").selectOption("21");
        $("#year").selectOption("1988");
    }

    @Test(description = "Tests Gender radio buttons")
    public void signUpTest3() {
        $("input[type='radio'][value='-1']").click();

        SelenideElement customPronoun = $("#preferred_pronoun");
        SelenideElement customGender = $("#custom_gender");

        customPronoun.shouldBe(visible, text("Select your pronoun"));
        customGender.shouldBe(visible, enabled, empty)
                .shouldHave(attribute("aria-label", "Gender (optional)"));
        customPronoun.selectOption("She: \"Wish her a happy birthday!\"");
        customPronoun.shouldHave(text("She: \"Wish her a happy birthday!\""), visible);

        $("input[type='radio'][value='1']").click();

        customPronoun.shouldBe(hidden);
        customGender.shouldNotBe(visible);
    }

    @AfterTest(description = "Closes the browser")
    public void afterTest() {
        System.out.println("Test is over, browser should be closed!");
        getWebDriver().quit();
    }
}
