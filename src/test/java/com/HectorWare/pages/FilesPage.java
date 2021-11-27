package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import javafx.beans.property.SetProperty;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class FilesPage extends BasePage{

    @FindBy(xpath = "(//div[@id='controls']//a)[4]")
    public WebElement plusBtn;

    @FindBy(xpath = "//table//tbody/tr")
    public List<WebElement> uploadedFiles;

    //this web element is hidden in the HTML
    @FindBy(id = "file_upload_start")
    public WebElement upload;

    @FindBy(xpath = "//*[@for='checkbox-allnewfiles']")
    public WebElement fileConflict;

    @FindBy(xpath = "//button[@class='continue primary']")
    public WebElement continu;




    //click plus button and through upload button upload the file
    public void clickUpload(String file){
        plusBtn.click();
        String path = "/Users/mamlakatkhudaykulova/Desktop/MYFILE.txt";
        WebUtilities.waitFor(3);
        upload.sendKeys(path);
        WebUtilities.waitFor(3);
    }

    //check if the uploaded file is in "All files"
    public boolean plusBtnOptions(String fileName) {
        boolean flag = false;
        for (WebElement file : uploadedFiles) {
            // System.out.println(files.getText());
            if (file.getText().equals(fileName)) {
                System.out.println(file.getText());
                flag = true;
                break;
            }
        }
        return flag;
    }

}
