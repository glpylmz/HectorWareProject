package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SettingsPage extends BasePage{

    public void navigateToSettings(){
        acoountOption("Settings");
    }

    @FindBy(xpath = "//button[.='Choose']")
    public WebElement chooseButton;

    @FindBy(id = "selectavatar")
    public WebElement selectFromFileIcon;

    @FindBy(id = "sendcropperbutton")
    public WebElement chooseAsAProfilPictureButton;

    @FindBy(id = "displayavatar")
    public WebElement profilePictureAvatar;

    @FindBy(xpath = "//div[@id='displayavatar']/div[2]")
    public WebElement uploadPictureWarningMessage;

    @FindBy(xpath = "//input[@id = 'uploadavatar']")
    public WebElement uploadNewPicturefromcomputer;

    @FindBy(id = "uploadavatarbutton")
    public WebElement uploadNewPictureButton;





    public void choosePicture(String picName){
        WebUtilities.waitFor(3);
        WebElement profilePicture = Driver.get().findElement(By.xpath("//tr[contains(@data-entryname,'"+picName+"')]/td"));
        profilePicture.click();

        chooseButton.click();
        WebUtilities.waitForClickablility(chooseAsAProfilPictureButton,15);
        chooseAsAProfilPictureButton.click();
    }

    public WebElement informationTitle(String str) {
        String path = "";

        switch (str) {
            case "Profile picture":
                path = "(//div[@id='personal-settings']//form)[1]";
                break;
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
                path = "(//div[@id='personal-settings']//form)[8]";

                break;
            case "Phone number":
                path = "(//div[@id='personal-settings']//form)[4]";
                break;
            case "Address":
                path = "(//div[@id='personal-settings']//form)[5]";
                break;
            case "Locale":
                path = "(//div[@id='personal-settings']//form)[9]";
                break;
            case "Website":
                path = "(//div[@id='personal-settings']//form)[6]";
                break;
            case "Twitter":
                path = "(//div[@id='personal-settings']//form)[7]";
                break;

            default:
                System.out.println("invalid information title");
        }

        return Driver.get().findElement(By.xpath(path));
    }

    public WebElement informationvisibility(String str) {
        return Driver.get().findElement(By.xpath("//label[.='"+str+"']/../div"));
    }

    public WebElement visibilityOption(String string,String visibility){
        return Driver.get().findElement(By.xpath("//label[.='"+string+"']/../div//a[@data-action='"+visibility+"']"));
    }




}
