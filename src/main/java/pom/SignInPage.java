package pom;

import utils.ExtranetLocators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;

public class SignInPage extends SeleniumBase {

    SeleniumActions actions = new SeleniumActions();
    ExtranetLocators extranetLocators = new ExtranetLocators();

    public void usersLoginInSuccessfully(String userName, String password) {
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE, extranetLocators.userNameTxt);
        actions.sendKeys(extranetLocators.userNameTxt, userName);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE, extranetLocators.passwordTxt);
        actions.sendKeys(extranetLocators.passwordTxt, password);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE, extranetLocators.signInBtn);
        actions.click(extranetLocators.signInBtn);

    }


}
