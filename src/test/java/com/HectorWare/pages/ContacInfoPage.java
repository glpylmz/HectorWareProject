package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContacInfoPage extends BasePage {
    public ContacInfoPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id="contact-fullname")
    public WebElement fullName;

    @FindBy(id = "contact-org")
    public WebElement companyName;

    @FindBy(id="contact-title")
    public  WebElement title;

    @FindBy(className = "icon action-item__menutoggle icon-picture-force-white")
    public  WebElement FotoButton;

// (...) moreOption icon to delete a contact
@FindBy(xpath = "(//*[@class=\"icon action-item__menutoggle action-item__menutoggle--default-icon\"])[5]")
    public WebElement MoreOptionButton;

  @FindBy(xpath = "//ul[starts-with(@id,'menu-')]/li")
      List<WebElement>dropDownFromMoreOption;

    public void deleteContact(String optionFromMoreIcon){
        MoreOptionButton.click();
        switch (optionFromMoreIcon){
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


@FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[6]/div/div[2]/div[2]/input")
    public WebElement addNewProperty;

}


