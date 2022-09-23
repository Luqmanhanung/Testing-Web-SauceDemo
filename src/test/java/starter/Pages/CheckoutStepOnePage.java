package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutStepOnePage extends PageObject {
    WebDriver driver = getDriver();
    private String pageURL ="https://www.saucedemo.com/checkout-step-one.html";
    private final By firstnameField = By.id("first-name");
    private final By lastnameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By itemName = By.className("inventory_item_name");
    private final By continueButton = By.id("continue");

    public CheckoutStepOnePage goToPage(){
        driver.get(pageURL);
        return this;
    }
    public void inputFirstname(String firstname){
        driver.findElement(firstnameField).sendKeys(firstname);
    }
    public void inputLastname(String lastname){
        driver.findElement(lastnameField).sendKeys(lastname);
    }
    public void inputPostalCode(String postalcode){
        driver.findElement(postalCodeField).sendKeys(postalcode);
    }
    public String getItemName() {
        return driver.findElement(itemName).getAttribute("innerHTML");
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }


}
