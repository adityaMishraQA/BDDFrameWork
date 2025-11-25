package utils;

import pageObjectsManager.PageObjectsManager;


import java.io.IOException;

public class InjectionSetup {



    public String greenCartSearchItem;
    public PageObjectsManager pageObjectsManager;
    public WebdriverManaging webdriverManaging;
    public PropertyFiles propertyFiles;
    public String greencartSearchedItem;


    public InjectionSetup() throws IOException {
        webdriverManaging=new WebdriverManaging();
        pageObjectsManager=new PageObjectsManager(webdriverManaging.driverSetup());
        propertyFiles=new PropertyFiles();
        System.out.println("InjectionSetup constructor invocation");

    }

}
