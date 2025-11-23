package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class BasePage {
    public WebDriver driver;


    public BasePage(WebDriver driver)
    {
        this.driver=driver;
    }


    public void cliclOnElement(By locator)
    {
        driver.findElement(locator).click();
    }

    public String getTextbyXpath(By locator)
    {
        return driver.findElement(locator).getText();
    }

    public WebElement findField(By locator)
    {
        return driver.findElement(locator);
    }

    public void switchToTab()
    {
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> iterator=handles.iterator();
        String parent=iterator.next();
        String child=iterator.next();
        driver.switchTo().window(child);
    }

}
