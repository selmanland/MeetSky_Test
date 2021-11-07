package com.meetSky.step_definitions;

import com.meetSky.pages.DashboardPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FileStepDefs {
    DashboardPage dashboardPage =new DashboardPage();
    @When("the user upload a file")
    public void theUserUploadAFile() {

        dashboardPage.filePlus.click();
        dashboardPage.fileUpload("meetSkyFile");

    }

    @Then("the user verify that the file is uploaded")
    public void theUserVerifyThatTheFileIsUploaded() {
        String expectedResult ="meetSkyFile";
        String actualResult = dashboardPage.uploadedFile.getText();

        Assert.assertEquals("verify that the file is uploaded",expectedResult,actualResult);
    }
}
