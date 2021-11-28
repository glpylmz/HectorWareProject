package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.CreateNewConversation;
import com.HectorWare.pages.LoginPage;
import com.HectorWare.utilities.ConfigurationReader;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class NewConvStepDef {
    CreateNewConversation createNewConversation = new CreateNewConversation();

    @Given("the user should be on talk module")
    public void the_user_should_be_on_talk_module() {

        WebUtilities.waitForClickablility(createNewConversation.talkModule,5);
        createNewConversation.navigateToModule("Talk");
    }
    @Then("all conversation lists under Talk module")
    public void all_conversation_lists_under_Talk_module() {
        List<WebElement> allConversations=new ArrayList<>();

        allConversations = Driver.get().findElements(By.xpath("//li[@class='acli_wrapper']"));
        createNewConversation.allConvIsDisplayed(allConversations);

    }
    @When("the users click + sign")
    public void the_users_click_sign() {
      Driver.get().findElement(By.xpath("//button[@slot='trigger']")).click();
    }

    @Then("A pop-up should appear")
    public void a_pop_up_should_appear() {

    createNewConversation.pop_up.isDisplayed();
    }

    @Then("A pop-up should ask the user enter the conversation name")
    public void a_pop_up_should_ask_the_user_enter_the_conversation_name() {
       createNewConversation.conversationBox.isDisplayed();
       createNewConversation.conversationBox.sendKeys("asdaasda");
    }
    @Then("A pop-up should ask the user to add parcipants")
    public void a_pop_up_should_ask_the_user_to_add_parcipants() {
      createNewConversation.AddParticipant.isDisplayed();
      createNewConversation.AddParticipant.click();
      createNewConversation.createConver.click();
    }
    @Then("newly created conversation should appear on the left")
    public void newly_created_conversation_should_appear_on_the_left() {
        createNewConversation.newConver.isDisplayed();
    }

}
