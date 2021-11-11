package com.HectorWare.step_definitions;

import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user navigate to login page")
    public void the_user_navigate_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @Then("the user should login successfully to the main page")
    public void the_user_should_login_successfully_to_the_main_page() {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @Given("the user login with valid credentials")
    public void the_user_login_with_valid_credentials() {
        Driver.get().get(ConfigurationReader.get("url"));

        WebUtilities.waitFor(2);
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));

        WebUtilities.waitFor(2);
        Assert.assertEquals("Files - Hectorware - QA", Driver.get().getTitle());
        ;
    }

}
