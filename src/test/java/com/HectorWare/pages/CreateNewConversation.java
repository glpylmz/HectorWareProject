package com.HectorWare.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateNewConversation extends BasePage{

    @FindBy(xpath = "//div[@class='modal-container']")
    public WebElement pop_up;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversationBox;

    @FindBy(xpath = "//div[@class='navigation']/button")
    public WebElement AddParticipant;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConver;

    @FindBy(id = "conversation_qt29tgn3")
    public WebElement newConver;

    public boolean allConvIsDisplayed (List<WebElement> listOfElement){
        boolean flag= true;
        for (WebElement element : listOfElement) {
            if(element.isDisplayed()){
                continue;
            }else{
                flag=false;
            }
        }
        return flag;
    }

}
