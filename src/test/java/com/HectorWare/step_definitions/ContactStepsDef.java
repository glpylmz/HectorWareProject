package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.ContacInfoPage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactStepsDef extends BasePage  {

    @Given("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        new LoginPage().login("Employee1","Employee123");

    }
    @When("the user should be on Contact page")
    public void the_user_should_be_on_Contact_page() {
        WebUtilities.waitForClickablility(contactsModule,10);
    }

    @Then("the New Contact page should be displayed")
    public void the_New_Contact_page_should_be_displayed() {
        Assert.assertTrue(Driver.get().getTitle().contains("New Contact"));


    }


}
