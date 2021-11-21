package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlineStatusDefs extends BasePage {


    @When("user clicks on profile avatar")
    public void user_clicks_on_profile_avatar() {
      memberIcon.click();
        Assert.assertTrue(accountOptions.get(0).isDisplayed());

    }

    @Then("user should see their online set status under their name")
    public void user_should_see_their_online_set_status_under_their_name() {
        Assert.assertTrue(accountOptions.get(0).isDisplayed());

    }



}
