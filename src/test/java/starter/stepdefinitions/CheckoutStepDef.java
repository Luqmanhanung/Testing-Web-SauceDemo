package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.CheckoutCompletePage;
import starter.Pages.CheckoutStepOnePage;
import starter.Pages.CheckoutStepTwoPage;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class CheckoutStepDef {
    CartPage cartPage;
    CheckoutStepOnePage checkoutStepOnePage;
    CheckoutStepTwoPage checkoutStepTwoPage;
    CheckoutCompletePage checkoutCompletePage;
    @And("Cart is empty")
    public void cartIsEmpty(){
        cartPage.goToPage();
        cartPage.allProductRemoved();
    }
    @Then("{string} is on the cart list")
    public void checkItemIsOnTheCartList(String itemname){
        assertEquals(itemname,cartPage.getProductname());

    }
    @When("I click checkout button")
    public void iClickCheckoutButton(){
        cartPage.clickCheckoutButton();
    }
    @Then("I am directed to checkout page")
    public void iAmDirectedToCheckoutPage(){
        checkoutStepOnePage.goToPage();
    }
    @When("I input firstname with {string}")
    public void iInputFirstnameWith(String firstname){
        checkoutStepOnePage.inputFirstname(firstname);
    }
    @And("I input lastname with {string}")
    public void iInputLastnameWith(String lastname){
        checkoutStepOnePage.inputLastname(lastname);
    }

    @And("I input postal code with {string}")
    public void iInputZipPostalCodeWith(String postalcode) {
        checkoutStepOnePage.inputPostalCode(postalcode);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton(){
        checkoutStepOnePage.clickContinueButton();
    }
    @Then("summary of checkout is appear product name {string}")
    public void summaryOfCheckoutIsAppearEgProductName(String productName) {
        assertEquals(productName,cartPage.getProductname());
    }

    @When("I click finish button")
    public void iClickFinishButton() {
        checkoutStepTwoPage.clickFinishButton();
    }

    @Then("checkout process completed")
    public void checkoutProcessCompleted() {
        assertTrue(checkoutCompletePage.isShowponyExpressImage());

    }
}
