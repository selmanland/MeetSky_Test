package com.meetSky.pages;

import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import com.meetSky.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkFunctionaltyPage extends BasePage{


    public TalkFunctionaltyPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//li[@data-id='spreed'])[1]")

    public WebElement talkButton;

    public void clicktalkButton() {
        talkButton.click();
    }

    @FindBy(xpath = "//div/a[@class='app-navigation-toggle']")
    public WebElement burgerMenuButton;

    public void clickBergerMenuButton() {
        burgerMenuButton.click();
    }

    @FindBy(xpath = "//span[@class='material-design-icon plus-icon']")
    public WebElement plusSignButton;

    public void clickPlusSignButton() {
        BrowserUtils.waitForClickablility(plusSignButton, 5);
        BrowserUtils.clickWithJS(plusSignButton);
    }

    @FindBy(xpath = "//div/input[@class='conversation-name']")
    public WebElement searchBox;

    public void sendsearchBox(String conversationName) {
        BrowserUtils.waitFor(5);
        searchBox.click();
        searchBox.sendKeys(ConfigurationReader.get("Conversation_Name"));
    }
    @FindBy(xpath = "//div/button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantButton;

    public void clickAddParticipantButton(){
        BrowserUtils.waitFor(5);
        addParticipantButton.click();
    }
    @FindBy(xpath = "//div/span[.='Employee10']")
    public WebElement Employee10;

    public void clickEmployee10() {
        BrowserUtils.waitFor(5);
        BrowserUtils.clickWithJS(Employee10);
    }
    @FindBy(xpath = "//div/button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversationButton;

    public void clickCreateConversationButton() {
        BrowserUtils.waitFor(5);
        BrowserUtils.clickWithJS(createConversationButton);
    }
@FindBy(css = ".conversations")

    public WebElement allConversations;

    public void getAllConversations(){
        BrowserUtils.waitFor(5);
        allConversations.isDisplayed();
        Assert.assertTrue("verify that is displayed",allConversations.isDisplayed());
    }

    @FindBy(xpath = "//span[@class='icon icon-start-call']")
    public WebElement videoCallButton;

    @FindBy(xpath = "//div[@id='videos']")
    public WebElement getScreen;



    public void getvideoCallScreen() {
        BrowserUtils.waitFor(5);
        getScreen.isDisplayed();
        Assert.assertTrue("verify that is displayed", getScreen.isDisplayed());
    }
    public void videoCallButtonClick() {
        BrowserUtils.waitFor(3);
        videoCallButton.click();
    }
   @FindBy(xpath = "//button[@class='top-bar__button error top-bar__button']")
    public WebElement leaveCallButton;

    public void leaveCallButtonClick() {
        BrowserUtils.waitForClickablility(leaveCallButton, 5);
        leaveCallButton.click();
    }

    public void getvideoCallScreen2() {
        BrowserUtils.waitFor(5);
        videoCallButton.isDisplayed();
        Assert.assertTrue("verify that is displayed", videoCallButton.isDisplayed());
    }


    public  void AssertContainsMeth(String expected){

        BrowserUtils.waitFor(8);
        System.out.println(Driver.get().getTitle());
        String actual = Driver.get().getTitle();
        Assert.assertTrue(actual.contains(expected));

    }


}




