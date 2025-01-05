package steps;

import elements.CommonNavItemMenu;

public class CommonNavItemMenuSteps extends CommonNavItemMenu {

    public NavItemCategoryStepsPage selectCategoryWomen(){
        womenCategory.click();

        return new NavItemCategoryStepsPage();
    }
}
