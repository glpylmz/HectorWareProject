package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage extends BasePage{

    public UploadFilePage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@id='controls']/div[2]/a/span[1]")
    public WebElement plusIcon;

    @FindBy(xpath = "//label[@class='menuitem']")
    public WebElement uploadFile;

    public void setUploadFile() {
        uploadFile.sendKeys();

    }

}
