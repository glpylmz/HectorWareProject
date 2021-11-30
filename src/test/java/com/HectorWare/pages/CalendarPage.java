package com.HectorWare.pages;

import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.bs.A;
import io.cucumber.java.et.Ja;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CalendarPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement EventTitleInputBox;

    @FindBy(xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement dateModule;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement HamburgerListButton;

    @FindBy(css = ".fc-scrollgrid-sync-inner>a")
    public WebElement datesHeader;

    @FindBy(xpath = "//ul[@id='menu-zonwp']/li/button/span[2]")
    public List<WebElement> HamburgerOptions;


    public CalendarPage(){PageFactory.initElements(Driver.get(),this);}

    public List<String> getTextFromHamburgerOptions(){
        List<String>text=new ArrayList<>();
         text.add(Driver.get().findElement(By.xpath("//*[.='Day']")).getText());
         WebUtilities.waitFor(5);
        text.add(Driver.get().findElement(By.xpath("//*[.='Week']")).getText());
        WebUtilities.waitFor(5);
        text.add(Driver.get().findElement(By.xpath("//*[.='Month']")).getText());
        WebUtilities.waitFor(5);
        text.add(Driver.get().findElement(By.xpath("//*[.='List']")).getText());
        WebUtilities.waitFor(5);
        return  text;
    }

    public void clickHamburgerOption(String option){
                    WebUtilities.waitFor(2);
        HamburgerListButton.click();
        HamburgerListButton.click();
        Driver.get().findElement(By.xpath("//*[text()='"+option+"']")).click();
   }

}
