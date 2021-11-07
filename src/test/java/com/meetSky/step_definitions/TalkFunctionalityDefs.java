package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.pages.TalkFunctionaltyPage;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkFunctionalityDefs {

    @Given("Meetsky Home page should contains title {string}")
    public void meetsky_Home_page_should_contains_title(String expectedTitle) {
        System.out.println(Driver.get().getTitle());
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @Then("Click on Talk tab")
    public void click_on_Talk_tab() {
        new TalkFunctionaltyPage().clicktalkButton();
    }

    @When("Meetsky Talk page should contains title {string}")
    public void meetsky_Talk_page_should_contains_title(String expectedTitle) {
        System.out.println(Driver.get().getTitle());
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));


    }

    @When("Click on the burger menu button")
    public void click_on_the_burger_menu_button() {
        new TalkFunctionaltyPage().clickBergerMenuButton();


    }

    @Then("Click on the Plus Sign")
    public void click_on_the_Plus_Sign() {
        new TalkFunctionaltyPage().clickPlusSignButton();
    }

    @Then("Send any Conversation name to searchBox {string}")
    public void send_any_Conversation_name_to_searchBox(String conversationName) {

        new TalkFunctionaltyPage().sendsearchBox(conversationName);

    }

    @Then("Click on Add participants Button")
    public void click_on_Add_participants_Button() {
        new TalkFunctionaltyPage().clickAddParticipantButton();

    }

    @Then("Click on  Employee10")
    public void click_on_Employee10() {
      new TalkFunctionaltyPage().clickEmployee10();

    }

    @Then("Click on Create Conversation Button")
    public void click_on_Create_Conversation_Button() {
        new TalkFunctionaltyPage().clickCreateConversationButton();
    }

    @Then("Verify the Title Contains {string}")
    public void verify_the_Title_Contains(String expectedTitle) {
        new TalkFunctionaltyPage().AssertContainsMeth(expectedTitle);


    }

    @Then("verify display all conversation list under the Talk module")
    public void verifyDisplayAllConversationListUnderTheTalkModule() {
        new TalkFunctionaltyPage().getAllConversations();
    }


    @When("User click on the start call button")
    public void userClickOnTheStartCallButton() {
       new TalkFunctionaltyPage().videoCallButtonClick();

    }

    @Then("verify videcall screen is Displayed")
    public void verifyVidecallScreenIsDisplayed() {
     new TalkFunctionaltyPage().getvideoCallScreen();

    }

    @And("click on the leave button")
    public void clickOnTheLeaveButton() {
        new TalkFunctionaltyPage().leaveCallButtonClick();

    }

    @Then("Then verify is Talk page is displayed")
    public void thenVerifyIsTalkPageIsDisplayed() {

        new TalkFunctionaltyPage().getvideoCallScreen2();
    }



    @Given("Navigate the url")
    public void navigateTheUrl() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
}
