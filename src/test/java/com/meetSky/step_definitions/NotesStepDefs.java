package com.meetSky.step_definitions;

import com.meetSky.pages.NotesPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesStepDefs {

    WebDriver driver = Driver.get();
    NotesPage filesPage = new NotesPage();
    WebDriverWait wait = new WebDriverWait(driver,60);

    @Given("User should be able to see the Notes module")
    public void user_should_be_able_to_see_the_Notes_module() throws InterruptedException {
        filesPage.notes.click();

        BrowserUtils.waitFor(2);
        filesPage.moreBtn.click();

    }

    @Given("User should be able to create a new note")
    public void user_should_be_able_to_create_a_new_note() {

        filesPage.createNewNote.click();
        BrowserUtils.waitFor(2);

    }

    @When("User should be able to delete any note")
    public void user_should_be_able_to_delete_any_note() {
        filesPage.moreBtn.click();

        BrowserUtils.clickWithJS(filesPage.noteEdit);

        filesPage.deleteNote.click();
        BrowserUtils.waitFor(10);
    }

    @Then("User should be able to rename any note")
    public void user_should_be_able_to_rename_any_note() throws InterruptedException {
        filesPage.moreBtn.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(filesPage.noteEdit);
        filesPage.renameBtn.click();
        Thread.sleep(5000);

        Actions doubleClick = new Actions(driver);
        doubleClick.doubleClick(filesPage.titleBtn).perform();

        BrowserUtils.clickWithJS(filesPage.titleBtn);

        for (int i =0 ;i<=13; i++){
            filesPage.titleBtn.sendKeys(Keys.BACK_SPACE);
        }
        filesPage.titleBtn.sendKeys("MY NOTE");

        Assert.assertTrue(filesPage.titleBtn.getAttribute("value").equals("MY NOTE"));
    }

}
