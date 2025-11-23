package stepDefinition;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utils.InjectionSetup;

import java.io.IOException;

public class Hooks {
    InjectionSetup injectionSetup;
    public Hooks(InjectionSetup injectionSetup)
    {
        this.injectionSetup=injectionSetup;
    }



    @After
    public void tearDown() throws IOException {
        injectionSetup.webdriverManaging.driverSetup().quit();
    }
}
