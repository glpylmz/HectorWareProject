package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import javafx.beans.property.SetProperty;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(css = ".oc-dialog-title")
    public WebElement conflictMessage;

    @FindBy(xpath = "//*[@for='checkbox-allexistingfiles']")
    public WebElement existingFile;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement continu;

    @FindBy(xpath = "(//span[.='Move or copy'])[2]")
    public WebElement moveOrCopy;

    @FindBy(xpath = "//a[@class='icon icon-add button button-add']")
    public WebElement createFolderBtn;

    @FindBy(xpath = "//form/input[@type='text']")
    public WebElement giveName;

    @FindBy(xpath = "//li/form/input[2]")
    public WebElement createFolderArrow;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveBtn;

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

   //checking if no duplicate file exists in "All files"
    public boolean checkDuplicates(){

        boolean flag = false;
        Set<WebElement> noDuplicate = new HashSet<>(uploadedFiles);
        if(noDuplicate.size()==uploadedFiles.size()){
            flag=true;
        }

        return flag;
    }

    public void moveFile(String fileName){
        for (WebElement file : uploadedFiles) {
            if (file.getText().contains(fileName)) {
                Actions actions = new Actions(Driver.get());
                actions.contextClick(file).perform();
               // WebUtilities.waitFor(3);
                WebUtilities.clickWithJS(moveOrCopy);
               // WebUtilities.waitFor(3);
                WebUtilities.clickWithJS(moveOrCopy);
            }
        }
    }

    public void createFolder(String folderName){

        createFolderBtn.click();
        giveName.clear();
        giveName.sendKeys(folderName);

        createFolderArrow.click();
      //  WebUtilities.waitFor(3);
        moveBtn.click();


        WebUtilities.waitFor(4);
    }

    public boolean myFolder(String fileName){

        Driver.get().navigate().refresh();
        boolean flag = false;
                uploadedFiles.get(0).click();

                WebUtilities.waitFor(3);
                if(Driver.get().findElement(By.xpath("//table//tbody/tr")).getText().contains(fileName)){
                    flag = true;
        }
        return flag;
    }
}
