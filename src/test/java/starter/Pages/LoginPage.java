package starter.Pages;

import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButtonField = By.id("login-button");


    public void inputUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public Performable clickLoginButton(){
        driver.findElement(loginButtonField).click();
        return null;
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }

}
