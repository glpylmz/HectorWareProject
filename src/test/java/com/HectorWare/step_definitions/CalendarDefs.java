package com.HectorWare.step_definitions;

import com.HectorWare.pages.BasePage;
import com.HectorWare.pages.CalendarPage;
import com.HectorWare.utilities.Driver;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalendarDefs {
CalendarPage calendarPage=new CalendarPage();
    @Given("the user navigate to {string} page")
    public void the_user_navigate_to_page(String module) {
      new CalendarPage().navigateToModule(module);

    }

    @When("the user clicks on Hamburger menu button")
    public void the_user_clicks_on_Hamburger_menu_button() {
        WebUtilities.waitForClickablility( calendarPage.HamburgerListButton,5);
          WebUtilities.clickWithJS( calendarPage.HamburgerListButton);
          WebUtilities.waitFor(5);
    }

    @Then("the  Hamburger menu button should include the expected options")
    public void the_Hamburger_menu_button_should_include_the_expected_options(List<String> expectedOptions) {
      List<String> actualOptions=calendarPage.getTextFromHamburgerOptions();

      Assert.assertEquals(expectedOptions,actualOptions);
    }


    @And("the user clicks on Hamburger {string} option")
    public void theUserClicksOnHamburgerOption(String option) {
       calendarPage.clickHamburgerOption(option);
    }


    @Then("the Daily calendar should be display")
    public void theDailyCalendarShouldBeDisplay() {

         DateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy");
         Date d =new Date();
         String date=dateFormat.format(d);
         String[] str = calendarPage.datesHeader.getText().split(" ");
         String dayTxt=str[1];
         Assert.assertEquals(date,dayTxt);

    }

    @Then("the Weekly calendar should be displayed")
    public void theWeeklyCalendarShouldBeDisplayed() {
        List<String>weekDays=WebUtilities.getElementsText(Driver.get().findElements(By.xpath("//a[@tabindex='0']")));
        try{
            if(weekDays.size()==7){
                Assert.assertTrue(true);
            }else{
                Assert.fail("The Weekly Calendar is NOT been displayed");
            }
        }catch (Exception e){
            e.getMessage();
        }

    }

    @Then("the Monthly calendar should be displayed")
    public void theMonthlyCalendarShouldBeDisplayed() {
        List<WebElement>weekDays=Driver.get().findElements(By.xpath("//a[@class='fc-daygrid-day-number']"));
        try{
            if(weekDays.size()>28){
                Assert.assertTrue(true);
            }else{
                Assert.fail("The Monthly Calendar is NOT been displayed");
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Then("the List calendar should be displayed")
    public void theListCalendarShouldBeDisplayed() {
        Date d =new Date();
        String[] text=calendarPage.dateModule.getText().split(" ");
        String actualText=text[0];
        String month="";
        switch (d.getMonth()){
            case 0:
                month="January";
                Assert.assertEquals(month,actualText);
                break;
            case 1:
                month="February";
                Assert.assertEquals(month,actualText);
                break;
            case 2:
                month="March";
                Assert.assertEquals(month,actualText);
                break;
            case 3:
                month="April";
                Assert.assertEquals(month,actualText);
                break;
            case 4:
                month="May";
                Assert.assertEquals(month,actualText);
                break;
            case 5:
                month="June";
                Assert.assertEquals(month,actualText);
                break;
            case 6:
                month="July";
                Assert.assertEquals(month,actualText);
                break;
            case 7:
                month="August";
                Assert.assertEquals(month,actualText);
                break;
            case 8:
                month="September";
                Assert.assertEquals(month,actualText);
                break;
            case 9:
                month="October";
                Assert.assertEquals(month,actualText);
                break;
            case 10:
                month="November";
                Assert.assertEquals(month,actualText);
                break;
            case 11:
                month="December";
                Assert.assertEquals(month,actualText);
                break;
        }
    }
}
