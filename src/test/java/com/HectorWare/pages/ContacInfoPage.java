package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContacInfoPage extends BasePage {
    public ContacInfoPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "new-contact-button")
    public WebElement addNewContactButton;

    @FindBy(id="contact-fullname")
    public WebElement fullName;

    @FindBy(id = "contact-org")
    public WebElement companyName;

    @FindBy(id="contact-title")
    public  WebElement title;

   @FindBy(linkText = "action-input__input focusable")
   public WebElement CreateNewGroup;

   @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContacts;



         // (...) moreOption icon to delete a contact

        @FindBy(xpath = "(//button[@aria-label='Actions'])[7]")
        public WebElement MoreOptionButton;
        @FindBy(xpath = "//ul[starts-with(@id,'menu-')]/li")
        List<WebElement> dropDownFromMoreOption;

        public void clickMoreOptionSubTitle (String optionFromMoreIcon){
            MoreOptionButton.click();
            switch (optionFromMoreIcon) {
                case "Download":
                    dropDownFromMoreOption.get(0).click();
                    break;
                case "Generate QR Code":
                    dropDownFromMoreOption.get(1).click();
                    break;
                case "Delete":
                    dropDownFromMoreOption.get(2).click();
                    break;
            }
            System.out.println("optionMoreIcon = " + optionFromMoreIcon);
            Assert.fail("no such option under moreOption button");
        }



        @FindBy(xpath = "(//input[@class='multiselect__input'])[3]")
        public WebElement addNewProperty;
        public void clickNewPropertySubTitle (String subTitle){
            addNewProperty.click();
            //WebUtilities.waitForClickablility(By.xpath("//div[@title='Birthday']"),10);
            Driver.get().findElement(By.xpath("//div[@title='" + subTitle + "']")).click();


        }


// contacts  sorted by some item such as surname or firts name
    @FindBy(css = ".settings-button")
    public WebElement settings;
    public void SortBy(String dropList) {
        settings.click();
        Driver.get().findElement(By.xpath(" //div[starts-with(@title,'Sort by'" + dropList + ")]")).click();
    }
    }


