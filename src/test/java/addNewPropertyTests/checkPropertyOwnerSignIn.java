package addNewPropertyTests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.AddPropertyPage;
import pom.HomePage;
import pom.SignInPage;
import utils.ExtranetLocators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import static utils.SeleniumActions.Waits.VISIBILITY_OF_ELEMENT;


public class checkPropertyOwnerSignIn {
    ExtranetLocators extranetLocators = new ExtranetLocators();
    SeleniumActions actions = new SeleniumActions();
    SignInPage signInPage = new SignInPage();
    HomePage homePage = new HomePage();
    AddPropertyPage addPropertyPage = new AddPropertyPage();

    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig();
        seleniumBase.environmentSetup();
    }

    @Test
    public void signInSuccessfully() {
        signInPage.usersLoginInSuccessfully("Elbanna", "Elbanna@123");
        actions.waitUntil(VISIBILITY_OF_ELEMENT, extranetLocators.homePageTxt);
        Assert.assertEquals(actions.getText(extranetLocators.homePageTxt), "Home Dashboard");
    }

    @Test(dependsOnMethods = "signInSuccessfully")
    public void checkAddNewPropertyBtn() {
        homePage.clickOnAddNewProperty();
        Assert.assertTrue(actions.isDisplayed(extranetLocators.addNewPropertyBtn));
    }

    @Test(dependsOnMethods = "checkAddNewPropertyBtn")
    public void checkDataAddedToBasicInfoSection() {
        addPropertyPage.addBasicInfoPartOne("Elbanna Prop", "5", "50", "2020");
        actions.waitUntil(VISIBILITY_OF_ELEMENT, extranetLocators.progressPar);
        Assert.assertEquals(actions.getText(extranetLocators.progressPar), "20%"
                , "Users couldn't enter Basic Info Data");
    }

    @Test(dependsOnMethods = "checkDataAddedToBasicInfoSection")
    public void checkDataAddedToBasicInfoPart_2() throws InterruptedException {
        addPropertyPage.addBasicInfoPartTwo("C:\\Users\\melba\\OneDrive\\Desktop\\TOP 50 OOP.pdf",
                "test");
        actions.waitUntil(VISIBILITY_OF_ELEMENT, extranetLocators.progressPar);
        Assert.assertEquals(actions.getText(extranetLocators.progressPar), "40%"
                , "Users couldn't complete data for Basic Info");
    }

    @Test(dependsOnMethods = "checkDataAddedToBasicInfoPart_2")
    public void checkDataAddedToBasicInfoPart_3(){
        addPropertyPage.addBasicInfoPartThree("English","SAR");
        actions.waitUntil(VISIBILITY_OF_ELEMENT,extranetLocators.progressPar);
        Assert.assertEquals(actions.getText(extranetLocators.progressPar),"60%"
                ,"Users couldn't complete data for Basic Info");
    }
}