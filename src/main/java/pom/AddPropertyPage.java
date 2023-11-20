package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.ExtranetLocators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;

public class AddPropertyPage extends SeleniumBase {
    SeleniumActions actions = new SeleniumActions();
    ExtranetLocators extranetLocators = new ExtranetLocators();

    public void addBasicInfoPartOne(String propertyName, String floorsCount, String roomsCount, String constructionYear) {
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE, extranetLocators.addNewPropertyBtn);
        actions.click(extranetLocators.addNewPropertyBtn);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.propertyNameTxt);
        actions.sendKeys(extranetLocators.propertyNameTxt,propertyName);
        actions.sendKeys(extranetLocators.floorsCountTxt,floorsCount);
        actions.sendKeys(extranetLocators.roomsCount,roomsCount);
        actions.sendKeysAndEnter(extranetLocators.constructionYearTxt,constructionYear);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.continueBtn);
        actions.click(extranetLocators.continueBtn);
    }
    public void addBasicInfoPartTwo(String filePath, String description) throws InterruptedException {
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.uploadFileBtn);
        actions.click(extranetLocators.uploadFileBtn);
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        try {
            Robot robot = new Robot();
            robot.delay(1000);  // Add a delay to ensure the file dialog is open

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.delay(1000);  // Add a delay to ensure the file path is pasted

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Thread.sleep(300);
        actions.sendKeys(extranetLocators.descriptionTxt,description);
        actions.click(extranetLocators.continueBtn);

    }
    public void addBasicInfoPartThree(String spokenLanguages, String currencies){
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.spokenLanguagesTxt);
        actions.sendKeysAndEnter(extranetLocators.spokenLanguagesTxt,spokenLanguages);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.currenciesTxt);
        actions.sendKeysAndEnter(extranetLocators.currenciesTxt,currencies);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,extranetLocators.continueBtn);
        actions.click(extranetLocators.continueBtn);
    }

}
