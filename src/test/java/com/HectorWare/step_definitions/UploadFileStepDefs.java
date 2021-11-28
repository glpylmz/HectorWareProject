package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.pages.SettingsPage;
import com.HectorWare.pages.UploadFilePage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class UploadFileStepDefs extends UploadFilePage {


    @When("the user click on plus icon")
    public void the_user_click_on_plus_icon() {
       plusIcon.click();
    }

    @When("the user can upload a file by clicking the upload file")
    public void the_user_can_upload_a_file_by_clicking_the_upload_file() {
        uploadFile.sendKeys("C:\\Users\\wodaf\\OneDrive\\Desktop\\happyfile.txt");


    }

    @Then("the user should be able to see the selected file on the page")
    public void the_user_should_be_able_to_see_the_selected_file_on_the_page() {
        Assert.assertTrue(Driver.get().findElement(By.xpath("//tbody[@id='fileList']/tr")).getAttribute("data-file").contains("happy"));
    }


}
