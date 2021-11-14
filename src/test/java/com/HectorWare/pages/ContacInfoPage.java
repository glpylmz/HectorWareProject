package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

@FindBy(xpath = "//*[@id=\"menu-ubzrn\"]/li[1]/button/span[2]")
    public WebElement UplodFoto;

@FindBy(xpath = "//*[@id=\"menu-ubzrn\"]/li[2]/button/span[2]")
    public WebElement uplodFotoFromFile;
}
