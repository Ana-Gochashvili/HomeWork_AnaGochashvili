import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTest {

    @BeforeTest
    public void beforeMethode() {
        open("https://www.google.com/");
    }

    @Test
    public void firstTest() {

        $(By.id("APjFqb")).sendKeys("selenide");
        $(By.id("APjFqb")).pressEnter();
    }

    @Test
    public void firstTest1() {
        $(By.name("q")).sendKeys("1234");
        $(By.name("btnK")).click();
        //    $("[value='Recherche Google']").click();

    }

    @Test
    public void firstTest2() {
        $(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a"))
                .click();
    }

}
