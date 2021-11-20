package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.ContacInfoPage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactStepsDef extends BasePage {

    @Given("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user clicks on Contact button on Dashboard page")
    public void the_user_clicks_on_Contact_button_on_Dashboard_page() {

    }

    @Then("the New Contact page should be displayed")
    public void the_New_Contact_page_should_be_displayed() {


    }


}
