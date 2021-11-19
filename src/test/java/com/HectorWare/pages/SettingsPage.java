package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage{

    public void navigateToSettings(){
        acoountOption("Settings");
    }

    public void isInformationDispleyed(String str){
        String path = "";
        switch (str) {
            case "Avatar":
                path = "(//div[@id='personal-settings']//form)[1]";
                break;
            case "Full name":
                path = "(//div[@id='personal-settings']//form)[2]";
                break;
            case "Email":
                path = "(//div[@id='personal-settings']//form)[3]";
                break;
            case "Language":
                path = "(//div[@id='personal-settings']//form)[4]";
                break;
            case "Phone number":
                path = "(//div[@id='personal-settings']//form)[3]";
                break;
            case "Address":
                path = "(//div[@id='personal-settings']//form)[4]";
                break;
            case "Locale":
                path = "(//div[@id='personal-settings']//form)[4]";
                break;
            case "Twitter":
                path = "(//div[@id='personal-settings']//form)[4]";
                break;
            default:
                System.out.println("invalid information title");
        }
        Assert.assertTrue(Driver.get().findElement(By.xpath(path)).isDisplayed());


        }


}
