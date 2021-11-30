package com.HectorWare.step_definitions;

import com.HectorWare.pages.FilesPage;
import com.HectorWare.utilities.WebUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fileUploadStepDefs {

    @When("the user clicks plus button and selects {string}")
    public void the_user_clicks_plus_button_and_selects(String file) {
       new FilesPage().clickUpload(file);
    }

    @Then("{string} is in the All files tab")
    public void is_in_the_All_files_tab(String fileName) {
        Assert.assertTrue(new FilesPage().plusBtnOptions(fileName));
    }


    @Then("{string} message is displayed")
    public void message_is_displayed(String conflictMsg) {

                Assert.assertEquals(conflictMsg,new FilesPage().conflictMessage.getText());
    }




    @When("the user selects already existing file")
    public void the_user_selects_already_existing_file() {
        new FilesPage().existingFile.click();
        new FilesPage().continu.click();
    }

    @Then("no duplicate file name in All files tab")
    public void no_duplicate_file_name_in_All_files_tab() {

        Assert.assertTrue(new FilesPage().checkDuplicates());
    }



    @When("the user right clicks {string} for move or copy option")
    public void the_user_right_clicks_for_move_or_copy_option(String fileName) {
        new FilesPage().moveFile(fileName);
    }

    @When("moves the file to a new folder {string}")
    public void moves_the_file_to_a_new_folder(String folderName) {
        new FilesPage().createFolder(folderName);
    }

    @Then("{string} is in that folder")
    public void is_in_that_folder(String fileName) {
        Assert.assertTrue(new FilesPage().myFolder(fileName));
    }

}
