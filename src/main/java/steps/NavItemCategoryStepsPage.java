package steps;

import elements.NavItemCategoryPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public class NavItemCategoryStepsPage extends NavItemCategoryPage {

    public NavItemCategoryStepsPage selectWomenClosingCategory() {
        wClothing.shouldBe(enabled, Duration.ofSeconds(3));
        wClothing.selectRadio("ქალის ტანსაცმელი");

        return this;
    }

    public boolean checkWomenClosingCategoryButton() {
      return wClothing.is(selected);
    }
}
