package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import starter.Help;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();
    Help help = new Help();
    private String pageUrl="https://www.saucedemo.com/inventory.html";



    private final By productSortContainer = By.className("product_sort_container");
    private final By activeSortOption = By.className("active_option");
    private final By inventoryList = By.className("inventory_item_name");
    private final By cartButton = By.className("shopping_cart_link");
    private final By firstItem = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button");
    private final By firstItemName = By.className("inventory_item_name");

    private final By headertitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By iconHeader = By.xpath("//*[@id=\"header_container\"]/div[2]/div[1]");
    private final By removeButton = By.id("remove-sauce-labs-fleece-jacket");
    private final By oneItem = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    public void clickCartButton(){
        driver.findElement(cartButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void SelectByVisibleText(By element, String text){
        Select dropdown = new Select(driver.findElement(element));
        dropdown.selectByVisibleText(text);
    }

    public InventoryPage sortProductBy(String sortMethod){
        help.SelectByVisibleText(productSortContainer,sortMethod);
        return this;
    }
    public String getSortProduct(){
        return driver.findElement(activeSortOption).getAttribute("innerHTML");
    }
    public InventoryPage goToPage(){
        driver.get(pageUrl);
        return this;
    }
    public String isShow(){
        return driver.findElement(headertitle).getText();
    }
    public String getHeaderTitle(){
        return driver.findElement(headertitle).getText();
    }
    public boolean isShowIconHeader(){
        return driver.findElement(iconHeader).isDisplayed();
    }
    public void selectItem(String item){
        driver.findElement(By.id(item)).click();
    }
    public void selectFirstItem(){
        driver.findElement(firstItem).click();
    }
    public String getFirstitem(){
        return driver.findElement(firstItemName).getAttribute("innerHTML");
    }

    public boolean isRemoveButtonShow(){
        return driver.findElement(removeButton).isDisplayed();
    }
    public void selectOneItem(){
        driver.findElement(oneItem).click();
    }








}
