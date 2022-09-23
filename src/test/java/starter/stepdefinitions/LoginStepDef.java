package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;

import javax.swing.*;

public class LoginStepDef {
    LoginPage loginPage;
    InventoryPage inventoryPage;
    Action action;

    

    @Given("I am on the login page")
    public void iAmOnTheLoginPage(){
        loginPage.open();
    }

    @When("I input username with {string}")
    public void iInputUsername(String username){
        loginPage.inputUsername(username);
    }

    @And("I input password with {string}")
    public void iInputPassword(String password){
        loginPage.inputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("I am directed to inventory page")
    public void iAmDirectedToInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html", inventoryPage.getUrl());
        assertEquals("PRODUCTS", inventoryPage.getHeaderTitle());
        assertTrue(inventoryPage.isShowIconHeader());
    }
    @Given("I am already logged in")
    public void alreadyLoggedIn(){
        loginPage.open();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
    }
}
