package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.get().get(ConfigurationReader.get("url"));
    }


    @And("the user enters the employee information")
    public void the_user_enters_the_employee_information() {
        // Write code here that turns the phrase above into concrete actions
        String username=ConfigurationReader.get("employee_username");//  driver_username
        String password=ConfigurationReader.get("employee_password"); //  driver_password

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions

               String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Files - Meetsky - QA",actualTitle);
    }







}
