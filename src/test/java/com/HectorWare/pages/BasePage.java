package com.HectorWare.pages;


import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//*[@class = 'app-icon'])[1]")
    public WebElement fileModule;

    @FindBy(xpath = "//li[@data-id = 'photos']")
    public WebElement fotosModule;

    @FindBy(xpath = "//li[@data-id = 'activity']")
    public WebElement activityModule;

    @FindBy(xpath = "//li[@data-id = 'spreed']")
    public WebElement talkModule;


    @FindBy(xpath = "//li[@data-id = 'mail']")
    public WebElement mailModule;

    @FindBy(xpath = "//li[@data-id = 'contacts']")
    public WebElement contactsModule;


    @FindBy(xpath = "//li[@data-id = 'calendar']")
    public WebElement calendarModule;

    @FindBy(xpath = "//li[@data-id = 'notes']")
    public WebElement notesModule;

    @FindBy(css = ".material-design-icon__svg")
    public WebElement searchIcon;

    @FindBy(id = "expand")
    public WebElement memberIcon;

    @FindBy(id = "contactsmenu")
    public WebElement contacts;


    @FindBy(id = "contactsmenu-search")
    public WebElement searchContact;


    public void navigateToModule(String module) {
        String moduleLink = "//*[@aria-label='" + module + "']";
        try {
            Driver.get().findElement(By.xpath(moduleLink)).click();
        } catch (Exception e) {
            WebUtilities.waitForClickablility(Driver.get().findElement(By.xpath(moduleLink)), 10);
            Assert.fail("No such element");
        }

    }

    @FindBy(xpath = "//nav[@id='expanddiv']//li")
    public List<WebElement> accountOptions;

    public void acoountOption(String option){
        memberIcon.click();

        switch (option){
            case "Set status":
                accountOptions.get(0).click();
                break;
            case "Settings":
                accountOptions.get(1).click();
                break;
            case "About":
                accountOptions.get(2).click();
                break;
            case "Help":
                accountOptions.get(3).click();
                break;
            case "Log out":
                accountOptions.get(4).click();
                break;
            default:
                System.out.println("option = " + option);
                Assert.fail("No such option under account");
        }
    }


}