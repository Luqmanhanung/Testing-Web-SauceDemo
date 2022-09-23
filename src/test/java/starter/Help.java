package starter;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Help extends PageObject {
    WebDriver driver = getDriver();

    public void SelectByVisibleText(By elemenLocator, String statement){
        Select selectOption = new Select(driver.findElement(elemenLocator));
        selectOption.selectByVisibleText(statement);
    }


}
