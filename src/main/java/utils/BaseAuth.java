package utils;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import steps.CommonNavItemMenuSteps;
import steps.NavItemCategoryStepsPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseAuth {
//    protected static NavItemCategoryStepsPage navItemCategoryStepsPage;
    protected static CommonNavItemMenuSteps commonNavItemMenuSteps;

    @BeforeSuite
    public void beforeSuite(){
    //    navItemCategoryStepsPage = new NavItemCategoryStepsPage();
        commonNavItemMenuSteps = new CommonNavItemMenuSteps();
    }


    @BeforeTest
    public void openDriver(){
        open("https://dressup.ge/");
        getWebDriver().manage().window().maximize();


    }
}
