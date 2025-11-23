package pageObjectsManager;

import org.openqa.selenium.WebDriver;
import pages.DealsPage;
import pages.GreenkartPage;

public class PageObjectsManager {
    public  WebDriver driver;
    public PageObjectsManager(WebDriver driver)
    {
        this.driver=driver;
        System.out.println("PageObjectsManager constructor invocation");

    }

   public GreenkartPage getObjectOfGreenKartPage()
   {
       return new GreenkartPage(driver);
   }

   public DealsPage getDealsPageObject()
   {
       return new DealsPage(driver);
   }
}
