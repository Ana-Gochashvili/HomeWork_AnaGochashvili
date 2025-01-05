package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.NavItemCategoryStepsPage;
import utils.BaseAuth;

public class NavItemCategoryTests extends BaseAuth {

    protected NavItemCategoryStepsPage navItemCategoryStepsPage;

    @BeforeMethod
    public void openWomenCategoryPage() {
        navItemCategoryStepsPage = commonNavItemMenuSteps.selectCategoryWomen();
    }

    @Test
    public void categoriesTesting() {
        SoftAssert softAssert = new SoftAssert();
        navItemCategoryStepsPage.selectWomenClosingCategory();

        softAssert.assertTrue(navItemCategoryStepsPage.checkWomenClosingCategoryButton());

    }
}
