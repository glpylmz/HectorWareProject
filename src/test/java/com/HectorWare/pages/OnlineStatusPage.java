package com.HectorWare.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OnlineStatusPage extends BasePage {

    @FindBy(xpath = "//div[@class='set-status-modal__header']")
    public WebElement poppedUpStatusWindow;

    @FindBy(xpath = "//div[@class='user-status-online-select'][2]")
    public List<WebElement> statusSelection;

    public void selection(String expected ){
        if(expected.equals("Online")){
            statusSelection.get(0).click();
        }else if(expected.equals("Away")){
            statusSelection.get(1).click();
        }else if(expected.equals("Do not disturb")){
            statusSelection.get(2).click();
        }else if(expected.equals("Invisible")){
            statusSelection.get(3).click();
        }
    }
}
