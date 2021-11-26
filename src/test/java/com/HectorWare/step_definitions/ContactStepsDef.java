package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.ContacInfoPage;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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

    @Then("the User should  clic on  the {string} button")
    public void theUserShouldClicOnTheButton(String arg0) {
        WebUtilities.waitFor(2);

        new ContacInfoPage().addNewContactButton.click();

    }

    @And("the user create a new contact information of {string} and{string} and{string} and{string} and {string}")
    public void theUserCreateANewContactInformationOfAndAndAndAnd(String fullName, String CompanyName, String Title, String PhoneNumber, String Email) {
        WebUtilities.waitFor(3);

     ContacInfoPage contacInfoPage=new ContacInfoPage();
     WebUtilities.waitFor(2);

     contacInfoPage.fullName.clear();
     contacInfoPage.fullName.sendKeys(fullName);

        WebUtilities.waitFor(2);
     contacInfoPage.companyName.sendKeys(CompanyName);
        WebUtilities.waitFor(2);
     contacInfoPage.title.sendKeys(Title);
        WebUtilities.waitFor(2);
     contacInfoPage.phoneNumber.sendKeys(PhoneNumber);

        WebUtilities.waitFor(3);
     contacInfoPage.email.sendKeys(Email);

    }






}
