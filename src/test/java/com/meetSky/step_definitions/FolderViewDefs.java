
package com.meetSky.step_definitions;


import com.meetSky.pages.FolderPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

class FolderViewDefs {

    FolderPage folderPage=new FolderPage();
    List<String>actualNameOrders=new ArrayList<>();
    List<String> AfterClickName=new ArrayList<>();



    @And("user should see following files")
    public void userShouldSeeFollowingFiles(List<String> BeforeClickName) {
        System.out.println("BeforeClickName = " + BeforeClickName);

        BrowserUtils.waitFor(3);
        List<WebElement> elements = folderPage.NameBtn;
        System.out.println("elements.size() = " + elements.size());


    }
    @Then("the user clicks on Name")
    public void the_user_clicks_on_Name() {
        BrowserUtils.waitFor(2);

        Driver.get().findElement(By.xpath("//span[text()='Name']")).click();

    }


    @And("user should see the changes of the order of files view like following")
    public void userShouldSeeTheChangesOfTheOrderOfFilesViewLikeFollowing(List<String>BeforeClickName) {
        System.out.println("BeforeClickName = " + BeforeClickName);

        BrowserUtils.waitFor(2);
        List<WebElement> elements=folderPage.NameBtn;
        System.out.println("elements.size() = " + elements.size());

        List<String>actualNameOrders=new ArrayList<>();

        for (WebElement element : elements) {
            actualNameOrders.add(element.getText());

        }

        System.out.println("actualNameOrders = " + actualNameOrders);

        Assert.assertFalse("file order is changed", actualNameOrders.equals(BeforeClickName));

    }
    @Then("the user should see files dynamically")
    public void the_user_should_see_files_dynamically() {
//        System.out.println("expectedNameOrders = " + expectedNameOrders);

        BrowserUtils.waitFor(1);
        List<WebElement> elements=folderPage.NameBtn;
        System.out.println("elements.size() = " + elements.size());



        for (WebElement element : elements) {
            actualNameOrders.add(element.getText());

        }

        System.out.println("actualNameOrders = " + actualNameOrders);

    }

    @Then("the user should see changed files")
    public void the_user_should_see_changed_files() {

        List<WebElement> elements=folderPage.NameBtn;


        for (WebElement element : elements) {
            AfterClickName.add(element.getText());

        }
        System.out.println("AfterClickName = " + AfterClickName);

        Assert.assertFalse("order is changed", actualNameOrders.equals(AfterClickName));



    }


    @Then("the user clicks on Size")
    public void theUserClicksOnSize() {

        Driver.get().findElement(By.xpath("//span[text()='Size']")).click();
    }



    @Then("the user clicks on {string}")
    public void theUserClicksOn(String button) {


        if (button.equals("Name")) {
            Driver.get().findElement(By.xpath("//span[text()='Name']")).click();
        } else if (button.equals("Size")) {
            Driver.get().findElement(By.xpath("//span[text()='Size']")).click();

        } else if (button.equals("Modified")) {
            Driver.get().findElement(By.xpath("//span[text()='Modified']")).click();

        }
    }


    @Then("the user clicks on Modified")
    public void theUserClicksOnModified() {
        Driver.get().findElement(By.xpath("//span[text()='Modified']")).click();
    }


}
