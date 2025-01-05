package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class CommonNavItemMenu {

    public  SelenideElement
            womenCategory = $(byText("ქალი")),
            kidCategory = $(byText("ბავშვი"));
}
