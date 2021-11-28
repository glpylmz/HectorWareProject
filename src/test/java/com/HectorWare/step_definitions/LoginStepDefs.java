package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.pages.SettingsPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user navigate to login page")
    public void the_user_navigate_to_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        loginPage.login();
    }

    @Then("the user should login successfully to the main page")
    public void the_user_should_login_successfully_to_the_main_page() {
        String expectedTitle = "Files - Hectorware - QA";
        Assert.assertEquals("Login to Base Page using conf.prop. credentials",expectedTitle,Driver.get().getTitle());
    }

    @Given("the user login with valid credentials")
    public void the_user_login_with_valid_credentials() {
        Driver.get().get(ConfigurationReader.get("url"));

        WebUtilities.waitFor(2);
        loginPage.login();

        WebUtilities.waitFor(2);
        Assert.assertEquals("Files - Hectorware - QA", Driver.get().getTitle());

    }

    @Given("the user login with {string} as username")
    public void theUserLoginWithAsUsername(String username) {
        Driver.get().get(ConfigurationReader.get("url"));

        WebUtilities.waitFor(2);
        loginPage.loginWithUsername(username);
        String expectedTitle = "Files - Hectorware - QA";
        //System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals("Login to base page title test",Driver.get().getTitle(),expectedTitle);
    }
    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        loginPage.login(username, password);
    }




}
