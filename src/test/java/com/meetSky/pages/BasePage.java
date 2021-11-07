package com.meetSky.pages;

import com.meetSky.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;



public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement filePlus;

    @FindBy(css = "input[type=file]")
    public WebElement fileUpload;

    @FindBy(xpath = "(//div[@class='file-name']/span)[1]")
    public WebElement uploadedFile;


    public void fileUpload(String fileName){
       //String desktopFilePath = "C://Users//Administrator//Desktop//"+fileName+".txt";

        String projectPath = System.getProperty("user.dir");
        String filePath ="src/test/resources/"+fileName+".txt";
        String projectFilePath = projectPath+"/"+filePath;
        fileUpload.sendKeys(projectFilePath);


    }







    public void navigateToModule(String module) {
        String Module = module.substring(0, 1).toUpperCase() + module.substring(1).toLowerCase();
        String moduleLocator = "//a[@aria-label='" + Module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 20);
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 10);
        }
    }


    //Change Status method
    public void changeStatus(String statusOptions) {
        String options = statusOptions.toLowerCase();
        String statusOptionsLocator = "//label[@class='user-status-online-select__label icon-user-status-"+options+"']";
        try{
            BrowserUtils.waitForClickablility(By.xpath(statusOptionsLocator),20);
            Driver.get().findElement(By.xpath(statusOptionsLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(statusOptionsLocator)),20 );
        }
    }



    public void ViewFolder(String module) {
        String Module = module.substring(0, 1).toUpperCase() + module.substring(1).toLowerCase();
        String moduleLocator = "//span[text()='" + Module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 20);
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 10);
        }

    }

}
