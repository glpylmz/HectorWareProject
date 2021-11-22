package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.pages.SettingsPage;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.security.Key;

public class SettingsStepDefs {
    @Given("the user logged in")
    public void the_user_logged_in() {
        new LoginPage().login();
    }

    @Given("the user should be on settings page")
    public void the_user_should_be_on_settings_page() {
        new SettingsPage().navigateToSettings();
        Assert.assertTrue(Driver.get().getTitle().contains("Settings"));
    }

    @Then("the user can see {string} on this page")
    public void the_user_can_see_on_this_page(String info) {
        Assert.assertTrue(new SettingsPage().informationTitle(info).isDisplayed());
    }

    @When("the user click on the Select from files button")
    public void the_user_click_on_the_Select_from_files_button() {
        try {
            WebUtilities.waitForClickablility(new SettingsPage().selectFromFileIcon, 5);
        } catch (Exception e) {
            Assert.fail("Select from file icon is not clickable");
            e.printStackTrace();
        }
        new SettingsPage().selectFromFileIcon.click();
    }


    @When("the user choose the {string} from inside folder")
    public void the_user_choose_the_from_inside_folder(String picname) {
        new SettingsPage().choosePicture(picname);
    }

    @Then("the user should see user picture avatar on the page")
    public void the_user_should_see_user_picture_avatar_on_the_page() {
        Assert.assertTrue(new SettingsPage().profilePictureAvatar.isDisplayed());
    }

    @Then("the user will see error message")
    public void the_user_will_see_error_message() {
        WebUtilities.waitForVisibility(new SettingsPage().uploadPictureWarningMessage, 10);
        WebUtilities.waitFor(3);
        Assert.assertTrue(new SettingsPage().uploadPictureWarningMessage.isDisplayed());
    }



        @When("the user click on the Upload new button again")
        public void the_user_click_on_the_Upload_new_button_again() {
            new SettingsPage().uploadNewPictureButton.click();
            try {
                new SettingsPage().uploadNewPictureButton.click();
                Assert.assertTrue("Upload file button doesnt work",false);

            } catch (Exception e) {
                Assert.assertTrue(true);
            }
        }




    @When("the user click on the Upload new button and choose the {string} from computer")
    public void the_user_choose_the_from_computer(String string) {
       new SettingsPage().uploadNewPicturefromcomputer.sendKeys("C:/Users/glpyl/Desktop/invalid.txt");
        WebUtilities.waitFor(5);
    }
}
