package com.HectorWare.step_definitions;

import com.HectorWare.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepsDef {

    @Given("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        LoginPage loginPage=new LoginPage();
        loginPage.login();


    }

    @When("the user clicks on Contact button on Dashboard page")
    public void the_user_clicks_on_Contact_button_on_Dashboard_page() {

    }

    @Then("the New Contact page should be displayed")
    public void the_New_Contact_page_should_be_displayed() {

    }


}
