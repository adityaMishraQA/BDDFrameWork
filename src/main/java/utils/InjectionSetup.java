package utils;

import org.openqa.selenium.WebDriver;
import pageObjectsManager.PageObjectsManager;

public class InjectionSetup {


    public WebDriver driver;
    public String greenCartSearchItem;
    public PageObjectsManager pageObjectsManager;
    public WebdriverManaging webdriverManaging;

    public InjectionSetup()
    {
        webdriverManaging=new WebdriverManaging();
        pageObjectsManager=new PageObjectsManager(webdriverManaging.driverSetup());
        System.out.println("InjectionSetup constructor invocation");

    }

}
