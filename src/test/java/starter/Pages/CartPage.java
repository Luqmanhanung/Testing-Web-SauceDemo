package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {
    WebDriver driver = getDriver();
    private String pageUrl = "https://www.saucedemo.com/cart.html";

    private By removeButton = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    private By continueShoppingButton = By.id("continue-shopping");
    private By oneproduct = By.id("inventory_item_name");
    private final By productname = By.className("inventory_item_name");
    private  final By checkoutButton = By.id("checkout");
    private  final By lastItemInCartList = By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/div[2]/button");
    private final By lastitemNameadded = By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div");
    private final By firstproductnameadd = By.className("inventory_item_name");



    public void clickRemoveButton(){
        driver.findElement(removeButton).click();
    }
    public void clickContinueShopping(){
        driver.findElement(continueShoppingButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public CartPage goToPage(){
        driver.get(pageUrl);
        return this;
    }
    public void getItem(){
        driver.findElement(oneproduct).isDisplayed();
    }
    public void removeItem(){
        driver.findElement(lastItemInCartList).click();
    }
    public CartPage allProductRemoved(){
        List<WebElement> removeButtons = driver.findElements(removeButton);
        for (WebElement rb :removeButtons){
            rb.click();
        }
        return  this;
    }
    public String getProductname() {
        return driver.findElement(productname).getAttribute("innerHTML");
    }
    public String getFirstProductNameAdded(){
        return driver.findElement(firstproductnameadd).getAttribute("innerHTML");
    }
    public String getLastProductadded(){
        return driver.findElement(lastitemNameadded).getAttribute("innerHTML");
    }
    public void clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }



}
