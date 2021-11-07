package com.meetSky.pages;

import com.meetSky.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage {

   public NotesPage() {PageFactory.initElements(Driver.get(),this);}

    @FindBy (xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    public WebElement notes;

   @FindBy(id = "notes_new_note")
    public WebElement createNewNote;

   @FindBy (xpath = "(//button[@*='Actions'])[3]")
    public WebElement noteEdit;

   @FindBy(xpath = "(//span[@class='action-button__text'])[3]")
    public WebElement deleteNote;

   @FindBy (xpath = "//*[@class='app-navigation-toggle']")
    public WebElement moreBtn;

   @FindBy(xpath = "(//span[@class='action-button__text'])[1]")
    public WebElement renameBtn;

   @FindBy(xpath = "(//input[@class='app-navigation-entry__edit-input'])[1]")
    public WebElement titleBtn;


}
