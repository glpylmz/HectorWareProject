package com.HectorWare.step_definitions;

import com.HectorWare.pages.FilesPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class fileUploadStepDefs {

    @When("the user clicks plus button and selects {string}")
    public void the_user_clicks_plus_button_and_selects(String file) {
       new FilesPage().clickUpload(file);
    }

    @Then("{string} is in the All files tab")
    public void is_in_the_All_files_tab(String fileName) {
        Assert.assertTrue(new FilesPage().plusBtnOptions(fileName));
    }


}
