package com.meetSky.pages;


import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FolderPage {
    public FolderPage() {
        PageFactory.initElements(Driver.get(), this); }





    @FindBy(xpath = "//tr//span[@class='innernametext']")
    public List<WebElement>  NameBtn;


    @FindBy(xpath = "//span[text()='Name']")
    public WebElement NameOption;

    @FindBy(xpath = "//span[text()='Size']")
    public WebElement SizeBtn;

    @FindBy(xpath = "//span[text()='Modified'")
    public WebElement ModifiedBtn;




}
