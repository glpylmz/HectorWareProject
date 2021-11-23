package com.HectorWare.pages;

import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "user")
    public WebElement userBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;


    public void login(String username, String password){
        userBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public void login(){

        String username = System.getProperty("username")!=null ? System.getProperty("username") : ConfigurationReader.get("username");
        String password = System.getProperty("password")!=null ? System.getProperty("password") : ConfigurationReader.get("password");

        userBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));

        loginButton.click();

    }

}
