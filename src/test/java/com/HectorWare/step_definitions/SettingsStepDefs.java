package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.pages.SettingsPage;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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
        new SettingsPage().isInformationDispleyed( info);
    }
}
