package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.OnlineStatusPage;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnlineStatusDefs extends BasePage {


    @When("user clicks on profile avatar")
    public void user_clicks_on_profile_avatar() {
      memberIcon.click();

    }

    @Then("user should see their online set status under their name")
    public void user_should_see_their_online_set_status_under_their_name() {
        Assert.assertTrue(accountOptions.get(0).isDisplayed());

    }

    @When("user clicks on set status under their name")
    public void user_clicks_on_set_status_under_their_name() {
        accountOptions.get(0).click();
    }

    @Then("user should see a new window popped up")
    public void user_should_see_a_new_window_popped_up() {
       Assert.assertTrue(new OnlineStatusPage().poppedUpStatusWindow.isDisplayed());
    }

    @And("user click on {string} status")
    public void user_click_on_status(String expectedString) {
        WebUtilities.waitFor(2);
        new OnlineStatusPage().selection(expectedString);
    }


    @And("user choose {string} status")
    public void userChooseStatus(String expected) {

        WebUtilities.waitFor(2);
        new OnlineStatusPage().selectionOfStatusMessage(expected);
    }
}
