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
        Driver.get().get(ConfigurationReader.get("url"));
        WebUtilities.waitFor(2);
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        WebUtilities.waitFor(2);
    }
    @When("the user should be on Contact page")
    public void the_user_should_be_on_Contact_page() {
        WebUtilities.waitFor(3);
        new ContacInfoPage().navigateToModule("Contacts");

    }

    @Then("the New Contact page should be displayed")
    public void the_New_Contact_page_should_be_displayed() {
        WebUtilities.waitFor(3);
        String expextedTitle="Contacts - Hectorware - QA";

        String actualTitle=Driver.get().getTitle();

        Assert.assertEquals(expextedTitle,actualTitle);
    }

// ADD new Contact
    @Then("the User should  clic on  the {string} button")
    public void the_User_should_clic_on_the_button(String string) {
        new ContacInfoPage().addNewContactButton.click();

    }
    @Then("the user create a new contact with folowing information as {string} and {string}")
    public void the_user_create_a_new_contact_with_folowing_information_as_and(String string, String string2) {

    }



}
