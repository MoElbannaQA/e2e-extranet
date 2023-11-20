package utils;

import org.openqa.selenium.By;

public class ExtranetLocators {
    public By userNameTxt = By.cssSelector("input[name='userName']");
    public By passwordTxt = By.cssSelector("input[name='password']");
    public By signInBtn = By.cssSelector("button[type='button']");
    public By homePageTxt = By.cssSelector("div[class='customContainer'] app-dashboard h2");
    public By hotelsTab = By.cssSelector("li[routerLink='/hotels/dashboard']");
    public By propertiesLink = By.xpath("//span[text()='Properties']"); //span[text()='Add New Property']
    public By propertiesInProgressLink = By.cssSelector("a[href='/hotels/properties/inprogress']");
    public By addNewPropertyBtn = By.cssSelector("div[class='customContainer'] app-in-progress-properties-list div button");
    public By propertyNameTxt = By.cssSelector("input[name='propertyName']");
    public By floorsCountTxt = By.cssSelector("input[name='floorsCount']");
    public By roomsCount = By.cssSelector("input[name='roomsCount']");
    public By continueBtn = By.xpath("(//button[contains(text(),'Continue')]) [1]");
    public By constructionYearTxt = By.cssSelector("ng-select[name='constructionYear'] div[class='ng-input'] input");
    public By progressPar = By.xpath("(//div[@class='custom-progress-precentage']) [1]");
    public By uploadFileBtn = By.xpath("//button[contains(text(),'Upload')]");
    public By descriptionTxt = By.xpath("(//textarea[@name='description']) [1]");
    public By spokenLanguagesTxt = By.cssSelector("ng-select[name='spokenLanguages'] div div[class='ng-input'] input");
    public By currenciesTxt = By.cssSelector("ng-select[name='currencies'] div div[class='ng-input'] input");

}
