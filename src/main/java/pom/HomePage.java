package pom;

import utils.ExtranetLocators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;

public class HomePage extends SeleniumBase {
    SeleniumActions actions = new SeleniumActions();
    ExtranetLocators extranetLocators = new ExtranetLocators();

    public void clickOnAddNewProperty(){
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.hotelsTab);
        actions.click(extranetLocators.hotelsTab);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.propertiesLink);
        actions.click(extranetLocators.propertiesLink);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.propertiesInProgressLink);
        actions.click(extranetLocators.propertiesInProgressLink);
    }

}
