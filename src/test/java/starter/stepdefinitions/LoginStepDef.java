package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.LoginPage;

public class LoginStepDef {
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmAlreadyOnLoginPage(){
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

    }
}
