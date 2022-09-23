package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;

public class TugasStepDef {
    CartPage cartPage;
    InventoryPage inventoryPage;



    @Given("I am already add one product on cart")
    public void iAmAlreadyAddOneProductOnCart(){
        inventoryPage.selectOneItem();
    }

    @And("I am on the inventory page")
    public void iAmOnTheInventoryPage(){
        inventoryPage.goToPage();
    }
    @When("I sort the product by {string}")
    public void iSortTheProductBy(String sortBy){
        inventoryPage.sortProductBy(sortBy);
    }
    @Then("Sort menu show {string}")
    public void sortMenuShow(String sortBy){
        assertEquals(sortBy, inventoryPage.getSortProduct());
    }
    @When("I click add to cart button on the first product on the list")
    public void IClickAddToCartButtonOnTheFirstProductOnTheList(){
        inventoryPage.selectFirstItem();
    }
    @And("I click on cart button")
    public void iClickOnCartButton(){
        inventoryPage.clickCartButton();
    }
    @Then("I am directed to cart page")
    public void iAmDirectedToCartPage(){
        cartPage.goToPage();

    }
    @And("The selected product appears in cart list")
    public void theSelectedProductAppearsInCartList() {
        assertEquals("Test.allTheThings() T-Shirt (Red)",cartPage.getLastProductadded());

    }
    @When("I click on remove button on the first product item added in the cart list")
    public void iClickOnRemoveButtonOnTheLastProductInList(){
        cartPage.removeItem();
    }


    @And("I click on continue shopping button")
    public void iClickOnContinueShoppingButton(){
        cartPage.clickContinueShopping();
    }
    @Then("I am redirected back to the inventory page")
    public void redirectedBackToInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html", inventoryPage.getUrl());
        assertEquals("PRODUCTS", inventoryPage.getHeaderTitle());
        assertTrue(inventoryPage.isShowIconHeader());
    }



}
